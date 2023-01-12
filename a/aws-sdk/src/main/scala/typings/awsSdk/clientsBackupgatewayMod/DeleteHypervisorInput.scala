package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHypervisorInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor to delete.
    */
  var HypervisorArn: ServerArn
}
object DeleteHypervisorInput {
  
  inline def apply(HypervisorArn: ServerArn): DeleteHypervisorInput = {
    val __obj = js.Dynamic.literal(HypervisorArn = HypervisorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHypervisorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteHypervisorInput] (val x: Self) extends AnyVal {
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
  }
}
