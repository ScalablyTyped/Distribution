package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionFailedEventAttributes extends js.Object {
  /**
    * The details of the failure.
    */
  var details: js.UndefOr[Data] = js.undefined
  /**
    * The reason provided for the failure.
    */
  var reason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  /**
    * The ID of the LambdaFunctionStarted event recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var startedEventId: EventId
}

object LambdaFunctionFailedEventAttributes {
  @scala.inline
  def apply(
    scheduledEventId: EventId,
    startedEventId: EventId,
    details: Data = null,
    reason: FailureReason = null
  ): LambdaFunctionFailedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId, startedEventId = startedEventId)
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[LambdaFunctionFailedEventAttributes]
  }
}

