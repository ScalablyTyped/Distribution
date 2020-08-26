package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageBasicCardButton extends js.Object {
  var openUrlAction: js.UndefOr[DialogflowV1MessageBasicCardButtonAction] = js.native
  var title: js.UndefOr[String] = js.native
}

object DialogflowV1MessageBasicCardButton {
  @scala.inline
  def apply(): DialogflowV1MessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageBasicCardButton]
  }
  @scala.inline
  implicit class DialogflowV1MessageBasicCardButtonOps[Self <: DialogflowV1MessageBasicCardButton] (val x: Self) extends AnyVal {
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
    def setOpenUrlAction(value: DialogflowV1MessageBasicCardButtonAction): Self = this.set("openUrlAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenUrlAction: Self = this.set("openUrlAction", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

