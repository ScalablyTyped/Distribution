package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an end docking event. */
trait EndDockingEvent
  extends StObject
     with EventObject {
  
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
  
  @scala.inline
  implicit class EndDockingEventMutableBuilder[Self <: EndDockingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBCancelled(value: Boolean): Self = StObject.set(x, "bCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBFloating(value: Boolean): Self = StObject.set(x, "bFloating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowRectangle(value: Rectangle): Self = StObject.set(x, "WindowRectangle", value.asInstanceOf[js.Any])
  }
}
