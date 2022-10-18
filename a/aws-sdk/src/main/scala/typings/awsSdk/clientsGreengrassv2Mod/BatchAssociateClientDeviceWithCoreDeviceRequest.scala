package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateClientDeviceWithCoreDeviceRequest extends StObject {
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var coreDeviceThingName: IoTThingName
  
  /**
    * The list of client devices to associate.
    */
  var entries: js.UndefOr[AssociateClientDeviceWithCoreDeviceEntryList] = js.undefined
}
object BatchAssociateClientDeviceWithCoreDeviceRequest {
  
  inline def apply(coreDeviceThingName: IoTThingName): BatchAssociateClientDeviceWithCoreDeviceRequest = {
    val __obj = js.Dynamic.literal(coreDeviceThingName = coreDeviceThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateClientDeviceWithCoreDeviceRequest]
  }
  
  extension [Self <: BatchAssociateClientDeviceWithCoreDeviceRequest](x: Self) {
    
    inline def setCoreDeviceThingName(value: IoTThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: AssociateClientDeviceWithCoreDeviceEntryList): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: AssociateClientDeviceWithCoreDeviceEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
