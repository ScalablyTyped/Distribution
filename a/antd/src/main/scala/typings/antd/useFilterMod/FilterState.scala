package typings.antd.useFilterMod

import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterState[RecordType] extends js.Object {
  var column: ColumnType[RecordType] = js.native
  var filteredKeys: js.UndefOr[js.Array[Key] | Null] = js.native
  var forceFiltered: js.UndefOr[Boolean] = js.native
  var key: Key = js.native
}

object FilterState {
  @scala.inline
  def apply[RecordType](column: ColumnType[RecordType], key: Key): FilterState[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterState[RecordType]]
  }
  @scala.inline
  implicit class FilterStateOps[Self <: FilterState[_], RecordType] (val x: Self with FilterState[RecordType]) extends AnyVal {
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
    def setFilteredKeysVarargs(value: Key*): Self = this.set("filteredKeys", js.Array(value :_*))
    @scala.inline
    def setFilteredKeys(value: js.Array[Key]): Self = this.set("filteredKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredKeys: Self = this.set("filteredKeys", js.undefined)
    @scala.inline
    def setFilteredKeysNull: Self = this.set("filteredKeys", null)
    @scala.inline
    def setForceFiltered(value: Boolean): Self = this.set("forceFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceFiltered: Self = this.set("forceFiltered", js.undefined)
  }
  
}

