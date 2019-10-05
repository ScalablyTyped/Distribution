package typings.amazonDashConnectDashStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentErrorStates extends js.Object

@JSGlobal("connect.AgentErrorStates")
@js.native
object AgentErrorStates extends js.Object {
  @js.native
  sealed trait AGENT_HUNG_UP extends AgentErrorStates
  
  @js.native
  sealed trait BAD_ADDRESS_AGENT extends AgentErrorStates
  
  @js.native
  sealed trait BAD_ADDRESS_CUSTOMER extends AgentErrorStates
  
  @js.native
  sealed trait DEFAULT extends AgentErrorStates
  
  @js.native
  sealed trait ERROR extends AgentErrorStates
  
  @js.native
  sealed trait FAILED_CONNECT_AGENT extends AgentErrorStates
  
  @js.native
  sealed trait FAILED_CONNECT_CUSTOMER extends AgentErrorStates
  
  @js.native
  sealed trait LINE_ENGAGED_AGENT extends AgentErrorStates
  
  @js.native
  sealed trait LINE_ENGAGED_CUSTOMER extends AgentErrorStates
  
  @js.native
  sealed trait MISSED_CALL_AGENT extends AgentErrorStates
  
  @js.native
  sealed trait MISSED_CALL_CUSTOMER extends AgentErrorStates
  
  @js.native
  sealed trait MULTIPLE_CCP_WINDOWS extends AgentErrorStates
  
  @js.native
  sealed trait REALTIME_COMMUNICATION_ERROR extends AgentErrorStates
  
  /* "AgentHungUp" */ val AGENT_HUNG_UP: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.AGENT_HUNG_UP with String = js.native
  /* "BadAddressAgent" */ val BAD_ADDRESS_AGENT: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.BAD_ADDRESS_AGENT with String = js.native
  /* "BadAddressCustomer" */ val BAD_ADDRESS_CUSTOMER: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.BAD_ADDRESS_CUSTOMER with String = js.native
  /* "Default" */ val DEFAULT: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.DEFAULT with String = js.native
  /* "Error" */ val ERROR: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.ERROR with String = js.native
  /* "FailedConnectAgent" */ val FAILED_CONNECT_AGENT: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.FAILED_CONNECT_AGENT with String = js.native
  /* "FailedConnectCustomer" */ val FAILED_CONNECT_CUSTOMER: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.FAILED_CONNECT_CUSTOMER with String = js.native
  /* "LineEngagedAgent" */ val LINE_ENGAGED_AGENT: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.LINE_ENGAGED_AGENT with String = js.native
  /* "LineEngagedCustomer" */ val LINE_ENGAGED_CUSTOMER: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.LINE_ENGAGED_CUSTOMER with String = js.native
  /* "MissedCallAgent" */ val MISSED_CALL_AGENT: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.MISSED_CALL_AGENT with String = js.native
  /* "MissedCallCustomer" */ val MISSED_CALL_CUSTOMER: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.MISSED_CALL_CUSTOMER with String = js.native
  /* "MultipleCcpWindows" */ val MULTIPLE_CCP_WINDOWS: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.MULTIPLE_CCP_WINDOWS with String = js.native
  /* "RealtimeCommunicationError" */ val REALTIME_COMMUNICATION_ERROR: typings.amazonDashConnectDashStreams.connect.AgentErrorStates.REALTIME_COMMUNICATION_ERROR with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AgentErrorStates with String] = js.native
}

