package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilTimeMod {
  
  @JSImport("@antv/scale/lib/util/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/scale/lib/util/time", "DAY")
  @js.native
  val DAY: Double = js.native
  
  @JSImport("@antv/scale/lib/util/time", "HOUR")
  @js.native
  val HOUR: Double = js.native
  
  @JSImport("@antv/scale/lib/util/time", "MINUTE")
  @js.native
  val MINUTE: Double = js.native
  
  @JSImport("@antv/scale/lib/util/time", "MONTH")
  @js.native
  val MONTH: Double = js.native
  
  @JSImport("@antv/scale/lib/util/time", "SECOND")
  @js.native
  val SECOND: /* 1000 */ Double = js.native
  
  @JSImport("@antv/scale/lib/util/time", "YEAR")
  @js.native
  val YEAR: Double = js.native
  
  inline def getTickInterval(min: Double, max: Double, tickCount: Double): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickInterval")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  inline def timeFormat(time: js.Any, mask: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFormat")(time.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toTimeStamp(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toTimeStamp")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Interval = js.Tuple2[String, Double]
}
