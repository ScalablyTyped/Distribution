package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReGeocodePoi extends StObject {
  
  var address: String
  
  var businessArea: String
  
  var direction: String
  
  var distance: Double
  
  var id: String
  
  var location: LngLat
  
  var name: String
  
  var tel: String
  
  var `type`: String
}
object ReGeocodePoi {
  
  @scala.inline
  def apply(
    address: String,
    businessArea: String,
    direction: String,
    distance: Double,
    id: String,
    location: LngLat,
    name: String,
    tel: String,
    `type`: String
  ): ReGeocodePoi = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], businessArea = businessArea.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReGeocodePoi]
  }
  
  @scala.inline
  implicit class ReGeocodePoiMutableBuilder[Self <: ReGeocodePoi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessArea(value: String): Self = StObject.set(x, "businessArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTel(value: String): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
