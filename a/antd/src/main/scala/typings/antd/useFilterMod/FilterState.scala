package typings.antd.useFilterMod

import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterState[RecordType] extends js.Object {
  var column: ColumnType[RecordType]
  var filteredKeys: js.UndefOr[js.Array[Key] | Null] = js.undefined
  var forceFiltered: js.UndefOr[Boolean] = js.undefined
  var key: Key
}

object FilterState {
  @scala.inline
  def apply[RecordType](
    column: ColumnType[RecordType],
    key: Key,
    filteredKeys: js.Array[Key] = null,
    forceFiltered: js.UndefOr[Boolean] = js.undefined
  ): FilterState[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (filteredKeys != null) __obj.updateDynamic("filteredKeys")(filteredKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFiltered)) __obj.updateDynamic("forceFiltered")(forceFiltered.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterState[RecordType]]
  }
}

