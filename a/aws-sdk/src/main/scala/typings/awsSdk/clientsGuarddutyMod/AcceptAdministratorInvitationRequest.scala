package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptAdministratorInvitationRequest extends StObject {
  
  /**
    * The account ID of the GuardDuty administrator account whose invitation you're accepting.
    */
  var AdministratorId: String
  
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * The value that is used to validate the administrator account to the member account.
    */
  var InvitationId: String
}
object AcceptAdministratorInvitationRequest {
  
  inline def apply(AdministratorId: String, DetectorId: DetectorId, InvitationId: String): AcceptAdministratorInvitationRequest = {
    val __obj = js.Dynamic.literal(AdministratorId = AdministratorId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any], InvitationId = InvitationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptAdministratorInvitationRequest]
  }
  
  extension [Self <: AcceptAdministratorInvitationRequest](x: Self) {
    
    inline def setAdministratorId(value: String): Self = StObject.set(x, "AdministratorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setInvitationId(value: String): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
  }
}
