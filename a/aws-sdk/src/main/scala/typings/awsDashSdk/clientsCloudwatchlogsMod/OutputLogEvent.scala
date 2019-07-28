package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputLogEvent extends js.Object {
  /**
    * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var ingestionTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The data contained in the log event.
    */
  var message: js.UndefOr[EventMessage] = js.undefined
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: js.UndefOr[Timestamp] = js.undefined
}

object OutputLogEvent {
  @scala.inline
  def apply(
    ingestionTime: js.UndefOr[Timestamp] = js.undefined,
    message: EventMessage = null,
    timestamp: js.UndefOr[Timestamp] = js.undefined
  ): OutputLogEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ingestionTime)) __obj.updateDynamic("ingestionTime")(ingestionTime)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[OutputLogEvent]
  }
}

