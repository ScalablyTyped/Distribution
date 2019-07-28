package typings.atAtlaskitSingleDashSelect.atAtlaskitSingleDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupType extends js.Object {
  var heading: js.UndefOr[String] = js.undefined
  var items: js.Array[ItemType]
}

object GroupType {
  @scala.inline
  def apply(items: js.Array[ItemType], heading: String = null): GroupType = {
    val __obj = js.Dynamic.literal(items = items)
    if (heading != null) __obj.updateDynamic("heading")(heading)
    __obj.asInstanceOf[GroupType]
  }
}

