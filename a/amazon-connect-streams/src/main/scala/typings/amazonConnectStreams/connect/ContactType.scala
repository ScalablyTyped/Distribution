package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContactType with String] = js.native
  /* "queue_callback" */ @js.native
  object QUEUE_CALLBACK extends TopLevel[QUEUE_CALLBACK with String]
  
  /* "voice" */ @js.native
  object VOICE extends TopLevel[VOICE with String]
  
}

