package typings.agGrid.componentResolverMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicComponentParams extends js.Object {
  @JSName("$scope")
  var $scope: js.UndefOr[js.Any] = js.undefined
  var api: GridApi
  var colDef: js.UndefOr[ColDef] = js.undefined
  var column: js.UndefOr[Column] = js.undefined
  var columnApi: ColumnApi
  var data: js.UndefOr[js.Any] = js.undefined
  var node: js.UndefOr[RowNode] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object DynamicComponentParams {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    $scope: js.Any = null,
    colDef: ColDef = null,
    column: Column = null,
    data: js.Any = null,
    node: RowNode = null,
    rowIndex: Int | Double = null
  ): DynamicComponentParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    if ($scope != null) __obj.updateDynamic("$scope")($scope.asInstanceOf[js.Any])
    if (colDef != null) __obj.updateDynamic("colDef")(colDef.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicComponentParams]
  }
}

