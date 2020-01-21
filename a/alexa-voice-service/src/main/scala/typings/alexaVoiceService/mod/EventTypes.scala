package typings.alexaVoiceService.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventTypes extends js.Object

@JSImport("alexa-voice-service", "EventTypes")
@js.native
object EventTypes extends js.Object {
  @js.native
  sealed trait ERROR extends EventTypes
  
  @js.native
  sealed trait LOG extends EventTypes
  
  @js.native
  sealed trait LOGIN extends EventTypes
  
  @js.native
  sealed trait LOGOUT extends EventTypes
  
  @js.native
  sealed trait RECORD_START extends EventTypes
  
  @js.native
  sealed trait RECORD_STOP extends EventTypes
  
  @js.native
  sealed trait REFRESH_TOKEN_SET extends EventTypes
  
  @js.native
  sealed trait TOKEN_INVALID extends EventTypes
  
  @js.native
  sealed trait TOKEN_SET extends EventTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypes with Double] = js.native
  /* 2 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 4 */ @js.native
  object LOG extends TopLevel[LOG with Double]
  
  /* 5 */ @js.native
  object LOGIN extends TopLevel[LOGIN with Double]
  
  /* 6 */ @js.native
  object LOGOUT extends TopLevel[LOGOUT with Double]
  
  /* 1 */ @js.native
  object RECORD_START extends TopLevel[RECORD_START with Double]
  
  /* 0 */ @js.native
  object RECORD_STOP extends TopLevel[RECORD_STOP with Double]
  
  /* 8 */ @js.native
  object REFRESH_TOKEN_SET extends TopLevel[REFRESH_TOKEN_SET with Double]
  
  /* 3 */ @js.native
  object TOKEN_INVALID extends TopLevel[TOKEN_INVALID with Double]
  
  /* 7 */ @js.native
  object TOKEN_SET extends TopLevel[TOKEN_SET with Double]
  
}

