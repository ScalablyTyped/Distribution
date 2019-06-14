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
  
  /* 2 */ val ERROR: ERROR with scala.Double = js.native
  /* 4 */ val LOG: LOG with scala.Double = js.native
  /* 5 */ val LOGIN: LOGIN with scala.Double = js.native
  /* 6 */ val LOGOUT: LOGOUT with scala.Double = js.native
  /* 1 */ val RECORD_START: RECORD_START with scala.Double = js.native
  /* 0 */ val RECORD_STOP: RECORD_STOP with scala.Double = js.native
  /* 8 */ val REFRESH_TOKEN_SET: REFRESH_TOKEN_SET with scala.Double = js.native
  /* 3 */ val TOKEN_INVALID: TOKEN_INVALID with scala.Double = js.native
  /* 7 */ val TOKEN_SET: TOKEN_SET with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.EventTypes with scala.Double
  ] = js.native
}

