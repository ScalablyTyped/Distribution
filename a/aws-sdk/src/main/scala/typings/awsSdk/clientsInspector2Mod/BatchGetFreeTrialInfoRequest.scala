package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetFreeTrialInfoRequest extends StObject {
  
  /**
    * The account IDs to get free trial status for.
    */
  var accountIds: BatchGetFreeTrialInfoRequestAccountIdsList
}
object BatchGetFreeTrialInfoRequest {
  
  inline def apply(accountIds: BatchGetFreeTrialInfoRequestAccountIdsList): BatchGetFreeTrialInfoRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetFreeTrialInfoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetFreeTrialInfoRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: BatchGetFreeTrialInfoRequestAccountIdsList): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: MeteringAccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
  }
}
