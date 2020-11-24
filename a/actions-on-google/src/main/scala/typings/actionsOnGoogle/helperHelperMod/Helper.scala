package typings.actionsOnGoogle.helperHelperMod

import typings.actionsOnGoogle.commonMod.ProtoAny
import typings.actionsOnGoogle.conversationConversationMod.InputValueSpec
import typings.actionsOnGoogle.conversationConversationMod.Intent
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2ExpectedIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/helper", "Helper")
@js.native
class Helper[TIntent /* <: Intent */, TValueSpec] protected () extends GoogleActionsV2ExpectedIntent {
  def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  
  @JSName("inputValueData")
  var inputValueData_Helper: ProtoAny[InputValueSpec, TValueSpec] = js.native
}
