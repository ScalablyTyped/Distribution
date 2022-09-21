package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowDuplicatesKey extends StObject {
  
  /** 是否允许重复上报同一设备， 如果允许重复上报，则onBluetoothDeviceFound 方法会多次上报同一设备，但是 RSSI 值会有不同 */
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.undefined
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 上报设备的间隔，单位为ms，默认为0ms，意思是找到新设备立即上报，否则根据传入的间隔上报 */
  var interval: js.UndefOr[Double] = js.undefined
  
  /** 蓝牙设备主 service 的 uuid 列表 */
  var services: js.Array[String]
}
object AllowDuplicatesKey {
  
  inline def apply(services: js.Array[String]): AllowDuplicatesKey = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDuplicatesKey]
  }
  
  extension [Self <: AllowDuplicatesKey](x: Self) {
    
    inline def setAllowDuplicatesKey(value: Boolean): Self = StObject.set(x, "allowDuplicatesKey", value.asInstanceOf[js.Any])
    
    inline def setAllowDuplicatesKeyUndefined: Self = StObject.set(x, "allowDuplicatesKey", js.undefined)
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
