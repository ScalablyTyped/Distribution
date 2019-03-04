package typings
package atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupType extends js.Object {
  var heading: js.UndefOr[java.lang.String] = js.undefined
  var items: js.Array[ItemType]
}

object GroupType {
  @scala.inline
  def apply(items: js.Array[ItemType], heading: java.lang.String = null): GroupType = {
    val __obj = js.Dynamic.literal(items = items)
    if (heading != null) __obj.updateDynamic("heading")(heading)
    __obj.asInstanceOf[GroupType]
  }
}

