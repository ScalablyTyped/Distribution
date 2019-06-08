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
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
}

object AirtableOptions {
  @scala.inline
  def apply(
    allowUnauthorizedSsl: js.UndefOr[scala.Boolean] = js.undefined,
    apiKey: java.lang.String = null,
    apiVersion: java.lang.String = null,
    endpointUrl: java.lang.String = null,
    noRetryIfRateLimited: js.UndefOr[scala.Boolean] = js.undefined,
    requestTimeout: scala.Int | scala.Double = null
  ): AirtableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnauthorizedSsl)) __obj.updateDynamic("allowUnauthorizedSsl")(allowUnauthorizedSsl)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl)
    if (!js.isUndefined(noRetryIfRateLimited)) __obj.updateDynamic("noRetryIfRateLimited")(noRetryIfRateLimited)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AirtableOptions]
  }
}

