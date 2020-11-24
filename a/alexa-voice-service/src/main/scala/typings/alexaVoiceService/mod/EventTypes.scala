package typings.alexaVoiceService.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventTypes extends js.Object
@JSImport("alexa-voice-service", "EventTypes")
@js.native
object EventTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypes with Double] = js.native
  
  @js.native
  sealed trait ERROR extends EventTypes
  /* 2 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait LOG extends EventTypes
  /* 4 */ @js.native
  object LOG extends TopLevel[LOG with Double]
  
  @js.native
  sealed trait LOGIN extends EventTypes
  /* 5 */ @js.native
  object LOGIN extends TopLevel[LOGIN with Double]
  
  @js.native
  sealed trait LOGOUT extends EventTypes
  /* 6 */ @js.native
  object LOGOUT extends TopLevel[LOGOUT with Double]
  
  @js.native
  sealed trait RECORD_START extends EventTypes
  /* 1 */ @js.native
  object RECORD_START extends TopLevel[RECORD_START with Double]
  
  @js.native
  sealed trait RECORD_STOP extends EventTypes
  /* 0 */ @js.native
  object RECORD_STOP extends TopLevel[RECORD_STOP with Double]
  
  @js.native
  sealed trait REFRESH_TOKEN_SET extends EventTypes
  /* 8 */ @js.native
  object REFRESH_TOKEN_SET extends TopLevel[REFRESH_TOKEN_SET with Double]
  
  @js.native
  sealed trait TOKEN_INVALID extends EventTypes
  /* 3 */ @js.native
  object TOKEN_INVALID extends TopLevel[TOKEN_INVALID with Double]
  
  @js.native
  sealed trait TOKEN_SET extends EventTypes
  /* 7 */ @js.native
  object TOKEN_SET extends TopLevel[TOKEN_SET with Double]
}
