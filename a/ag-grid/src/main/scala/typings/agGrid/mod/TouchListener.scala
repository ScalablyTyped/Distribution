package typings.agGrid.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "TouchListener")
@js.native
class TouchListener protected ()
  extends typings.agGrid.touchListenerMod.TouchListener {
  def this(eElement: HTMLElement) = this()
  def this(eElement: HTMLElement, preventMouseClick: Boolean) = this()
}

/* static members */
@JSImport("ag-grid", "TouchListener")
@js.native
object TouchListener extends js.Object {
  var DOUBLE_TAP_MILLIS: js.Any = js.native
  var EVENT_DOUBLE_TAP: String = js.native
  var EVENT_LONG_TAP: String = js.native
  var EVENT_TAP: String = js.native
}

