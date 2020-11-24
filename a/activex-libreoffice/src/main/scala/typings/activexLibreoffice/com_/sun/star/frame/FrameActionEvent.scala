package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this event struct is broadcast for actions which can happen to components within frames
  * @see XFrameActionListener
  */
@js.native
trait FrameActionEvent extends EventObject {
  
  /** specifies the concrete event */
  var Action: FrameAction = js.native
  
  /** contains the frame in which the event occurred */
  var Frame: XFrame = js.native
}
object FrameActionEvent {
  
  @scala.inline
  def apply(Action: FrameAction, Frame: XFrame, Source: XInterface): FrameActionEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameActionEvent]
  }
  
  @scala.inline
  implicit class FrameActionEventOps[Self <: FrameActionEvent] (val x: Self) extends AnyVal {
    
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
    def setAction(value: FrameAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: XFrame): Self = this.set("Frame", value.asInstanceOf[js.Any])
  }
}
