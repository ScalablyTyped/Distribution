package typings.agGrid.componentResolverMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicComponentParams extends js.Object {
  @JSName("$scope")
  var $scope: js.UndefOr[js.Any] = js.native
  var api: GridApi = js.native
  var colDef: js.UndefOr[ColDef] = js.native
  var column: js.UndefOr[Column] = js.native
  var columnApi: ColumnApi = js.native
  var data: js.UndefOr[js.Any] = js.native
  var node: js.UndefOr[RowNode] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
}

