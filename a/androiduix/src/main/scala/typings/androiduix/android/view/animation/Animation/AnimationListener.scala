package typings.androiduix.android.view.animation.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationListener extends js.Object {
  
  def onAnimationEnd(animation: typings.androiduix.android.view.animation.Animation): Unit = js.native
  
  def onAnimationRepeat(animation: typings.androiduix.android.view.animation.Animation): Unit = js.native
  
  def onAnimationStart(animation: typings.androiduix.android.view.animation.Animation): Unit = js.native
}
object AnimationListener {
  
  @scala.inline
  def apply(
    onAnimationEnd: typings.androiduix.android.view.animation.Animation => Unit,
    onAnimationRepeat: typings.androiduix.android.view.animation.Animation => Unit,
    onAnimationStart: typings.androiduix.android.view.animation.Animation => Unit
  ): AnimationListener = {
    val __obj = js.Dynamic.literal(onAnimationEnd = js.Any.fromFunction1(onAnimationEnd), onAnimationRepeat = js.Any.fromFunction1(onAnimationRepeat), onAnimationStart = js.Any.fromFunction1(onAnimationStart))
    __obj.asInstanceOf[AnimationListener]
  }
  
  @scala.inline
  implicit class AnimationListenerOps[Self <: AnimationListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnAnimationEnd(value: typings.androiduix.android.view.animation.Animation => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationRepeat(value: typings.androiduix.android.view.animation.Animation => Unit): Self = this.set("onAnimationRepeat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationStart(value: typings.androiduix.android.view.animation.Animation => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
  }
}
