package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var item: js.UndefOr[js.Object] = js.undefined
}

object AnonItem {
  @scala.inline
  def apply(item: js.Object = null): AnonItem = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem]
  }
}

