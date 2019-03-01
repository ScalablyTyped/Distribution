package typings
package applicationinsightsLib.outLibraryConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var _profileQueryEndpoint: js.Any
  /** A list of domains to exclude from cross-component header injection */
  var correlationHeaderExcludedDomains: js.Array[java.lang.String]
  /** The id for cross-component correlation. READ ONLY. */
  var correlationId: java.lang.String
  /** The time to wait before retrying to retrieve the id for cross-component correlation (Default 30000) */
  var correlationIdRetryIntervalMs: scala.Double
  /** A flag indicating if telemetry transmission is disabled (Default false) */
  var disableAppInsights: scala.Boolean
  var endpointBase: js.Any
  /** The ingestion endpoint to send telemetry payloads to */
  var endpointUrl: java.lang.String
  /** An http.Agent to use for SDK HTTP traffic (Optional, Default undefined) */
  var httpAgent: nodeLib.httpMod.Agent
  /** An https.Agent to use for SDK HTTPS traffic (Optional, Default undefined) */
  var httpsAgent: nodeLib.httpsMod.Agent
  /** An identifier for your Application Insights resource */
  var instrumentationKey: java.lang.String
  /** The maximum amount of time to wait for a payload to reach maxBatchSize (Default 15000) */
  var maxBatchIntervalMs: scala.Double
  /** The maximum number of telemetry items to include in a payload to the ingestion endpoint (Default 250) */
  var maxBatchSize: scala.Double
  var profileQueryEndpoint: java.lang.String
  /** A proxy server for SDK HTTP traffic (Optional, Default pulled from `http_proxy` environment variable) */
  var proxyHttpUrl: java.lang.String
  /** A proxy server for SDK HTTPS traffic (Optional, Default pulled from `https_proxy` environment variable) */
  var proxyHttpsUrl: java.lang.String
  /** The percentage of telemetry items tracked that should be transmitted (Default 100) */
  var samplingPercentage: scala.Double
  var setCorrelationId: js.Any
}

object Config {
  @scala.inline
  def apply(
    _profileQueryEndpoint: js.Any,
    correlationHeaderExcludedDomains: js.Array[java.lang.String],
    correlationId: java.lang.String,
    correlationIdRetryIntervalMs: scala.Double,
    disableAppInsights: scala.Boolean,
    endpointBase: js.Any,
    endpointUrl: java.lang.String,
    httpAgent: nodeLib.httpMod.Agent,
    httpsAgent: nodeLib.httpsMod.Agent,
    instrumentationKey: java.lang.String,
    maxBatchIntervalMs: scala.Double,
    maxBatchSize: scala.Double,
    profileQueryEndpoint: java.lang.String,
    proxyHttpUrl: java.lang.String,
    proxyHttpsUrl: java.lang.String,
    samplingPercentage: scala.Double,
    setCorrelationId: js.Any
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_profileQueryEndpoint")(_profileQueryEndpoint)
    __obj.updateDynamic("correlationHeaderExcludedDomains")(correlationHeaderExcludedDomains)
    __obj.updateDynamic("correlationId")(correlationId)
    __obj.updateDynamic("correlationIdRetryIntervalMs")(correlationIdRetryIntervalMs)
    __obj.updateDynamic("disableAppInsights")(disableAppInsights)
    __obj.updateDynamic("endpointBase")(endpointBase)
    __obj.updateDynamic("endpointUrl")(endpointUrl)
    __obj.updateDynamic("httpAgent")(httpAgent)
    __obj.updateDynamic("httpsAgent")(httpsAgent)
    __obj.updateDynamic("instrumentationKey")(instrumentationKey)
    __obj.updateDynamic("maxBatchIntervalMs")(maxBatchIntervalMs)
    __obj.updateDynamic("maxBatchSize")(maxBatchSize)
    __obj.updateDynamic("profileQueryEndpoint")(profileQueryEndpoint)
    __obj.updateDynamic("proxyHttpUrl")(proxyHttpUrl)
    __obj.updateDynamic("proxyHttpsUrl")(proxyHttpsUrl)
    __obj.updateDynamic("samplingPercentage")(samplingPercentage)
    __obj.updateDynamic("setCorrelationId")(setCorrelationId)
    __obj.asInstanceOf[Config]
  }
}

