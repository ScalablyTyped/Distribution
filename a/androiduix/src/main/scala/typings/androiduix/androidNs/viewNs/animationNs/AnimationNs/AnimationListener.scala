package typings.androiduix.androidNs.viewNs.animationNs.AnimationNs

import typings.androiduix.androidNs.viewNs.animationNs.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationListener extends js.Object {
  def onAnimationEnd(animation: Animation): Unit
  def onAnimationRepeat(animation: Animation): Unit
  def onAnimationStart(animation: Animation): Unit
}

object AnimationListener {
  @scala.inline
  def apply(
    onAnimationEnd: Animation => Unit,
    onAnimationRepeat: Animation => Unit,
    onAnimationStart: Animation => Unit
  ): AnimationListener = {
    val __obj = js.Dynamic.literal(onAnimationEnd = js.Any.fromFunction1(onAnimationEnd), onAnimationRepeat = js.Any.fromFunction1(onAnimationRepeat), onAnimationStart = js.Any.fromFunction1(onAnimationStart))
  
    __obj.asInstanceOf[AnimationListener]
  }
}

