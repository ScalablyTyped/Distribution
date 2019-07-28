package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityTaskTimedOutEventAttributes extends js.Object {
  /**
    * Contains the content of the details parameter for the last call made by the activity to RecordActivityTaskHeartbeat.
    */
  var details: js.UndefOr[LimitedData] = js.undefined
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  /**
    * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
  /**
    * The type of the timeout that caused this event.
    */
  var timeoutType: ActivityTaskTimeoutType
}

object ActivityTaskTimedOutEventAttributes {
  @scala.inline
  def apply(
    scheduledEventId: EventId,
    startedEventId: EventId,
    timeoutType: ActivityTaskTimeoutType,
    details: LimitedData = null
  ): ActivityTaskTimedOutEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId, startedEventId = startedEventId, timeoutType = timeoutType.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[ActivityTaskTimedOutEventAttributes]
  }
}

