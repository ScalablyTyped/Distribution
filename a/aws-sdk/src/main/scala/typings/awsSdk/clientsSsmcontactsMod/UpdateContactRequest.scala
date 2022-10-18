package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact or escalation plan you're updating.
    */
  var ContactId: SsmContactsArn
  
  /**
    * The full name of the contact or escalation plan.
    */
  var DisplayName: js.UndefOr[ContactName] = js.undefined
  
  /**
    * A list of stages. A contact has an engagement plan with stages for specified contact channels. An escalation plan uses these stages to contact specified contacts. 
    */
  var Plan: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.Plan] = js.undefined
}
object UpdateContactRequest {
  
  inline def apply(ContactId: SsmContactsArn): UpdateContactRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactRequest]
  }
  
  extension [Self <: UpdateContactRequest](x: Self) {
    
    inline def setContactId(value: SsmContactsArn): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: ContactName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setPlan(value: Plan): Self = StObject.set(x, "Plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "Plan", js.undefined)
  }
}
