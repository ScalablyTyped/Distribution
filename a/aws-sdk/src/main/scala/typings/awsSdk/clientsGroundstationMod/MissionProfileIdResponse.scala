package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissionProfileIdResponse extends StObject {
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: js.UndefOr[Uuid] = js.undefined
}
object MissionProfileIdResponse {
  
  inline def apply(): MissionProfileIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MissionProfileIdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MissionProfileIdResponse] (val x: Self) extends AnyVal {
    
    inline def setMissionProfileId(value: Uuid): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileIdUndefined: Self = StObject.set(x, "missionProfileId", js.undefined)
  }
}
