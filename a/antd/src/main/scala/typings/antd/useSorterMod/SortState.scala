package typings.antd.useSorterMod

import typings.antd.antdBooleans.`false`
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.SortOrder
import typings.rcTable.interfaceMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortState[RecordType] extends js.Object {
  var column: ColumnType[RecordType] = js.native
  var key: Key = js.native
  var multiplePriority: Double | `false` = js.native
  var sortOrder: SortOrder | Null = js.native
}

object SortState {
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType], key: Key, multiplePriority: Double | `false`): SortState[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], multiplePriority = multiplePriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortState[RecordType]]
  }
  @scala.inline
  implicit class SortStateOps[Self <: SortState[_], RecordType] (val x: Self with SortState[RecordType]) extends AnyVal {
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
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiplePriority(value: Double | `false`): Self = this.set("multiplePriority", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortOrderNull: Self = this.set("sortOrder", null)
  }
  
}

