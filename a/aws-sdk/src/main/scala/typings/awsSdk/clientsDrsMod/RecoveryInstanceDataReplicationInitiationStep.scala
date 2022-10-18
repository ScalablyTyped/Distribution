package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryInstanceDataReplicationInitiationStep extends StObject {
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[RecoveryInstanceDataReplicationInitiationStepName] = js.undefined
  
  /**
    * The status of the step.
    */
  var status: js.UndefOr[RecoveryInstanceDataReplicationInitiationStepStatus] = js.undefined
}
object RecoveryInstanceDataReplicationInitiationStep {
  
  inline def apply(): RecoveryInstanceDataReplicationInitiationStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryInstanceDataReplicationInitiationStep]
  }
  
  extension [Self <: RecoveryInstanceDataReplicationInitiationStep](x: Self) {
    
    inline def setName(value: RecoveryInstanceDataReplicationInitiationStepName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: RecoveryInstanceDataReplicationInitiationStepStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
