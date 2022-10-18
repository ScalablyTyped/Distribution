package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclineInvitationsResponse extends StObject {
  
  /**
    * An array of objects, one for each account whose invitation hasn't been declined. Each object identifies the account and explains why the request hasn't been processed for that account.
    */
  var unprocessedAccounts: js.UndefOr[listOfUnprocessedAccount] = js.undefined
}
object DeclineInvitationsResponse {
  
  inline def apply(): DeclineInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclineInvitationsResponse]
  }
  
  extension [Self <: DeclineInvitationsResponse](x: Self) {
    
    inline def setUnprocessedAccounts(value: listOfUnprocessedAccount): Self = StObject.set(x, "unprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsUndefined: Self = StObject.set(x, "unprocessedAccounts", js.undefined)
    
    inline def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "unprocessedAccounts", js.Array(value*))
  }
}
