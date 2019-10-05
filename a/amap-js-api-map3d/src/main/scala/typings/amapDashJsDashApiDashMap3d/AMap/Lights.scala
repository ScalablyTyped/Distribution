package typings.amapDashJsDashApiDashMap3d.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Lights")
@js.native
object Lights extends js.Object {
  @js.native
  class AmbientLight protected () extends js.Object {
    def this(color: js.Tuple3[Double, Double, Double], intensity: Double) = this()
    def setColor(color: js.Tuple3[Double, Double, Double]): Unit = js.native
    def setIntensity(intensity: Double): Unit = js.native
  }
  
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
  
}

