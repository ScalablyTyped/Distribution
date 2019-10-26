package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod

import typings.actionsDashOnDashGoogle.distCommonMod.ProtoAny
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2ExpectedIntent
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.InputValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/helper", "Helper")
@js.native
class Helper[TIntent /* <: Intent */, TValueSpec] protected () extends GoogleActionsV2ExpectedIntent {
  def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  @JSName("inputValueData")
  var inputValueData_Helper: ProtoAny[InputValueSpec, TValueSpec] = js.native
}

