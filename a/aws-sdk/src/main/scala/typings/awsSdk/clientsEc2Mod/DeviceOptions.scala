package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOptions extends StObject {
  
  /**
    * The ID of the tenant application with the device-identity provider.
    */
  var TenantId: js.UndefOr[String] = js.undefined
}
object DeviceOptions {
  
  inline def apply(): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceOptions] (val x: Self) extends AnyVal {
    
    inline def setTenantId(value: String): Self = StObject.set(x, "TenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "TenantId", js.undefined)
  }
}
