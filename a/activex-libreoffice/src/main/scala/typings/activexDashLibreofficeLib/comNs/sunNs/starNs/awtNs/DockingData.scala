package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** data returned by docking handler */
trait DockingData extends js.Object {
  /** specifies the position and size where the window would be placed if the user releases the mouse */
  var TrackingRectangle: Rectangle
  /** specifies that the window should be floating (TRUE) or docked (FALSE) */
  var bFloating: scala.Boolean
}

object DockingData {
  @scala.inline
  def apply(TrackingRectangle: Rectangle, bFloating: scala.Boolean): DockingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TrackingRectangle")(TrackingRectangle)
    __obj.updateDynamic("bFloating")(bFloating)
    __obj.asInstanceOf[DockingData]
  }
}

