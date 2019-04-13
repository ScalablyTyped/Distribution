package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionTimedOutEventAttributes extends js.Object {
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  /**
    * The ID of the ActivityTaskStarted event that was recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  /**
    * The type of the timeout that caused this event.
    */
  var timeoutType: js.UndefOr[LambdaFunctionTimeoutType] = js.undefined
}

object LambdaFunctionTimedOutEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId, timeoutType: LambdaFunctionTimeoutType = null): LambdaFunctionTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId, startedEventId = startedEventId)
    if (timeoutType != null) __obj.updateDynamic("timeoutType")(timeoutType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionTimedOutEventAttributes]
  }
}

