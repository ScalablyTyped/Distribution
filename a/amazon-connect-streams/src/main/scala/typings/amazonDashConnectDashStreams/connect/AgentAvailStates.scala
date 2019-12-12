package typings.amazonDashConnectDashStreams.connect

import org.scalablytyped.runtime.TopLevel
import typings.amazonDashConnectDashStreams.connect.AgentAvailStates.AFTER_CALL_WORK
import typings.amazonDashConnectDashStreams.connect.AgentAvailStates.BUSY
import typings.amazonDashConnectDashStreams.connect.AgentAvailStates.CALLING_CUSTOMER
import typings.amazonDashConnectDashStreams.connect.AgentAvailStates.DIALING
import typings.amazonDashConnectDashStreams.connect.AgentAvailStates.INIT
import typings.amazonDashConnectDashStreams.connect.AgentAvailStates.JOINING
import typings.amazonDashConnectDashStreams.connect.AgentAvailStates.PENDING_AVAILABLE
import typings.amazonDashConnectDashStreams.connect.AgentAvailStates.PENDING_BUSY
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AgentAvailStates with String] = js.native
  /* "AfterCallWork" */ @js.native
  object AFTER_CALL_WORK extends TopLevel[AFTER_CALL_WORK with String]
  
  /* "Busy" */ @js.native
  object BUSY extends TopLevel[BUSY with String]
  
  /* "CallingCustomer" */ @js.native
  object CALLING_CUSTOMER extends TopLevel[CALLING_CUSTOMER with String]
  
  /* "Dialing" */ @js.native
  object DIALING extends TopLevel[DIALING with String]
  
  /* "Init" */ @js.native
  object INIT extends TopLevel[INIT with String]
  
  /* "Joining" */ @js.native
  object JOINING extends TopLevel[JOINING with String]
  
  /* "PendingAvailable" */ @js.native
  object PENDING_AVAILABLE extends TopLevel[PENDING_AVAILABLE with String]
  
  /* "PendingBusy" */ @js.native
  object PENDING_BUSY extends TopLevel[PENDING_BUSY with String]
  
}

