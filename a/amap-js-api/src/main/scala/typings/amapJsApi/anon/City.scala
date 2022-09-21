package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait City extends StObject {
  
  /**
    * 市名称
    */
  var city: String
  
  /**
    * 市代码
    */
  var citycode: String
  
  /**
    * 区名称
    */
  var district: String
  
  /**
    * 省
    */
  var province: String | js.Array[scala.Nothing]
}
object City {
  
  inline def apply(city: String, citycode: String, district: String, province: String | js.Array[scala.Nothing]): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
  
  extension [Self <: City](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String | js.Array[scala.Nothing]): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setProvinceVarargs(value: scala.Nothing*): Self = StObject.set(x, "province", js.Array(value*))
  }
}
