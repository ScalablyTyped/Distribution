package typings.adone.glossesStdMod

import typings.node.perfUnderscoreHooksMod.EventLoopDelayMonitor
import typings.node.perfUnderscoreHooksMod.EventLoopMonitorOptions
import typings.node.perfUnderscoreHooksMod.Performance
import typings.node.perfUnderscoreHooksMod.PerformanceObserverCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "perf_hooks")
@js.native
object perfUnderscoreHooksNs extends js.Object {
  @js.native
  class PerformanceObserver protected ()
    extends typings.node.perfUnderscoreHooksMod.PerformanceObserver {
    def this(callback: PerformanceObserverCallback) = this()
  }
  
  val performance: Performance = js.native
  def monitorEventLoopDelay(): EventLoopDelayMonitor = js.native
  def monitorEventLoopDelay(options: EventLoopMonitorOptions): EventLoopDelayMonitor = js.native
  @JSName("constants")
  @js.native
  object constantsNs extends js.Object {
    val NODE_PERFORMANCE_GC_INCREMENTAL: Double = js.native
    val NODE_PERFORMANCE_GC_MAJOR: Double = js.native
    val NODE_PERFORMANCE_GC_MINOR: Double = js.native
    val NODE_PERFORMANCE_GC_WEAKCB: Double = js.native
  }
  
}

