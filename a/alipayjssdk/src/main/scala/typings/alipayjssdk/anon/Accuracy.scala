package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accuracy extends StObject {
  
  // 纬度
  var accuracy: Double
  
  // 城市编码
  var adCode: String
  
  // 省份名
  var city: String
  
  // 城市名
  var cityCode: String
  
  // 速度，单位毫秒
  var country: String
  
  // 国家名
  var countryCode: String
  
  // 经度
  var latitude: String
  
  var longitude: String
  
  // 定位点附近的 POI 信息
  var pois: js.Array[Address]
  
  // 国家编号
  var province: String
  
  // 精度，单位米
  var speed: Double
  
  // 区域编码
  // 街道门牌信息，结构是：{street, number}
  var streetNumber: Number
}
object Accuracy {
  
  inline def apply(
    accuracy: Double,
    adCode: String,
    city: String,
    cityCode: String,
    country: String,
    countryCode: String,
    latitude: String,
    longitude: String,
    pois: js.Array[Address],
    province: String,
    speed: Double,
    streetNumber: Number
  ): Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], cityCode = cityCode.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
  
  extension [Self <: Accuracy](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityCode(value: String): Self = StObject.set(x, "cityCode", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setPois(value: js.Array[Address]): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
    
    inline def setPoisVarargs(value: Address*): Self = StObject.set(x, "pois", js.Array(value*))
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setStreetNumber(value: Number): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
  }
}
