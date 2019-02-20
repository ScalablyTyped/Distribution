package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a docking event. */
trait DockingEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** specifies the current mouse position in frame coordinates */
  var MousePos: Point
  /** specifies the current tracking rectangle */
  var TrackingRectangle: Rectangle
  /**
    * specifies if the docking procedure is interactive which means that the user is currently dragging the window to a new position if this member is
    * `FALSE` the window will be docked or undocked immediately using the returned tracking rectangle
    */
  var bInteractive: scala.Boolean
  /** specifies if the layout should be adjusted immediately */
  var bLiveMode: scala.Boolean
}

