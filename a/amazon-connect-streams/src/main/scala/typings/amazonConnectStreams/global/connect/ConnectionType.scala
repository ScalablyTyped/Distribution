package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lists the different types of connections. */
@JSGlobal("connect.ConnectionType")
@js.native
object ConnectionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.amazonConnectStreams.connect.ConnectionType with String] = js.native
  
  /* "agent" */ val AGENT: typings.amazonConnectStreams.connect.ConnectionType.AGENT with String = js.native
  
  /* "inbound" */ val INBOUND: typings.amazonConnectStreams.connect.ConnectionType.INBOUND with String = js.native
  
  /* "monitoring" */ val MONITORING: typings.amazonConnectStreams.connect.ConnectionType.MONITORING with String = js.native
  
  /* "outbound" */ val OUTBOUND: typings.amazonConnectStreams.connect.ConnectionType.OUTBOUND with String = js.native
}
