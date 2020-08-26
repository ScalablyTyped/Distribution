package typings.agGrid

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/columnController/autoGroupColService", JSImport.Namespace)
@js.native
object autoGroupColServiceMod extends js.Object {
  @js.native
  class AutoGroupColService () extends js.Object {
    var balancedColumnTreeBuilder: js.Any = js.native
    var columnController: js.Any = js.native
    var context: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    def createAutoGroupColumns(rowGroupColumns: js.Array[Column]): js.Array[Column] = js.native
    /* private */ def createOneAutoGroupColumn(rowGroupCol: js.Any, index: js.Any): js.Any = js.native
    /* private */ def generateDefaultColDef(rowGroupCol: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object AutoGroupColService extends js.Object {
    var GROUP_AUTO_COLUMN_BUNDLE_ID: String = js.native
    var GROUP_AUTO_COLUMN_ID: String = js.native
  }
  
}

