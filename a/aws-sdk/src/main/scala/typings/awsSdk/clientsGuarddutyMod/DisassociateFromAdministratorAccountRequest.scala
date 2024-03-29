package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFromAdministratorAccountRequest extends StObject {
  
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
}
object DisassociateFromAdministratorAccountRequest {
  
  inline def apply(DetectorId: DetectorId): DisassociateFromAdministratorAccountRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateFromAdministratorAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateFromAdministratorAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
