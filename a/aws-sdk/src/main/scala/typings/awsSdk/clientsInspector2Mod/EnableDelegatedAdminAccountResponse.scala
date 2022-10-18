package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableDelegatedAdminAccountResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID of the successfully Amazon Inspector delegated administrator.
    */
  var delegatedAdminAccountId: AccountId
}
object EnableDelegatedAdminAccountResponse {
  
  inline def apply(delegatedAdminAccountId: AccountId): EnableDelegatedAdminAccountResponse = {
    val __obj = js.Dynamic.literal(delegatedAdminAccountId = delegatedAdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDelegatedAdminAccountResponse]
  }
  
  extension [Self <: EnableDelegatedAdminAccountResponse](x: Self) {
    
    inline def setDelegatedAdminAccountId(value: AccountId): Self = StObject.set(x, "delegatedAdminAccountId", value.asInstanceOf[js.Any])
  }
}
