package typings.actionsDashOnDashGoogle.distServiceActionssdkActionssdkMod

import org.scalablytyped.runtime.TopLevel
import typings.actionsDashOnDashGoogle.distAssistantMod.AppHandler
import typings.actionsDashOnDashGoogle.distServiceActionssdkConvMod.ActionsSdkConversation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsSdk extends js.Object {
  /** @public */
  def apply[Conversation /* <: ActionsSdkConversation[js.Object, js.Object] */](): AppHandler with (ActionsSdkApp[js.Object, js.Object, Conversation]) = js.native
  def apply[Conversation /* <: ActionsSdkConversation[js.Object, js.Object] */](options: ActionsSdkOptions[js.Object, js.Object]): AppHandler with (ActionsSdkApp[js.Object, js.Object, Conversation]) = js.native
}

@JSImport("actions-on-google/dist/service/actionssdk/actionssdk", "actionssdk")
@js.native
object actionssdk extends TopLevel[ActionsSdk]

