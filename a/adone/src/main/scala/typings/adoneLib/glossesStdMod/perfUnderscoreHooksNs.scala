package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "perf_hooks")
@js.native
object perfUnderscoreHooksNs extends js.Object {
  @js.native
  class PerformanceObserver protected ()
    extends nodeLib.perfUnderscoreHooksMod.PerformanceObserver {
    def this(callback: nodeLib.perfUnderscoreHooksMod.PerformanceObserverCallback) = this()
  }
  
  val performance: nodeLib.perfUnderscoreHooksMod.Performance = js.native
  @JSName("constants")
  @js.native
  object constantsNs extends js.Object {
    val NODE_PERFORMANCE_GC_INCREMENTAL: scala.Double = js.native
    val NODE_PERFORMANCE_GC_MAJOR: scala.Double = js.native
    val NODE_PERFORMANCE_GC_MINOR: scala.Double = js.native
    val NODE_PERFORMANCE_GC_WEAKCB: scala.Double = js.native
  }
  
}

