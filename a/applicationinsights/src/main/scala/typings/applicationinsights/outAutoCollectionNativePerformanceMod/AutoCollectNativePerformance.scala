package typings.applicationinsights.outAutoCollectionNativePerformanceMod

import typings.applicationinsights.Anon_DisabledMetrics
import typings.applicationinsights.outLibraryTelemetryClientMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/NativePerformance", "AutoCollectNativePerformance")
@js.native
class AutoCollectNativePerformance protected () extends js.Object {
  def this(client: ^) = this()
  var _client: js.Any = js.native
  var _disabledMetrics: js.Any = js.native
  var _handle: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _isInitialized: js.Any = js.native
  /**
    * Tracks event loop ticks per interval as a custom metric. Also included in the metric is min/max/avg
    * time spent in event loop for this interval.
    *
    * @private
    * @returns {void}
    * @memberof AutoCollectNativePerformance
    */
  /* private */ def _trackEventLoop(): js.Any = js.native
  /**
    * Tracks garbage collection stats for this interval. One custom metric is sent per type of garbage
    * collection that occurred during this collection interval.
    *
    * @private
    * @memberof AutoCollectNativePerformance
    */
  /* private */ def _trackGarbageCollection(): js.Any = js.native
  /**
    * Track heap memory usage metrics as a custom metric.
    *
    * @private
    * @memberof AutoCollectNativePerformance
    */
  /* private */ def _trackHeapUsage(): js.Any = js.native
  /**
    * Trigger an iteration of native metrics collection
    *
    * @private
    * @memberof AutoCollectNativePerformance
    */
  /* private */ def _trackNativeMetrics(): js.Any = js.native
  /**
    * Cleanup this instance of AutoCollectNativePerformance
    *
    * @memberof AutoCollectNativePerformance
    */
  def dispose(): Unit = js.native
  /**
    * Start instance of native metrics agent.
    *
    * @param {boolean} isEnabled
    * @param {number} [collectionInterval=60000]
    * @memberof AutoCollectNativePerformance
    */
  def enable(isEnabled: Boolean): Unit = js.native
  def enable(isEnabled: Boolean, disabledMetrics: IDisabledExtendedMetrics): Unit = js.native
  def enable(isEnabled: Boolean, disabledMetrics: IDisabledExtendedMetrics, collectionInterval: Double): Unit = js.native
}

/* static members */
@JSImport("applicationinsights/out/AutoCollection/NativePerformance", "AutoCollectNativePerformance")
@js.native
object AutoCollectNativePerformance extends js.Object {
  var INSTANCE: AutoCollectNativePerformance = js.native
  var _emitter: js.Any = js.native
  var _metricsAvailable: js.Any = js.native
  /**
    *  Reports if NativePerformance is able to run in this environment
    */
  def isNodeVersionCompatible(): Boolean = js.native
  /**
    * Parse environment variable and overwrite isEnabled based on respective fields being set
    *
    * @private
    * @static
    * @param {(boolean | IDisabledExtendedMetrics)} collectExtendedMetrics
    * @returns {(boolean | IDisabledExtendedMetrics)}
    * @memberof AutoCollectNativePerformance
    */
  def parseEnabled(collectExtendedMetrics: Boolean): Anon_DisabledMetrics = js.native
  def parseEnabled(collectExtendedMetrics: IDisabledExtendedMetrics): Anon_DisabledMetrics = js.native
}

