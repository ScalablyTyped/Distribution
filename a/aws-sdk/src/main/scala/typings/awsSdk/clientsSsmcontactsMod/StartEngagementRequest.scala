package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEngagementRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact being engaged.
    */
  var ContactId: SsmContactsArn
  
  /**
    * The secure content of the message that was sent to the contact. Use this field for engagements to VOICE or EMAIL.
    */
  var Content: typings.awsSdk.clientsSsmcontactsMod.Content
  
  /**
    * A token ensuring that the operation is called only once with the specified details.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.IdempotencyToken] = js.undefined
  
  /**
    * The ARN of the incident that the engagement is part of.
    */
  var IncidentId: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.IncidentId] = js.undefined
  
  /**
    * The insecure content of the message that was sent to the contact. Use this field for engagements to SMS.
    */
  var PublicContent: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.PublicContent] = js.undefined
  
  /**
    * The insecure subject of the message that was sent to the contact. Use this field for engagements to SMS.
    */
  var PublicSubject: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.PublicSubject] = js.undefined
  
  /**
    * The user that started the engagement.
    */
  var Sender: typings.awsSdk.clientsSsmcontactsMod.Sender
  
  /**
    * The secure subject of the message that was sent to the contact. Use this field for engagements to VOICE or EMAIL.
    */
  var Subject: typings.awsSdk.clientsSsmcontactsMod.Subject
}
object StartEngagementRequest {
  
  inline def apply(ContactId: SsmContactsArn, Content: Content, Sender: Sender, Subject: Subject): StartEngagementRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEngagementRequest]
  }
  
  extension [Self <: StartEngagementRequest](x: Self) {
    
    inline def setContactId(value: SsmContactsArn): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Content): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setIncidentId(value: IncidentId): Self = StObject.set(x, "IncidentId", value.asInstanceOf[js.Any])
    
    inline def setIncidentIdUndefined: Self = StObject.set(x, "IncidentId", js.undefined)
    
    inline def setPublicContent(value: PublicContent): Self = StObject.set(x, "PublicContent", value.asInstanceOf[js.Any])
    
    inline def setPublicContentUndefined: Self = StObject.set(x, "PublicContent", js.undefined)
    
    inline def setPublicSubject(value: PublicSubject): Self = StObject.set(x, "PublicSubject", value.asInstanceOf[js.Any])
    
    inline def setPublicSubjectUndefined: Self = StObject.set(x, "PublicSubject", js.undefined)
    
    inline def setSender(value: Sender): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
