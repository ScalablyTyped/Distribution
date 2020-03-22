package typings.antvScale

import typings.antvScale.antvScaleNumbers.`1000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/esm/util/time", JSImport.Namespace)
@js.native
object utilTimeMod extends js.Object {
  val DAY: Double = js.native
  val HOUR: Double = js.native
  val MINUTE: Double = js.native
  val MONTH: Double = js.native
  val SECOND: `1000` = js.native
  val YEAR: Double = js.native
  def getTickInterval(min: Double, max: Double, tickCount: Double): Interval = js.native
  def timeFormat(time: js.Any, mask: js.Any): js.Any = js.native
  def toTimeStamp(value: js.Any): Double = js.native
  type Interval = js.Tuple2[String, Double]
}

