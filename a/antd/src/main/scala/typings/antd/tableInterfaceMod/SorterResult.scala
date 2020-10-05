package typings.antd.tableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SorterResult[RecordType] extends js.Object {
  var column: js.UndefOr[typings.rcTable.interfaceMod.ColumnType[RecordType]] = js.native
  var columnKey: js.UndefOr[Key] = js.native
  var field: js.UndefOr[Key | js.Array[Key]] = js.native
  var order: js.UndefOr[SortOrder] = js.native
}

object SorterResult {
  @scala.inline
  def apply[RecordType](): SorterResult[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SorterResult[RecordType]]
  }
  @scala.inline
  implicit class SorterResultOps[Self <: SorterResult[_], RecordType] (val x: Self with SorterResult[RecordType]) extends AnyVal {
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
    def setColumn(value: typings.rcTable.interfaceMod.ColumnType[RecordType]): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setColumnKey(value: Key): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setFieldVarargs(value: Key*): Self = this.set("field", js.Array(value :_*))
    @scala.inline
    def setField(value: Key | js.Array[Key]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setOrder(value: SortOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
  }
  
}

