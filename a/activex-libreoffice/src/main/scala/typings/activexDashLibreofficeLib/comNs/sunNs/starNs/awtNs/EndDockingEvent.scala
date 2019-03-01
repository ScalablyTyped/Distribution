package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an end docking event. */
trait EndDockingEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** specifies the new bounding rectangle of the window */
  var WindowRectangle: Rectangle
  /** specifies that the docking procedure was canceled */
  var bCancelled: scala.Boolean
  /** specifies if the window is now floating `TRUE` or docked `FALSE` */
  var bFloating: scala.Boolean
}

object EndDockingEvent {
  @scala.inline
  def apply(
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    WindowRectangle: Rectangle,
    bCancelled: scala.Boolean,
    bFloating: scala.Boolean
  ): EndDockingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("WindowRectangle")(WindowRectangle)
    __obj.updateDynamic("bCancelled")(bCancelled)
    __obj.updateDynamic("bFloating")(bFloating)
    __obj.asInstanceOf[EndDockingEvent]
  }
}

