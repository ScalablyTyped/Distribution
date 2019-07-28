package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputLogEvent extends js.Object {
  /**
    * The raw event message.
    */
  var message: EventMessage
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: Timestamp
}

object InputLogEvent {
  @scala.inline
  def apply(message: EventMessage, timestamp: Timestamp): InputLogEvent = {
    val __obj = js.Dynamic.literal(message = message, timestamp = timestamp)
  
    __obj.asInstanceOf[InputLogEvent]
  }
}

