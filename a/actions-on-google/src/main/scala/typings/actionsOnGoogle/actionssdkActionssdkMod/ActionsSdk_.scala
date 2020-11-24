package typings.actionsOnGoogle.actionssdkActionssdkMod

import typings.actionsOnGoogle.assistantMod.AppHandler
import typings.actionsOnGoogle.convMod.ActionsSdkConversation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsSdk_ extends js.Object {
  
  /** @public */
  def apply[Conversation /* <: ActionsSdkConversation[js.Object, js.Object] */](): AppHandler with (ActionsSdkApp[js.Object, js.Object, Conversation]) = js.native
  def apply[Conversation /* <: ActionsSdkConversation[js.Object, js.Object] */](options: ActionsSdkOptions[js.Object, js.Object]): AppHandler with (ActionsSdkApp[js.Object, js.Object, Conversation]) = js.native
}
