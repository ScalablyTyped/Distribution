package typings.agGrid.dateFilterMod

import typings.agGrid.baseFilterMod.IComparableFilterParams
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateFilterParams extends IComparableFilterParams {
  
  var browserDatePicker: js.UndefOr[Boolean] = js.native
  
  var comparator: js.UndefOr[IDateComparatorFunc] = js.native
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
    valueGetter: RowNode => js.Any
  ): IDateFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    __obj.asInstanceOf[IDateFilterParams]
  }
  
  @scala.inline
  implicit class IDateFilterParamsOps[Self <: IDateFilterParams] (val x: Self) extends AnyVal {
    
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
    def setBrowserDatePicker(value: Boolean): Self = this.set("browserDatePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserDatePicker: Self = this.set("browserDatePicker", js.undefined)
    
    @scala.inline
    def setComparator(value: (/* filterLocalDateAtMidnight */ Date, /* cellValue */ js.Any) => Double): Self = this.set("comparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
  }
}
