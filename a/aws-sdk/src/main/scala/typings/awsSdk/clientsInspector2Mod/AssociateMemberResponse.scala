package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateMemberResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID of the successfully associated member account.
    */
  var accountId: AccountId
}
object AssociateMemberResponse {
  
  inline def apply(accountId: AccountId): AssociateMemberResponse = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateMemberResponse]
  }
  
  extension [Self <: AssociateMemberResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
  }
}
