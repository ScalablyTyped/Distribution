package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an event from the mouse.
  *
  * This event is also used for pop-up menu requests on objects. See {@link PopupTrigger} for details.
  * @see XMouseListener
  * @see XMouseMotionListener
  * @see InputEvent
  */
trait MouseEvent
  extends StObject
     with InputEvent {
  
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
  
  inline def apply(
    Buttons: Double,
    ClickCount: Double,
    Modifiers: Double,
    PopupTrigger: Boolean,
    Source: XInterface,
    X: Double,
    Y: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(Buttons = Buttons.asInstanceOf[js.Any], ClickCount = ClickCount.asInstanceOf[js.Any], Modifiers = Modifiers.asInstanceOf[js.Any], PopupTrigger = PopupTrigger.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
  
  extension [Self <: MouseEvent](x: Self) {
    
    inline def setButtons(value: Double): Self = StObject.set(x, "Buttons", value.asInstanceOf[js.Any])
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "ClickCount", value.asInstanceOf[js.Any])
    
    inline def setPopupTrigger(value: Boolean): Self = StObject.set(x, "PopupTrigger", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
