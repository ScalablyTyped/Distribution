package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentErrorStates extends js.Object

@JSGlobal("connect.AgentErrorStates")
@js.native
object AgentErrorStates extends js.Object {
  @js.native
  sealed trait AGENT_HUNG_UP
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait BAD_ADDRESS_AGENT
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait BAD_ADDRESS_CUSTOMER
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait DEFAULT
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait ERROR
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait FAILED_CONNECT_AGENT
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait FAILED_CONNECT_CUSTOMER
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait LINE_ENGAGED_AGENT
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait LINE_ENGAGED_CUSTOMER
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait MISSED_CALL_AGENT
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait MISSED_CALL_CUSTOMER
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait MULTIPLE_CCP_WINDOWS
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  @js.native
  sealed trait REALTIME_COMMUNICATION_ERROR
    extends amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates
  
  /* "AgentHungUp" */ val AGENT_HUNG_UP: AGENT_HUNG_UP with java.lang.String = js.native
  /* "BadAddressAgent" */ val BAD_ADDRESS_AGENT: BAD_ADDRESS_AGENT with java.lang.String = js.native
  /* "BadAddressCustomer" */ val BAD_ADDRESS_CUSTOMER: BAD_ADDRESS_CUSTOMER with java.lang.String = js.native
  /* "Default" */ val DEFAULT: DEFAULT with java.lang.String = js.native
  /* "Error" */ val ERROR: ERROR with java.lang.String = js.native
  /* "FailedConnectAgent" */ val FAILED_CONNECT_AGENT: FAILED_CONNECT_AGENT with java.lang.String = js.native
  /* "FailedConnectCustomer" */ val FAILED_CONNECT_CUSTOMER: FAILED_CONNECT_CUSTOMER with java.lang.String = js.native
  /* "LineEngagedAgent" */ val LINE_ENGAGED_AGENT: LINE_ENGAGED_AGENT with java.lang.String = js.native
  /* "LineEngagedCustomer" */ val LINE_ENGAGED_CUSTOMER: LINE_ENGAGED_CUSTOMER with java.lang.String = js.native
  /* "MissedCallAgent" */ val MISSED_CALL_AGENT: MISSED_CALL_AGENT with java.lang.String = js.native
  /* "MissedCallCustomer" */ val MISSED_CALL_CUSTOMER: MISSED_CALL_CUSTOMER with java.lang.String = js.native
  /* "MultipleCcpWindows" */ val MULTIPLE_CCP_WINDOWS: MULTIPLE_CCP_WINDOWS with java.lang.String = js.native
  /* "RealtimeCommunicationError" */ val REALTIME_COMMUNICATION_ERROR: REALTIME_COMMUNICATION_ERROR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[amazonDashConnectDashStreamsLib.connectNs.AgentErrorStates with java.lang.String] = js.native
}

