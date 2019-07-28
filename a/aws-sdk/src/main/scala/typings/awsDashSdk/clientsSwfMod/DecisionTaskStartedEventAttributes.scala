package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecisionTaskStartedEventAttributes extends js.Object {
  /**
    * Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.undefined
  /**
    * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
}

object DecisionTaskStartedEventAttributes {
  @scala.inline
  def apply(scheduledEventId: EventId, identity: Identity = null): DecisionTaskStartedEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    __obj.asInstanceOf[DecisionTaskStartedEventAttributes]
  }
}

