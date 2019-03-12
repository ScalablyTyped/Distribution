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
    onAnimationEnd: androiduixLib.androidNs.viewNs.animationNs.Animation => scala.Unit,
    onAnimationRepeat: androiduixLib.androidNs.viewNs.animationNs.Animation => scala.Unit,
    onAnimationStart: androiduixLib.androidNs.viewNs.animationNs.Animation => scala.Unit
  ): AnimationListener = {
    val __obj = js.Dynamic.literal(onAnimationEnd = js.Any.fromFunction1(onAnimationEnd), onAnimationRepeat = js.Any.fromFunction1(onAnimationRepeat), onAnimationStart = js.Any.fromFunction1(onAnimationStart))
  
    __obj.asInstanceOf[AnimationListener]
  }
}

