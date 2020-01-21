package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AgentErrorStates with String] = js.native
  /* "AgentHungUp" */ @js.native
  object AGENT_HUNG_UP extends TopLevel[AGENT_HUNG_UP with String]
  
  /* "BadAddressAgent" */ @js.native
  object BAD_ADDRESS_AGENT extends TopLevel[BAD_ADDRESS_AGENT with String]
  
  /* "BadAddressCustomer" */ @js.native
  object BAD_ADDRESS_CUSTOMER extends TopLevel[BAD_ADDRESS_CUSTOMER with String]
  
  /* "Default" */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with String]
  
  /* "Error" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
  /* "FailedConnectAgent" */ @js.native
  object FAILED_CONNECT_AGENT extends TopLevel[FAILED_CONNECT_AGENT with String]
  
  /* "FailedConnectCustomer" */ @js.native
  object FAILED_CONNECT_CUSTOMER extends TopLevel[FAILED_CONNECT_CUSTOMER with String]
  
  /* "LineEngagedAgent" */ @js.native
  object LINE_ENGAGED_AGENT extends TopLevel[LINE_ENGAGED_AGENT with String]
  
  /* "LineEngagedCustomer" */ @js.native
  object LINE_ENGAGED_CUSTOMER extends TopLevel[LINE_ENGAGED_CUSTOMER with String]
  
  /* "MissedCallAgent" */ @js.native
  object MISSED_CALL_AGENT extends TopLevel[MISSED_CALL_AGENT with String]
  
  /* "MissedCallCustomer" */ @js.native
  object MISSED_CALL_CUSTOMER extends TopLevel[MISSED_CALL_CUSTOMER with String]
  
  /* "MultipleCcpWindows" */ @js.native
  object MULTIPLE_CCP_WINDOWS extends TopLevel[MULTIPLE_CCP_WINDOWS with String]
  
  /* "RealtimeCommunicationError" */ @js.native
  object REALTIME_COMMUNICATION_ERROR extends TopLevel[REALTIME_COMMUNICATION_ERROR with String]
  
}

