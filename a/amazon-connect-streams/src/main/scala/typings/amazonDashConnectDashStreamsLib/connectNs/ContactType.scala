package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactType extends js.Object

@JSGlobal("connect.ContactType")
@js.native
object ContactType extends js.Object {
  @js.native
  sealed trait QUEUE_CALLBACK
    extends amazonDashConnectDashStreamsLib.connectNs.ContactType
  
  @js.native
  sealed trait VOICE
    extends amazonDashConnectDashStreamsLib.connectNs.ContactType
  
  /* "queue_callback" */ val QUEUE_CALLBACK: QUEUE_CALLBACK with java.lang.String = js.native
  /* "voice" */ val VOICE: VOICE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[amazonDashConnectDashStreamsLib.connectNs.ContactType with java.lang.String] = js.native
}

