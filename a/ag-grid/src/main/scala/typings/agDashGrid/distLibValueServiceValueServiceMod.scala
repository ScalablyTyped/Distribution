package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/valueService/valueService", JSImport.Namespace)
@js.native
object distLibValueServiceValueServiceMod extends js.Object {
  @js.native
  class ValueService () extends js.Object {
    var cellExpressions: js.Any = js.native
    var columnController: js.Any = js.native
    var eventService: js.Any = js.native
    var expressionService: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var initialised: js.Any = js.native
    var valueCache: js.Any = js.native
    /* private */ def executeValueGetter(filterValueGetter: js.Any, data: js.Any, column: js.Any, rowNode: js.Any): js.Any = js.native
    def getKeyForNode(col: Column, rowNode: RowNode): js.Any = js.native
    def getValue(column: Column, rowNode: RowNode): js.Any = js.native
    def getValue(column: Column, rowNode: RowNode, forFilter: Boolean): js.Any = js.native
    def getValue(column: Column, rowNode: RowNode, forFilter: Boolean, ignoreAggData: Boolean): js.Any = js.native
    /* private */ def getValueCallback(node: js.Any, field: js.Any): js.Any = js.native
    def init(): Unit = js.native
    def setValue(rowNode: RowNode, colKey: String, newValue: js.Any): Unit = js.native
    def setValue(rowNode: RowNode, colKey: Column, newValue: js.Any): Unit = js.native
    /* private */ def setValueUsingField(data: js.Any, field: js.Any, newValue: js.Any, isFieldContainsDots: js.Any): js.Any = js.native
  }
  
}

