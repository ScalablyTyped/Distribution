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
  var cf: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
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

