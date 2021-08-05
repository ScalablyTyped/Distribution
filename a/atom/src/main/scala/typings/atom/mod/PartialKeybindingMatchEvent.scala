package typings.atom.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialKeybindingMatchEvent extends StObject {
  
  /** DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element
  
  /** The string of keystrokes that matched the binding. */
  var keystrokes: String
  
  /** The KeyBindings that the keystrokes partially matched. */
  var partiallyMatchedBindings: js.Array[KeyBinding]
}
object PartialKeybindingMatchEvent {
  
  inline def apply(keyboardEventTarget: Element, keystrokes: String, partiallyMatchedBindings: js.Array[KeyBinding]): PartialKeybindingMatchEvent = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any], partiallyMatchedBindings = partiallyMatchedBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialKeybindingMatchEvent]
  }
  
  extension [Self <: PartialKeybindingMatchEvent](x: Self) {
    
    inline def setKeyboardEventTarget(value: Element): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
    
    inline def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
    
    inline def setPartiallyMatchedBindings(value: js.Array[KeyBinding]): Self = StObject.set(x, "partiallyMatchedBindings", value.asInstanceOf[js.Any])
    
    inline def setPartiallyMatchedBindingsVarargs(value: KeyBinding*): Self = StObject.set(x, "partiallyMatchedBindings", js.Array(value :_*))
  }
}
