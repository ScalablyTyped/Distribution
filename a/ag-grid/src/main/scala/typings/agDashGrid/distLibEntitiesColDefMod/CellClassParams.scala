package typings.agDashGrid.distLibEntitiesColDefMod

import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellClassParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any
  var api: GridApi
  var colDef: ColDef
  var context: js.Any
  var data: js.Any
  var node: RowNode
  var rowIndex: Double
  var value: js.Any
}

object CellClassParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    api: GridApi,
    colDef: ColDef,
    context: js.Any,
    data: js.Any,
    node: RowNode,
    rowIndex: Double,
    value: js.Any
  ): CellClassParams = {
    val __obj = js.Dynamic.literal($scope = $scope, api = api, colDef = colDef, context = context, data = data, node = node, rowIndex = rowIndex, value = value)
  
    __obj.asInstanceOf[CellClassParams]
  }
}

