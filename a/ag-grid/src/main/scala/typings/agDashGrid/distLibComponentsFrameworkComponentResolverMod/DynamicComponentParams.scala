package typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
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
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi)
    if ($scope != null) __obj.updateDynamic("$scope")($scope)
    if (colDef != null) __obj.updateDynamic("colDef")(colDef)
    if (column != null) __obj.updateDynamic("column")(column)
    if (data != null) __obj.updateDynamic("data")(data)
    if (node != null) __obj.updateDynamic("node")(node)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicComponentParams]
  }
}

