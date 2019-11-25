package typings.antd.esTableColumnGroupMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object ColumnGroupProps {
  @scala.inline
  def apply(className: String = null, title: ReactNode = null): ColumnGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupProps]
  }
}

