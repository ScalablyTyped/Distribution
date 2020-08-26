package typings.antd.tableInterfaceMod

import typings.antd.paginationPaginationMod.PaginationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablePaginationConfig extends PaginationProps {
  var position: js.UndefOr[js.Array[TablePaginationPosition]] = js.native
}

object TablePaginationConfig {
  @scala.inline
  def apply(): TablePaginationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablePaginationConfig]
  }
  @scala.inline
  implicit class TablePaginationConfigOps[Self <: TablePaginationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPositionVarargs(value: TablePaginationPosition*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: js.Array[TablePaginationPosition]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

