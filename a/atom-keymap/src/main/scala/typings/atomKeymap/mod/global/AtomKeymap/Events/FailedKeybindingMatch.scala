package typings.atomKeymap.mod.global.AtomKeymap.Events

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedKeybindingMatch extends js.Object {
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element = js.native
  /** The string of keystrokes that failed to match the binding. */
  var keystrokes: String = js.native
}

object FailedKeybindingMatch {
  @scala.inline
  def apply(keyboardEventTarget: Element, keystrokes: String): FailedKeybindingMatch = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedKeybindingMatch]
  }
  @scala.inline
  implicit class FailedKeybindingMatchOps[Self <: FailedKeybindingMatch] (val x: Self) extends AnyVal {
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
    def setKeyboardEventTarget(value: Element): Self = this.set("keyboardEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeystrokes(value: String): Self = this.set("keystrokes", value.asInstanceOf[js.Any])
  }
  
}

