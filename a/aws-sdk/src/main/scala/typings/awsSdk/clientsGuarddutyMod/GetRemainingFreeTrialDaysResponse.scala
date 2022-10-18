package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRemainingFreeTrialDaysResponse extends StObject {
  
  /**
    * The member accounts which were included in a request and were processed successfully.
    */
  var Accounts: js.UndefOr[AccountFreeTrialInfos] = js.undefined
  
  /**
    * The member account that was included in a request but for which the request could not be processed.
    */
  var UnprocessedAccounts: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.UnprocessedAccounts] = js.undefined
}
object GetRemainingFreeTrialDaysResponse {
  
  inline def apply(): GetRemainingFreeTrialDaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRemainingFreeTrialDaysResponse]
  }
  
  extension [Self <: GetRemainingFreeTrialDaysResponse](x: Self) {
    
    inline def setAccounts(value: AccountFreeTrialInfos): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setAccountsVarargs(value: AccountFreeTrialInfo*): Self = StObject.set(x, "Accounts", js.Array(value*))
    
    inline def setUnprocessedAccounts(value: UnprocessedAccounts): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsUndefined: Self = StObject.set(x, "UnprocessedAccounts", js.undefined)
    
    inline def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value*))
  }
}
