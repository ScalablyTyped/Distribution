package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait City extends StObject {
  
  var city: String = js.native
  
  var citycode: String = js.native
  
  var district: String = js.native
  
  var provice: String = js.native
}
object City {
  
  @scala.inline
  def apply(city: String, citycode: String, district: String, provice: String): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], provice = provice.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
  
  @scala.inline
  implicit class CityMutableBuilder[Self <: City] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvice(value: String): Self = StObject.set(x, "provice", value.asInstanceOf[js.Any])
  }
}
