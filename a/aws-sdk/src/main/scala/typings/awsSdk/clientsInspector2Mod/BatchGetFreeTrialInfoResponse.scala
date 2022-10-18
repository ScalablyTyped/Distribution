package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetFreeTrialInfoResponse extends StObject {
  
  /**
    * An array of objects that provide Amazon Inspector free trial details for each of the requested accounts. 
    */
  var accounts: FreeTrialAccountInfoList
  
  /**
    * An array of objects detailing any accounts that free trial data could not be returned for.
    */
  var failedAccounts: FreeTrialInfoErrorList
}
object BatchGetFreeTrialInfoResponse {
  
  inline def apply(accounts: FreeTrialAccountInfoList, failedAccounts: FreeTrialInfoErrorList): BatchGetFreeTrialInfoResponse = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], failedAccounts = failedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetFreeTrialInfoResponse]
  }
  
  extension [Self <: BatchGetFreeTrialInfoResponse](x: Self) {
    
    inline def setAccounts(value: FreeTrialAccountInfoList): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: FreeTrialAccountInfo*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setFailedAccounts(value: FreeTrialInfoErrorList): Self = StObject.set(x, "failedAccounts", value.asInstanceOf[js.Any])
    
    inline def setFailedAccountsVarargs(value: FreeTrialInfoError*): Self = StObject.set(x, "failedAccounts", js.Array(value*))
  }
}
