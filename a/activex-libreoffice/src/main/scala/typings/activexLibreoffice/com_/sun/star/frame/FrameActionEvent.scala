package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this event struct is broadcast for actions which can happen to components within frames
  * @see XFrameActionListener
  */
trait FrameActionEvent
  extends StObject
     with EventObject {
  
  /** specifies the concrete event */
  var Action: FrameAction
  
  /** contains the frame in which the event occurred */
  var Frame: XFrame
}
object FrameActionEvent {
  
  inline def apply(Action: FrameAction, Frame: XFrame, Source: XInterface): FrameActionEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameActionEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameActionEvent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: FrameAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: XFrame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
  }
}
