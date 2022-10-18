package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contact extends StObject {
  
  /**
    * The unique and identifiable alias of the contact or escalation plan.
    */
  var Alias: ContactAlias
  
  /**
    * The Amazon Resource Name (ARN) of the contact or escalation plan.
    */
  var ContactArn: SsmContactsArn
  
  /**
    * The full name of the contact or escalation plan.
    */
  var DisplayName: js.UndefOr[ContactName] = js.undefined
  
  /**
    * Refers to the type of contact. A single contact is type PERSONAL and an escalation plan is type ESCALATION.
    */
  var Type: ContactType
}
object Contact {
  
  inline def apply(Alias: ContactAlias, ContactArn: SsmContactsArn, Type: ContactType): Contact = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], ContactArn = ContactArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
  
  extension [Self <: Contact](x: Self) {
    
    inline def setAlias(value: ContactAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: ContactName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setType(value: ContactType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
