package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.node.perfUnderscoreHooksMod.EventLoopDelayMonitor
import typings.node.perfUnderscoreHooksMod.EventLoopMonitorOptions
import typings.node.perfUnderscoreHooksMod.Performance
import typings.node.perfUnderscoreHooksMod.PerformanceObserverCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofperf_hooks extends js.Object {
  var PerformanceObserver: Instantiable1[
    /* callback */ PerformanceObserverCallback, 
    typings.adone.glossesStdMod.perfUnderscoreHooksNs.PerformanceObserver
  ] = js.native
  val constantsNs: TypeofconstantsNODEPERFORMANCEGCINCREMENTAL = js.native
  val performance: Performance = js.native
  def monitorEventLoopDelay(): EventLoopDelayMonitor = js.native
  def monitorEventLoopDelay(options: EventLoopMonitorOptions): EventLoopDelayMonitor = js.native
}

