package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipatingServer extends StObject {
  
  /**
    * The launch status of a participating server.
    */
  var launchStatus: js.UndefOr[LaunchStatus] = js.undefined
  
  /**
    * The Recovery Instance ID of a participating server.
    */
  var recoveryInstanceID: js.UndefOr[RecoveryInstanceID] = js.undefined
  
  /**
    * The Source Server ID of a participating server.
    */
  var sourceServerID: js.UndefOr[SourceServerID] = js.undefined
}
object ParticipatingServer {
  
  inline def apply(): ParticipatingServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipatingServer]
  }
  
  extension [Self <: ParticipatingServer](x: Self) {
    
    inline def setLaunchStatus(value: LaunchStatus): Self = StObject.set(x, "launchStatus", value.asInstanceOf[js.Any])
    
    inline def setLaunchStatusUndefined: Self = StObject.set(x, "launchStatus", js.undefined)
    
    inline def setRecoveryInstanceID(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceID", value.asInstanceOf[js.Any])
    
    inline def setRecoveryInstanceIDUndefined: Self = StObject.set(x, "recoveryInstanceID", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDUndefined: Self = StObject.set(x, "sourceServerID", js.undefined)
  }
}
