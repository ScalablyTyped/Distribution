package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReverseReplicationRequest extends StObject {
  
  /**
    * The ID of the Recovery Instance that we want to reverse the replication for.
    */
  var recoveryInstanceID: RecoveryInstanceID
}
object ReverseReplicationRequest {
  
  inline def apply(recoveryInstanceID: RecoveryInstanceID): ReverseReplicationRequest = {
    val __obj = js.Dynamic.literal(recoveryInstanceID = recoveryInstanceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseReplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReverseReplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setRecoveryInstanceID(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceID", value.asInstanceOf[js.Any])
  }
}
