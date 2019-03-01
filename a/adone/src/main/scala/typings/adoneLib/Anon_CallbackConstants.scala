package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackConstants extends js.Object {
  var PerformanceObserver: org.scalablytyped.runtime.Instantiable1[
    /* callback */ nodeLib.perfUnderscoreHooksMod.PerformanceObserverCallback, 
    adoneLib.glossesStdMod.perfUnderscoreHooksNs.PerformanceObserver
  ]
  val constantsNs: Anon_NODEPERFORMANCEGCINCREMENTAL
  val performance: nodeLib.perfUnderscoreHooksMod.Performance
}

object Anon_CallbackConstants {
  @scala.inline
  def apply(
    PerformanceObserver: org.scalablytyped.runtime.Instantiable1[
      /* callback */ nodeLib.perfUnderscoreHooksMod.PerformanceObserverCallback, 
      adoneLib.glossesStdMod.perfUnderscoreHooksNs.PerformanceObserver
    ],
    constantsNs: Anon_NODEPERFORMANCEGCINCREMENTAL,
    performance: nodeLib.perfUnderscoreHooksMod.Performance
  ): Anon_CallbackConstants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PerformanceObserver")(PerformanceObserver)
    __obj.updateDynamic("constantsNs")(constantsNs)
    __obj.updateDynamic("performance")(performance)
    __obj.asInstanceOf[Anon_CallbackConstants]
  }
}

