package typings.antd.tableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCurrentDataSource[RecordType] extends js.Object {
  var action: TableAction = js.native
  var currentDataSource: js.Array[RecordType] = js.native
}

object TableCurrentDataSource {
  @scala.inline
  def apply[RecordType](action: TableAction, currentDataSource: js.Array[RecordType]): TableCurrentDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], currentDataSource = currentDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCurrentDataSource[RecordType]]
  }
  @scala.inline
  implicit class TableCurrentDataSourceOps[Self <: TableCurrentDataSource[_], RecordType] (val x: Self with TableCurrentDataSource[RecordType]) extends AnyVal {
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
    def setAction(value: TableAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentDataSourceVarargs(value: RecordType*): Self = this.set("currentDataSource", js.Array(value :_*))
    @scala.inline
    def setCurrentDataSource(value: js.Array[RecordType]): Self = this.set("currentDataSource", value.asInstanceOf[js.Any])
  }
  
}

