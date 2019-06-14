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
    
    /* 7 */ val DEQUE: DEQUE with scala.Double = js.native
    /* 6 */ val ENQUEUE: ENQUEUE with scala.Double = js.native
    /* 1 */ val ERROR: ERROR with scala.Double = js.native
    /* 0 */ val LOG: LOG with scala.Double = js.native
    /* 4 */ val PAUSE: PAUSE with scala.Double = js.native
    /* 2 */ val PLAY: PLAY with scala.Double = js.native
    /* 3 */ val REPLAY: REPLAY with scala.Double = js.native
    /* 5 */ val STOP: STOP with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        alexaDashVoiceDashServiceLib.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes with scala.Double
      ] = js.native
  }
  
}

