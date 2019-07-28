package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionCompletedEventAttributes extends js.Object {
  /**
    * The results of the Lambda task.
    */
  var result: js.UndefOr[Data] = js.undefined
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this Lambda task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  /**
    * The ID of the LambdaFunctionStarted event recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var startedEventId: EventId
}

object LambdaFunctionCompletedEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, startedEventId: EventId, result: Data = null): LambdaFunctionCompletedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId, startedEventId = startedEventId)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[LambdaFunctionCompletedEventAttributes]
  }
}

