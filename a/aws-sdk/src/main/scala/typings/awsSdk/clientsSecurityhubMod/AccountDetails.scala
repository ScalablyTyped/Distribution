package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountDetails extends StObject {
  
  /**
    * The ID of an Amazon Web Services account.
    */
  var AccountId: typings.awsSdk.clientsSecurityhubMod.AccountId
  
  /**
    * The email of an Amazon Web Services account.
    */
  var Email: js.UndefOr[NonEmptyString] = js.undefined
}
object AccountDetails {
  
  inline def apply(AccountId: AccountId): AccountDetails = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountDetails] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: NonEmptyString): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
  }
}
