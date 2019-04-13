package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOutboundVoiceContactRequest extends js.Object {
  /**
    * Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes. There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters. For example, if you want play a greeting when the customer answers the call, you can pass the customer name in attributes similar to the following:
    */
  var Attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is disconnected, a new contact is started.
    */
  var ClientToken: js.UndefOr[ClientToken] = js.undefined
  /**
    * The identifier for the contact flow to connect the outbound call to. To find the ContactFlowId, open the contact flow you want to use in the Amazon Connect contact flow editor. The ID for the contact flow is displayed in the address bar as part of the URL. For example, the contact flow ID is the set of characters at the end of the URL, after 'contact-flow/' such as 78ea8fd5-2659-4f2b-b528-699760ccfc1b.
    */
  var ContactFlowId: awsDashSdkLib.clientsConnectMod.ContactFlowId
  /**
    * The phone number of the customer in E.164 format.
    */
  var DestinationPhoneNumber: PhoneNumber
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: awsDashSdkLib.clientsConnectMod.InstanceId
  /**
    * The queue to add the call to. If you specify a queue, the phone displayed for caller ID is the phone number specified in the queue. If you do not specify a queue, the queue used will be the queue defined in the contact flow. To find the QueueId, open the queue you want to use in the Amazon Connect Queue editor. The ID for the queue is displayed in the address bar as part of the URL. For example, the queue ID is the set of characters at the end of the URL, after 'queue/' such as queue/aeg40574-2d01-51c3-73d6-bf8624d2168c.
    */
  var QueueId: js.UndefOr[QueueId] = js.undefined
  /**
    * The phone number, in E.164 format, associated with your Amazon Connect instance to use for the outbound call.
    */
  var SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
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
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId, DestinationPhoneNumber = DestinationPhoneNumber, InstanceId = InstanceId)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (QueueId != null) __obj.updateDynamic("QueueId")(QueueId)
    if (SourcePhoneNumber != null) __obj.updateDynamic("SourcePhoneNumber")(SourcePhoneNumber)
    __obj.asInstanceOf[StartOutboundVoiceContactRequest]
  }
}

