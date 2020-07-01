package typings.antd.tableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCurrentDataSource[RecordType] extends js.Object {
  var action: TableAction
  var currentDataSource: js.Array[RecordType]
}

object TableCurrentDataSource {
  @scala.inline
  def apply[RecordType](action: TableAction, currentDataSource: js.Array[RecordType]): TableCurrentDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], currentDataSource = currentDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCurrentDataSource[RecordType]]
  }
}

