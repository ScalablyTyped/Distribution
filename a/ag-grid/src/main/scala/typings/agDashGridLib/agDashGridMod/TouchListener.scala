package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "TouchListener")
@js.native
class TouchListener protected ()
  extends agDashGridLib.distLibWidgetsTouchListenerMod.TouchListener {
  def this(eElement: stdLib.HTMLElement) = this()
  def this(eElement: stdLib.HTMLElement, preventMouseClick: scala.Boolean) = this()
}

/* static members */
@JSImport("ag-grid", "TouchListener")
@js.native
object TouchListener extends js.Object {
  var DOUBLE_TAP_MILLIS: js.Any = js.native
  var EVENT_DOUBLE_TAP: java.lang.String = js.native
  var EVENT_LONG_TAP: java.lang.String = js.native
  var EVENT_TAP: java.lang.String = js.native
}

