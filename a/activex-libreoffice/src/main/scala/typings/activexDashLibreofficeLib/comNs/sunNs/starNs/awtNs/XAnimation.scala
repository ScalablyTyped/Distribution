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
    isAnimationRunning: () => scala.Boolean,
    startAnimation: () => scala.Unit,
    stopAnimation: () => scala.Unit
  ): XAnimation = {
    val __obj = js.Dynamic.literal(isAnimationRunning = js.Any.fromFunction0(isAnimationRunning), startAnimation = js.Any.fromFunction0(startAnimation), stopAnimation = js.Any.fromFunction0(stopAnimation))
  
    __obj.asInstanceOf[XAnimation]
  }
}

