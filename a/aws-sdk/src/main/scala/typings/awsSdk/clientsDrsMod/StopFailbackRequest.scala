package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopFailbackRequest extends StObject {
  
  /**
    * The ID of the Recovery Instance we want to stop failback for.
    */
  var recoveryInstanceID: RecoveryInstanceID
}
object StopFailbackRequest {
  
  inline def apply(recoveryInstanceID: RecoveryInstanceID): StopFailbackRequest = {
    val __obj = js.Dynamic.literal(recoveryInstanceID = recoveryInstanceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopFailbackRequest]
  }
  
  extension [Self <: StopFailbackRequest](x: Self) {
    
    inline def setRecoveryInstanceID(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceID", value.asInstanceOf[js.Any])
  }
}
