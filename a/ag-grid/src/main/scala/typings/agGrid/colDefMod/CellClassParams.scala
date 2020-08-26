package typings.agGrid.colDefMod

import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellClassParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var api: GridApi = js.native
  var colDef: ColDef = js.native
  var context: js.Any = js.native
  var data: js.Any = js.native
  var node: RowNode = js.native
  var rowIndex: Double = js.native
  var value: js.Any = js.native
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
  @scala.inline
  implicit class CellClassParamsOps[Self <: CellClassParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$scope(value: js.Any): Self = this.set("$scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi(value: GridApi): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setColDef(value: ColDef): Self = this.set("colDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: RowNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

