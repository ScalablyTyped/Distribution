package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentStateType extends js.Object

@JSGlobal("connect.AgentStateType")
@js.native
object AgentStateType extends js.Object {
  @js.native
  sealed trait INIT extends AgentStateType
  
  @js.native
  sealed trait NOT_ROUTABLE extends AgentStateType
  
  @js.native
  sealed trait OFFLINE extends AgentStateType
  
  @js.native
  sealed trait ROUTABLE extends AgentStateType
  
}

