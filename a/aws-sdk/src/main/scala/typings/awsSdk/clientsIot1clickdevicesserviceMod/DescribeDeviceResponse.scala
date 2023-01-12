package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceResponse extends StObject {
  
  /**
    * Device details.
    */
  var DeviceDescription: js.UndefOr[typings.awsSdk.clientsIot1clickdevicesserviceMod.DeviceDescription] = js.undefined
}
object DescribeDeviceResponse {
  
  inline def apply(): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceDescription(value: DeviceDescription): Self = StObject.set(x, "DeviceDescription", value.asInstanceOf[js.Any])
    
    inline def setDeviceDescriptionUndefined: Self = StObject.set(x, "DeviceDescription", js.undefined)
  }
}
