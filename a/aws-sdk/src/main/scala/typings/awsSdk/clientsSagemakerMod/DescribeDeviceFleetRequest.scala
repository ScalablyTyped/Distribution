package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceFleetRequest extends StObject {
  
  /**
    * The name of the fleet.
    */
  var DeviceFleetName: EntityName
}
object DescribeDeviceFleetRequest {
  
  inline def apply(DeviceFleetName: EntityName): DescribeDeviceFleetRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceFleetRequest]
  }
  
  extension [Self <: DescribeDeviceFleetRequest](x: Self) {
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
  }
}
