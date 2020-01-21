package typings.actionsOnGoogle.actionssdkActionssdkMod

import typings.actionsOnGoogle.argumentArgumentMod.Argument
import typings.actionsOnGoogle.convMod.ActionsSdkConversation
import typings.actionsOnGoogle.conversationConversationMod.ExceptionHandler
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsSdkHandlers[TConvData, TUserStorage, TConversation /* <: ActionsSdkConversation[TConvData, TUserStorage] */] extends js.Object {
  @JSName("catcher")
  var catcher_Original: ExceptionHandler[TUserStorage, TConversation] = js.native
  var fallback: js.UndefOr[
    (ActionsSdkIntentHandler[js.Object, js.Object, ActionsSdkConversation[js.Object, js.Object], Argument]) | String
  ] = js.native
  var intents: ActionSdkIntentHandlers = js.native
  def catcher(conv: TConversation, error: Error): js.Promise[_] | js.Any = js.native
}

