package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDeviceResponse extends StObject {
  
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.DeviceId] = js.undefined
}
object RegisterDeviceResponse {
  
  inline def apply(): RegisterDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
  }
}
