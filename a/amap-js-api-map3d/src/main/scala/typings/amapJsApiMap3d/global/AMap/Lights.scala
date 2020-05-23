package typings.amapJsApiMap3d.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Lights")
@js.native
object Lights extends js.Object {
  @js.native
  class AmbientLight protected ()
    extends typings.amapJsApiMap3d.AMap.Lights.AmbientLight {
    def this(color: js.Tuple3[Double, Double, Double], intensity: Double) = this()
    /* CompleteClass */
    override def setColor(color: js.Tuple3[Double, Double, Double]): Unit = js.native
    /* CompleteClass */
    override def setIntensity(intensity: Double): Unit = js.native
  }
  
  @js.native
  class DirectionLight protected ()
    extends typings.amapJsApiMap3d.AMap.Lights.DirectionLight {
    def this(
      direction: js.Tuple3[Double, Double, Double],
      color: js.Tuple3[Double, Double, Double],
      intensity: Double
    ) = this()
    /* CompleteClass */
    override def setColor(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
    /* CompleteClass */
    override def setDirection(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
    /* CompleteClass */
    override def setIntensity(intensity: Double): Unit = js.native
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  
}

