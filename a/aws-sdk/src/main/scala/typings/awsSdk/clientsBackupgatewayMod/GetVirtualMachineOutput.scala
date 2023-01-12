package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVirtualMachineOutput extends StObject {
  
  /**
    * This object contains the basic attributes of VirtualMachine contained by the output of GetVirtualMachine 
    */
  var VirtualMachine: js.UndefOr[VirtualMachineDetails] = js.undefined
}
object GetVirtualMachineOutput {
  
  inline def apply(): GetVirtualMachineOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVirtualMachineOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVirtualMachineOutput] (val x: Self) extends AnyVal {
    
    inline def setVirtualMachine(value: VirtualMachineDetails): Self = StObject.set(x, "VirtualMachine", value.asInstanceOf[js.Any])
    
    inline def setVirtualMachineUndefined: Self = StObject.set(x, "VirtualMachine", js.undefined)
  }
}
