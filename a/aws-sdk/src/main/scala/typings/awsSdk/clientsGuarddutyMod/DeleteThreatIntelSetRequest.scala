package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThreatIntelSetRequest extends StObject {
  
  /**
    * The unique ID of the detector that the threatIntelSet is associated with.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * The unique ID of the threatIntelSet that you want to delete.
    */
  var ThreatIntelSetId: String
}
object DeleteThreatIntelSetRequest {
  
  inline def apply(DetectorId: DetectorId, ThreatIntelSetId: String): DeleteThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThreatIntelSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteThreatIntelSetRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelSetId(value: String): Self = StObject.set(x, "ThreatIntelSetId", value.asInstanceOf[js.Any])
  }
}
