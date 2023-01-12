package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OEMEphemeris extends StObject {
  
  /**
    * The data for an OEM ephemeris, supplied directly in the request rather than through an S3 object.
    */
  var oemData: js.UndefOr[UnboundedString] = js.undefined
  
  /**
    * Identifies the S3 object to be used as the ephemeris.
    */
  var s3Object: js.UndefOr[S3Object] = js.undefined
}
object OEMEphemeris {
  
  inline def apply(): OEMEphemeris = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OEMEphemeris]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OEMEphemeris] (val x: Self) extends AnyVal {
    
    inline def setOemData(value: UnboundedString): Self = StObject.set(x, "oemData", value.asInstanceOf[js.Any])
    
    inline def setOemDataUndefined: Self = StObject.set(x, "oemData", js.undefined)
    
    inline def setS3Object(value: S3Object): Self = StObject.set(x, "s3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "s3Object", js.undefined)
  }
}
