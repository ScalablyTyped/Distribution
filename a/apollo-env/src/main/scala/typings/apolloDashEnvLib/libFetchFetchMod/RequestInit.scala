package typings
package apolloDashEnvLib.libFetchFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var agent: js.UndefOr[RequestAgent | apolloDashEnvLib.apolloDashEnvLibNumbers.`false`] = js.undefined
  var body: js.UndefOr[BodyInit] = js.undefined
  var cache: js.UndefOr[RequestCache] = js.undefined
  // Cloudflare Workers accept a `cf` property to control Cloudflare features
  // See https://developers.cloudflare.com/workers/reference/cloudflare-features/
  var cf: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  // The following properties are node-fetch extensions
  var follow: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[HeadersInit] = js.undefined
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[RequestMode] = js.undefined
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    agent: RequestAgent | apolloDashEnvLib.apolloDashEnvLibNumbers.`false` = null,
    body: BodyInit = null,
    cache: RequestCache = null,
    cf: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    credentials: RequestCredentials = null,
    follow: scala.Int | scala.Double = null,
    headers: HeadersInit = null,
    integrity: java.lang.String = null,
    method: java.lang.String = null,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: java.lang.String = null,
    referrerPolicy: ReferrerPolicy = null,
    size: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cf != null) __obj.updateDynamic("cf")(cf)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}

