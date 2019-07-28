package typings.applicationinsights.outLibraryConfigMod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var _profileQueryEndpoint: js.Any
  /** Host name for quickpulse service */
  var _quickPulseHost: js.Any
  /** A list of domains to exclude from cross-component header injection */
  var correlationHeaderExcludedDomains: js.Array[String]
  /** The id for cross-component correlation. READ ONLY. */
  var correlationId: String
  /** The time to wait before retrying to retrieve the id for cross-component correlation (Default 30000) */
  var correlationIdRetryIntervalMs: Double
  /** A flag indicating if telemetry transmission is disabled (Default false) */
  var disableAppInsights: Boolean
  var endpointBase: js.Any
  /** The ingestion endpoint to send telemetry payloads to */
  var endpointUrl: String
  /** An http.Agent to use for SDK HTTP traffic (Optional, Default undefined) */
  var httpAgent: Agent
  /** An https.Agent to use for SDK HTTPS traffic (Optional, Default undefined) */
  var httpsAgent: typings.node.httpsMod.Agent
  /** An identifier for your Application Insights resource */
  var instrumentationKey: String
  /** The maximum amount of time to wait for a payload to reach maxBatchSize (Default 15000) */
  var maxBatchIntervalMs: Double
  /** The maximum number of telemetry items to include in a payload to the ingestion endpoint (Default 250) */
  var maxBatchSize: Double
  var profileQueryEndpoint: String
  /** A proxy server for SDK HTTP traffic (Optional, Default pulled from `http_proxy` environment variable) */
  var proxyHttpUrl: String
  /** A proxy server for SDK HTTPS traffic (Optional, Default pulled from `https_proxy` environment variable) */
  var proxyHttpsUrl: String
  var quickPulseHost: String
  /** The percentage of telemetry items tracked that should be transmitted (Default 100) */
  var samplingPercentage: Double
  var setCorrelationId: js.Any
}

object Config {
  @scala.inline
  def apply(
    _profileQueryEndpoint: js.Any,
    _quickPulseHost: js.Any,
    correlationHeaderExcludedDomains: js.Array[String],
    correlationId: String,
    correlationIdRetryIntervalMs: Double,
    disableAppInsights: Boolean,
    endpointBase: js.Any,
    endpointUrl: String,
    httpAgent: Agent,
    httpsAgent: typings.node.httpsMod.Agent,
    instrumentationKey: String,
    maxBatchIntervalMs: Double,
    maxBatchSize: Double,
    profileQueryEndpoint: String,
    proxyHttpUrl: String,
    proxyHttpsUrl: String,
    quickPulseHost: String,
    samplingPercentage: Double,
    setCorrelationId: js.Any
  ): Config = {
    val __obj = js.Dynamic.literal(_profileQueryEndpoint = _profileQueryEndpoint, _quickPulseHost = _quickPulseHost, correlationHeaderExcludedDomains = correlationHeaderExcludedDomains, correlationId = correlationId, correlationIdRetryIntervalMs = correlationIdRetryIntervalMs, disableAppInsights = disableAppInsights, endpointBase = endpointBase, endpointUrl = endpointUrl, httpAgent = httpAgent, httpsAgent = httpsAgent, instrumentationKey = instrumentationKey, maxBatchIntervalMs = maxBatchIntervalMs, maxBatchSize = maxBatchSize, profileQueryEndpoint = profileQueryEndpoint, proxyHttpUrl = proxyHttpUrl, proxyHttpsUrl = proxyHttpsUrl, quickPulseHost = quickPulseHost, samplingPercentage = samplingPercentage, setCorrelationId = setCorrelationId)
  
    __obj.asInstanceOf[Config]
  }
}

