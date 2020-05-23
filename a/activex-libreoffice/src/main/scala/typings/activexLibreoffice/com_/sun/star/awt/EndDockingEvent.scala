package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an end docking event. */
trait EndDockingEvent extends EventObject {
  /** specifies the new bounding rectangle of the window */
  var WindowRectangle: Rectangle
  /** specifies that the docking procedure was canceled */
  var bCancelled: Boolean
  /** specifies if the window is now floating `TRUE` or docked `FALSE` */
  var bFloating: Boolean
}

object EndDockingEvent {
  @scala.inline
  def apply(Source: XInterface, WindowRectangle: Rectangle, bCancelled: Boolean, bFloating: Boolean): EndDockingEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], WindowRectangle = WindowRectangle.asInstanceOf[js.Any], bCancelled = bCancelled.asInstanceOf[js.Any], bFloating = bFloating.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDockingEvent]
  }
}

