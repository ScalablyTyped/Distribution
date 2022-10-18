package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VmServerAddress extends StObject {
  
  /**
    * The ID of the VM.
    */
  var vmId: js.UndefOr[VmId] = js.undefined
  
  /**
    * The ID of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.undefined
}
object VmServerAddress {
  
  inline def apply(): VmServerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmServerAddress]
  }
  
  extension [Self <: VmServerAddress](x: Self) {
    
    inline def setVmId(value: VmId): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
    
    inline def setVmManagerId(value: VmManagerId): Self = StObject.set(x, "vmManagerId", value.asInstanceOf[js.Any])
    
    inline def setVmManagerIdUndefined: Self = StObject.set(x, "vmManagerId", js.undefined)
  }
}
