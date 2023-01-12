package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountDetail extends StObject {
  
  /**
    * The member account ID.
    */
  var AccountId: typings.awsSdk.clientsGuarddutyMod.AccountId
  
  /**
    * The email address of the member account.
    */
  var Email: typings.awsSdk.clientsGuarddutyMod.Email
}
object AccountDetail {
  
  inline def apply(AccountId: AccountId, Email: Email): AccountDetail = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountDetail] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
  }
}
