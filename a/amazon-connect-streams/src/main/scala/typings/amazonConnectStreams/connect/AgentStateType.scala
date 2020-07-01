package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentStateType extends js.Object

/** This enumeration lists the different types of agent states. */
@JSGlobal("connect.AgentStateType")
@js.native
object AgentStateType extends js.Object {
  /** The agent state hasn't been initialized yet. */
  @js.native
  sealed trait INIT extends AgentStateType
  
  /** The agent is in a state where they cannot be routed contacts. */
  @js.native
  sealed trait NOT_ROUTABLE extends AgentStateType
  
  /** The agent is offline. */
  @js.native
  sealed trait OFFLINE extends AgentStateType
  
  /** The agent is in a state where they can be routed contacts. */
  @js.native
  sealed trait ROUTABLE extends AgentStateType
  
}

