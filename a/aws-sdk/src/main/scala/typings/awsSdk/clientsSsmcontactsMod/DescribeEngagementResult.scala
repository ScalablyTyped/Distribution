package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEngagementResult extends StObject {
  
  /**
    * The ARN of the escalation plan or contacts involved in the engagement.
    */
  var ContactArn: SsmContactsArn
  
  /**
    * The secure content of the message that was sent to the contact. Use this field for engagements to VOICE and EMAIL.
    */
  var Content: typings.awsSdk.clientsSsmcontactsMod.Content
  
  /**
    * The ARN of the engagement.
    */
  var EngagementArn: SsmContactsArn
  
  /**
    * The ARN of the incident in which the engagement occurred.
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
    * The time that the engagement started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the engagement ended.
    */
  var StopTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The secure subject of the message that was sent to the contact. Use this field for engagements to VOICE and EMAIL.
    */
  var Subject: typings.awsSdk.clientsSsmcontactsMod.Subject
}
object DescribeEngagementResult {
  
  inline def apply(
    ContactArn: SsmContactsArn,
    Content: Content,
    EngagementArn: SsmContactsArn,
    Sender: Sender,
    Subject: Subject
  ): DescribeEngagementResult = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], EngagementArn = EngagementArn.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEngagementResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEngagementResult] (val x: Self) extends AnyVal {
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Content): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setEngagementArn(value: SsmContactsArn): Self = StObject.set(x, "EngagementArn", value.asInstanceOf[js.Any])
    
    inline def setIncidentId(value: IncidentId): Self = StObject.set(x, "IncidentId", value.asInstanceOf[js.Any])
    
    inline def setIncidentIdUndefined: Self = StObject.set(x, "IncidentId", js.undefined)
    
    inline def setPublicContent(value: PublicContent): Self = StObject.set(x, "PublicContent", value.asInstanceOf[js.Any])
    
    inline def setPublicContentUndefined: Self = StObject.set(x, "PublicContent", js.undefined)
    
    inline def setPublicSubject(value: PublicSubject): Self = StObject.set(x, "PublicSubject", value.asInstanceOf[js.Any])
    
    inline def setPublicSubjectUndefined: Self = StObject.set(x, "PublicSubject", js.undefined)
    
    inline def setSender(value: Sender): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStopTime(value: js.Date): Self = StObject.set(x, "StopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "StopTime", js.undefined)
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
