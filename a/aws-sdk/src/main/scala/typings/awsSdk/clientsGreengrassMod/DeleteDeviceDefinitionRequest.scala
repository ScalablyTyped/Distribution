package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceDefinitionRequest extends StObject {
  
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string
}
object DeleteDeviceDefinitionRequest {
  
  inline def apply(DeviceDefinitionId: string): DeleteDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceDefinitionRequest]
  }
  
  extension [Self <: DeleteDeviceDefinitionRequest](x: Self) {
    
    inline def setDeviceDefinitionId(value: string): Self = StObject.set(x, "DeviceDefinitionId", value.asInstanceOf[js.Any])
  }
}
