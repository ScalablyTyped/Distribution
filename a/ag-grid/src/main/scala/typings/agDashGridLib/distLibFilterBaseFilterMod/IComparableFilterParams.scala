package typings
package agDashGridLib.distLibFilterBaseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComparableFilterParams
  extends agDashGridLib.distLibInterfacesIFilterMod.IFilterParams {
  var suppressAndOrCondition: scala.Boolean
}

object IComparableFilterParams {
  @scala.inline
  def apply(
    $scope: js.Any,
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    context: js.Any,
    doesRowPassOtherFilter: agDashGridLib.distLibEntitiesRowNodeMod.RowNode => scala.Boolean,
    filterChangedCallback: () => scala.Unit,
    filterModifiedCallback: () => scala.Unit,
    rowModel: agDashGridLib.distLibInterfacesIRowModelMod.IRowModel,
    suppressAndOrCondition: scala.Boolean,
    valueGetter: agDashGridLib.distLibEntitiesRowNodeMod.RowNode => js.Any,
    applyButton: js.UndefOr[scala.Boolean] = js.undefined,
    clearButton: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOption: java.lang.String = null,
    filterOptions: js.Array[java.lang.String] = null,
    newRowsAction: java.lang.String = null,
    textFormatter: /* from */ java.lang.String => java.lang.String = null
  ): IComparableFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope, colDef = colDef, column = column, context = context, doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel, suppressAndOrCondition = suppressAndOrCondition, valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton)
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction)
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    __obj.asInstanceOf[IComparableFilterParams]
  }
}

