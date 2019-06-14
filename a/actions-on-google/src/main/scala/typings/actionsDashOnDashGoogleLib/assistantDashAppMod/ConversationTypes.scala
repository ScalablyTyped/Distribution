package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConversationTypes extends js.Object

@JSImport("actions-on-google/assistant-app", "ConversationTypes")
@js.native
object ConversationTypes extends js.Object {
  /**
    * An active (ongoing) conversation.
    */
  @js.native
  sealed trait ACTIVE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.ConversationTypes
  
  /**
    * A new conversation.
    */
  @js.native
  sealed trait NEW
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.ConversationTypes
  
  /**
    * Unspecified conversation state.
    */
  @js.native
  sealed trait UNSPECIFIED
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.ConversationTypes
  
  /* 2 */ val ACTIVE: ACTIVE with scala.Double = js.native
  /* 1 */ val NEW: NEW with scala.Double = js.native
  /* 0 */ val UNSPECIFIED: UNSPECIFIED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    actionsDashOnDashGoogleLib.assistantDashAppMod.ConversationTypes with scala.Double
  ] = js.native
}

