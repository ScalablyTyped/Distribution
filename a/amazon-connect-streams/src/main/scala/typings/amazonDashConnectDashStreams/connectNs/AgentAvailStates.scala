package typings.amazonDashConnectDashStreams.connectNs

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
  
  /* "AfterCallWork" */ val AFTER_CALL_WORK: typings.amazonDashConnectDashStreams.connectNs.AgentAvailStates.AFTER_CALL_WORK with String = js.native
  /* "Busy" */ val BUSY: typings.amazonDashConnectDashStreams.connectNs.AgentAvailStates.BUSY with String = js.native
  /* "CallingCustomer" */ val CALLING_CUSTOMER: typings.amazonDashConnectDashStreams.connectNs.AgentAvailStates.CALLING_CUSTOMER with String = js.native
  /* "Dialing" */ val DIALING: typings.amazonDashConnectDashStreams.connectNs.AgentAvailStates.DIALING with String = js.native
  /* "Init" */ val INIT: typings.amazonDashConnectDashStreams.connectNs.AgentAvailStates.INIT with String = js.native
  /* "Joining" */ val JOINING: typings.amazonDashConnectDashStreams.connectNs.AgentAvailStates.JOINING with String = js.native
  /* "PendingAvailable" */ val PENDING_AVAILABLE: typings.amazonDashConnectDashStreams.connectNs.AgentAvailStates.PENDING_AVAILABLE with String = js.native
  /* "PendingBusy" */ val PENDING_BUSY: typings.amazonDashConnectDashStreams.connectNs.AgentAvailStates.PENDING_BUSY with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AgentAvailStates with String] = js.native
}

