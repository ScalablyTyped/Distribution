package typings.agGrid.dateComponentMod

import typings.agGrid.dateFilterMod.IDateFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateParams extends js.Object {
  var filterParams: IDateFilterParams
  /** Method for component to tell ag-Grid that the date has changed. */
  def onDateChanged(): Unit
}

object IDateParams {
  @scala.inline
  def apply(filterParams: IDateFilterParams, onDateChanged: () => Unit): IDateParams = {
    val __obj = js.Dynamic.literal(filterParams = filterParams.asInstanceOf[js.Any], onDateChanged = js.Any.fromFunction0(onDateChanged))
    __obj.asInstanceOf[IDateParams]
  }
}

