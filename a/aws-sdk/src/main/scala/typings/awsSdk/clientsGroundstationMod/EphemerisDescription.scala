package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EphemerisDescription extends StObject {
  
  /**
    * Supplied ephemeris data.
    */
  var ephemerisData: js.UndefOr[UnboundedString] = js.undefined
  
  /**
    * Source S3 object used for the ephemeris.
    */
  var sourceS3Object: js.UndefOr[S3Object] = js.undefined
}
object EphemerisDescription {
  
  inline def apply(): EphemerisDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemerisDescription]
  }
  
  extension [Self <: EphemerisDescription](x: Self) {
    
    inline def setEphemerisData(value: UnboundedString): Self = StObject.set(x, "ephemerisData", value.asInstanceOf[js.Any])
    
    inline def setEphemerisDataUndefined: Self = StObject.set(x, "ephemerisData", js.undefined)
    
    inline def setSourceS3Object(value: S3Object): Self = StObject.set(x, "sourceS3Object", value.asInstanceOf[js.Any])
    
    inline def setSourceS3ObjectUndefined: Self = StObject.set(x, "sourceS3Object", js.undefined)
  }
}
