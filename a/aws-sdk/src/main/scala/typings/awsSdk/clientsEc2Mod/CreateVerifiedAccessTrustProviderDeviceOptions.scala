package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVerifiedAccessTrustProviderDeviceOptions extends StObject {
  
  /**
    * The ID of the tenant application with the device-identity provider.
    */
  var TenantId: js.UndefOr[String] = js.undefined
}
object CreateVerifiedAccessTrustProviderDeviceOptions {
  
  inline def apply(): CreateVerifiedAccessTrustProviderDeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVerifiedAccessTrustProviderDeviceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVerifiedAccessTrustProviderDeviceOptions] (val x: Self) extends AnyVal {
    
    inline def setTenantId(value: String): Self = StObject.set(x, "TenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "TenantId", js.undefined)
  }
}
