package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateClientDeviceWithCoreDeviceEntry extends StObject {
  
  /**
    * The name of the IoT thing that represents the client device to associate.
    */
  var thingName: IoTThingName
}
object AssociateClientDeviceWithCoreDeviceEntry {
  
  inline def apply(thingName: IoTThingName): AssociateClientDeviceWithCoreDeviceEntry = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateClientDeviceWithCoreDeviceEntry]
  }
  
  extension [Self <: AssociateClientDeviceWithCoreDeviceEntry](x: Self) {
    
    inline def setThingName(value: IoTThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
