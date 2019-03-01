package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  var item: js.UndefOr[js.Object] = js.undefined
}

object Anon_Item {
  @scala.inline
  def apply(item: js.Object = null): Anon_Item = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[Anon_Item]
  }
}

