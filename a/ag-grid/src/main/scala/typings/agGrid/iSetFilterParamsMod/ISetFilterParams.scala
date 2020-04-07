package typings.agGrid.iSetFilterParamsMod

import typings.agGrid.AnonInstantiableICellRendererComp
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.componentResolverMod.ComponentHolder
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import typings.agGrid.iFilterMod.IFilterParams
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetFilterParams
  extends IFilterParams
     with ComponentHolder {
  @JSName("apply")
  var apply: Boolean
  var cellHeight: Double
  var cellRenderer: AnonInstantiableICellRendererComp | ICellRendererFunc | String
  var comparator: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.undefined
  var debounceMs: js.UndefOr[Double] = js.undefined
  var miniFilterSearchByRefDataKey: js.UndefOr[Boolean] = js.undefined
  @JSName("newRowsAction")
  var newRowsAction_ISetFilterParams: String
  var selectAllOnMiniFilter: Boolean
  var suppressMiniFilter: Boolean
  var suppressRemoveEntries: js.UndefOr[Boolean] = js.undefined
  var suppressSorting: Boolean
  var values: js.UndefOr[SetFilterValues] = js.undefined
}

object ISetFilterParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    apply: Boolean,
    cellHeight: Double,
    cellRenderer: AnonInstantiableICellRendererComp | ICellRendererFunc | String,
    colDef: ColDef,
    column: Column,
    context: js.Any,
    doesRowPassOtherFilter: RowNode => Boolean,
    filterChangedCallback: () => Unit,
    filterModifiedCallback: () => Unit,
    newRowsAction: String,
    rowModel: IRowModel,
    selectAllOnMiniFilter: Boolean,
    suppressMiniFilter: Boolean,
    suppressSorting: Boolean,
    valueGetter: RowNode => js.Any,
    applyButton: js.UndefOr[Boolean] = js.undefined,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    comparator: (/* a */ js.Any, /* b */ js.Any) => Double = null,
    debounceMs: Int | Double = null,
    defaultOption: String = null,
    filterOptions: js.Array[String] = null,
    miniFilterSearchByRefDataKey: js.UndefOr[Boolean] = js.undefined,
    suppressRemoveEntries: js.UndefOr[Boolean] = js.undefined,
    textFormatter: /* from */ String => String = null,
    values: SetFilterValues = null
  ): ISetFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), newRowsAction = newRowsAction.asInstanceOf[js.Any], rowModel = rowModel.asInstanceOf[js.Any], selectAllOnMiniFilter = selectAllOnMiniFilter.asInstanceOf[js.Any], suppressMiniFilter = suppressMiniFilter.asInstanceOf[js.Any], suppressSorting = suppressSorting.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton.asInstanceOf[js.Any])
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2(comparator))
    if (debounceMs != null) __obj.updateDynamic("debounceMs")(debounceMs.asInstanceOf[js.Any])
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(miniFilterSearchByRefDataKey)) __obj.updateDynamic("miniFilterSearchByRefDataKey")(miniFilterSearchByRefDataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressRemoveEntries)) __obj.updateDynamic("suppressRemoveEntries")(suppressRemoveEntries.asInstanceOf[js.Any])
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetFilterParams]
  }
}

