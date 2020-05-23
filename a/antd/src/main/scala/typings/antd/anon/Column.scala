package typings.antd.anon

import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column[RecordType] extends js.Object {
  var column: ColumnType[RecordType]
  var order: SortOrder
}

object Column {
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType], order: SortOrder = null): Column[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[RecordType]]
  }
}

