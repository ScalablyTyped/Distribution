package typings.amapDashJsDashApiDashMap3d.AMapNs.LightsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Lights.DirectionLight")
@js.native
class DirectionLight protected () extends js.Object {
  def this(
    direction: js.Tuple3[Double, Double, Double],
    color: js.Tuple3[Double, Double, Double],
    intensity: Double
  ) = this()
  def setColor(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
  def setDirection(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
  def setIntensity(intensity: Double): Unit = js.native
  def update(): Unit = js.native
}

