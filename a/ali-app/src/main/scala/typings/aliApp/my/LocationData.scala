package typings.aliApp.my

import typings.aliApp.anon.Address
import typings.aliApp.anon.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region 位置 https://docs.alipay.com/mini/api/location
@js.native
trait LocationData extends js.Object {
  
  /** 精确度，单位m */
  var accuracy: String = js.native
  
  /**
    * 城市(type>0生效)
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * 城市级别的地区代码(type>0生效)
    */
  var cityAdcode: js.UndefOr[String] = js.native
  
  /**
    * 国家(type>0生效)
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * 国家编号 (type>0生效)
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * 区县(type>0生效)
    */
  var district: js.UndefOr[String] = js.native
  
  /**
    * 区县级别的地区代码(type>0生效)
    */
  var districtAdcode: js.UndefOr[String] = js.native
  
  /**
    * 水平精确度，单位m
    */
  var horizontalAccuracy: String = js.native
  
  /** 纬度 */
  var latitude: String = js.native
  
  /** 经度 */
  var longitude: String = js.native
  
  /**
    * 需要POI级别逆地理的才会有的字段, 定位点附近的 POI 信息，结构是：{ name, address } （type > 2生效）
    */
  var pois: js.UndefOr[js.Array[Address]] = js.native
  
  /**
    * 省份(type>0生效)
    */
  var province: js.UndefOr[String] = js.native
  
  /**
    * 需要街道级别逆地理的才会有的字段,街道门牌信息，结构是：{ street, number } (type > 1生效)
    */
  var streetNumber: js.UndefOr[Number] = js.native
}
object LocationData {
  
  @scala.inline
  def apply(accuracy: String, horizontalAccuracy: String, latitude: String, longitude: String): LocationData = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], horizontalAccuracy = horizontalAccuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
  
  @scala.inline
  implicit class LocationDataOps[Self <: LocationData] (val x: Self) extends AnyVal {
    
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
    def setAccuracy(value: String): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAccuracy(value: String): Self = this.set("horizontalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: String): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: String): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCityAdcode(value: String): Self = this.set("cityAdcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCityAdcode: Self = this.set("cityAdcode", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistrict: Self = this.set("district", js.undefined)
    
    @scala.inline
    def setDistrictAdcode(value: String): Self = this.set("districtAdcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistrictAdcode: Self = this.set("districtAdcode", js.undefined)
    
    @scala.inline
    def setPoisVarargs(value: Address*): Self = this.set("pois", js.Array(value :_*))
    
    @scala.inline
    def setPois(value: js.Array[Address]): Self = this.set("pois", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePois: Self = this.set("pois", js.undefined)
    
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvince: Self = this.set("province", js.undefined)
    
    @scala.inline
    def setStreetNumber(value: Number): Self = this.set("streetNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreetNumber: Self = this.set("streetNumber", js.undefined)
  }
}
