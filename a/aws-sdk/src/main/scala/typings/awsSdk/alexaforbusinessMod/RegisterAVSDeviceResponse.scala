package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterAVSDeviceResponse extends StObject {
  
  /**
    * The ARN of the device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
}
object RegisterAVSDeviceResponse {
  
  @scala.inline
  def apply(): RegisterAVSDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAVSDeviceResponse]
  }
  
  @scala.inline
  implicit class RegisterAVSDeviceResponseMutableBuilder[Self <: RegisterAVSDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
  }
}
