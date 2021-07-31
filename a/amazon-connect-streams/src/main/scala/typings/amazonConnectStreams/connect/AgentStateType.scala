package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentStateType extends StObject
/** This enumeration lists the different types of agent states. */
@JSGlobal("connect.AgentStateType")
@js.native
object AgentStateType extends StObject {
  
  /** The agent state hasn't been initialized yet. */
  @js.native
  sealed trait INIT
    extends StObject
       with AgentStateType
  
  /** The agent is in a state where they cannot be routed contacts. */
  @js.native
  sealed trait NOT_ROUTABLE
    extends StObject
       with AgentStateType
  
  /** The agent is offline. */
  @js.native
  sealed trait OFFLINE
    extends StObject
       with AgentStateType
  
  /** The agent is in a state where they can be routed contacts. */
  @js.native
  sealed trait ROUTABLE
    extends StObject
       with AgentStateType
}
