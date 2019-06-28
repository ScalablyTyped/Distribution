package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageRequest extends js.Object {
  /**
    * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address. You can use an AddressConfiguration object to tailor the message for an address by specifying settings such as content overrides and message variables.
    */
  var Addresses: js.UndefOr[MapOfAddressConfiguration] = js.undefined
  /**
    * A map of custom attributes to attach to the message. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOf__string] = js.undefined
  /**
    * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. You can use an EndpointSendConfiguration object to tailor the message for an endpoint by specifying settings such as content overrides and message variables.
    */
  var Endpoints: js.UndefOr[MapOfEndpointSendConfiguration] = js.undefined
  /**
    * The set of properties that defines the configuration settings for the message.
    */
  var MessageConfiguration: DirectMessageConfiguration
  /**
    * The unique identifier for tracing the message. This identifier is visible to message recipients.
    */
  var TraceId: js.UndefOr[__string] = js.undefined
}

object MessageRequest {
  @scala.inline
  def apply(
    MessageConfiguration: DirectMessageConfiguration,
    Addresses: MapOfAddressConfiguration = null,
    Context: MapOf__string = null,
    Endpoints: MapOfEndpointSendConfiguration = null,
    TraceId: __string = null
  ): MessageRequest = {
    val __obj = js.Dynamic.literal(MessageConfiguration = MessageConfiguration)
    if (Addresses != null) __obj.updateDynamic("Addresses")(Addresses)
    if (Context != null) __obj.updateDynamic("Context")(Context)
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints)
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId)
    __obj.asInstanceOf[MessageRequest]
  }
}

