package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

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
  sealed trait KEYBOARD
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.InputTypes
  
  /**
    * Input given by touch.
    */
  @js.native
  sealed trait TOUCH
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.InputTypes
  
  /**
    * Unspecified.
    */
  @js.native
  sealed trait UNSPECIFIED
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.InputTypes
  
  /**
    * Input given by voice (spoken).
    */
  @js.native
  sealed trait VOICE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.InputTypes
  
  /* 3 */ val KEYBOARD: KEYBOARD with scala.Double = js.native
  /* 1 */ val TOUCH: TOUCH with scala.Double = js.native
  /* 0 */ val UNSPECIFIED: UNSPECIFIED with scala.Double = js.native
  /* 2 */ val VOICE: VOICE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[actionsDashOnDashGoogleLib.assistantDashAppMod.InputTypes with scala.Double] = js.native
}

