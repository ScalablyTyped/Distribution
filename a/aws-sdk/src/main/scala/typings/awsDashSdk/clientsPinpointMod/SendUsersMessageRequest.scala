package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendUsersMessageRequest extends js.Object {
  /**
    * A map of custom attribute-value pairs. For a push notification, Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
    */
  var Context: js.UndefOr[MapOf__string] = js.native
  /**
    * The settings and content for the default message and any default messages that you defined for specific channels.
    */
  var MessageConfiguration: DirectMessageConfiguration = js.native
  /**
    * The message template to use for the message.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.TemplateConfiguration] = js.native
  /**
    * The unique identifier for tracing the message. This identifier is visible to message recipients.
    */
  var TraceId: js.UndefOr[__string] = js.native
  /**
    * A map that associates user IDs with EndpointSendConfiguration objects. You can use an EndpointSendConfiguration object to tailor the message for a user by specifying settings such as content overrides and message variables.
    */
  var Users: MapOfEndpointSendConfiguration = js.native
}

object SendUsersMessageRequest {
  @scala.inline
  def apply(
    MessageConfiguration: DirectMessageConfiguration,
    Users: MapOfEndpointSendConfiguration,
    Context: MapOf__string = null,
    TemplateConfiguration: TemplateConfiguration = null,
    TraceId: __string = null
  ): SendUsersMessageRequest = {
    val __obj = js.Dynamic.literal(MessageConfiguration = MessageConfiguration.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (TemplateConfiguration != null) __obj.updateDynamic("TemplateConfiguration")(TemplateConfiguration.asInstanceOf[js.Any])
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessageRequest]
  }
}

