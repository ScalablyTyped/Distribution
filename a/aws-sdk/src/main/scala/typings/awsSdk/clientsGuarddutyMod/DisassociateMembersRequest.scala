package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMembersRequest extends StObject {
  
  /**
    * A list of account IDs of the GuardDuty member accounts that you want to disassociate from the administrator account.
    */
  var AccountIds: typings.awsSdk.clientsGuarddutyMod.AccountIds
  
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from the administrator account.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
}
object DisassociateMembersRequest {
  
  inline def apply(AccountIds: AccountIds, DetectorId: DetectorId): DisassociateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembersRequest]
  }
  
  extension [Self <: DisassociateMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
