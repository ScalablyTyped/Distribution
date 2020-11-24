package typings.actionsOnGoogle.dialogflowDialogflowMod

import typings.actionsOnGoogle.assistantMod.AppHandler
import typings.actionsOnGoogle.contextMod.Contexts
import typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialogflow_ extends js.Object {
  
  /** @public */
  def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](): AppHandler with (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
  def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](options: DialogflowOptions[js.Object, js.Object]): AppHandler with (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
}
