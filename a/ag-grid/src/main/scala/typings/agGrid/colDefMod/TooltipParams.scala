package typings.agGrid.colDefMod

import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any
  var api: GridApi
  var colDef: ColDef
  var context: js.Any
  var data: js.Any
  var node: RowNode
  var rowIndex: Double
  var value: js.Any
  var valueFormatted: js.Any
}

object TooltipParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    api: GridApi,
    colDef: ColDef,
    context: js.Any,
    data: js.Any,
    node: RowNode,
    rowIndex: Double,
    value: js.Any,
    valueFormatted: js.Any
  ): TooltipParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipParams]
  }
}

