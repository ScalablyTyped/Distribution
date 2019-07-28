package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    val __obj = js.Dynamic.literal(MousePos = MousePos, Source = Source, TrackingRectangle = TrackingRectangle, bInteractive = bInteractive, bLiveMode = bLiveMode)
  
    __obj.asInstanceOf[DockingEvent]
  }
}

