package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.atlassianConnectJsStrings.CONNECT
import typings.atlassianConnectJs.atlassianConnectJsStrings.DELETE
import typings.atlassianConnectJs.atlassianConnectJsStrings.GET
import typings.atlassianConnectJs.atlassianConnectJsStrings.HEAD
import typings.atlassianConnectJs.atlassianConnectJsStrings.OPTIONS
import typings.atlassianConnectJs.atlassianConnectJsStrings.PATCH
import typings.atlassianConnectJs.atlassianConnectJsStrings.POST
import typings.atlassianConnectJs.atlassianConnectJsStrings.PUT
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  url  :string} & std.Partial<atlassian-connect-js.AP.RequestOptions> */
trait urlstringPartialRequestOp extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String | js.Object] = js.undefined
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ js.Any, Unit]
  ] = js.undefined
  var experimental: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[Accept] = js.undefined
  var success: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.undefined
  var `type`: js.UndefOr[GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH] = js.undefined
  /**
    * The url to request from the host application, relative to the host's context path
    */
  var url: String
}

object urlstringPartialRequestOp {
  @scala.inline
  def apply(
    url: String,
    cache: js.UndefOr[Boolean] = js.undefined,
    contentType: String = null,
    data: String | js.Object = null,
    error: (/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ js.Any) => Unit = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    headers: Accept = null,
    success: /* response */ String => Unit = null,
    `type`: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH = null
  ): urlstringPartialRequestOp = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[urlstringPartialRequestOp]
  }
}

