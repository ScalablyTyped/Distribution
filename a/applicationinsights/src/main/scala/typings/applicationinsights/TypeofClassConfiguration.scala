package typings.applicationinsights

import org.scalablytyped.runtime.Instantiable0
import typings.applicationinsights.applicationinsightsMod.Configuration
import typings.applicationinsights.applicationinsightsMod.DistributedTracingModes
import typings.applicationinsights.outAutoCollectionNativePerformanceMod.IDisabledExtendedMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassConfiguration extends Instantiable0[Configuration] {
  /**
    * Sets the state of console and logger tracking (enabled by default for third-party loggers only)
    * @param value if true logger activity will be sent to Application Insights
    * @param collectConsoleLog if true, logger autocollection will include console.log calls (default false)
    * @returns {Configuration} this class
    */
  def setAutoCollectConsole(value: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setAutoCollectConsole(value: Boolean, collectConsoleLog: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of dependency tracking (enabled by default)
    * @param value if true dependencies will be sent to Application Insights
    * @returns {Configuration} this class
    */
  def setAutoCollectDependencies(value: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of exception tracking (enabled by default)
    * @param value if true uncaught exceptions will be sent to Application Insights
    * @returns {Configuration} this class
    */
  def setAutoCollectExceptions(value: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of performance tracking (enabled by default)
    * @param value if true performance counters will be collected every second and sent to Application Insights
    * @param collectExtendedMetrics if true, extended metrics counters will be collected every minute and sent to Application Insights
    * @returns {Configuration} this class
    */
  def setAutoCollectPerformance(value: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setAutoCollectPerformance(value: Boolean, collectExtendedMetrics: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setAutoCollectPerformance(value: Boolean, collectExtendedMetrics: IDisabledExtendedMetrics): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of request tracking (enabled by default)
    * @param value if true requests will be sent to Application Insights
    * @returns {Configuration} this class
    */
  def setAutoCollectRequests(value: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the state of automatic dependency correlation (enabled by default)
    * @param value if true dependencies will be correlated with requests
    * @param useAsyncHooks if true, forces use of experimental async_hooks module to provide correlation. If false, instead uses only patching-based techniques. If left blank, the best option is chosen for you based on your version of Node.js.
    * @returns {Configuration} this class
    */
  def setAutoDependencyCorrelation(value: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setAutoDependencyCorrelation(value: Boolean, useAsyncHooks: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Sets the distributed tracing modes. If W3C mode is enabled, W3C trace context
    * headers (traceparent/tracestate) will be parsed in all incoming requests, and included in outgoing
    * requests. In W3C mode, existing back-compatibility AI headers will also be parsed and included.
    * Enabling W3C mode will not break existing correlation with other Application Insights instrumented
    * services. Default=AI
    */
  def setDistributedTracingMode(value: DistributedTracingModes): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Enables debug and warning logging for AppInsights itself.
    * @param enableDebugLogging if true, enables debug logging
    * @param enableWarningLogging if true, enables warning logging
    * @returns {Configuration} this class
    */
  def setInternalLogging(): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setInternalLogging(enableDebugLogging: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setInternalLogging(enableDebugLogging: Boolean, enableWarningLogging: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Enables communication with Application Insights Live Metrics.
    * @param enable if true, enables communication with the live metrics service
    */
  def setSendLiveMetrics(): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setSendLiveMetrics(enable: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  /**
    * Enable or disable disk-backed retry caching to cache events when client is offline (enabled by default)
    * Note that this method only applies to the default client. Disk-backed retry caching is disabled by default for additional clients.
    * For enable for additional clients, use client.channel.setUseDiskRetryCaching(true).
    * These cached events are stored in your system or user's temporary directory and access restricted to your user when possible.
    * @param value if true events that occured while client is offline will be cached on disk
    * @param resendInterval The wait interval for resending cached events.
    * @param maxBytesOnDisk The maximum size (in bytes) that the created temporary directory for cache events can grow to, before caching is disabled.
    * @returns {Configuration} this class
    */
  def setUseDiskRetryCaching(value: Boolean): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setUseDiskRetryCaching(value: Boolean, resendInterval: Double): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
  def setUseDiskRetryCaching(value: Boolean, resendInterval: Double, maxBytesOnDisk: Double): /* import warning: importer.ImportType#apply Failed type conversion: typeof Configuration */ js.Any = js.native
}

