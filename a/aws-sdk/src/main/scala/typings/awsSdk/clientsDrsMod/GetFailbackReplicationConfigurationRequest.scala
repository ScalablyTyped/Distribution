package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFailbackReplicationConfigurationRequest extends StObject {
  
  /**
    * The ID of the Recovery Instance whose failback replication configuration should be returned.
    */
  var recoveryInstanceID: RecoveryInstanceID
}
object GetFailbackReplicationConfigurationRequest {
  
  inline def apply(recoveryInstanceID: RecoveryInstanceID): GetFailbackReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal(recoveryInstanceID = recoveryInstanceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFailbackReplicationConfigurationRequest]
  }
  
  extension [Self <: GetFailbackReplicationConfigurationRequest](x: Self) {
    
    inline def setRecoveryInstanceID(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceID", value.asInstanceOf[js.Any])
  }
}
