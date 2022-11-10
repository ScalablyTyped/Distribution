package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TLEEphemeris extends StObject {
  
  /**
    * Identifies the S3 object to be used as the ephemeris.
    */
  var s3Object: js.UndefOr[S3Object] = js.undefined
  
  /**
    * The data for a TLE ephemeris, supplied directly in the request rather than through an S3 object.
    */
  var tleData: js.UndefOr[TLEDataList] = js.undefined
}
object TLEEphemeris {
  
  inline def apply(): TLEEphemeris = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLEEphemeris]
  }
  
  extension [Self <: TLEEphemeris](x: Self) {
    
    inline def setS3Object(value: S3Object): Self = StObject.set(x, "s3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "s3Object", js.undefined)
    
    inline def setTleData(value: TLEDataList): Self = StObject.set(x, "tleData", value.asInstanceOf[js.Any])
    
    inline def setTleDataUndefined: Self = StObject.set(x, "tleData", js.undefined)
    
    inline def setTleDataVarargs(value: TLEData*): Self = StObject.set(x, "tleData", js.Array(value*))
  }
}
