package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputTypes extends js.Object

@JSImport("actions-on-google/assistant-app", "InputTypes")
@js.native
object InputTypes extends js.Object {
  /**
    * Input given by keyboard (typed).
    */
  @js.native
  sealed trait KEYBOARD extends InputTypes
  
  /**
    * Input given by touch.
    */
  @js.native
  sealed trait TOUCH extends InputTypes
  
  /**
    * Unspecified.
    */
  @js.native
  sealed trait UNSPECIFIED extends InputTypes
  
  /**
    * Input given by voice (spoken).
    */
  @js.native
  sealed trait VOICE extends InputTypes
  
  /* 3 */ val KEYBOARD: typings.actionsDashOnDashGoogle.assistantDashAppMod.InputTypes.KEYBOARD with Double = js.native
  /* 1 */ val TOUCH: typings.actionsDashOnDashGoogle.assistantDashAppMod.InputTypes.TOUCH with Double = js.native
  /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.assistantDashAppMod.InputTypes.UNSPECIFIED with Double = js.native
  /* 2 */ val VOICE: typings.actionsDashOnDashGoogle.assistantDashAppMod.InputTypes.VOICE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputTypes with Double] = js.native
}

