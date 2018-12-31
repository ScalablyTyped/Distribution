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
  
  val ACTIVE: ACTIVE with java.lang.String = js.native
  val NEW: NEW with java.lang.String = js.native
  val UNSPECIFIED: UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    actionsDashOnDashGoogleLib.assistantDashAppMod.ConversationTypes with java.lang.String
  ] = js.native
}

