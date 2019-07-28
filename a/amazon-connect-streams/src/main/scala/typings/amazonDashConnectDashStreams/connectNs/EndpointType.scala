package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndpointType extends js.Object

@JSGlobal("connect.EndpointType")
@js.native
object EndpointType extends js.Object {
  @js.native
  sealed trait AGENT extends EndpointType
  
  @js.native
  sealed trait PHONE_NUMBER extends EndpointType
  
  @js.native
  sealed trait QUEUE extends EndpointType
  
  /* "agent" */ val AGENT: typings.amazonDashConnectDashStreams.connectNs.EndpointType.AGENT with String = js.native
  /* "phone_number" */ val PHONE_NUMBER: typings.amazonDashConnectDashStreams.connectNs.EndpointType.PHONE_NUMBER with String = js.native
  /* "queue" */ val QUEUE: typings.amazonDashConnectDashStreams.connectNs.EndpointType.QUEUE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EndpointType with String] = js.native
}

