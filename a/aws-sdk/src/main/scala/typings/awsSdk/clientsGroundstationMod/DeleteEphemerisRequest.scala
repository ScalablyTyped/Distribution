package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEphemerisRequest extends StObject {
  
  /**
    * The AWS Ground Station ephemeris ID.
    */
  var ephemerisId: Uuid
}
object DeleteEphemerisRequest {
  
  inline def apply(ephemerisId: Uuid): DeleteEphemerisRequest = {
    val __obj = js.Dynamic.literal(ephemerisId = ephemerisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEphemerisRequest]
  }
  
  extension [Self <: DeleteEphemerisRequest](x: Self) {
    
    inline def setEphemerisId(value: Uuid): Self = StObject.set(x, "ephemerisId", value.asInstanceOf[js.Any])
  }
}
