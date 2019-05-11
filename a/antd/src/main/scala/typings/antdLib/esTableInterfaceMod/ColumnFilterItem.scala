package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFilterItem extends js.Object {
  var children: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var text: reactLib.reactMod.ReactNode
  var value: java.lang.String
}

object ColumnFilterItem {
  @scala.inline
  def apply(
    text: reactLib.reactMod.ReactNode,
    value: java.lang.String,
    children: js.Array[ColumnFilterItem] = null
  ): ColumnFilterItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[ColumnFilterItem]
  }
}

