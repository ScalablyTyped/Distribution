package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCopyActiveItem extends js.Object {
  var copyActiveItem: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object AnonCopyActiveItem {
  @scala.inline
  def apply(copyActiveItem: js.UndefOr[Boolean] = js.undefined, items: js.Array[js.Object] = null): AnonCopyActiveItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copyActiveItem)) __obj.updateDynamic("copyActiveItem")(copyActiveItem.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCopyActiveItem]
  }
}

