package typings.agGrid.iSetFilterParamsMod

import typings.agGrid.anon.InstantiableICellRendererComp
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.componentResolverMod.ComponentHolder
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import typings.agGrid.iFilterMod.IFilterParams
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetFilterParams
  extends IFilterParams
     with ComponentHolder {
  @JSName("apply")
  var apply: Boolean = js.native
  var cellHeight: Double = js.native
  var cellRenderer: InstantiableICellRendererComp | ICellRendererFunc | String = js.native
  var comparator: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
  var debounceMs: js.UndefOr[Double] = js.native
  var miniFilterSearchByRefDataKey: js.UndefOr[Boolean] = js.native
  @JSName("newRowsAction")
  var newRowsAction_ISetFilterParams: String = js.native
  var selectAllOnMiniFilter: Boolean = js.native
  var suppressMiniFilter: Boolean = js.native
  var suppressRemoveEntries: js.UndefOr[Boolean] = js.native
  var suppressSorting: Boolean = js.native
  var values: js.UndefOr[SetFilterValues] = js.native
}

object ISetFilterParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    apply: Boolean,
    cellHeight: Double,
    cellRenderer: InstantiableICellRendererComp | ICellRendererFunc | String,
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
    valueGetter: RowNode => js.Any
  ): ISetFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), newRowsAction = newRowsAction.asInstanceOf[js.Any], rowModel = rowModel.asInstanceOf[js.Any], selectAllOnMiniFilter = selectAllOnMiniFilter.asInstanceOf[js.Any], suppressMiniFilter = suppressMiniFilter.asInstanceOf[js.Any], suppressSorting = suppressSorting.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    __obj.asInstanceOf[ISetFilterParams]
  }
  @scala.inline
  implicit class ISetFilterParamsOps[Self <: ISetFilterParams] (val x: Self) extends AnyVal {
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
    def setApply(value: Boolean): Self = this.set("apply", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellRendererFunction1(value: /* params */ js.Any => HTMLElement | String): Self = this.set("cellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setCellRenderer(value: InstantiableICellRendererComp | ICellRendererFunc | String): Self = this.set("cellRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewRowsAction(value: String): Self = this.set("newRowsAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectAllOnMiniFilter(value: Boolean): Self = this.set("selectAllOnMiniFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuppressMiniFilter(value: Boolean): Self = this.set("suppressMiniFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuppressSorting(value: Boolean): Self = this.set("suppressSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def setComparator(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("comparator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    @scala.inline
    def setDebounceMs(value: Double): Self = this.set("debounceMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounceMs: Self = this.set("debounceMs", js.undefined)
    @scala.inline
    def setMiniFilterSearchByRefDataKey(value: Boolean): Self = this.set("miniFilterSearchByRefDataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiniFilterSearchByRefDataKey: Self = this.set("miniFilterSearchByRefDataKey", js.undefined)
    @scala.inline
    def setSuppressRemoveEntries(value: Boolean): Self = this.set("suppressRemoveEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressRemoveEntries: Self = this.set("suppressRemoveEntries", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValuesFunction1(value: /* params */ SetFilterValuesFuncParams => Unit): Self = this.set("values", js.Any.fromFunction1(value))
    @scala.inline
    def setValues(value: SetFilterValues): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

