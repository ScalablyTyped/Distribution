package typings.atAngularAnimations.browserBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DOMAnimation represents the Animation Web API.
  *
  * It is an external API by the browser, and must thus use "declare interface",
  * to prevent renaming by Closure Compiler.
  *
  * @see https://developer.mozilla.org/de/docs/Web/API/Animation
  */
trait DOMAnimation extends js.Object {
  var currentTime: Double
  var onfinish: js.Function
  var position: Double
  def addEventListener(eventName: String, handler: js.Function1[/* event */ js.Any, _]): js.Any
  def cancel(): Unit
  def dispatchEvent(eventName: String): js.Any
  def finish(): Unit
  def pause(): Unit
  def play(): Unit
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
}

