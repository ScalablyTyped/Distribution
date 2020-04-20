package typings.antd.tableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCurrentDataSource[RecordType] extends js.Object {
  var currentDataSource: js.Array[RecordType]
}

object TableCurrentDataSource {
  @scala.inline
  def apply[RecordType](currentDataSource: js.Array[RecordType]): TableCurrentDataSource[RecordType] = {
    val __obj = js.Dynamic.literal(currentDataSource = currentDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCurrentDataSource[RecordType]]
  }
}

