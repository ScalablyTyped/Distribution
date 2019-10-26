package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersLineItemSubLine extends js.Object {
  /**
    * A generic line item (e.g. add-on).
    */
  var lineItem: js.UndefOr[GoogleActionsV2OrdersLineItem] = js.undefined
  /**
    * A note associated with the line item.
    */
  var note: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersLineItemSubLine {
  @scala.inline
  def apply(lineItem: GoogleActionsV2OrdersLineItem = null, note: String = null): GoogleActionsV2OrdersLineItemSubLine = {
    val __obj = js.Dynamic.literal()
    if (lineItem != null) __obj.updateDynamic("lineItem")(lineItem)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItemSubLine]
  }
}

