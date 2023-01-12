package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreengrassV2 extends StObject {
  
  /**
    * The name of the IoT thing for your IoT Greengrass V2 core device.
    */
  var coreDeviceThingName: CoreDeviceThingName
}
object GreengrassV2 {
  
  inline def apply(coreDeviceThingName: CoreDeviceThingName): GreengrassV2 = {
    val __obj = js.Dynamic.literal(coreDeviceThingName = coreDeviceThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreengrassV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GreengrassV2] (val x: Self) extends AnyVal {
    
    inline def setCoreDeviceThingName(value: CoreDeviceThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
  }
}
