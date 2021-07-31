package typings.atom.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedKeybindingMatchEvent extends StObject {
  
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element
  
  /** The string of keystrokes that failed to match the binding. */
  var keystrokes: String
}
object FailedKeybindingMatchEvent {
  
  @scala.inline
  def apply(keyboardEventTarget: Element, keystrokes: String): FailedKeybindingMatchEvent = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedKeybindingMatchEvent]
  }
  
  @scala.inline
  implicit class FailedKeybindingMatchEventMutableBuilder[Self <: FailedKeybindingMatchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyboardEventTarget(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
  }
}
