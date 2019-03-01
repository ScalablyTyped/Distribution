package typings
package androiduixLib.androidNs.viewNs.animationNs.AnimationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationListener extends js.Object {
  def onAnimationEnd(animation: androiduixLib.androidNs.viewNs.animationNs.Animation): scala.Unit
  def onAnimationRepeat(animation: androiduixLib.androidNs.viewNs.animationNs.Animation): scala.Unit
  def onAnimationStart(animation: androiduixLib.androidNs.viewNs.animationNs.Animation): scala.Unit
}

object AnimationListener {
  @scala.inline
  def apply(
    onAnimationEnd: js.Function1[androiduixLib.androidNs.viewNs.animationNs.Animation, scala.Unit],
    onAnimationRepeat: js.Function1[androiduixLib.androidNs.viewNs.animationNs.Animation, scala.Unit],
    onAnimationStart: js.Function1[androiduixLib.androidNs.viewNs.animationNs.Animation, scala.Unit]
  ): AnimationListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    __obj.updateDynamic("onAnimationRepeat")(onAnimationRepeat)
    __obj.updateDynamic("onAnimationStart")(onAnimationStart)
    __obj.asInstanceOf[AnimationListener]
  }
}

