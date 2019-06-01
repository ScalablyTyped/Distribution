package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentAvailStates extends js.Object

@JSGlobal("connect.AgentAvailStates")
@js.native
object AgentAvailStates extends js.Object {
  @js.native
  sealed trait AFTER_CALL_WORK
    extends amazonDashConnectDashStreamsLib.connectNs.AgentAvailStates
  
  @js.native
  sealed trait BUSY
    extends amazonDashConnectDashStreamsLib.connectNs.AgentAvailStates
  
  @js.native
  sealed trait CALLING_CUSTOMER
    extends amazonDashConnectDashStreamsLib.connectNs.AgentAvailStates
  
  @js.native
  sealed trait DIALING
    extends amazonDashConnectDashStreamsLib.connectNs.AgentAvailStates
  
  @js.native
  sealed trait INIT
    extends amazonDashConnectDashStreamsLib.connectNs.AgentAvailStates
  
  @js.native
  sealed trait JOINING
    extends amazonDashConnectDashStreamsLib.connectNs.AgentAvailStates
  
  @js.native
  sealed trait PENDING_AVAILABLE
    extends amazonDashConnectDashStreamsLib.connectNs.AgentAvailStates
  
  @js.native
  sealed trait PENDING_BUSY
    extends amazonDashConnectDashStreamsLib.connectNs.AgentAvailStates
  
  /* "AfterCallWork" */ val AFTER_CALL_WORK: AFTER_CALL_WORK with java.lang.String = js.native
  /* "Busy" */ val BUSY: BUSY with java.lang.String = js.native
  /* "CallingCustomer" */ val CALLING_CUSTOMER: CALLING_CUSTOMER with java.lang.String = js.native
  /* "Dialing" */ val DIALING: DIALING with java.lang.String = js.native
  /* "Init" */ val INIT: INIT with java.lang.String = js.native
  /* "Joining" */ val JOINING: JOINING with java.lang.String = js.native
  /* "PendingAvailable" */ val PENDING_AVAILABLE: PENDING_AVAILABLE with java.lang.String = js.native
  /* "PendingBusy" */ val PENDING_BUSY: PENDING_BUSY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[amazonDashConnectDashStreamsLib.connectNs.AgentAvailStates with java.lang.String] = js.native
}

