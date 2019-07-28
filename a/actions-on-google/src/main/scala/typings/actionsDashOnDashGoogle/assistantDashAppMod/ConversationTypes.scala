package typings.actionsDashOnDashGoogle.assistantDashAppMod

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
  sealed trait ACTIVE extends ConversationTypes
  
  /**
    * A new conversation.
    */
  @js.native
  sealed trait NEW extends ConversationTypes
  
  /**
    * Unspecified conversation state.
    */
  @js.native
  sealed trait UNSPECIFIED extends ConversationTypes
  
  /* 2 */ val ACTIVE: typings.actionsDashOnDashGoogle.assistantDashAppMod.ConversationTypes.ACTIVE with Double = js.native
  /* 1 */ val NEW: typings.actionsDashOnDashGoogle.assistantDashAppMod.ConversationTypes.NEW with Double = js.native
  /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.assistantDashAppMod.ConversationTypes.UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConversationTypes with Double] = js.native
}

