package typings
package agDashGridLib.distLibRenderingCellRenderersGroupCellRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupCellRendererParams
  extends agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererParams {
  var actualValue: java.lang.String
  var checkbox: js.Any
  var footerValueGetter: js.Any
  var fullWidth: scala.Boolean
  var padding: scala.Double
  var pinned: java.lang.String
  var scope: js.Any
  var suppressCount: scala.Boolean
  var suppressDoubleClickExpand: scala.Boolean
  var suppressPadding: scala.Boolean
}

object GroupCellRendererParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    actualValue: java.lang.String,
    addRenderedRowListener: (java.lang.String, js.Function) => scala.Unit,
    api: agDashGridLib.distLibGridApiMod.GridApi,
    checkbox: js.Any,
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    data: js.Any,
    eGridCell: stdLib.HTMLElement,
    eParentOfValue: stdLib.HTMLElement,
    footerValueGetter: js.Any,
    formatValue: js.Any => js.Any,
    fullWidth: scala.Boolean,
    getValue: () => js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    padding: scala.Double,
    pinned: java.lang.String,
    refreshCell: () => scala.Unit,
    rowIndex: scala.Double,
    scope: js.Any,
    setValue: js.Any => scala.Unit,
    suppressCount: scala.Boolean,
    suppressDoubleClickExpand: scala.Boolean,
    suppressPadding: scala.Boolean,
    value: js.Any,
    valueFormatted: js.Any
  ): GroupCellRendererParams = {
    val __obj = js.Dynamic.literal($scope = $scope, actualValue = actualValue, addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api, checkbox = checkbox, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, eGridCell = eGridCell, eParentOfValue = eParentOfValue, footerValueGetter = footerValueGetter, formatValue = js.Any.fromFunction1(formatValue), fullWidth = fullWidth, getValue = js.Any.fromFunction0(getValue), node = node, padding = padding, pinned = pinned, refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex, scope = scope, setValue = js.Any.fromFunction1(setValue), suppressCount = suppressCount, suppressDoubleClickExpand = suppressDoubleClickExpand, suppressPadding = suppressPadding, value = value, valueFormatted = valueFormatted)
  
    __obj.asInstanceOf[GroupCellRendererParams]
  }
}

