package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedAccount extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AccountId: typings.awsSdk.clientsGuarddutyMod.AccountId
  
  /**
    * A reason why the account hasn't been processed.
    */
  var Result: String
}
object UnprocessedAccount {
  
  inline def apply(AccountId: AccountId, Result: String): UnprocessedAccount = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnprocessedAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
