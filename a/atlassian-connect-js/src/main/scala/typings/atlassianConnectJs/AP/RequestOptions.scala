package typings.atlassianConnectJs.AP

import typings.atlassianConnectJs.anon.Accept
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

trait RequestOptions extends js.Object {
  /**
    * If the request should be cached.
    */
  var cache: Boolean
  /**
    * The content-type string value of the entity body, above; required when data is supplied.
    */
  var contentType: String
  /**
    * The body of the request; required if type is 'POST' or 'PUT'. Optionally, for 'GET' this will append the object as key=value pairs to the end of the URL query string.
    */
  var data: String | js.Object
  /**
    * If this is set to true, the developer acknowledges that the API endpoint which is being called may be in beta state, and thus may also have a shorter deprecation cycle than stable APIs.
    */
  var experimental: Boolean
  /**
    * An object containing headers to set; supported headers are: 'Accept', 'If-Match' and 'If-None-Match'.
    */
  var headers: Accept
  /**
    * The HTTP method name.
    */
  var `type`: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH
  /**
    * An optional callback function executed when a HTTP status error code is returned.
    */
  def error(xhr: XMLHttpRequest, statusText: String, errorThrown: js.Any): Unit
  /**
    * An optional callback function executed on a 200 success status code.
    */
  def success(response: String): Unit
}

object RequestOptions {
  @scala.inline
  def apply(
    cache: Boolean,
    contentType: String,
    data: String | js.Object,
    error: (XMLHttpRequest, String, js.Any) => Unit,
    experimental: Boolean,
    headers: Accept,
    success: String => Unit,
    `type`: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], error = js.Any.fromFunction3(error), experimental = experimental.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

