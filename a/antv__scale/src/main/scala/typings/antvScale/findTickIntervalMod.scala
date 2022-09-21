package typings.antvScale

import typings.antvScale.timeIntervalMod.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findTickIntervalMod {
  
  @JSImport("@antv/scale/lib/utils/find-tick-interval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findTickInterval(start: js.Date, stop: js.Date, count: Double, interval: Double, utc: Boolean): TickInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("findTickInterval")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[TickInterval]
  
  type TickInterval = js.Tuple2[Interval, Double]
}
