package typings.agDashGrid.distLibInterfacesISetFilterParamsMod

import typings.agDashGrid.Anon_ICellRendererComp
import typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentHolder
import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibInterfacesIFilterMod.IFilterParams
import typings.agDashGrid.distLibInterfacesIRowModelMod.IRowModel
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetFilterParams
  extends IFilterParams
     with ComponentHolder {
  @JSName("apply")
  var apply: Boolean
  var cellHeight: Double
  var cellRenderer: Anon_ICellRendererComp | ICellRendererFunc | String
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
    cellRenderer: Anon_ICellRendererComp | ICellRendererFunc | String,
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

