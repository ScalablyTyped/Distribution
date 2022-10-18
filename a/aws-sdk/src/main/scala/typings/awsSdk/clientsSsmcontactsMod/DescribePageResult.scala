package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePageResult extends StObject {
  
  /**
    * The ARN of the contact that was engaged.
    */
  var ContactArn: SsmContactsArn
  
  /**
    * The secure content of the message that was sent to the contact. Use this field for engagements to VOICE and EMAIL.
    */
  var Content: typings.awsSdk.clientsSsmcontactsMod.Content
  
  /**
    * The time that the contact channel received the engagement.
    */
  var DeliveryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the engagement that engaged the contact channel.
    */
  var EngagementArn: SsmContactsArn
  
  /**
    * The ARN of the incident that engaged the contact channel.
    */
  var IncidentId: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.IncidentId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the engagement to a contact channel.
    */
  var PageArn: SsmContactsArn
  
  /**
    * The insecure content of the message that was sent to the contact. Use this field for engagements to SMS.
    */
  var PublicContent: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.PublicContent] = js.undefined
  
  /**
    * The insecure subject of the message that was sent to the contact. Use this field for engagements to SMS.
    */
  var PublicSubject: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.PublicSubject] = js.undefined
  
  /**
    * The time that the contact channel acknowledged the engagement.
    */
  var ReadTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user that started the engagement.
    */
  var Sender: typings.awsSdk.clientsSsmcontactsMod.Sender
  
  /**
    * The time the engagement was sent to the contact channel.
    */
  var SentTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The secure subject of the message that was sent to the contact. Use this field for engagements to VOICE and EMAIL.
    */
  var Subject: typings.awsSdk.clientsSsmcontactsMod.Subject
}
object DescribePageResult {
  
  inline def apply(
    ContactArn: SsmContactsArn,
    Content: Content,
    EngagementArn: SsmContactsArn,
    PageArn: SsmContactsArn,
    Sender: Sender,
    Subject: Subject
  ): DescribePageResult = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], EngagementArn = EngagementArn.asInstanceOf[js.Any], PageArn = PageArn.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePageResult]
  }
  
  extension [Self <: DescribePageResult](x: Self) {
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Content): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTime(value: js.Date): Self = StObject.set(x, "DeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "DeliveryTime", js.undefined)
    
    inline def setEngagementArn(value: SsmContactsArn): Self = StObject.set(x, "EngagementArn", value.asInstanceOf[js.Any])
    
    inline def setIncidentId(value: IncidentId): Self = StObject.set(x, "IncidentId", value.asInstanceOf[js.Any])
    
    inline def setIncidentIdUndefined: Self = StObject.set(x, "IncidentId", js.undefined)
    
    inline def setPageArn(value: SsmContactsArn): Self = StObject.set(x, "PageArn", value.asInstanceOf[js.Any])
    
    inline def setPublicContent(value: PublicContent): Self = StObject.set(x, "PublicContent", value.asInstanceOf[js.Any])
    
    inline def setPublicContentUndefined: Self = StObject.set(x, "PublicContent", js.undefined)
    
    inline def setPublicSubject(value: PublicSubject): Self = StObject.set(x, "PublicSubject", value.asInstanceOf[js.Any])
    
    inline def setPublicSubjectUndefined: Self = StObject.set(x, "PublicSubject", js.undefined)
    
    inline def setReadTime(value: js.Date): Self = StObject.set(x, "ReadTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "ReadTime", js.undefined)
    
    inline def setSender(value: Sender): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSentTime(value: js.Date): Self = StObject.set(x, "SentTime", value.asInstanceOf[js.Any])
    
    inline def setSentTimeUndefined: Self = StObject.set(x, "SentTime", js.undefined)
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
