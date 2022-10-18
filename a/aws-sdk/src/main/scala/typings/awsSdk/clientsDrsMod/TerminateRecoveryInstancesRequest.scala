package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateRecoveryInstancesRequest extends StObject {
  
  /**
    * The IDs of the Recovery Instances that should be terminated.
    */
  var recoveryInstanceIDs: RecoveryInstancesForTerminationRequest
}
object TerminateRecoveryInstancesRequest {
  
  inline def apply(recoveryInstanceIDs: RecoveryInstancesForTerminationRequest): TerminateRecoveryInstancesRequest = {
    val __obj = js.Dynamic.literal(recoveryInstanceIDs = recoveryInstanceIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateRecoveryInstancesRequest]
  }
  
  extension [Self <: TerminateRecoveryInstancesRequest](x: Self) {
    
    inline def setRecoveryInstanceIDs(value: RecoveryInstancesForTerminationRequest): Self = StObject.set(x, "recoveryInstanceIDs", value.asInstanceOf[js.Any])
    
    inline def setRecoveryInstanceIDsVarargs(value: RecoveryInstanceID*): Self = StObject.set(x, "recoveryInstanceIDs", js.Array(value*))
  }
}
