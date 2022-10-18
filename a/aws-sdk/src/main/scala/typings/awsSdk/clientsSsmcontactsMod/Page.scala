package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  /**
    * The ARN of the contact that Incident Manager is engaging.
    */
  var ContactArn: SsmContactsArn
  
  /**
    * The time the message was delivered to the contact channel.
    */
  var DeliveryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the engagement that this page is part of.
    */
  var EngagementArn: SsmContactsArn
  
  /**
    * The ARN of the incident that's engaging the contact channel.
    */
  var IncidentId: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.IncidentId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the page to the contact channel.
    */
  var PageArn: SsmContactsArn
  
  /**
    * The time that the contact channel acknowledged engagement.
    */
  var ReadTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user that started the engagement.
    */
  var Sender: typings.awsSdk.clientsSsmcontactsMod.Sender
  
  /**
    * The time that Incident Manager engaged the contact channel.
    */
  var SentTime: js.UndefOr[js.Date] = js.undefined
}
object Page {
  
  inline def apply(ContactArn: SsmContactsArn, EngagementArn: SsmContactsArn, PageArn: SsmContactsArn, Sender: Sender): Page = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any], EngagementArn = EngagementArn.asInstanceOf[js.Any], PageArn = PageArn.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  extension [Self <: Page](x: Self) {
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTime(value: js.Date): Self = StObject.set(x, "DeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "DeliveryTime", js.undefined)
    
    inline def setEngagementArn(value: SsmContactsArn): Self = StObject.set(x, "EngagementArn", value.asInstanceOf[js.Any])
    
    inline def setIncidentId(value: IncidentId): Self = StObject.set(x, "IncidentId", value.asInstanceOf[js.Any])
    
    inline def setIncidentIdUndefined: Self = StObject.set(x, "IncidentId", js.undefined)
    
    inline def setPageArn(value: SsmContactsArn): Self = StObject.set(x, "PageArn", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: js.Date): Self = StObject.set(x, "ReadTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "ReadTime", js.undefined)
    
    inline def setSender(value: Sender): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSentTime(value: js.Date): Self = StObject.set(x, "SentTime", value.asInstanceOf[js.Any])
    
    inline def setSentTimeUndefined: Self = StObject.set(x, "SentTime", js.undefined)
  }
}
