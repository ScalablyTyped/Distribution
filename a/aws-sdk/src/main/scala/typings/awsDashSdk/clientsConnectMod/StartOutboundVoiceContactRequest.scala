package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOutboundVoiceContactRequest extends js.Object {
  /**
    * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes. There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Attributes] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is disconnected, a new contact is started.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.ClientToken] = js.native
  /**
    * The identifier of the contact flow for the outbound call.
    */
  var ContactFlowId: typings.awsDashSdk.clientsConnectMod.ContactFlowId = js.native
  /**
    * The phone number of the customer, in E.164 format.
    */
  var DestinationPhoneNumber: PhoneNumber = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId = js.native
  /**
    * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If you do not specify a queue, you must specify a source phone number.
    */
  var QueueId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.QueueId] = js.native
  /**
    * The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a source phone number, you must specify a queue.
    */
  var SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.native
}

object StartOutboundVoiceContactRequest {
  @scala.inline
  def apply(
    ContactFlowId: ContactFlowId,
    DestinationPhoneNumber: PhoneNumber,
    InstanceId: InstanceId,
    Attributes: Attributes = null,
    ClientToken: ClientToken = null,
    QueueId: QueueId = null,
    SourcePhoneNumber: PhoneNumber = null
  ): StartOutboundVoiceContactRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], DestinationPhoneNumber = DestinationPhoneNumber.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (QueueId != null) __obj.updateDynamic("QueueId")(QueueId.asInstanceOf[js.Any])
    if (SourcePhoneNumber != null) __obj.updateDynamic("SourcePhoneNumber")(SourcePhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOutboundVoiceContactRequest]
  }
}

