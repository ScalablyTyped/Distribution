package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowExecutionMessage extends js.Object {
  /**
    * The type of flow event .
    */
  var eventType: js.UndefOr[FlowExecutionEventType] = js.undefined
  /**
    * The unique identifier of the message.
    */
  var messageId: js.UndefOr[FlowExecutionMessageId] = js.undefined
  /**
    * A string containing information about the flow event.
    */
  var payload: js.UndefOr[FlowExecutionMessagePayload] = js.undefined
  /**
    * The date and time when the message was last updated.
    */
  var timestamp: js.UndefOr[Timestamp] = js.undefined
}

object FlowExecutionMessage {
  @scala.inline
  def apply(
    eventType: FlowExecutionEventType = null,
    messageId: FlowExecutionMessageId = null,
    payload: FlowExecutionMessagePayload = null,
    timestamp: Timestamp = null
  ): FlowExecutionMessage = {
    val __obj = js.Dynamic.literal()
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[FlowExecutionMessage]
  }
}

