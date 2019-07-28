package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CopyActiveItem extends js.Object {
  var copyActiveItem: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object Anon_CopyActiveItem {
  @scala.inline
  def apply(copyActiveItem: js.UndefOr[Boolean] = js.undefined, items: js.Array[js.Object] = null): Anon_CopyActiveItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copyActiveItem)) __obj.updateDynamic("copyActiveItem")(copyActiveItem)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_CopyActiveItem]
  }
}

