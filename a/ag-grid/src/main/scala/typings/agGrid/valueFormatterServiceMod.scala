package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/valueFormatterService", JSImport.Namespace)
@js.native
object valueFormatterServiceMod extends js.Object {
  @js.native
  class ValueFormatterService () extends js.Object {
    var expressionService: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    def formatValue(column: Column, rowNode: RowNode, $scope: js.Any, value: js.Any): String = js.native
  }
  
}

