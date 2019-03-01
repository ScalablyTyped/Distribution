package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animatable extends js.Object {
  def isRunning(): scala.Boolean
  def start(): scala.Unit
  def stop(): scala.Unit
}

object Animatable {
  @scala.inline
  def apply(
    isRunning: js.Function0[scala.Boolean],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit]
  ): Animatable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRunning")(isRunning)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Animatable]
  }
}

