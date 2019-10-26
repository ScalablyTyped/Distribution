package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.InputValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelperOptions[TIntent /* <: Intent */, TValueSpec] extends js.Object {
  var data: js.UndefOr[TValueSpec] = js.undefined
  var intent: TIntent
  var `type`: InputValueSpec
}

object HelperOptions {
  @scala.inline
  def apply[TIntent /* <: Intent */, TValueSpec](intent: TIntent, `type`: InputValueSpec, data: TValueSpec = null): HelperOptions[TIntent, TValueSpec] = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelperOptions[TIntent, TValueSpec]]
  }
}

