package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** data returned by docking handler */
trait DockingData extends js.Object {
  /** specifies the position and size where the window would be placed if the user releases the mouse */
  var TrackingRectangle: Rectangle
  /** specifies that the window should be floating (TRUE) or docked (FALSE) */
  var bFloating: Boolean
}

object DockingData {
  @scala.inline
  def apply(TrackingRectangle: Rectangle, bFloating: Boolean): DockingData = {
    val __obj = js.Dynamic.literal(TrackingRectangle = TrackingRectangle.asInstanceOf[js.Any], bFloating = bFloating.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockingData]
  }
}

