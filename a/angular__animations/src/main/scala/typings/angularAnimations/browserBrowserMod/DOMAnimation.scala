package typings.angularAnimations.browserBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DOMAnimation represents the Animation Web API.
  *
  * It is an external API by the browser, and must thus use "declare interface",
  * to prevent renaming by Closure Compiler.
  *
  * @see https://developer.mozilla.org/de/docs/Web/API/Animation
  */
@js.native
trait DOMAnimation extends js.Object {
  
  def addEventListener(eventName: String, handler: js.Function1[/* event */ js.Any, _]): js.Any = js.native
  
  def cancel(): Unit = js.native
  
  var currentTime: Double = js.native
  
  def dispatchEvent(eventName: String): js.Any = js.native
  
  def finish(): Unit = js.native
  
  var onfinish: js.Function = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  var position: Double = js.native
}
object DOMAnimation {
  
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ js.Any, _]) => js.Any,
    cancel: () => Unit,
    currentTime: Double,
    dispatchEvent: String => js.Any,
    finish: () => Unit,
    onfinish: js.Function,
    pause: () => Unit,
    play: () => Unit,
    position: Double
  ): DOMAnimation = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), cancel = js.Any.fromFunction0(cancel), currentTime = currentTime.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), finish = js.Any.fromFunction0(finish), onfinish = onfinish.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMAnimation]
  }
  
  @scala.inline
  implicit class DOMAnimationOps[Self <: DOMAnimation] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: (String, js.Function1[/* event */ js.Any, _]) => js.Any): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatchEvent(value: String => js.Any): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinish(value: () => Unit): Self = this.set("finish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnfinish(value: js.Function): Self = this.set("onfinish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
