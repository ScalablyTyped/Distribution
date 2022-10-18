package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateClientDeviceFromCoreDeviceRequest extends StObject {
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var coreDeviceThingName: IoTThingName
  
  /**
    * The list of client devices to disassociate.
    */
  var entries: js.UndefOr[DisassociateClientDeviceFromCoreDeviceEntryList] = js.undefined
}
object BatchDisassociateClientDeviceFromCoreDeviceRequest {
  
  inline def apply(coreDeviceThingName: IoTThingName): BatchDisassociateClientDeviceFromCoreDeviceRequest = {
    val __obj = js.Dynamic.literal(coreDeviceThingName = coreDeviceThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateClientDeviceFromCoreDeviceRequest]
  }
  
  extension [Self <: BatchDisassociateClientDeviceFromCoreDeviceRequest](x: Self) {
    
    inline def setCoreDeviceThingName(value: IoTThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: DisassociateClientDeviceFromCoreDeviceEntryList): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: DisassociateClientDeviceFromCoreDeviceEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
