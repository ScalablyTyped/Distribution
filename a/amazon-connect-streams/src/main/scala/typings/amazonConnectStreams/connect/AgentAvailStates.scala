package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentAvailStates extends StObject
@JSGlobal("connect.AgentAvailStates")
@js.native
object AgentAvailStates extends StObject {
  
  @js.native
  sealed trait AFTER_CALL_WORK
    extends StObject
       with AgentAvailStates
  
  @js.native
  sealed trait BUSY
    extends StObject
       with AgentAvailStates
  
  @js.native
  sealed trait CALLING_CUSTOMER
    extends StObject
       with AgentAvailStates
  
  @js.native
  sealed trait DIALING
    extends StObject
       with AgentAvailStates
  
  @js.native
  sealed trait INIT
    extends StObject
       with AgentAvailStates
  
  @js.native
  sealed trait JOINING
    extends StObject
       with AgentAvailStates
  
  @js.native
  sealed trait PENDING_AVAILABLE
    extends StObject
       with AgentAvailStates
  
  @js.native
  sealed trait PENDING_BUSY
    extends StObject
       with AgentAvailStates
}
