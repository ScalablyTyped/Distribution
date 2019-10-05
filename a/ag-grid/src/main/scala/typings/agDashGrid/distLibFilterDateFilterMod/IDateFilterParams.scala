package typings.agDashGrid.distLibFilterDateFilterMod

import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibFilterBaseFilterMod.IComparableFilterParams
import typings.agDashGrid.distLibInterfacesIRowModelMod.IRowModel
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateFilterParams extends IComparableFilterParams {
  var browserDatePicker: js.UndefOr[Boolean] = js.undefined
  var comparator: js.UndefOr[IDateComparatorFunc] = js.undefined
}

object IDateFilterParams {
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
    browserDatePicker: js.UndefOr[Boolean] = js.undefined,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    comparator: (/* filterLocalDateAtMidnight */ Date, /* cellValue */ js.Any) => Double = null,
    defaultOption: String = null,
    filterOptions: js.Array[String] = null,
    newRowsAction: String = null,
    textFormatter: /* from */ String => String = null
  ): IDateFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope, colDef = colDef, column = column, context = context, doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel, suppressAndOrCondition = suppressAndOrCondition, valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton)
    if (!js.isUndefined(browserDatePicker)) __obj.updateDynamic("browserDatePicker")(browserDatePicker)
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2(comparator))
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction)
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    __obj.asInstanceOf[IDateFilterParams]
  }
}

