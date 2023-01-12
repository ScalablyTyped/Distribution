package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAVSDeviceResponse extends StObject {
  
  /**
    * The ARN of the device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
}
object RegisterAVSDeviceResponse {
  
  inline def apply(): RegisterAVSDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAVSDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterAVSDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
  }
}
