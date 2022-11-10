package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMissionProfileRequest extends StObject {
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: Uuid
}
object DeleteMissionProfileRequest {
  
  inline def apply(missionProfileId: Uuid): DeleteMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMissionProfileRequest]
  }
  
  extension [Self <: DeleteMissionProfileRequest](x: Self) {
    
    inline def setMissionProfileId(value: Uuid): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
  }
}
