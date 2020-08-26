package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1Fulfillment extends js.Object {
  var messages: js.UndefOr[js.Array[DialogflowV1Message]] = js.native
  var speech: js.UndefOr[String] = js.native
}

object DialogflowV1Fulfillment {
  @scala.inline
  def apply(): DialogflowV1Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Fulfillment]
  }
  @scala.inline
  implicit class DialogflowV1FulfillmentOps[Self <: DialogflowV1Fulfillment] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: DialogflowV1Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[DialogflowV1Message]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setSpeech(value: String): Self = this.set("speech", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeech: Self = this.set("speech", js.undefined)
  }
  
}

