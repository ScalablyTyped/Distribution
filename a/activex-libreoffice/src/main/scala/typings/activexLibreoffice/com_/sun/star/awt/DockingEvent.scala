package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a docking event. */
trait DockingEvent extends EventObject {
  /** specifies the current mouse position in frame coordinates */
  var MousePos: Point
  /** specifies the current tracking rectangle */
  var TrackingRectangle: Rectangle
  /**
    * specifies if the docking procedure is interactive which means that the user is currently dragging the window to a new position if this member is
    * `FALSE` the window will be docked or undocked immediately using the returned tracking rectangle
    */
  var bInteractive: Boolean
  /** specifies if the layout should be adjusted immediately */
  var bLiveMode: Boolean
}

object DockingEvent {
  @scala.inline
  def apply(
    MousePos: Point,
    Source: XInterface,
    TrackingRectangle: Rectangle,
    bInteractive: Boolean,
    bLiveMode: Boolean
  ): DockingEvent = {
    val __obj = js.Dynamic.literal(MousePos = MousePos.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], TrackingRectangle = TrackingRectangle.asInstanceOf[js.Any], bInteractive = bInteractive.asInstanceOf[js.Any], bLiveMode = bLiveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockingEvent]
  }
}

