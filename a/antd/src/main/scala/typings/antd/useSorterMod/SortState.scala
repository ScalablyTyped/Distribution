package typings.antd.useSorterMod

import typings.antd.antdBooleans.`false`
import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortState[RecordType] extends js.Object {
  var column: ColumnType[RecordType]
  var key: Key
  var multiplePriority: Double | `false`
  var sortOrder: SortOrder | Null
}

object SortState {
  @scala.inline
  def apply[RecordType](
    column: ColumnType[RecordType],
    key: Key,
    multiplePriority: Double | `false`,
    sortOrder: SortOrder = null
  ): SortState[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], multiplePriority = multiplePriority.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortState[RecordType]]
  }
}

