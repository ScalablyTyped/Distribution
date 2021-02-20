package typings.atom.mod

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddedKeystrokeResolverEvent extends StObject {
  
  /**
    *  The raw DOM 3 `KeyboardEvent` being resolved. See the DOM API documentation
    *  for more details.
    */
  var event: KeyboardEvent = js.native
  
  /**
    *  An object mapping DOM 3 `KeyboardEvent.code` values to objects with the
    *  typed character for that key in each modifier state, based on the current
    *  operating system layout.
    */
  var keymap: js.Object = js.native
  
  /**
    *  The currently resolved keystroke string. If your function returns a falsy
    *  value, this is how Atom will resolve your keystroke.
    */
  var keystroke: String = js.native
  
  /** The OS-specific name of the current keyboard layout. */
  var layoutName: String = js.native
}
object AddedKeystrokeResolverEvent {
  
  @scala.inline
  def apply(event: KeyboardEvent, keymap: js.Object, keystroke: String, layoutName: String): AddedKeystrokeResolverEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], keymap = keymap.asInstanceOf[js.Any], keystroke = keystroke.asInstanceOf[js.Any], layoutName = layoutName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedKeystrokeResolverEvent]
  }
  
  @scala.inline
  implicit class AddedKeystrokeResolverEventMutableBuilder[Self <: AddedKeystrokeResolverEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeymap(value: js.Object): Self = StObject.set(x, "keymap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeystroke(value: String): Self = StObject.set(x, "keystroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutName(value: String): Self = StObject.set(x, "layoutName", value.asInstanceOf[js.Any])
  }
}
