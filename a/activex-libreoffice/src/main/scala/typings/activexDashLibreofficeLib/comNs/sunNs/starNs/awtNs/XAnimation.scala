package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows controlling an animation.
  * @since OOo 3.4
  */
trait XAnimation extends js.Object {
  /** determines whether the animation is currently running */
  def isAnimationRunning(): scala.Boolean
  /** starts the animation */
  def startAnimation(): scala.Unit
  /** stops the animation */
  def stopAnimation(): scala.Unit
}

object XAnimation {
  @scala.inline
  def apply(
    isAnimationRunning: js.Function0[scala.Boolean],
    startAnimation: js.Function0[scala.Unit],
    stopAnimation: js.Function0[scala.Unit]
  ): XAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAnimationRunning")(isAnimationRunning)
    __obj.updateDynamic("startAnimation")(startAnimation)
    __obj.updateDynamic("stopAnimation")(stopAnimation)
    __obj.asInstanceOf[XAnimation]
  }
}

