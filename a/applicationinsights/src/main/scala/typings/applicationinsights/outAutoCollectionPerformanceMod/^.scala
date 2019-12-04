package typings.applicationinsights.outAutoCollectionPerformanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/Performance", JSImport.Namespace)
@js.native
class ^ protected () extends AutoCollectPerformance {
  /**
    * @param enableLiveMetricsCounters - enable sending additional live metrics information (dependency metrics, exception metrics, committed memory)
    */
  def this(client: typings.applicationinsights.outLibraryTelemetryClientMod.^) = this()
  def this(client: typings.applicationinsights.outLibraryTelemetryClientMod.^, collectionInterval: Double) = this()
  def this(
    client: typings.applicationinsights.outLibraryTelemetryClientMod.^,
    collectionInterval: Double,
    enableLiveMetricsCounters: Boolean
  ) = this()
}

@JSImport("applicationinsights/out/AutoCollection/Performance", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var INSTANCE: AutoCollectPerformance = js.native
  var _intervalDependencyExecutionTime: js.Any = js.native
  var _intervalRequestExecutionTime: js.Any = js.native
  var _lastDependencyExecutionTime: js.Any = js.native
  var _lastRequestExecutionTime: js.Any = js.native
  var _totalDependencyCount: js.Any = js.native
  var _totalExceptionCount: js.Any = js.native
  var _totalFailedDependencyCount: js.Any = js.native
  var _totalFailedRequestCount: js.Any = js.native
  var _totalRequestCount: js.Any = js.native
  def countDependency(duration: String, success: Boolean): Unit = js.native
  def countDependency(duration: Double, success: Boolean): Unit = js.native
  def countException(): Unit = js.native
  def countRequest(duration: String, success: Boolean): Unit = js.native
  def countRequest(duration: Double, success: Boolean): Unit = js.native
  def isEnabled(): Boolean = js.native
}

