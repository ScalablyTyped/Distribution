package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a docking event. */
trait DockingEvent
  extends StObject
     with EventObject {
  
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
  
  inline def apply(
    MousePos: Point,
    Source: XInterface,
    TrackingRectangle: Rectangle,
    bInteractive: Boolean,
    bLiveMode: Boolean
  ): DockingEvent = {
    val __obj = js.Dynamic.literal(MousePos = MousePos.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], TrackingRectangle = TrackingRectangle.asInstanceOf[js.Any], bInteractive = bInteractive.asInstanceOf[js.Any], bLiveMode = bLiveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockingEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DockingEvent] (val x: Self) extends AnyVal {
    
    inline def setBInteractive(value: Boolean): Self = StObject.set(x, "bInteractive", value.asInstanceOf[js.Any])
    
    inline def setBLiveMode(value: Boolean): Self = StObject.set(x, "bLiveMode", value.asInstanceOf[js.Any])
    
    inline def setMousePos(value: Point): Self = StObject.set(x, "MousePos", value.asInstanceOf[js.Any])
    
    inline def setTrackingRectangle(value: Rectangle): Self = StObject.set(x, "TrackingRectangle", value.asInstanceOf[js.Any])
  }
}
