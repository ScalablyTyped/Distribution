package typings.apolloServerEnv.fetchMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerEnv.apolloServerEnvBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var agent: js.UndefOr[RequestAgent | `false`] = js.undefined
  var body: js.UndefOr[BodyInit] = js.undefined
  var cache: js.UndefOr[RequestCache] = js.undefined
  // Cloudflare Workers accept a `cf` property to control Cloudflare features
  // See https://developers.cloudflare.com/workers/reference/cloudflare-features/
  var cf: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  // The following properties are node-fetch extensions
  var follow: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[HeadersInit] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[RequestMode] = js.undefined
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    agent: RequestAgent | `false` = null,
    body: BodyInit = null,
    cache: RequestCache = null,
    cf: StringDictionary[js.Any] = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    credentials: RequestCredentials = null,
    follow: js.UndefOr[Double] = js.undefined,
    headers: HeadersInit = null,
    integrity: String = null,
    method: String = null,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    size: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cf != null) __obj.updateDynamic("cf")(cf.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}

