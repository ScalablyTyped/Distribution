package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2SimpleSelect extends js.Object {
  /**
    * List of items users should select from.
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2SimpleSelectItem]] = js.undefined
}

object GoogleActionsV2SimpleSelect {
  @scala.inline
  def apply(items: js.Array[GoogleActionsV2SimpleSelectItem] = null): GoogleActionsV2SimpleSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2SimpleSelect]
  }
}

