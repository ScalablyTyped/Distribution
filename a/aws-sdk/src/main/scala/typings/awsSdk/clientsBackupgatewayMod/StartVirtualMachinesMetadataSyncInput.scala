package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartVirtualMachinesMetadataSyncInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor.
    */
  var HypervisorArn: ServerArn
}
object StartVirtualMachinesMetadataSyncInput {
  
  inline def apply(HypervisorArn: ServerArn): StartVirtualMachinesMetadataSyncInput = {
    val __obj = js.Dynamic.literal(HypervisorArn = HypervisorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartVirtualMachinesMetadataSyncInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartVirtualMachinesMetadataSyncInput] (val x: Self) extends AnyVal {
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
  }
}
