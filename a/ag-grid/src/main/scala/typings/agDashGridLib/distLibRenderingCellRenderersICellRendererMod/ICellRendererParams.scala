package typings
package agDashGridLib.distLibRenderingCellRenderersICellRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellRendererParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var context: js.Any
  var data: js.Any
  var eGridCell: stdLib.HTMLElement
  var eParentOfValue: stdLib.HTMLElement
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var rowIndex: scala.Double
  var value: js.Any
  var valueFormatted: js.Any
  def addRenderedRowListener(eventType: java.lang.String, listener: js.Function): scala.Unit
  def formatValue(value: js.Any): js.Any
  def getValue(): js.Any
  def refreshCell(): scala.Unit
  def setValue(value: js.Any): scala.Unit
}

object ICellRendererParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    addRenderedRowListener: (java.lang.String, js.Function) => scala.Unit,
    api: agDashGridLib.distLibGridApiMod.GridApi,
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    data: js.Any,
    eGridCell: stdLib.HTMLElement,
    eParentOfValue: stdLib.HTMLElement,
    formatValue: js.Any => js.Any,
    getValue: () => js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    refreshCell: () => scala.Unit,
    rowIndex: scala.Double,
    setValue: js.Any => scala.Unit,
    value: js.Any,
    valueFormatted: js.Any
  ): ICellRendererParams = {
    val __obj = js.Dynamic.literal($scope = $scope, addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, eGridCell = eGridCell, eParentOfValue = eParentOfValue, formatValue = js.Any.fromFunction1(formatValue), getValue = js.Any.fromFunction0(getValue), node = node, refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex, setValue = js.Any.fromFunction1(setValue), value = value, valueFormatted = valueFormatted)
  
    __obj.asInstanceOf[ICellRendererParams]
  }
}

