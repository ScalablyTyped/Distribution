package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageRequest extends js.Object {
  /**
    * A map of key-value pairs, where each key is an address and each value is an AddressConfiguration object. An address can be a push notification token, a phone number, or an email address.
    */
  var Addresses: js.UndefOr[MapOfAddressConfiguration] = js.undefined
  /**
    * A map of custom attributes to attributes to be attached to the message. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOf__string] = js.undefined
  /**
    * A map of key-value pairs, where each key is an endpoint ID and each value is an EndpointSendConfiguration object. Within an EndpointSendConfiguration object, you can tailor the message for an endpoint by specifying message overrides or substitutions.
    */
  var Endpoints: js.UndefOr[MapOfEndpointSendConfiguration] = js.undefined
  /**
    * Message configuration.
    */
  var MessageConfiguration: js.UndefOr[DirectMessageConfiguration] = js.undefined
  /**
    * A unique ID that you can use to trace a message. This ID is visible to recipients.
    */
  var TraceId: js.UndefOr[__string] = js.undefined
}

object MessageRequest {
  @scala.inline
  def apply(
    Addresses: MapOfAddressConfiguration = null,
    Context: MapOf__string = null,
    Endpoints: MapOfEndpointSendConfiguration = null,
    MessageConfiguration: DirectMessageConfiguration = null,
    TraceId: __string = null
  ): MessageRequest = {
    val __obj = js.Dynamic.literal()
    if (Addresses != null) __obj.updateDynamic("Addresses")(Addresses)
    if (Context != null) __obj.updateDynamic("Context")(Context)
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints)
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (TraceId != null) __obj.updateDynamic("TraceId")(TraceId)
    __obj.asInstanceOf[MessageRequest]
  }
}

