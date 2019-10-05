package typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-voice-service", "Player")
@js.native
class Player () extends js.Object {
  def on(eventType: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes): Unit = js.native
  def on(
    eventType: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

@JSImport("alexa-voice-service", "Player")
@js.native
object Player extends js.Object {
  @js.native
  sealed trait EventTypes extends js.Object
  
  @js.native
  object EventTypes extends js.Object {
    @js.native
    sealed trait DEQUE
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes
    
    @js.native
    sealed trait ENQUEUE
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes
    
    @js.native
    sealed trait ERROR
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes
    
    @js.native
    sealed trait LOG
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes
    
    @js.native
    sealed trait PAUSE
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes
    
    @js.native
    sealed trait PLAY
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes
    
    @js.native
    sealed trait REPLAY
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes
    
    @js.native
    sealed trait STOP
      extends typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes
    
    /* 7 */ val DEQUE: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes.DEQUE with Double = js.native
    /* 6 */ val ENQUEUE: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes.ENQUEUE with Double = js.native
    /* 1 */ val ERROR: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes.ERROR with Double = js.native
    /* 0 */ val LOG: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes.LOG with Double = js.native
    /* 4 */ val PAUSE: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes.PAUSE with Double = js.native
    /* 2 */ val PLAY: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes.PLAY with Double = js.native
    /* 3 */ val REPLAY: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes.REPLAY with Double = js.native
    /* 5 */ val STOP: typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes.STOP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes with Double
      ] = js.native
  }
  
}

