package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateClientDeviceFromCoreDeviceEntry extends StObject {
  
  /**
    * The name of the IoT thing that represents the client device to disassociate.
    */
  var thingName: IoTThingName
}
object DisassociateClientDeviceFromCoreDeviceEntry {
  
  inline def apply(thingName: IoTThingName): DisassociateClientDeviceFromCoreDeviceEntry = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateClientDeviceFromCoreDeviceEntry]
  }
  
  extension [Self <: DisassociateClientDeviceFromCoreDeviceEntry](x: Self) {
    
    inline def setThingName(value: IoTThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
