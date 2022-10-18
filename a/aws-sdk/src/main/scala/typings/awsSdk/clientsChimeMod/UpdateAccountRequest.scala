package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The default license applied when you add users to an Amazon Chime account.
    */
  var DefaultLicense: js.UndefOr[License] = js.undefined
  
  /**
    * The new name for the specified Amazon Chime account.
    */
  var Name: js.UndefOr[AccountName] = js.undefined
}
object UpdateAccountRequest {
  
  inline def apply(AccountId: NonEmptyString): UpdateAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountRequest]
  }
  
  extension [Self <: UpdateAccountRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setDefaultLicense(value: License): Self = StObject.set(x, "DefaultLicense", value.asInstanceOf[js.Any])
    
    inline def setDefaultLicenseUndefined: Self = StObject.set(x, "DefaultLicense", js.undefined)
    
    inline def setName(value: AccountName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
