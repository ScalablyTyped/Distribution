package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMemberDetectorsRequest extends StObject {
  
  /**
    * The account ID of the member account.
    */
  var AccountIds: typings.awsSdk.clientsGuarddutyMod.AccountIds
  
  /**
    * The detector ID for the administrator account.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
}
object GetMemberDetectorsRequest {
  
  inline def apply(AccountIds: AccountIds, DetectorId: DetectorId): GetMemberDetectorsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberDetectorsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMemberDetectorsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
