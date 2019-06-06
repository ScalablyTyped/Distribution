package typings
package airtableLib.airtableMod.Global.AirtableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AirtableOptions extends js.Object {
  var allowUnauthorizedSsl: js.UndefOr[scala.Boolean] = js.undefined
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  var endpointUrl: js.UndefOr[java.lang.String] = js.undefined
  var noRetryIfRateLimited: js.UndefOr[scala.Boolean] = js.undefined
  var requestTimeout: scala.Double
}

object AirtableOptions {
  @scala.inline
  def apply(
    requestTimeout: scala.Double,
    allowUnauthorizedSsl: js.UndefOr[scala.Boolean] = js.undefined,
    apiKey: java.lang.String = null,
    apiVersion: java.lang.String = null,
    endpointUrl: java.lang.String = null,
    noRetryIfRateLimited: js.UndefOr[scala.Boolean] = js.undefined
  ): AirtableOptions = {
    val __obj = js.Dynamic.literal(requestTimeout = requestTimeout)
    if (!js.isUndefined(allowUnauthorizedSsl)) __obj.updateDynamic("allowUnauthorizedSsl")(allowUnauthorizedSsl)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl)
    if (!js.isUndefined(noRetryIfRateLimited)) __obj.updateDynamic("noRetryIfRateLimited")(noRetryIfRateLimited)
    __obj.asInstanceOf[AirtableOptions]
  }
}

