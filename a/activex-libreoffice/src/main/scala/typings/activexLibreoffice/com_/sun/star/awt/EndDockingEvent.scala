package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an end docking event. */
@js.native
trait EndDockingEvent extends EventObject {
  /** specifies the new bounding rectangle of the window */
  var WindowRectangle: Rectangle = js.native
  /** specifies that the docking procedure was canceled */
  var bCancelled: Boolean = js.native
  /** specifies if the window is now floating `TRUE` or docked `FALSE` */
  var bFloating: Boolean = js.native
}

object EndDockingEvent {
  @scala.inline
  def apply(Source: XInterface, WindowRectangle: Rectangle, bCancelled: Boolean, bFloating: Boolean): EndDockingEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], WindowRectangle = WindowRectangle.asInstanceOf[js.Any], bCancelled = bCancelled.asInstanceOf[js.Any], bFloating = bFloating.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDockingEvent]
  }
  @scala.inline
  implicit class EndDockingEventOps[Self <: EndDockingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWindowRectangle(value: Rectangle): Self = this.set("WindowRectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBCancelled(value: Boolean): Self = this.set("bCancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def setBFloating(value: Boolean): Self = this.set("bFloating", value.asInstanceOf[js.Any])
  }
  
}

