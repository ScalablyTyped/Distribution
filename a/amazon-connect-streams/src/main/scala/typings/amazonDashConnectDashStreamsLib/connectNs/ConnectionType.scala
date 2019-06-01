package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionType extends js.Object

@JSGlobal("connect.ConnectionType")
@js.native
object ConnectionType extends js.Object {
  @js.native
  sealed trait AGENT
    extends amazonDashConnectDashStreamsLib.connectNs.ConnectionType
  
  @js.native
  sealed trait INBOUND
    extends amazonDashConnectDashStreamsLib.connectNs.ConnectionType
  
  @js.native
  sealed trait MONITORING
    extends amazonDashConnectDashStreamsLib.connectNs.ConnectionType
  
  @js.native
  sealed trait OUTBOUND
    extends amazonDashConnectDashStreamsLib.connectNs.ConnectionType
  
  /* "agent" */ val AGENT: AGENT with java.lang.String = js.native
  /* "inbound" */ val INBOUND: INBOUND with java.lang.String = js.native
  /* "monitoring" */ val MONITORING: MONITORING with java.lang.String = js.native
  /* "outbound" */ val OUTBOUND: OUTBOUND with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[amazonDashConnectDashStreamsLib.connectNs.ConnectionType with java.lang.String] = js.native
}

