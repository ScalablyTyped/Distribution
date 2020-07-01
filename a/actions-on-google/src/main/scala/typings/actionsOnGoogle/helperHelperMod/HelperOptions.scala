package typings.actionsOnGoogle.helperHelperMod

import typings.actionsOnGoogle.conversationConversationMod.InputValueSpec
import typings.actionsOnGoogle.conversationConversationMod.Intent
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
  def apply[/* <: typings.actionsOnGoogle.conversationConversationMod.Intent */ TIntent, TValueSpec](intent: TIntent, `type`: InputValueSpec, data: TValueSpec = null): HelperOptions[TIntent, TValueSpec] = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelperOptions[TIntent, TValueSpec]]
  }
}

