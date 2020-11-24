package typings.actionsOnGoogle.dialogflowDialogflowMod

import typings.actionsOnGoogle.contextMod.Contexts
import typings.actionsOnGoogle.conversationConversationMod.ExceptionHandler
import typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowHandlers[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */] extends js.Object {
  
  def catcher(conv: TConversation, error: Error): js.Promise[_] | js.Any = js.native
  @JSName("catcher")
  var catcher_Original: ExceptionHandler[TUserStorage, TConversation] = js.native
  
  var fallback: js.UndefOr[js.Function | String] = js.native
  
  var intents: DialogflowIntentHandlers = js.native
}
