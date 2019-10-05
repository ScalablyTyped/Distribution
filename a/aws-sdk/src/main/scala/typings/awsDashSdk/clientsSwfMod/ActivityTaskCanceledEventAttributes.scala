package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityTaskCanceledEventAttributes extends js.Object {
  /**
    * Details of the cancellation.
    */
  var details: js.UndefOr[Data] = js.undefined
  /**
    * If set, contains the ID of the last ActivityTaskCancelRequested event recorded for this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var latestCancelRequestedEventId: js.UndefOr[EventId] = js.undefined
  /**
    * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var scheduledEventId: EventId
  /**
    * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var startedEventId: EventId
}

object ActivityTaskCanceledEventAttributes {
  @scala.inline
  def apply(
    scheduledEventId: EventId,
    startedEventId: EventId,
    details: Data = null,
    latestCancelRequestedEventId: Int | Double = null
  ): ActivityTaskCanceledEventAttributes = {
    val __obj = js.Dynamic.literal(scheduledEventId = scheduledEventId, startedEventId = startedEventId)
    if (details != null) __obj.updateDynamic("details")(details)
    if (latestCancelRequestedEventId != null) __obj.updateDynamic("latestCancelRequestedEventId")(latestCancelRequestedEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskCanceledEventAttributes]
  }
}

