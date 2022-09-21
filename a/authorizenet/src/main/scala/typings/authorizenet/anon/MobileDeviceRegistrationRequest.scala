package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileDeviceRegistrationRequest extends StObject {
  
  var mobileDeviceRegistrationRequest: typings.authorizenet.mod.APIContracts.MobileDeviceRegistrationRequest
}
object MobileDeviceRegistrationRequest {
  
  inline def apply(
    mobileDeviceRegistrationRequest: typings.authorizenet.mod.APIContracts.MobileDeviceRegistrationRequest
  ): MobileDeviceRegistrationRequest = {
    val __obj = js.Dynamic.literal(mobileDeviceRegistrationRequest = mobileDeviceRegistrationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileDeviceRegistrationRequest]
  }
  
  extension [Self <: MobileDeviceRegistrationRequest](x: Self) {
    
    inline def setMobileDeviceRegistrationRequest(value: typings.authorizenet.mod.APIContracts.MobileDeviceRegistrationRequest): Self = StObject.set(x, "mobileDeviceRegistrationRequest", value.asInstanceOf[js.Any])
  }
}
