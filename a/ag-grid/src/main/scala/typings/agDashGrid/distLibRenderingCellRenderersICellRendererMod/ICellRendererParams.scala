package typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellRendererParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any
  var api: GridApi
  var colDef: ColDef
  var column: Column
  var columnApi: ColumnApi
  var context: js.Any
  var data: js.Any
  var eGridCell: HTMLElement
  var eParentOfValue: HTMLElement
  var node: RowNode
  var rowIndex: Double
  var value: js.Any
  var valueFormatted: js.Any
  def addRenderedRowListener(eventType: String, listener: js.Function): Unit
  def formatValue(value: js.Any): js.Any
  def getValue(): js.Any
  def refreshCell(): Unit
  def setValue(value: js.Any): Unit
}

object ICellRendererParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    addRenderedRowListener: (String, js.Function) => Unit,
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    eGridCell: HTMLElement,
    eParentOfValue: HTMLElement,
    formatValue: js.Any => js.Any,
    getValue: () => js.Any,
    node: RowNode,
    refreshCell: () => Unit,
    rowIndex: Double,
    setValue: js.Any => Unit,
    value: js.Any,
    valueFormatted: js.Any
  ): ICellRendererParams = {
    val __obj = js.Dynamic.literal($scope = $scope, addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, eGridCell = eGridCell, eParentOfValue = eParentOfValue, formatValue = js.Any.fromFunction1(formatValue), getValue = js.Any.fromFunction0(getValue), node = node, refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex, setValue = js.Any.fromFunction1(setValue), value = value, valueFormatted = valueFormatted)
  
    __obj.asInstanceOf[ICellRendererParams]
  }
}

