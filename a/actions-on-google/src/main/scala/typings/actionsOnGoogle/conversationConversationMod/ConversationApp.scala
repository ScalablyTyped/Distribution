package typings.actionsOnGoogle.conversationConversationMod

import typings.actionsOnGoogle.assistantMod.ServiceBaseApp
import typings.googleAuthLibrary.mod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationApp[TConvData, TUserStorage] extends ServiceBaseApp {
  
  /** @hidden */
  var _client: js.UndefOr[OAuth2Client] = js.native
  
  /** @public */
  var auth: js.UndefOr[OAuth2Config] = js.native
  
  /** @public */
  var init: js.UndefOr[js.Function0[ConversationOptionsInit[TConvData, TUserStorage]]] = js.native
  
  /** @public */
  var ordersv3: Boolean = js.native
}
