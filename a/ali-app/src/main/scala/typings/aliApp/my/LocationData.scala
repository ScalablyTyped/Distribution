package typings.aliApp.my

import typings.aliApp.anon.Address
import typings.aliApp.anon.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region 位置 https://docs.alipay.com/mini/api/location
trait LocationData extends StObject {
  
  /** 精确度，单位m */
  var accuracy: String
  
  /**
    * 城市(type>0生效)
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * 城市级别的地区代码(type>0生效)
    */
  var cityAdcode: js.UndefOr[String] = js.undefined
  
  /**
    * 国家(type>0生效)
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * 国家编号 (type>0生效)
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * 区县(type>0生效)
    */
  var district: js.UndefOr[String] = js.undefined
  
  /**
    * 区县级别的地区代码(type>0生效)
    */
  var districtAdcode: js.UndefOr[String] = js.undefined
  
  /**
    * 水平精确度，单位m
    */
  var horizontalAccuracy: String
  
  /** 纬度 */
  var latitude: String
  
  /** 经度 */
  var longitude: String
  
  /**
    * 需要POI级别逆地理的才会有的字段, 定位点附近的 POI 信息，结构是：{ name, address } （type > 2生效）
    */
  var pois: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * 省份(type>0生效)
    */
  var province: js.UndefOr[String] = js.undefined
  
  /**
    * 需要街道级别逆地理的才会有的字段,街道门牌信息，结构是：{ street, number } (type > 1生效)
    */
  var streetNumber: js.UndefOr[Number] = js.undefined
}
object LocationData {
  
  inline def apply(accuracy: String, horizontalAccuracy: String, latitude: String, longitude: String): LocationData = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], horizontalAccuracy = horizontalAccuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationData] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: String): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityAdcode(value: String): Self = StObject.set(x, "cityAdcode", value.asInstanceOf[js.Any])
    
    inline def setCityAdcodeUndefined: Self = StObject.set(x, "cityAdcode", js.undefined)
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setDistrictAdcode(value: String): Self = StObject.set(x, "districtAdcode", value.asInstanceOf[js.Any])
    
    inline def setDistrictAdcodeUndefined: Self = StObject.set(x, "districtAdcode", js.undefined)
    
    inline def setDistrictUndefined: Self = StObject.set(x, "district", js.undefined)
    
    inline def setHorizontalAccuracy(value: String): Self = StObject.set(x, "horizontalAccuracy", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setPois(value: js.Array[Address]): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
    
    inline def setPoisUndefined: Self = StObject.set(x, "pois", js.undefined)
    
    inline def setPoisVarargs(value: Address*): Self = StObject.set(x, "pois", js.Array(value*))
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setProvinceUndefined: Self = StObject.set(x, "province", js.undefined)
    
    inline def setStreetNumber(value: Number): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
    
    inline def setStreetNumberUndefined: Self = StObject.set(x, "streetNumber", js.undefined)
  }
}
