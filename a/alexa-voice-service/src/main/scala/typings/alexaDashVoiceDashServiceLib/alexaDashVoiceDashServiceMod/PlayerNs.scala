package typings
package alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-voice-service", "Player")
@js.native
object PlayerNs extends js.Object {
  @js.native
  sealed trait EventTypes extends js.Object
  
  @js.native
  object EventTypes extends js.Object {
    @js.native
    sealed trait DEQUE
      extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait ENQUEUE
      extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait ERROR
      extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait LOG
      extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait PAUSE
      extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait PLAY
      extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait REPLAY
      extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait STOP
      extends alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    val DEQUE: DEQUE with java.lang.String = js.native
    val ENQUEUE: ENQUEUE with java.lang.String = js.native
    val ERROR: ERROR with java.lang.String = js.native
    val LOG: LOG with java.lang.String = js.native
    val PAUSE: PAUSE with java.lang.String = js.native
    val PLAY: PLAY with java.lang.String = js.native
    val REPLAY: REPLAY with java.lang.String = js.native
    val STOP: STOP with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes with java.lang.String
      ] = js.native
  }
  
}

