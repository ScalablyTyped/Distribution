package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentErrorStates extends StObject
@JSGlobal("connect.AgentErrorStates")
@js.native
object AgentErrorStates extends StObject {
  
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
}
