package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentAvailStates extends js.Object

@JSGlobal("connect.AgentAvailStates")
@js.native
object AgentAvailStates extends js.Object {
  @js.native
  sealed trait AFTER_CALL_WORK extends AgentAvailStates
  
  @js.native
  sealed trait BUSY extends AgentAvailStates
  
  @js.native
  sealed trait CALLING_CUSTOMER extends AgentAvailStates
  
  @js.native
  sealed trait DIALING extends AgentAvailStates
  
  @js.native
  sealed trait INIT extends AgentAvailStates
  
  @js.native
  sealed trait JOINING extends AgentAvailStates
  
  @js.native
  sealed trait PENDING_AVAILABLE extends AgentAvailStates
  
  @js.native
  sealed trait PENDING_BUSY extends AgentAvailStates
  
}

