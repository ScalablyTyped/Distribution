package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseLocationData extends StObject {
  
  /**
    * 详细地址
    */
  var address: String
  
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: Double
  
  /**
    * 经度，浮点数，范围为-180~180，负数表示西经
    */
  var longitude: Double
  
  /**
    * 位置名称
    */
  var name: String
}
object ChooseLocationData {
  
  inline def apply(address: String, latitude: Double, longitude: Double, name: String): ChooseLocationData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseLocationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseLocationData] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
