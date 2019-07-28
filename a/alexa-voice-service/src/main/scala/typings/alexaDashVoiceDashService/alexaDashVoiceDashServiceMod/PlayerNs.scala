package typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod

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
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait ENQUEUE
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait ERROR
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait LOG
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait PAUSE
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait PLAY
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait REPLAY
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    @js.native
    sealed trait STOP
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes
    
    /* 7 */ val DEQUE: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes.DEQUE with Double = js.native
    /* 6 */ val ENQUEUE: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes.ENQUEUE with Double = js.native
    /* 1 */ val ERROR: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes.ERROR with Double = js.native
    /* 0 */ val LOG: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes.LOG with Double = js.native
    /* 4 */ val PAUSE: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes.PAUSE with Double = js.native
    /* 2 */ val PLAY: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes.PLAY with Double = js.native
    /* 3 */ val REPLAY: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes.REPLAY with Double = js.native
    /* 5 */ val STOP: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes.STOP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.PlayerNs.EventTypes with Double
      ] = js.native
  }
  
}

