package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTaskCancelRequestedEventAttributes extends js.Object {
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelActivityTask decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
}

object ActivityTaskCancelRequestedEventAttributes {
  @scala.inline
  def apply(activityId: ActivityId, decisionTaskCompletedEventId: EventId): ActivityTaskCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityTaskCancelRequestedEventAttributes]
  }
}

