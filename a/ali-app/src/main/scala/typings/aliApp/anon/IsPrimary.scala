package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsPrimary extends StObject {
  
  /**
    * 该服务是否为主服务
    */
  var isPrimary: Boolean = js.native
  
  /**
    * 蓝牙设备服务的 uuid
    */
  var serviceId: String = js.native
}
object IsPrimary {
  
  @scala.inline
  def apply(isPrimary: Boolean, serviceId: String): IsPrimary = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrimary]
  }
  
  @scala.inline
  implicit class IsPrimaryMutableBuilder[Self <: IsPrimary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
