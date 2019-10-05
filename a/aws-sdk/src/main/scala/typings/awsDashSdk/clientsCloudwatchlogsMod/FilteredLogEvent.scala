package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredLogEvent extends js.Object {
  /**
    * The ID of the event.
    */
  var eventId: js.UndefOr[EventId] = js.undefined
  /**
    * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var ingestionTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the log stream to which this event belongs.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.undefined
  /**
    * The data contained in the log event.
    */
  var message: js.UndefOr[EventMessage] = js.undefined
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: js.UndefOr[Timestamp] = js.undefined
}

object FilteredLogEvent {
  @scala.inline
  def apply(
    eventId: EventId = null,
    ingestionTime: Int | Double = null,
    logStreamName: LogStreamName = null,
    message: EventMessage = null,
    timestamp: Int | Double = null
  ): FilteredLogEvent = {
    val __obj = js.Dynamic.literal()
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (ingestionTime != null) __obj.updateDynamic("ingestionTime")(ingestionTime.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName)
    if (message != null) __obj.updateDynamic("message")(message)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredLogEvent]
  }
}

