package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressComponent extends StObject {
  
  var adcode: String = js.native
  
  var building: String = js.native
  
  var buildingType: String = js.native
  
  var businessAreas: js.Array[BusinessArea] = js.native
  
  var city: String = js.native
  
  var citycode: String = js.native
  
  var district: String = js.native
  
  var neighborhood: String = js.native
  
  var neighborhoodType: String = js.native
  
  var province: String = js.native
  
  var street: String = js.native
  
  var streetNumber: String = js.native
  
  var township: String = js.native
}
object AddressComponent {
  
  @scala.inline
  def apply(
    adcode: String,
    building: String,
    buildingType: String,
    businessAreas: js.Array[BusinessArea],
    city: String,
    citycode: String,
    district: String,
    neighborhood: String,
    neighborhoodType: String,
    province: String,
    street: String,
    streetNumber: String,
    township: String
  ): AddressComponent = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], building = building.asInstanceOf[js.Any], buildingType = buildingType.asInstanceOf[js.Any], businessAreas = businessAreas.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any], neighborhoodType = neighborhoodType.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any], township = township.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent]
  }
  
  @scala.inline
  implicit class AddressComponentMutableBuilder[Self <: AddressComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuilding(value: String): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingType(value: String): Self = StObject.set(x, "buildingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessAreas(value: js.Array[BusinessArea]): Self = StObject.set(x, "businessAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessAreasVarargs(value: BusinessArea*): Self = StObject.set(x, "businessAreas", js.Array(value :_*))
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeighborhoodType(value: String): Self = StObject.set(x, "neighborhoodType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTownship(value: String): Self = StObject.set(x, "township", value.asInstanceOf[js.Any])
  }
}
