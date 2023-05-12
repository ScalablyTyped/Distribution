package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChatContactRequest extends StObject {
  
  /**
    * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes. They can be accessed in flows just like any other contact attributes.  There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: js.UndefOr[typings.awsSdk.clientsConnectMod.Attributes] = js.undefined
  
  /**
    * The total duration of the newly started chat session. If not specified, the chat session duration defaults to 25 hour. The minimum configurable time is 60 minutes. The maximum configurable time is 10,080 minutes (7 days).
    */
  var ChatDurationInMinutes: js.UndefOr[typings.awsSdk.clientsConnectMod.ChatDurationInMinutes] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * The identifier of the flow for initiating the chat. To see the ContactFlowId in the Amazon Connect console user interface, on the navigation menu go to Routing, Contact Flows. Choose the flow. On the flow page, under the name of the flow, choose Show additional flow information. The ContactFlowId is the last part of the ARN, shown here in bold:  arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/846ec553-a005-41c0-8341-xxxxxxxxxxxx 
    */
  var ContactFlowId: typings.awsSdk.clientsConnectMod.ContactFlowId
  
  /**
    * The initial message to be sent to the newly created chat.
    */
  var InitialMessage: js.UndefOr[ChatMessage] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * Information identifying the participant.
    */
  var ParticipantDetails: typings.awsSdk.clientsConnectMod.ParticipantDetails
  
  /**
    * Enable persistent chats. For more information about enabling persistent chat, and for example use cases and how to configure for them, see Enable persistent chat.
    */
  var PersistentChat: js.UndefOr[typings.awsSdk.clientsConnectMod.PersistentChat] = js.undefined
  
  /**
    * The unique identifier for an Amazon Connect contact. This identifier is related to the chat starting.  You cannot provide data for both RelatedContactId and PersistentChat.  
    */
  var RelatedContactId: js.UndefOr[ContactId] = js.undefined
  
  /**
    * The supported chat message content types. Supported types are text/plain, text/markdown, application/json, application/vnd.amazonaws.connect.message.interactive, and application/vnd.amazonaws.connect.message.interactive.response.  Content types must always contain text/plain. You can then put any other supported type in the list. For example, all the following lists are valid because they contain text/plain: [text/plain, text/markdown, application/json], [text/markdown, text/plain], [text/plain, application/json, application/vnd.amazonaws.connect.message.interactive.response].   The type application/vnd.amazonaws.connect.message.interactive is required to use the Show view flow block. 
    */
  var SupportedMessagingContentTypes: js.UndefOr[typings.awsSdk.clientsConnectMod.SupportedMessagingContentTypes] = js.undefined
}
object StartChatContactRequest {
  
  inline def apply(ContactFlowId: ContactFlowId, InstanceId: InstanceId, ParticipantDetails: ParticipantDetails): StartChatContactRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], ParticipantDetails = ParticipantDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChatContactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartChatContactRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setChatDurationInMinutes(value: ChatDurationInMinutes): Self = StObject.set(x, "ChatDurationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setChatDurationInMinutesUndefined: Self = StObject.set(x, "ChatDurationInMinutes", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setInitialMessage(value: ChatMessage): Self = StObject.set(x, "InitialMessage", value.asInstanceOf[js.Any])
    
    inline def setInitialMessageUndefined: Self = StObject.set(x, "InitialMessage", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setParticipantDetails(value: ParticipantDetails): Self = StObject.set(x, "ParticipantDetails", value.asInstanceOf[js.Any])
    
    inline def setPersistentChat(value: PersistentChat): Self = StObject.set(x, "PersistentChat", value.asInstanceOf[js.Any])
    
    inline def setPersistentChatUndefined: Self = StObject.set(x, "PersistentChat", js.undefined)
    
    inline def setRelatedContactId(value: ContactId): Self = StObject.set(x, "RelatedContactId", value.asInstanceOf[js.Any])
    
    inline def setRelatedContactIdUndefined: Self = StObject.set(x, "RelatedContactId", js.undefined)
    
    inline def setSupportedMessagingContentTypes(value: SupportedMessagingContentTypes): Self = StObject.set(x, "SupportedMessagingContentTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedMessagingContentTypesUndefined: Self = StObject.set(x, "SupportedMessagingContentTypes", js.undefined)
    
    inline def setSupportedMessagingContentTypesVarargs(value: SupportedMessagingContentType*): Self = StObject.set(x, "SupportedMessagingContentTypes", js.Array(value*))
  }
}
