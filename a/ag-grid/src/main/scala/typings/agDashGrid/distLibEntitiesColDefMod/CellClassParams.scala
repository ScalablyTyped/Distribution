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
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellClassParams]
  }
}

