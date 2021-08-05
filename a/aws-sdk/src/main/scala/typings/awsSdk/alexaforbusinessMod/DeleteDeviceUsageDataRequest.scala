package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceUsageDataRequest extends StObject {
  
  /**
    * The ARN of the device.
    */
  var DeviceArn: Arn
  
  /**
    * The type of usage data to delete.
    */
  var DeviceUsageType: typings.awsSdk.alexaforbusinessMod.DeviceUsageType
}
object DeleteDeviceUsageDataRequest {
  
  inline def apply(DeviceArn: Arn, DeviceUsageType: DeviceUsageType): DeleteDeviceUsageDataRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any], DeviceUsageType = DeviceUsageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceUsageDataRequest]
  }
  
  extension [Self <: DeleteDeviceUsageDataRequest](x: Self) {
    
    inline def setDeviceArn(value: Arn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceUsageType(value: DeviceUsageType): Self = StObject.set(x, "DeviceUsageType", value.asInstanceOf[js.Any])
  }
}
