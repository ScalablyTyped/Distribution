package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3OrderContents extends js.Object {
  /**
    * List of order line items.
    * At least 1 line_item is required and at-most 50 is allowed.
    * All line items must belong to same vertical.
    */
  var lineItems: js.UndefOr[js.Array[GoogleActionsOrdersV3LineItem]] = js.undefined
}

object GoogleActionsOrdersV3OrderContents {
  @scala.inline
  def apply(lineItems: js.Array[GoogleActionsOrdersV3LineItem] = null): GoogleActionsOrdersV3OrderContents = {
    val __obj = js.Dynamic.literal()
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderContents]
  }
}

