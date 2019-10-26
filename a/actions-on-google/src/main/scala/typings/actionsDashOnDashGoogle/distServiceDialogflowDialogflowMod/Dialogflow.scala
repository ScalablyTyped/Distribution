package typings.actionsDashOnDashGoogle.distServiceDialogflowDialogflowMod

import org.scalablytyped.runtime.TopLevel
import typings.actionsDashOnDashGoogle.distAssistantMod.AppHandler
import typings.actionsDashOnDashGoogle.distServiceDialogflowContextMod.Contexts
import typings.actionsDashOnDashGoogle.distServiceDialogflowConvMod.DialogflowConversation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialogflow extends js.Object {
  /** @public */
  def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](): AppHandler with (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
  def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](options: DialogflowOptions[js.Object, js.Object]): AppHandler with (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
}

@JSImport("actions-on-google/dist/service/dialogflow/dialogflow", "dialogflow")
@js.native
object dialogflow extends TopLevel[Dialogflow]

