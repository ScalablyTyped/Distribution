package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndpointType extends js.Object

@JSGlobal("connect.EndpointType")
@js.native
object EndpointType extends js.Object {
  @js.native
  sealed trait AGENT
    extends amazonDashConnectDashStreamsLib.connectNs.EndpointType
  
  @js.native
  sealed trait PHONE_NUMBER
    extends amazonDashConnectDashStreamsLib.connectNs.EndpointType
  
  @js.native
  sealed trait QUEUE
    extends amazonDashConnectDashStreamsLib.connectNs.EndpointType
  
  /* "agent" */ val AGENT: AGENT with java.lang.String = js.native
  /* "phone_number" */ val PHONE_NUMBER: PHONE_NUMBER with java.lang.String = js.native
  /* "queue" */ val QUEUE: QUEUE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[amazonDashConnectDashStreamsLib.connectNs.EndpointType with java.lang.String] = js.native
}

