package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileDeviceLoginRequest extends StObject {
  
  var mobileDeviceLoginRequest: typings.authorizenet.mod.APIContracts.MobileDeviceLoginRequest
}
object MobileDeviceLoginRequest {
  
  inline def apply(mobileDeviceLoginRequest: typings.authorizenet.mod.APIContracts.MobileDeviceLoginRequest): MobileDeviceLoginRequest = {
    val __obj = js.Dynamic.literal(mobileDeviceLoginRequest = mobileDeviceLoginRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileDeviceLoginRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileDeviceLoginRequest] (val x: Self) extends AnyVal {
    
    inline def setMobileDeviceLoginRequest(value: typings.authorizenet.mod.APIContracts.MobileDeviceLoginRequest): Self = StObject.set(x, "mobileDeviceLoginRequest", value.asInstanceOf[js.Any])
  }
}
