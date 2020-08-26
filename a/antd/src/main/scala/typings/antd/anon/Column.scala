package typings.antd.anon

import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column[RecordType] extends js.Object {
  var column: ColumnType[RecordType] = js.native
  var order: SortOrder = js.native
}

object Column {
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType]): Column[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[RecordType]]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column[_], RecordType] (val x: Self with Column[RecordType]) extends AnyVal {
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
    def setColumn(value: ColumnType[RecordType]): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: SortOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
  }
  
}

