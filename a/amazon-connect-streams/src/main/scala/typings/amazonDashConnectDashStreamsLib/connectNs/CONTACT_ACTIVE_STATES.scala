package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CONTACT_ACTIVE_STATES extends js.Object

@JSGlobal("connect.CONTACT_ACTIVE_STATES")
@js.native
object CONTACT_ACTIVE_STATES extends js.Object {
  @js.native
  sealed trait CONNECTED
    extends amazonDashConnectDashStreamsLib.connectNs.CONTACT_ACTIVE_STATES
  
  @js.native
  sealed trait CONNECTING
    extends amazonDashConnectDashStreamsLib.connectNs.CONTACT_ACTIVE_STATES
  
  @js.native
  sealed trait INCOMING
    extends amazonDashConnectDashStreamsLib.connectNs.CONTACT_ACTIVE_STATES
  
  /* "connected" */ val CONNECTED: CONNECTED with java.lang.String = js.native
  /* "connecting" */ val CONNECTING: CONNECTING with java.lang.String = js.native
  /* "incoming" */ val INCOMING: INCOMING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    amazonDashConnectDashStreamsLib.connectNs.CONTACT_ACTIVE_STATES with java.lang.String
  ] = js.native
}

