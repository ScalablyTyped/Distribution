package typings.agDashGrid.distLibRenderingCellRenderersGroupCellRendererMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererParams
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupCellRendererParams extends ICellRendererParams {
  var actualValue: String
  var checkbox: js.Any
  var footerValueGetter: js.Any
  var fullWidth: Boolean
  var padding: Double
  var pinned: String
  var scope: js.Any
  var suppressCount: Boolean
  var suppressDoubleClickExpand: Boolean
  var suppressPadding: Boolean
}

object GroupCellRendererParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    actualValue: String,
    addRenderedRowListener: (String, js.Function) => Unit,
    api: GridApi,
    checkbox: js.Any,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    eGridCell: HTMLElement,
    eParentOfValue: HTMLElement,
    footerValueGetter: js.Any,
    formatValue: js.Any => js.Any,
    fullWidth: Boolean,
    getValue: () => js.Any,
    node: RowNode,
    padding: Double,
    pinned: String,
    refreshCell: () => Unit,
    rowIndex: Double,
    scope: js.Any,
    setValue: js.Any => Unit,
    suppressCount: Boolean,
    suppressDoubleClickExpand: Boolean,
    suppressPadding: Boolean,
    value: js.Any,
    valueFormatted: js.Any
  ): GroupCellRendererParams = {
    val __obj = js.Dynamic.literal($scope = $scope, actualValue = actualValue, addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api, checkbox = checkbox, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, eGridCell = eGridCell, eParentOfValue = eParentOfValue, footerValueGetter = footerValueGetter, formatValue = js.Any.fromFunction1(formatValue), fullWidth = fullWidth, getValue = js.Any.fromFunction0(getValue), node = node, padding = padding, pinned = pinned, refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex, scope = scope, setValue = js.Any.fromFunction1(setValue), suppressCount = suppressCount, suppressDoubleClickExpand = suppressDoubleClickExpand, suppressPadding = suppressPadding, value = value, valueFormatted = valueFormatted)
  
    __obj.asInstanceOf[GroupCellRendererParams]
  }
}

