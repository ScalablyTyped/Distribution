package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSatelliteRequest extends StObject {
  
  /**
    * UUID of a satellite.
    */
  var satelliteId: Uuid
}
object GetSatelliteRequest {
  
  inline def apply(satelliteId: Uuid): GetSatelliteRequest = {
    val __obj = js.Dynamic.literal(satelliteId = satelliteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSatelliteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSatelliteRequest] (val x: Self) extends AnyVal {
    
    inline def setSatelliteId(value: Uuid): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
  }
}
