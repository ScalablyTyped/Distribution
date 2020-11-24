package typings.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait City extends js.Object {
  
  /**
    * 市名称
    */
  var city: String = js.native
  
  /**
    * 市代码
    */
  var citycode: String = js.native
  
  /**
    * 区名称
    */
  var district: String = js.native
  
  /**
    * 省
    */
  var province: String | js.Array[scala.Nothing] = js.native
}
object City {
  
  @scala.inline
  def apply(city: String, citycode: String, district: String, province: String | js.Array[scala.Nothing]): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
  
  @scala.inline
  implicit class CityOps[Self <: City] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvinceVarargs(value: scala.Nothing*): Self = this.set("province", js.Array(value :_*))
    
    @scala.inline
    def setProvince(value: String | js.Array[scala.Nothing]): Self = this.set("province", value.asInstanceOf[js.Any])
  }
}
