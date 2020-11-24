package typings.alexaVoiceService.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("alexa-voice-service", "Player")
@js.native
class Player () extends js.Object {
  
  def on(eventType: typings.alexaVoiceService.mod.Player.EventTypes): Unit = js.native
  def on(eventType: typings.alexaVoiceService.mod.Player.EventTypes, callback: js.Function0[Unit]): Unit = js.native
}
@JSImport("alexa-voice-service", "Player")
@js.native
object Player extends js.Object {
  
  @js.native
  sealed trait EventTypes extends js.Object
  @js.native
  object EventTypes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.alexaVoiceService.mod.Player.EventTypes with Double] = js.native
    
    @js.native
    sealed trait DEQUE
      extends typings.alexaVoiceService.mod.Player.EventTypes
    /* 7 */ @js.native
    object DEQUE extends TopLevel[DEQUE with Double]
    
    @js.native
    sealed trait ENQUEUE
      extends typings.alexaVoiceService.mod.Player.EventTypes
    /* 6 */ @js.native
    object ENQUEUE extends TopLevel[ENQUEUE with Double]
    
    @js.native
    sealed trait ERROR
      extends typings.alexaVoiceService.mod.Player.EventTypes
    /* 1 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    @js.native
    sealed trait LOG
      extends typings.alexaVoiceService.mod.Player.EventTypes
    /* 0 */ @js.native
    object LOG extends TopLevel[LOG with Double]
    
    @js.native
    sealed trait PAUSE
      extends typings.alexaVoiceService.mod.Player.EventTypes
    /* 4 */ @js.native
    object PAUSE extends TopLevel[PAUSE with Double]
    
    @js.native
    sealed trait PLAY
      extends typings.alexaVoiceService.mod.Player.EventTypes
    /* 2 */ @js.native
    object PLAY extends TopLevel[PLAY with Double]
    
    @js.native
    sealed trait REPLAY
      extends typings.alexaVoiceService.mod.Player.EventTypes
    /* 3 */ @js.native
    object REPLAY extends TopLevel[REPLAY with Double]
    
    @js.native
    sealed trait STOP
      extends typings.alexaVoiceService.mod.Player.EventTypes
    /* 5 */ @js.native
    object STOP extends TopLevel[STOP with Double]
  }
}
