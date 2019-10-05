package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartLambdaFunctionFailedEventAttributes extends js.Object {
  /**
    * The cause of the failure. To help diagnose issues, use this information to trace back the chain of events leading up to this event.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because the IAM role attached to the execution lacked sufficient permissions. For details and example IAM policies, see Lambda Tasks in the Amazon SWF Developer Guide. 
    */
  var cause: js.UndefOr[StartLambdaFunctionFailedCause] = js.undefined
  /**
    * A description that can help diagnose the cause of the fault.
    */
  var message: js.UndefOr[CauseMessage] = js.undefined
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
    */
  var scheduledEventId: js.UndefOr[EventId] = js.undefined
}

object StartLambdaFunctionFailedEventAttributes {
  @scala.inline
  def apply(
    cause: StartLambdaFunctionFailedCause = null,
    message: CauseMessage = null,
    scheduledEventId: Int | Double = null
  ): StartLambdaFunctionFailedEventAttributes = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (scheduledEventId != null) __obj.updateDynamic("scheduledEventId")(scheduledEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLambdaFunctionFailedEventAttributes]
  }
}

