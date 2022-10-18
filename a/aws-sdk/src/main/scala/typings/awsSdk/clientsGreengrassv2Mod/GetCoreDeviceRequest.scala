package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoreDeviceRequest extends StObject {
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var coreDeviceThingName: CoreDeviceThingName
}
object GetCoreDeviceRequest {
  
  inline def apply(coreDeviceThingName: CoreDeviceThingName): GetCoreDeviceRequest = {
    val __obj = js.Dynamic.literal(coreDeviceThingName = coreDeviceThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCoreDeviceRequest]
  }
  
  extension [Self <: GetCoreDeviceRequest](x: Self) {
    
    inline def setCoreDeviceThingName(value: CoreDeviceThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
  }
}
