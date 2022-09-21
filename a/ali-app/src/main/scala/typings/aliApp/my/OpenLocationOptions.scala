package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenLocationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 地址的详细说明 */
  var address: String
  
  /** 纬度 */
  var latitude: Double | String
  
  /** 经度 */
  var longitude: Double | String
  
  /** 位置名称 */
  var name: String
  
  /** 缩放比例，范围 3~19，默认为 15 */
  var scale: js.UndefOr[Double] = js.undefined
}
object OpenLocationOptions {
  
  inline def apply(address: String, latitude: Double | String, longitude: Double | String, name: String): OpenLocationOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenLocationOptions]
  }
  
  extension [Self <: OpenLocationOptions](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double | String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double | String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
