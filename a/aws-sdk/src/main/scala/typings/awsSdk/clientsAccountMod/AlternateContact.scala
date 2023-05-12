package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternateContact extends StObject {
  
  /**
    * The type of alternate contact.
    */
  var AlternateContactType: js.UndefOr[typings.awsSdk.clientsAccountMod.AlternateContactType] = js.undefined
  
  /**
    * The email address associated with this alternate contact.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.clientsAccountMod.EmailAddress] = js.undefined
  
  /**
    * The name associated with this alternate contact.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsAccountMod.Name] = js.undefined
  
  /**
    * The phone number associated with this alternate contact.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.clientsAccountMod.PhoneNumber] = js.undefined
  
  /**
    * The title associated with this alternate contact.
    */
  var Title: js.UndefOr[typings.awsSdk.clientsAccountMod.Title] = js.undefined
}
object AlternateContact {
  
  inline def apply(): AlternateContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternateContact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlternateContact] (val x: Self) extends AnyVal {
    
    inline def setAlternateContactType(value: AlternateContactType): Self = StObject.set(x, "AlternateContactType", value.asInstanceOf[js.Any])
    
    inline def setAlternateContactTypeUndefined: Self = StObject.set(x, "AlternateContactType", js.undefined)
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setTitle(value: Title): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
