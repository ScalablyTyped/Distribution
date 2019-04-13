package typings
package alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventTypes extends js.Object

@JSImport("alexa-voice-service", "EventTypes")
@js.native
object EventTypes extends js.Object {
  @js.native
  sealed trait ERROR
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes
  
  @js.native
  sealed trait LOG
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes
  
  @js.native
  sealed trait LOGIN
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes
  
  @js.native
  sealed trait LOGOUT
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes
  
  @js.native
  sealed trait RECORD_START
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes
  
  @js.native
  sealed trait RECORD_STOP
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes
  
  @js.native
  sealed trait REFRESH_TOKEN_SET
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes
  
  @js.native
  sealed trait TOKEN_INVALID
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes
  
  @js.native
  sealed trait TOKEN_SET
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes
  
  val ERROR: ERROR with java.lang.String = js.native
  val LOG: LOG with java.lang.String = js.native
  val LOGIN: LOGIN with java.lang.String = js.native
  val LOGOUT: LOGOUT with java.lang.String = js.native
  val RECORD_START: RECORD_START with java.lang.String = js.native
  val RECORD_STOP: RECORD_STOP with java.lang.String = js.native
  val REFRESH_TOKEN_SET: REFRESH_TOKEN_SET with java.lang.String = js.native
  val TOKEN_INVALID: TOKEN_INVALID with java.lang.String = js.native
  val TOKEN_SET: TOKEN_SET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes with java.lang.String
  ] = js.native
}

