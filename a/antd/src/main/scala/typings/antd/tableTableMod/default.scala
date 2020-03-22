package typings.antd.tableTableMod

import typings.antd.columnGroupMod.ColumnGroupProps
import typings.antd.columnMod.ColumnProps
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/Table", JSImport.Default)
@js.native
object default extends js.Object {
  var SELECTION_ALL: String = js.native
  var SELECTION_INVERT: String = js.native
  def apply[RecordType /* <: js.Object */](props: TableProps[RecordType]): Element = js.native
  @js.native
  object Column extends js.Object {
    def apply[RecordType](_underscore: ColumnProps[RecordType]): Null = js.native
  }
  
  @js.native
  object ColumnGroup extends js.Object {
    def apply[RecordType](_underscore: ColumnGroupProps[RecordType]): Null = js.native
  }
  
  @js.native
  object defaultProps extends js.Object {
    var rowKey: String = js.native
  }
  
}

