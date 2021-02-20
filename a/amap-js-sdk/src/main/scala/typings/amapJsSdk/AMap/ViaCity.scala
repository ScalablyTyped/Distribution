package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViaCity extends StObject {
  
  var adcode: String = js.native
  
  var citycode: String = js.native
  
  var districts: js.Array[District] = js.native
  
  var name: String = js.native
}
object ViaCity {
  
  @scala.inline
  def apply(adcode: String, citycode: String, districts: js.Array[District], name: String): ViaCity = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], districts = districts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViaCity]
  }
  
  @scala.inline
  implicit class ViaCityMutableBuilder[Self <: ViaCity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistricts(value: js.Array[District]): Self = StObject.set(x, "districts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictsVarargs(value: District*): Self = StObject.set(x, "districts", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
