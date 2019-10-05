package typings.agDashGrid.distLibFilterTextFilterMod

import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibFilterBaseFilterMod.IComparableFilterParams
import typings.agDashGrid.distLibInterfacesIRowModelMod.IRowModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFilterParams extends IComparableFilterParams {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var debounceMs: js.UndefOr[Double] = js.undefined
  var textCustomComparator: js.UndefOr[TextComparator] = js.undefined
}

object ITextFilterParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    colDef: ColDef,
    column: Column,
    context: js.Any,
    doesRowPassOtherFilter: RowNode => Boolean,
    filterChangedCallback: () => Unit,
    filterModifiedCallback: () => Unit,
    rowModel: IRowModel,
    suppressAndOrCondition: Boolean,
    valueGetter: RowNode => js.Any,
    applyButton: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    debounceMs: Int | Double = null,
    defaultOption: String = null,
    filterOptions: js.Array[String] = null,
    newRowsAction: String = null,
    textCustomComparator: (/* filter */ String, /* gridValue */ js.Any, /* filterText */ String) => Boolean = null,
    textFormatter: /* from */ String => String = null
  ): ITextFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope, colDef = colDef, column = column, context = context, doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel, suppressAndOrCondition = suppressAndOrCondition, valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (debounceMs != null) __obj.updateDynamic("debounceMs")(debounceMs.asInstanceOf[js.Any])
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction)
    if (textCustomComparator != null) __obj.updateDynamic("textCustomComparator")(js.Any.fromFunction3(textCustomComparator))
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    __obj.asInstanceOf[ITextFilterParams]
  }
}

