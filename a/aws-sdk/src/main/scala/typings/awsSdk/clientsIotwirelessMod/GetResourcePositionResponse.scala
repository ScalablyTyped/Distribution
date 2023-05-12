package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePositionResponse extends StObject {
  
  /**
    * The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON format, which a format that's used to encode geographic data structures. For more information, see GeoJSON.
    */
  var GeoJsonPayload: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.GeoJsonPayload] = js.undefined
}
object GetResourcePositionResponse {
  
  inline def apply(): GetResourcePositionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePositionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourcePositionResponse] (val x: Self) extends AnyVal {
    
    inline def setGeoJsonPayload(value: GeoJsonPayload): Self = StObject.set(x, "GeoJsonPayload", value.asInstanceOf[js.Any])
    
    inline def setGeoJsonPayloadUndefined: Self = StObject.set(x, "GeoJsonPayload", js.undefined)
  }
}
