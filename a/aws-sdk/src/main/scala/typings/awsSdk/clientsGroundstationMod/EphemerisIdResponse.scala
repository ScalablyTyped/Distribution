package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EphemerisIdResponse extends StObject {
  
  /**
    * The AWS Ground Station ephemeris ID.
    */
  var ephemerisId: js.UndefOr[Uuid] = js.undefined
}
object EphemerisIdResponse {
  
  inline def apply(): EphemerisIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemerisIdResponse]
  }
  
  extension [Self <: EphemerisIdResponse](x: Self) {
    
    inline def setEphemerisId(value: Uuid): Self = StObject.set(x, "ephemerisId", value.asInstanceOf[js.Any])
    
    inline def setEphemerisIdUndefined: Self = StObject.set(x, "ephemerisId", js.undefined)
  }
}
