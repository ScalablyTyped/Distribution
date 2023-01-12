package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceFleetRequest extends StObject {
  
  /**
    * The name of the fleet to delete.
    */
  var DeviceFleetName: EntityName
}
object DeleteDeviceFleetRequest {
  
  inline def apply(DeviceFleetName: EntityName): DeleteDeviceFleetRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeviceFleetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDeviceFleetRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
  }
}
