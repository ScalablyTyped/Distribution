package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartVirtualMachinesMetadataSyncOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor.
    */
  var HypervisorArn: js.UndefOr[ServerArn] = js.undefined
}
object StartVirtualMachinesMetadataSyncOutput {
  
  inline def apply(): StartVirtualMachinesMetadataSyncOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartVirtualMachinesMetadataSyncOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartVirtualMachinesMetadataSyncOutput] (val x: Self) extends AnyVal {
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
    
    inline def setHypervisorArnUndefined: Self = StObject.set(x, "HypervisorArn", js.undefined)
  }
}
