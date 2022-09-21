package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPrimary extends StObject {
  
  /** 该服务是否为主服务 */
  var isPrimary: Boolean
  
  /** 蓝牙设备服务的uuid */
  var serviceId: String
}
object IsPrimary {
  
  inline def apply(isPrimary: Boolean, serviceId: String): IsPrimary = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrimary]
  }
  
  extension [Self <: IsPrimary](x: Self) {
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
