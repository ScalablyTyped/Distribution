package typings.antd.mod

import typings.antd.antdBooleans.`false`
import typings.antd.listItemMod.ListItemTypeProps
import typings.antd.listMod.ListProps
import typings.antd.paginationPaginationMod.PaginationConfig
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "List")
@js.native
object List extends js.Object {
  var Item: ListItemTypeProps = js.native
  def apply[T](hasPaginationProps: ListProps[T]): Element = js.native
  @js.native
  object defaultProps extends js.Object {
    var bordered: Boolean = js.native
    var dataSource: js.Array[scala.Nothing] = js.native
    var loading: Boolean = js.native
    var pagination: js.UndefOr[`false` | PaginationConfig] = js.native
    var split: Boolean = js.native
  }
  
}

