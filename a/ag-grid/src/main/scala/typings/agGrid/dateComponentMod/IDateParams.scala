package typings.agGrid.dateComponentMod

import typings.agGrid.dateFilterMod.IDateFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateParams extends js.Object {
  
  var filterParams: IDateFilterParams = js.native
  
  /** Method for component to tell ag-Grid that the date has changed. */
  def onDateChanged(): Unit = js.native
}
object IDateParams {
  
  @scala.inline
  def apply(filterParams: IDateFilterParams, onDateChanged: () => Unit): IDateParams = {
    val __obj = js.Dynamic.literal(filterParams = filterParams.asInstanceOf[js.Any], onDateChanged = js.Any.fromFunction0(onDateChanged))
    __obj.asInstanceOf[IDateParams]
  }
  
  @scala.inline
  implicit class IDateParamsOps[Self <: IDateParams] (val x: Self) extends AnyVal {
    
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
    def setFilterParams(value: IDateFilterParams): Self = this.set("filterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDateChanged(value: () => Unit): Self = this.set("onDateChanged", js.Any.fromFunction0(value))
  }
}
