package typings.antd.mod

import typings.antd.antdStrings.SELECT_ALL
import typings.antd.antdStrings.SELECT_INVERT
import typings.antd.columnGroupMod.ColumnGroupProps
import typings.antd.columnMod.ColumnProps
import typings.antd.tableTableMod.TableProps
import typings.rcTable.footerCellMod.SummaryCellProps
import typings.rcTable.rowMod.FooterRowProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Table")
@js.native
object Table extends js.Object {
  var SELECTION_ALL: SELECT_ALL = js.native
  var SELECTION_INVERT: SELECT_INVERT = js.native
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
  object Summary extends js.Object {
    var Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpan */ SummaryCellProps, Element] = js.native
    var Row: js.Function1[/* props */ FooterRowProps, Element] = js.native
  }
  
  @js.native
  object defaultProps extends js.Object {
    var rowKey: String = js.native
  }
  
}

