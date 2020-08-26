package typings.actionsOnGoogle.helperHelperMod

import typings.actionsOnGoogle.conversationConversationMod.InputValueSpec
import typings.actionsOnGoogle.conversationConversationMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelperOptions[TIntent /* <: Intent */, TValueSpec] extends js.Object {
  var data: js.UndefOr[TValueSpec] = js.native
  var intent: TIntent = js.native
  var `type`: InputValueSpec = js.native
}

object HelperOptions {
  @scala.inline
  def apply[/* <: typings.actionsOnGoogle.conversationConversationMod.Intent */ TIntent, TValueSpec](intent: TIntent, `type`: InputValueSpec): HelperOptions[TIntent, TValueSpec] = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelperOptions[TIntent, TValueSpec]]
  }
  @scala.inline
  implicit class HelperOptionsOps[Self <: HelperOptions[_, _], /* <: typings.actionsOnGoogle.conversationConversationMod.Intent */ TIntent, TValueSpec] (val x: Self with (HelperOptions[TIntent, TValueSpec])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIntent(value: TIntent): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: InputValueSpec): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: TValueSpec): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

