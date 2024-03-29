package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeoLocationResponse extends StObject {
  
  /**
    * A complex type that contains the codes and full continent, country, and subdivision names for the specified geolocation code.
    */
  var GeoLocationDetails: typings.awsSdk.clientsRoute53Mod.GeoLocationDetails
}
object GetGeoLocationResponse {
  
  inline def apply(GeoLocationDetails: GeoLocationDetails): GetGeoLocationResponse = {
    val __obj = js.Dynamic.literal(GeoLocationDetails = GeoLocationDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeoLocationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGeoLocationResponse] (val x: Self) extends AnyVal {
    
    inline def setGeoLocationDetails(value: GeoLocationDetails): Self = StObject.set(x, "GeoLocationDetails", value.asInstanceOf[js.Any])
  }
}
