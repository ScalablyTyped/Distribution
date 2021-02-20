package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseLocationData extends StObject {
  
  /**
    * 详细地址
    */
  var address: String = js.native
  
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: Double = js.native
  
  /**
    * 经度，浮点数，范围为-180~180，负数表示西经
    */
  var longitude: Double = js.native
  
  /**
    * 位置名称
    */
  var name: String = js.native
}
object ChooseLocationData {
  
  @scala.inline
  def apply(address: String, latitude: Double, longitude: Double, name: String): ChooseLocationData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseLocationData]
  }
  
  @scala.inline
  implicit class ChooseLocationDataMutableBuilder[Self <: ChooseLocationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
