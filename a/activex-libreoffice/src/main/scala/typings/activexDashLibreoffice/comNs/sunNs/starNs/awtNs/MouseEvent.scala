package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an event from the mouse.
  *
  * This event is also used for pop-up menu requests on objects. See {@link PopupTrigger} for details.
  * @see XMouseListener
  * @see XMouseMotionListener
  * @see InputEvent
  */
trait MouseEvent extends InputEvent {
  /**
    * contains the pressed mouse buttons.
    *
    * Zero ore more constants from the {@link com.sun.star.awt.MouseButton} group.
    */
  var Buttons: Double
  /** contains the number of mouse clicks associated with event. */
  var ClickCount: Double
  /**
    * specifies if this event is a pop-up menu trigger event.
    *
    * If this member is `TRUE` , the event describes a request for a pop-up menu, also known as context menu, on an object.
    *
    * In this case, X and Y describe the position where the request was issued. If those members are `-1` , then the request was issued using the keyboard,
    * by pressing the operating-system dependent key combination for this purpose.
    * @see XMouseListener.mousePressed
    */
  var PopupTrigger: Boolean
  /** contains the x coordinate location of the mouse. */
  var X: Double
  /** contains the y coordinate location of the mouse. */
  var Y: Double
}

object MouseEvent {
  @scala.inline
  def apply(
    Buttons: Double,
    ClickCount: Double,
    Modifiers: Double,
    PopupTrigger: Boolean,
    Source: XInterface,
    X: Double,
    Y: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(Buttons = Buttons, ClickCount = ClickCount, Modifiers = Modifiers, PopupTrigger = PopupTrigger, Source = Source, X = X, Y = Y)
  
    __obj.asInstanceOf[MouseEvent]
  }
}

