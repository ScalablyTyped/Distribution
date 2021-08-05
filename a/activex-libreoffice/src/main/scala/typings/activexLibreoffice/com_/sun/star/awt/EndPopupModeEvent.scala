package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an end pop-up mode event. */
trait EndPopupModeEvent
  extends StObject
     with EventObject {
  
  /** specifies the new position of the floating window in frame coordinates if bTearoff is `TRUE` */
  var FloatingPosition: Point
  
  /**
    * specifies how the pop-up mode was ended `TRUE` means the window should be teared-off and positioned at FloatingPosition `FALSE` means the window was
    * closed
    */
  var bTearoff: Boolean
}
object EndPopupModeEvent {
  
  inline def apply(FloatingPosition: Point, Source: XInterface, bTearoff: Boolean): EndPopupModeEvent = {
    val __obj = js.Dynamic.literal(FloatingPosition = FloatingPosition.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], bTearoff = bTearoff.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPopupModeEvent]
  }
  
  extension [Self <: EndPopupModeEvent](x: Self) {
    
    inline def setBTearoff(value: Boolean): Self = StObject.set(x, "bTearoff", value.asInstanceOf[js.Any])
    
    inline def setFloatingPosition(value: Point): Self = StObject.set(x, "FloatingPosition", value.asInstanceOf[js.Any])
  }
}
