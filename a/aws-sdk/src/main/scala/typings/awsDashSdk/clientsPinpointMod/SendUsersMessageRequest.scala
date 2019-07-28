package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendUsersMessageRequest extends js.Object {
  /**
    * A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
    */
  var Context: js.UndefOr[MapOf__string] = js.undefined
  /**
    * The message definitions for the default message and any default messages that you defined for specific channels.
    */
  var MessageConfiguration: DirectMessageConfiguration
  /**
    * The unique identifier for tracing the message. This identifier is visible to message recipients.
    */
  var TraceId: js.UndefOr[__string] = js.undefined
  /**
    * A map that associates user IDs with EndpointSendConfiguration objects. You can use an EndpointSendConfiguration object to tailor the message for a user by specifying settings such as content overrides and message variables.
    */
  var Users: MapOfEndpointSendConfiguration
}

object SendUsersMessageRequest {
  @scala.inline
  def apply(
    MessageConfiguration: DirectMessageConfiguration,
    Users: MapOfEndpointSendConfiguration,
    Context: MapOf__string = null,
    TraceId: __string = null
  ): SendUsersMessageRequest = {
    val __obj = js.Dynamic.literal(MessageConfiguration = MessageConfiguration, Users = Users)
    if (Context != null) __obj.updateDynamic("Context")(Context)
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId)
    __obj.asInstanceOf[SendUsersMessageRequest]
  }
}

