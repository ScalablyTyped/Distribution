package typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.Player.EventTypes with Double
      ] = js.native
    /* 7 */ @js.native
    object DEQUE extends TopLevel[DEQUE with Double]
    
    /* 6 */ @js.native
    object ENQUEUE extends TopLevel[ENQUEUE with Double]
    
    /* 1 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    /* 0 */ @js.native
    object LOG extends TopLevel[LOG with Double]
    
    /* 4 */ @js.native
    object PAUSE extends TopLevel[PAUSE with Double]
    
    /* 2 */ @js.native
    object PLAY extends TopLevel[PLAY with Double]
    
    /* 3 */ @js.native
    object REPLAY extends TopLevel[REPLAY with Double]
    
    /* 5 */ @js.native
    object STOP extends TopLevel[STOP with Double]
    
  }
  
}

