package typings.applicationinsights.outLibraryConfigMod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Library/Config", JSImport.Namespace)
@js.native
class ^ () extends Config {
  def this(instrumentationKey: String) = this()
  /* CompleteClass */
  override var _profileQueryEndpoint: js.Any = js.native
  /** Host name for quickpulse service */
  /* CompleteClass */
  override var _quickPulseHost: js.Any = js.native
  /** A list of domains to exclude from cross-component header injection */
  /* CompleteClass */
  override var correlationHeaderExcludedDomains: js.Array[String] = js.native
  /** The id for cross-component correlation. READ ONLY. */
  /* CompleteClass */
  override var correlationId: String = js.native
  /** The time to wait before retrying to retrieve the id for cross-component correlation (Default 30000) */
  /* CompleteClass */
  override var correlationIdRetryIntervalMs: Double = js.native
  /** A flag indicating if telemetry transmission is disabled (Default false) */
  /* CompleteClass */
  override var disableAppInsights: Boolean = js.native
  /* CompleteClass */
  override var endpointBase: js.Any = js.native
  /** The ingestion endpoint to send telemetry payloads to */
  /* CompleteClass */
  override var endpointUrl: String = js.native
  /** An http.Agent to use for SDK HTTP traffic (Optional, Default undefined) */
  /* CompleteClass */
  override var httpAgent: Agent = js.native
  /** An https.Agent to use for SDK HTTPS traffic (Optional, Default undefined) */
  /* CompleteClass */
  override var httpsAgent: typings.node.httpsMod.Agent = js.native
  /** An identifier for your Application Insights resource */
  /* CompleteClass */
  override var instrumentationKey: String = js.native
  /** The maximum amount of time to wait for a payload to reach maxBatchSize (Default 15000) */
  /* CompleteClass */
  override var maxBatchIntervalMs: Double = js.native
  /** The maximum number of telemetry items to include in a payload to the ingestion endpoint (Default 250) */
  /* CompleteClass */
  override var maxBatchSize: Double = js.native
  /* CompleteClass */
  override var profileQueryEndpoint: String = js.native
  /** A proxy server for SDK HTTP traffic (Optional, Default pulled from `http_proxy` environment variable) */
  /* CompleteClass */
  override var proxyHttpUrl: String = js.native
  /** A proxy server for SDK HTTPS traffic (Optional, Default pulled from `https_proxy` environment variable) */
  /* CompleteClass */
  override var proxyHttpsUrl: String = js.native
  /* CompleteClass */
  override var quickPulseHost: String = js.native
  /** The percentage of telemetry items tracked that should be transmitted (Default 100) */
  /* CompleteClass */
  override var samplingPercentage: Double = js.native
  /* CompleteClass */
  override var setCorrelationId: js.Any = js.native
}

@JSImport("applicationinsights/out/Library/Config", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ENV_azurePrefix: String = js.native
  var ENV_http_proxy: String = js.native
  var ENV_https_proxy: String = js.native
  var ENV_iKey: String = js.native
  var ENV_nativeMetricsDisableAll: String = js.native
  var ENV_nativeMetricsDisablers: String = js.native
  var ENV_profileQueryEndpoint: String = js.native
  var ENV_quickPulseHost: String = js.native
  var legacy_ENV_iKey: String = js.native
  /* private */ def _getInstrumentationKey(): js.Any = js.native
}

