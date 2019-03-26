package typings
package agDashGridLib.distLibComponentsFrameworkComponentResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicComponentParams extends js.Object {
  @JSName("$scope")
  var $scope: js.UndefOr[js.Any] = js.undefined
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var colDef: js.UndefOr[agDashGridLib.distLibEntitiesColDefMod.ColDef] = js.undefined
  var column: js.UndefOr[agDashGridLib.distLibEntitiesColumnMod.Column] = js.undefined
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var data: js.UndefOr[js.Any] = js.undefined
  var node: js.UndefOr[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object DynamicComponentParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    $scope: js.Any = null,
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef = null,
    column: agDashGridLib.distLibEntitiesColumnMod.Column = null,
    data: js.Any = null,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode = null,
    rowIndex: scala.Int | scala.Double = null
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

