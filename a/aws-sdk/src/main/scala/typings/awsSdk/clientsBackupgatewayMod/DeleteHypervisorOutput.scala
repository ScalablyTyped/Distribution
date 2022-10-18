package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHypervisorOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor you deleted.
    */
  var HypervisorArn: js.UndefOr[ServerArn] = js.undefined
}
object DeleteHypervisorOutput {
  
  inline def apply(): DeleteHypervisorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteHypervisorOutput]
  }
  
  extension [Self <: DeleteHypervisorOutput](x: Self) {
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
    
    inline def setHypervisorArnUndefined: Self = StObject.set(x, "HypervisorArn", js.undefined)
  }
}
