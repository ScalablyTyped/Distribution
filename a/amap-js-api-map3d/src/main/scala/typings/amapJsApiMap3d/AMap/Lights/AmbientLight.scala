package typings.amapJsApiMap3d.AMap.Lights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmbientLight extends js.Object {
  def setColor(color: js.Tuple3[Double, Double, Double]): Unit
  def setIntensity(intensity: Double): Unit
}

object AmbientLight {
  @scala.inline
  def apply(setColor: js.Tuple3[Double, Double, Double] => Unit, setIntensity: Double => Unit): AmbientLight = {
    val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1(setColor), setIntensity = js.Any.fromFunction1(setIntensity))
    __obj.asInstanceOf[AmbientLight]
  }
}

