package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactType extends js.Object

@JSGlobal("connect.ContactType")
@js.native
object ContactType extends js.Object {
  @js.native
  sealed trait QUEUE_CALLBACK extends ContactType
  
  @js.native
  sealed trait VOICE extends ContactType
  
  /* "queue_callback" */ val QUEUE_CALLBACK: typings.amazonDashConnectDashStreams.connectNs.ContactType.QUEUE_CALLBACK with String = js.native
  /* "voice" */ val VOICE: typings.amazonDashConnectDashStreams.connectNs.ContactType.VOICE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContactType with String] = js.native
}

