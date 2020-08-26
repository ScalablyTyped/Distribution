package typings.agGrid.textFilterMod

import typings.agGrid.baseFilterMod.IScalarFilterParams
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumberFilterParams extends IScalarFilterParams {
  var debounceMs: js.UndefOr[Double] = js.native
}

object INumberFilterParams {
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
    valueGetter: RowNode => js.Any
  ): INumberFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    __obj.asInstanceOf[INumberFilterParams]
  }
  @scala.inline
  implicit class INumberFilterParamsOps[Self <: INumberFilterParams] (val x: Self) extends AnyVal {
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
    def setDebounceMs(value: Double): Self = this.set("debounceMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounceMs: Self = this.set("debounceMs", js.undefined)
  }
  
}

