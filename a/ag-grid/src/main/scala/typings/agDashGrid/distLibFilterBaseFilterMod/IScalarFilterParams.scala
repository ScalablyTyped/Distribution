package typings.agDashGrid.distLibFilterBaseFilterMod

import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibInterfacesIRowModelMod.IRowModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScalarFilterParams extends IComparableFilterParams {
  var inRangeInclusive: js.UndefOr[Boolean] = js.undefined
  var nullComparator: js.UndefOr[NullComparator] = js.undefined
}

object IScalarFilterParams {
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
    clearButton: js.UndefOr[Boolean] = js.undefined,
    defaultOption: String = null,
    filterOptions: js.Array[String] = null,
    inRangeInclusive: js.UndefOr[Boolean] = js.undefined,
    newRowsAction: String = null,
    nullComparator: NullComparator = null,
    textFormatter: /* from */ String => String = null
  ): IScalarFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope, colDef = colDef, column = column, context = context, doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel, suppressAndOrCondition = suppressAndOrCondition, valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton)
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (!js.isUndefined(inRangeInclusive)) __obj.updateDynamic("inRangeInclusive")(inRangeInclusive)
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction)
    if (nullComparator != null) __obj.updateDynamic("nullComparator")(nullComparator)
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    __obj.asInstanceOf[IScalarFilterParams]
  }
}

