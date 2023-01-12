package typings.awsSdk.clientsSagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceRegistrationRequest extends StObject {
  
  /**
    * The name of the fleet that the device belongs to.
    */
  var DeviceFleetName: typings.awsSdk.clientsSagemakeredgeMod.DeviceFleetName
  
  /**
    * The unique name of the device you want to get the registration status from.
    */
  var DeviceName: typings.awsSdk.clientsSagemakeredgeMod.DeviceName
}
object GetDeviceRegistrationRequest {
  
  inline def apply(DeviceFleetName: DeviceFleetName, DeviceName: DeviceName): GetDeviceRegistrationRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceRegistrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeviceRegistrationRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceFleetName(value: DeviceFleetName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
  }
}
