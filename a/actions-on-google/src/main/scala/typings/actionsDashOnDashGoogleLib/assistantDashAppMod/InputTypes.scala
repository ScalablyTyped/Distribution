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
  
  val KEYBOARD: KEYBOARD with java.lang.String = js.native
  val TOUCH: TOUCH with java.lang.String = js.native
  val UNSPECIFIED: UNSPECIFIED with java.lang.String = js.native
  val VOICE: VOICE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[actionsDashOnDashGoogleLib.assistantDashAppMod.InputTypes with java.lang.String] = js.native
}

