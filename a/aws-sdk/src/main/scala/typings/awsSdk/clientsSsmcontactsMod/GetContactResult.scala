package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactResult extends StObject {
  
  /**
    * The alias of the contact or escalation plan. The alias is unique and identifiable.
    */
  var Alias: ContactAlias
  
  /**
    * The ARN of the contact or escalation plan.
    */
  var ContactArn: SsmContactsArn
  
  /**
    * The full name of the contact or escalation plan.
    */
  var DisplayName: js.UndefOr[ContactName] = js.undefined
  
  /**
    * Details about the specific timing or stages and targets of the escalation plan or engagement plan.
    */
  var Plan: typings.awsSdk.clientsSsmcontactsMod.Plan
  
  /**
    * The type of contact, either PERSONAL or ESCALATION. 
    */
  var Type: ContactType
}
object GetContactResult {
  
  inline def apply(Alias: ContactAlias, ContactArn: SsmContactsArn, Plan: Plan, Type: ContactType): GetContactResult = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], ContactArn = ContactArn.asInstanceOf[js.Any], Plan = Plan.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactResult]
  }
  
  extension [Self <: GetContactResult](x: Self) {
    
    inline def setAlias(value: ContactAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: ContactName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setPlan(value: Plan): Self = StObject.set(x, "Plan", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContactType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
