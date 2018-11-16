package typings
package alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventTypes extends js.Object

@JSImport("alexa-voice-service/AVS", "EventTypes")
@js.native
object EventTypes extends js.Object {
  @js.native
  sealed trait ERROR
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes
  
  @js.native
  sealed trait LOG
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes
  
  @js.native
  sealed trait LOGIN
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes
  
  @js.native
  sealed trait LOGOUT
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes
  
  @js.native
  sealed trait RECORD_START
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes
  
  @js.native
  sealed trait RECORD_STOP
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes
  
  @js.native
  sealed trait REFRESH_TOKEN_SET
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes
  
  @js.native
  sealed trait TOKEN_INVALID
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes
  
  @js.native
  sealed trait TOKEN_SET
    extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.AVSNs.EventTypes
  
}

