package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AWSAccount extends StObject {
  
  /**
    *  The email address that's associated with the Amazon Web Services account. 
    */
  var emailAddress: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    *  The identifier for the Amazon Web Services account. 
    */
  var id: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The name of the Amazon Web Services account. 
    */
  var name: js.UndefOr[AccountName] = js.undefined
}
object AWSAccount {
  
  inline def apply(): AWSAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AWSAccount]
  }
  
  extension [Self <: AWSAccount](x: Self) {
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setId(value: AccountId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: AccountName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
