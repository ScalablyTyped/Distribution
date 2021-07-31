package typings.atom.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullKeybindingMatchEvent extends StObject {
  
  /** The KeyBinding that the keystrokes matched. */
  var binding: KeyBinding
  
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element
  
  /** The string of keystrokes that matched the binding. */
  var keystrokes: String
}
object FullKeybindingMatchEvent {
  
  @scala.inline
  def apply(binding: KeyBinding, keyboardEventTarget: Element, keystrokes: String): FullKeybindingMatchEvent = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullKeybindingMatchEvent]
  }
  
  @scala.inline
  implicit class FullKeybindingMatchEventMutableBuilder[Self <: FullKeybindingMatchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: KeyBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardEventTarget(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
  }
}
