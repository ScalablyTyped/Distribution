package typings.atom.mod

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddedKeystrokeResolverEvent extends js.Object {
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
  implicit class AddedKeystrokeResolverEventOps[Self <: AddedKeystrokeResolverEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: KeyboardEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeymap(value: js.Object): Self = this.set("keymap", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeystroke(value: String): Self = this.set("keystroke", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutName(value: String): Self = this.set("layoutName", value.asInstanceOf[js.Any])
  }
  
}

