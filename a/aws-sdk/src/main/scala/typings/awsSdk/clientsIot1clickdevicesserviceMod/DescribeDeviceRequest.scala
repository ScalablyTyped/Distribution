package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceRequest extends StObject {
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string
}
object DescribeDeviceRequest {
  
  inline def apply(DeviceId: string): DescribeDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
  }
}
