package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReGeocode extends StObject {
  
  var addressComponent: AddressComponent
  
  var crosses: js.Array[Cross]
  
  var formattedAddress: String
  
  var pois: js.Array[ReGeocodePoi]
  
  var roads: js.Array[Road]
}
object ReGeocode {
  
  @scala.inline
  def apply(
    addressComponent: AddressComponent,
    crosses: js.Array[Cross],
    formattedAddress: String,
    pois: js.Array[ReGeocodePoi],
    roads: js.Array[Road]
  ): ReGeocode = {
    val __obj = js.Dynamic.literal(addressComponent = addressComponent.asInstanceOf[js.Any], crosses = crosses.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], roads = roads.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReGeocode]
  }
  
  @scala.inline
  implicit class ReGeocodeMutableBuilder[Self <: ReGeocode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressComponent(value: AddressComponent): Self = StObject.set(x, "addressComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosses(value: js.Array[Cross]): Self = StObject.set(x, "crosses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossesVarargs(value: Cross*): Self = StObject.set(x, "crosses", js.Array(value :_*))
    
    @scala.inline
    def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPois(value: js.Array[ReGeocodePoi]): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoisVarargs(value: ReGeocodePoi*): Self = StObject.set(x, "pois", js.Array(value :_*))
    
    @scala.inline
    def setRoads(value: js.Array[Road]): Self = StObject.set(x, "roads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadsVarargs(value: Road*): Self = StObject.set(x, "roads", js.Array(value :_*))
  }
}
