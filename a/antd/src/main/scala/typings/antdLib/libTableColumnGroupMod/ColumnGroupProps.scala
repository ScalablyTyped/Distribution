package typings
package antdLib.libTableColumnGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupProps extends js.Object {
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object ColumnGroupProps {
  @scala.inline
  def apply(title: reactLib.reactMod.ReactNs.ReactNode = null): ColumnGroupProps = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupProps]
  }
}

