package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this event struct is broadcast for actions which can happen to components within frames
  * @see XFrameActionListener
  */
trait FrameActionEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** specifies the concrete event */
  var Action: FrameAction
  /** contains the frame in which the event occurred */
  var Frame: XFrame
}

object FrameActionEvent {
  @scala.inline
  def apply(
    Action: FrameAction,
    Frame: XFrame,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): FrameActionEvent = {
    val __obj = js.Dynamic.literal(Action = Action, Frame = Frame, Source = Source)
  
    __obj.asInstanceOf[FrameActionEvent]
  }
}

