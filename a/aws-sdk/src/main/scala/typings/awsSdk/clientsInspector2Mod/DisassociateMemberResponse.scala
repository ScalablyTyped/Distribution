package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMemberResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID of the successfully disassociated member.
    */
  var accountId: AccountId
}
object DisassociateMemberResponse {
  
  inline def apply(accountId: AccountId): DisassociateMemberResponse = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMemberResponse]
  }
  
  extension [Self <: DisassociateMemberResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
  }
}
