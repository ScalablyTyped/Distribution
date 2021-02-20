package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeviceUsageDataRequest extends StObject {
  
  /**
    * The ARN of the device.
    */
  var DeviceArn: Arn = js.native
  
  /**
    * The type of usage data to delete.
    */
  var DeviceUsageType: typings.awsSdk.alexaforbusinessMod.DeviceUsageType = js.native
}
object DeleteDeviceUsageDataRequest {
  
  @scala.inline
  def apply(DeviceArn: Arn, DeviceUsageType: DeviceUsageType): DeleteDeviceUsageDataRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any], DeviceUsageType = DeviceUsageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceUsageDataRequest]
  }
  
  @scala.inline
  implicit class DeleteDeviceUsageDataRequestMutableBuilder[Self <: DeleteDeviceUsageDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUsageType(value: DeviceUsageType): Self = StObject.set(x, "DeviceUsageType", value.asInstanceOf[js.Any])
  }
}
