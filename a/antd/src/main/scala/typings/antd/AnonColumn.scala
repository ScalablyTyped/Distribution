package typings.antd

import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn[RecordType] extends js.Object {
  var column: ColumnType[RecordType]
  var order: SortOrder
}

object AnonColumn {
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType], order: SortOrder = null): AnonColumn[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn[RecordType]]
  }
}

