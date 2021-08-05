package typings.atom.mod

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedKeystrokeResolverEvent extends StObject {
  
  /**
    *  The raw DOM 3 `KeyboardEvent` being resolved. See the DOM API documentation
    *  for more details.
    */
  var event: KeyboardEvent
  
  /**
    *  An object mapping DOM 3 `KeyboardEvent.code` values to objects with the
    *  typed character for that key in each modifier state, based on the current
    *  operating system layout.
    */
  var keymap: js.Object
  
  /**
    *  The currently resolved keystroke string. If your function returns a falsy
    *  value, this is how Atom will resolve your keystroke.
    */
  var keystroke: String
  
  /** The OS-specific name of the current keyboard layout. */
  var layoutName: String
}
object AddedKeystrokeResolverEvent {
  
  inline def apply(event: KeyboardEvent, keymap: js.Object, keystroke: String, layoutName: String): AddedKeystrokeResolverEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], keymap = keymap.asInstanceOf[js.Any], keystroke = keystroke.asInstanceOf[js.Any], layoutName = layoutName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedKeystrokeResolverEvent]
  }
  
  extension [Self <: AddedKeystrokeResolverEvent](x: Self) {
    
    inline def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setKeymap(value: js.Object): Self = StObject.set(x, "keymap", value.asInstanceOf[js.Any])
    
    inline def setKeystroke(value: String): Self = StObject.set(x, "keystroke", value.asInstanceOf[js.Any])
    
    inline def setLayoutName(value: String): Self = StObject.set(x, "layoutName", value.asInstanceOf[js.Any])
  }
}
