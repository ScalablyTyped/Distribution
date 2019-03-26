package typings
package agDashGridLib.distLibInterfacesIFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any
  var applyButton: js.UndefOr[scala.Boolean] = js.undefined
  var clearButton: js.UndefOr[scala.Boolean] = js.undefined
  var colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var context: js.Any
  var defaultOption: js.UndefOr[java.lang.String] = js.undefined
  var filterOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var newRowsAction: js.UndefOr[java.lang.String] = js.undefined
  var rowModel: agDashGridLib.distLibInterfacesIRowModelMod.IRowModel
  var textFormatter: js.UndefOr[js.Function1[/* from */ java.lang.String, java.lang.String]] = js.undefined
  def doesRowPassOtherFilter(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean
  def filterChangedCallback(): scala.Unit
  def filterModifiedCallback(): scala.Unit
  def valueGetter(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): js.Any
}

object IFilterParams {
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
    valueGetter: agDashGridLib.distLibEntitiesRowNodeMod.RowNode => js.Any,
    applyButton: js.UndefOr[scala.Boolean] = js.undefined,
    clearButton: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOption: java.lang.String = null,
    filterOptions: js.Array[java.lang.String] = null,
    newRowsAction: java.lang.String = null,
    textFormatter: /* from */ java.lang.String => java.lang.String = null
  ): IFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope, colDef = colDef, column = column, context = context, doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel, valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton)
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction)
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    __obj.asInstanceOf[IFilterParams]
  }
}

