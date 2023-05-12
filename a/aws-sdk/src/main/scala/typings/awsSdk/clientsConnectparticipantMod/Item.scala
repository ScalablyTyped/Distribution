package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  /**
    * The time when the message or event was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.undefined
  
  /**
    * Provides information about the attachments.
    */
  var Attachments: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.Attachments] = js.undefined
  
  /**
    * The contactId on which the transcript item was originally sent. This field is populated only when the transcript item is from the current chat session.
    */
  var ContactId: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.ContactId] = js.undefined
  
  /**
    * The content of the message or event.
    */
  var Content: js.UndefOr[ChatContent] = js.undefined
  
  /**
    * The type of content of the item.
    */
  var ContentType: js.UndefOr[ChatContentType] = js.undefined
  
  /**
    * The chat display name of the sender.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.DisplayName] = js.undefined
  
  /**
    * The ID of the item.
    */
  var Id: js.UndefOr[ChatItemId] = js.undefined
  
  /**
    * The metadata related to the message. Currently this supports only information related to message receipts.
    */
  var MessageMetadata: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.MessageMetadata] = js.undefined
  
  /**
    * The ID of the sender in the session.
    */
  var ParticipantId: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.ParticipantId] = js.undefined
  
  /**
    * The role of the sender. For example, is it a customer, agent, or system.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.ParticipantRole] = js.undefined
  
  /**
    * The contactId on which the transcript item was originally sent. This field is only populated for persistent chats when the transcript item is from the past chat session. For more information, see Enable persistent chat.
    */
  var RelatedContactId: js.UndefOr[ContactId] = js.undefined
  
  /**
    * Type of the item: message or event. 
    */
  var Type: js.UndefOr[ChatItemType] = js.undefined
}
object Item {
  
  inline def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    inline def setAbsoluteTime(value: Instant): Self = StObject.set(x, "AbsoluteTime", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteTimeUndefined: Self = StObject.set(x, "AbsoluteTime", js.undefined)
    
    inline def setAttachments(value: Attachments): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: AttachmentItem*): Self = StObject.set(x, "Attachments", js.Array(value*))
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
    
    inline def setContent(value: ChatContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ChatContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setId(value: ChatItemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMessageMetadata(value: MessageMetadata): Self = StObject.set(x, "MessageMetadata", value.asInstanceOf[js.Any])
    
    inline def setMessageMetadataUndefined: Self = StObject.set(x, "MessageMetadata", js.undefined)
    
    inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "ParticipantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "ParticipantId", js.undefined)
    
    inline def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "ParticipantRole", js.undefined)
    
    inline def setRelatedContactId(value: ContactId): Self = StObject.set(x, "RelatedContactId", value.asInstanceOf[js.Any])
    
    inline def setRelatedContactIdUndefined: Self = StObject.set(x, "RelatedContactId", js.undefined)
    
    inline def setType(value: ChatItemType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
