package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Engagement extends StObject {
  
  /**
    * The ARN of the escalation plan or contact that Incident Manager is engaging.
    */
  var ContactArn: SsmContactsArn
  
  /**
    * The Amazon Resource Name (ARN) of the engagement.
    */
  var EngagementArn: SsmContactsArn
  
  /**
    * The ARN of the incident that's engaging the contact.
    */
  var IncidentId: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.IncidentId] = js.undefined
  
  /**
    * The user that started the engagement.
    */
  var Sender: typings.awsSdk.clientsSsmcontactsMod.Sender
  
  /**
    * The time that the engagement began.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the engagement ended.
    */
  var StopTime: js.UndefOr[js.Date] = js.undefined
}
object Engagement {
  
  inline def apply(ContactArn: SsmContactsArn, EngagementArn: SsmContactsArn, Sender: Sender): Engagement = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any], EngagementArn = EngagementArn.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engagement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Engagement] (val x: Self) extends AnyVal {
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setEngagementArn(value: SsmContactsArn): Self = StObject.set(x, "EngagementArn", value.asInstanceOf[js.Any])
    
    inline def setIncidentId(value: IncidentId): Self = StObject.set(x, "IncidentId", value.asInstanceOf[js.Any])
    
    inline def setIncidentIdUndefined: Self = StObject.set(x, "IncidentId", js.undefined)
    
    inline def setSender(value: Sender): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStopTime(value: js.Date): Self = StObject.set(x, "StopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "StopTime", js.undefined)
  }
}
