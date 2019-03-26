package typings
package agDashGridLib.distLibInterfacesISetFilterParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetFilterParams
  extends agDashGridLib.distLibInterfacesIFilterMod.IFilterParams
     with agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentHolder {
  @JSName("apply")
  var apply: scala.Boolean
  var cellHeight: scala.Double
  var cellRenderer: agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String
  var comparator: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]] = js.undefined
  var debounceMs: js.UndefOr[scala.Double] = js.undefined
  var miniFilterSearchByRefDataKey: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("newRowsAction")
  var newRowsAction_ISetFilterParams: java.lang.String
  var selectAllOnMiniFilter: scala.Boolean
  var suppressMiniFilter: scala.Boolean
  var suppressRemoveEntries: js.UndefOr[scala.Boolean] = js.undefined
  var suppressSorting: scala.Boolean
  var values: js.UndefOr[SetFilterValues] = js.undefined
}

object ISetFilterParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    apply: scala.Boolean,
    cellHeight: scala.Double,
    cellRenderer: agDashGridLib.Anon_ICellRendererComp | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc | java.lang.String,
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    context: js.Any,
    doesRowPassOtherFilter: agDashGridLib.distLibEntitiesRowNodeMod.RowNode => scala.Boolean,
    filterChangedCallback: () => scala.Unit,
    filterModifiedCallback: () => scala.Unit,
    newRowsAction: java.lang.String,
    rowModel: agDashGridLib.distLibInterfacesIRowModelMod.IRowModel,
    selectAllOnMiniFilter: scala.Boolean,
    suppressMiniFilter: scala.Boolean,
    suppressSorting: scala.Boolean,
    valueGetter: agDashGridLib.distLibEntitiesRowNodeMod.RowNode => js.Any,
    applyButton: js.UndefOr[scala.Boolean] = js.undefined,
    clearButton: js.UndefOr[scala.Boolean] = js.undefined,
    comparator: (/* a */ js.Any, /* b */ js.Any) => scala.Double = null,
    debounceMs: scala.Int | scala.Double = null,
    defaultOption: java.lang.String = null,
    filterOptions: js.Array[java.lang.String] = null,
    miniFilterSearchByRefDataKey: js.UndefOr[scala.Boolean] = js.undefined,
    suppressRemoveEntries: js.UndefOr[scala.Boolean] = js.undefined,
    textFormatter: /* from */ java.lang.String => java.lang.String = null,
    values: SetFilterValues = null
  ): ISetFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope, apply = apply, cellHeight = cellHeight, cellRenderer = cellRenderer.asInstanceOf[js.Any], colDef = colDef, column = column, context = context, doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), newRowsAction = newRowsAction, rowModel = rowModel, selectAllOnMiniFilter = selectAllOnMiniFilter, suppressMiniFilter = suppressMiniFilter, suppressSorting = suppressSorting, valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton)
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2(comparator))
    if (debounceMs != null) __obj.updateDynamic("debounceMs")(debounceMs.asInstanceOf[js.Any])
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (!js.isUndefined(miniFilterSearchByRefDataKey)) __obj.updateDynamic("miniFilterSearchByRefDataKey")(miniFilterSearchByRefDataKey)
    if (!js.isUndefined(suppressRemoveEntries)) __obj.updateDynamic("suppressRemoveEntries")(suppressRemoveEntries)
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetFilterParams]
  }
}

