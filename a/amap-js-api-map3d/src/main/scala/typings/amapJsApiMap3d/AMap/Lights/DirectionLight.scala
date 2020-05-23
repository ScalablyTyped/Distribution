package typings.amapJsApiMap3d.AMap.Lights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionLight extends js.Object {
  def setColor(direction: js.Tuple3[Double, Double, Double]): Unit
  def setDirection(direction: js.Tuple3[Double, Double, Double]): Unit
  def setIntensity(intensity: Double): Unit
  def update(): Unit
}

object DirectionLight {
  @scala.inline
  def apply(
    setColor: js.Tuple3[Double, Double, Double] => Unit,
    setDirection: js.Tuple3[Double, Double, Double] => Unit,
    setIntensity: Double => Unit,
    update: () => Unit
  ): DirectionLight = {
    val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1(setColor), setDirection = js.Any.fromFunction1(setDirection), setIntensity = js.Any.fromFunction1(setIntensity), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[DirectionLight]
  }
}

