package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHypervisorOutput extends StObject {
  
  /**
    * Details about the requested hypervisor.
    */
  var Hypervisor: js.UndefOr[HypervisorDetails] = js.undefined
}
object GetHypervisorOutput {
  
  inline def apply(): GetHypervisorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHypervisorOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHypervisorOutput] (val x: Self) extends AnyVal {
    
    inline def setHypervisor(value: HypervisorDetails): Self = StObject.set(x, "Hypervisor", value.asInstanceOf[js.Any])
    
    inline def setHypervisorUndefined: Self = StObject.set(x, "Hypervisor", js.undefined)
  }
}
