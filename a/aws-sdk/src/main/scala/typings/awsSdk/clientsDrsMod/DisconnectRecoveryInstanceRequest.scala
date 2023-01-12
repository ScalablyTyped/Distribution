package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectRecoveryInstanceRequest extends StObject {
  
  /**
    * The ID of the Recovery Instance to disconnect.
    */
  var recoveryInstanceID: RecoveryInstanceID
}
object DisconnectRecoveryInstanceRequest {
  
  inline def apply(recoveryInstanceID: RecoveryInstanceID): DisconnectRecoveryInstanceRequest = {
    val __obj = js.Dynamic.literal(recoveryInstanceID = recoveryInstanceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectRecoveryInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisconnectRecoveryInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setRecoveryInstanceID(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceID", value.asInstanceOf[js.Any])
  }
}
