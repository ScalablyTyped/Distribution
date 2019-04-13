package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityTaskCancelRequestedEventAttributes extends js.Object {
  /**
    * The unique ID of the task.
    */
  var activityId: ActivityId
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelActivityTask decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
}

object ActivityTaskCancelRequestedEventAttributes {
  @scala.inline
  def apply(activityId: ActivityId, decisionTaskCompletedEventId: EventId): ActivityTaskCancelRequestedEventAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId, decisionTaskCompletedEventId = decisionTaskCompletedEventId)
  
    __obj.asInstanceOf[ActivityTaskCancelRequestedEventAttributes]
  }
}

