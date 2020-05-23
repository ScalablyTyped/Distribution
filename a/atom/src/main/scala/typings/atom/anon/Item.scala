package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var item: js.UndefOr[js.Object] = js.undefined
}

object Item {
  @scala.inline
  def apply(item: js.Object = null): Item = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

