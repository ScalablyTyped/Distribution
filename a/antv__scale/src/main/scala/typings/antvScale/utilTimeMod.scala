package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilTimeMod {
  
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
  
  @JSImport("@antv/scale/lib/util/time", "getTickInterval")
  @js.native
  def getTickInterval(min: Double, max: Double, tickCount: Double): Interval = js.native
  
  @JSImport("@antv/scale/lib/util/time", "timeFormat")
  @js.native
  def timeFormat(time: js.Any, mask: js.Any): String = js.native
  
  @JSImport("@antv/scale/lib/util/time", "toTimeStamp")
  @js.native
  def toTimeStamp(value: js.Any): Double = js.native
  
  type Interval = js.Tuple2[String, Double]
}
