package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMembersRequest extends StObject {
  
  /**
    * A list of account ID and email address pairs of the accounts that you want to associate with the GuardDuty administrator account.
    */
  var AccountDetails: typings.awsSdk.clientsGuarddutyMod.AccountDetails
  
  /**
    * The unique ID of the detector of the GuardDuty account that you want to associate member accounts with.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
}
object CreateMembersRequest {
  
  inline def apply(AccountDetails: AccountDetails, DetectorId: DetectorId): CreateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountDetails = AccountDetails.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMembersRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountDetails(value: AccountDetails): Self = StObject.set(x, "AccountDetails", value.asInstanceOf[js.Any])
    
    inline def setAccountDetailsVarargs(value: AccountDetail*): Self = StObject.set(x, "AccountDetails", js.Array(value*))
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
