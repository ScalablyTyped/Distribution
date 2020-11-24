package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReGeocode extends js.Object {
  
  var addressComponent: AddressComponent = js.native
  
  var crosses: js.Array[Cross] = js.native
  
  var formattedAddress: String = js.native
  
  var pois: js.Array[ReGeocodePoi] = js.native
  
  var roads: js.Array[Road] = js.native
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
  implicit class ReGeocodeOps[Self <: ReGeocode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressComponent(value: AddressComponent): Self = this.set("addressComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossesVarargs(value: Cross*): Self = this.set("crosses", js.Array(value :_*))
    
    @scala.inline
    def setCrosses(value: js.Array[Cross]): Self = this.set("crosses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedAddress(value: String): Self = this.set("formattedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoisVarargs(value: ReGeocodePoi*): Self = this.set("pois", js.Array(value :_*))
    
    @scala.inline
    def setPois(value: js.Array[ReGeocodePoi]): Self = this.set("pois", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadsVarargs(value: Road*): Self = this.set("roads", js.Array(value :_*))
    
    @scala.inline
    def setRoads(value: js.Array[Road]): Self = this.set("roads", value.asInstanceOf[js.Any])
  }
}
