package typings.applicationinsights.performanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCollectPerformance extends js.Object {
  var _client: js.Any = js.native
  var _collectionInterval: js.Any = js.native
  var _enableLiveMetricsCounters: js.Any = js.native
  var _handle: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _isInitialized: js.Any = js.native
  var _lastAppCpuUsage: js.Any = js.native
  var _lastCpus: js.Any = js.native
  var _lastDependencies: js.Any = js.native
  var _lastExceptions: js.Any = js.native
  var _lastHrtime: js.Any = js.native
  var _lastIntervalDependencyExecutionTime: js.Any = js.native
  var _lastIntervalRequestExecutionTime: js.Any = js.native
  var _lastRequests: js.Any = js.native
  /* private */ def _trackCpu(): js.Any = js.native
  /* private */ def _trackDependencyRate(): js.Any = js.native
  /* private */ def _trackExceptionRate(): js.Any = js.native
  /* private */ def _trackMemory(): js.Any = js.native
  /* private */ def _trackNetwork(): js.Any = js.native
  def dispose(): Unit = js.native
  def enable(isEnabled: Boolean): Unit = js.native
  def enable(isEnabled: Boolean, collectionInterval: Double): Unit = js.native
  def isInitialized(): Boolean = js.native
  def trackPerformance(): Unit = js.native
}

