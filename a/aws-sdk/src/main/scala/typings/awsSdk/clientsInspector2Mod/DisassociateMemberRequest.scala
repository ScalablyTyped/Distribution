package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMemberRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the member account to disassociate.
    */
  var accountId: AccountId
}
object DisassociateMemberRequest {
  
  inline def apply(accountId: AccountId): DisassociateMemberRequest = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMemberRequest]
  }
  
  extension [Self <: DisassociateMemberRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
  }
}
