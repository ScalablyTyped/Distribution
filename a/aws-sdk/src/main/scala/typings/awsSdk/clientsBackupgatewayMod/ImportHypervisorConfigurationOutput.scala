package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportHypervisorConfigurationOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor you disassociated.
    */
  var HypervisorArn: js.UndefOr[ServerArn] = js.undefined
}
object ImportHypervisorConfigurationOutput {
  
  inline def apply(): ImportHypervisorConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportHypervisorConfigurationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportHypervisorConfigurationOutput] (val x: Self) extends AnyVal {
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
    
    inline def setHypervisorArnUndefined: Self = StObject.set(x, "HypervisorArn", js.undefined)
  }
}
