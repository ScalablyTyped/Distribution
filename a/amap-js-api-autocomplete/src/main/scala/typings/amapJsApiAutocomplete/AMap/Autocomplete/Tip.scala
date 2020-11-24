package typings.amapJsApiAutocomplete.AMap.Autocomplete

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tip extends js.Object {
  
  /**
    * 区域编码
    */
  var adcode: String = js.native
  
  /**
    * 地址
    */
  var address: String = js.native
  
  /**
    * 城市
    */
  var city: js.Array[_] = js.native
  
  /**
    * 所属区域
    */
  var district: String = js.native
  
  /**
    * ID
    */
  var id: String = js.native
  
  /**
    * 坐标经纬度
    */
  var location: LngLat = js.native
  
  /**
    * 名称
    */
  var name: String = js.native
  
  /**
    * 类型编码
    */
  var typecode: String = js.native
}
object Tip {
  
  @scala.inline
  def apply(
    adcode: String,
    address: String,
    city: js.Array[_],
    district: String,
    id: String,
    location: LngLat,
    name: String,
    typecode: String
  ): Tip = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typecode = typecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
  
  @scala.inline
  implicit class TipOps[Self <: Tip] (val x: Self) extends AnyVal {
    
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
    def setAdcode(value: String): Self = this.set("adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityVarargs(value: js.Any*): Self = this.set("city", js.Array(value :_*))
    
    @scala.inline
    def setCity(value: js.Array[_]): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LngLat): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypecode(value: String): Self = this.set("typecode", value.asInstanceOf[js.Any])
  }
}
