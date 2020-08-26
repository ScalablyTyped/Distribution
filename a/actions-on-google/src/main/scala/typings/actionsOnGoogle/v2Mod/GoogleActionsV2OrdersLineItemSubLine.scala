package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersLineItemSubLine extends js.Object {
  /**
    * A generic line item (e.g. add-on).
    */
  var lineItem: js.UndefOr[GoogleActionsV2OrdersLineItem] = js.native
  /**
    * A note associated with the line item.
    */
  var note: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersLineItemSubLine {
  @scala.inline
  def apply(): GoogleActionsV2OrdersLineItemSubLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItemSubLine]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersLineItemSubLineOps[Self <: GoogleActionsV2OrdersLineItemSubLine] (val x: Self) extends AnyVal {
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
    def setLineItem(value: GoogleActionsV2OrdersLineItem): Self = this.set("lineItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItem: Self = this.set("lineItem", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
  }
  
}

