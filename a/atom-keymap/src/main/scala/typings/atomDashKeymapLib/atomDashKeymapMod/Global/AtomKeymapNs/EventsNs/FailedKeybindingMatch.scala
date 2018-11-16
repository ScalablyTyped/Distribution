package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FailedKeybindingMatch extends js.Object {
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: stdLib.Element
  /** The string of keystrokes that failed to match the binding. */
  var keystrokes: java.lang.String
}

