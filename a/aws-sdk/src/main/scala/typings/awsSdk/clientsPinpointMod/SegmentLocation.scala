package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentLocation extends StObject {
  
  /**
    * The country or region code, in ISO 3166-1 alpha-2 format, for the segment.
    */
  var Country: js.UndefOr[SetDimension] = js.undefined
  
  /**
    * The GPS location and range for the segment.
    */
  var GPSPoint: js.UndefOr[GPSPointDimension] = js.undefined
}
object SegmentLocation {
  
  inline def apply(): SegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentLocation] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: SetDimension): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setGPSPoint(value: GPSPointDimension): Self = StObject.set(x, "GPSPoint", value.asInstanceOf[js.Any])
    
    inline def setGPSPointUndefined: Self = StObject.set(x, "GPSPoint", js.undefined)
  }
}
