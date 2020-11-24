package typings.atom.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullKeybindingMatchEvent extends js.Object {
  
  /** The KeyBinding that the keystrokes matched. */
  var binding: KeyBinding = js.native
  
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element = js.native
  
  /** The string of keystrokes that matched the binding. */
  var keystrokes: String = js.native
}
object FullKeybindingMatchEvent {
  
  @scala.inline
  def apply(binding: KeyBinding, keyboardEventTarget: Element, keystrokes: String): FullKeybindingMatchEvent = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullKeybindingMatchEvent]
  }
  
  @scala.inline
  implicit class FullKeybindingMatchEventOps[Self <: FullKeybindingMatchEvent] (val x: Self) extends AnyVal {
    
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
    def setBinding(value: KeyBinding): Self = this.set("binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardEventTarget(value: Element): Self = this.set("keyboardEventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystrokes(value: String): Self = this.set("keystrokes", value.asInstanceOf[js.Any])
  }
}
