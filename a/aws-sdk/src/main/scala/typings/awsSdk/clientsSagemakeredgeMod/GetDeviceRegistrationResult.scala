package typings.awsSdk.clientsSagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceRegistrationResult extends StObject {
  
  /**
    * The amount of time, in seconds, that the registration status is stored on the device’s cache before it is refreshed.
    */
  var CacheTTL: js.UndefOr[CacheTTLSeconds] = js.undefined
  
  /**
    * Describes if the device is currently registered with SageMaker Edge Manager.
    */
  var DeviceRegistration: js.UndefOr[typings.awsSdk.clientsSagemakeredgeMod.DeviceRegistration] = js.undefined
}
object GetDeviceRegistrationResult {
  
  inline def apply(): GetDeviceRegistrationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceRegistrationResult]
  }
  
  extension [Self <: GetDeviceRegistrationResult](x: Self) {
    
    inline def setCacheTTL(value: CacheTTLSeconds): Self = StObject.set(x, "CacheTTL", value.asInstanceOf[js.Any])
    
    inline def setCacheTTLUndefined: Self = StObject.set(x, "CacheTTL", js.undefined)
    
    inline def setDeviceRegistration(value: DeviceRegistration): Self = StObject.set(x, "DeviceRegistration", value.asInstanceOf[js.Any])
    
    inline def setDeviceRegistrationUndefined: Self = StObject.set(x, "DeviceRegistration", js.undefined)
  }
}
