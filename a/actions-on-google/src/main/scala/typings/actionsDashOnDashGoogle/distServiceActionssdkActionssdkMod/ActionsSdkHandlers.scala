package typings.actionsDashOnDashGoogle.distServiceActionssdkActionssdkMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkConvMod.ActionsSdkConversation
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod.Argument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.ExceptionHandler
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

