package typings
package agDashGridLib.distLibRenderingDateComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateParams extends js.Object {
  var filterParams: agDashGridLib.distLibFilterDateFilterMod.IDateFilterParams
  /** Method for component to tell ag-Grid that the date has changed. */
  def onDateChanged(): scala.Unit
}

object IDateParams {
  @scala.inline
  def apply(
    filterParams: agDashGridLib.distLibFilterDateFilterMod.IDateFilterParams,
    onDateChanged: () => scala.Unit
  ): IDateParams = {
    val __obj = js.Dynamic.literal(filterParams = filterParams, onDateChanged = js.Any.fromFunction0(onDateChanged))
  
    __obj.asInstanceOf[IDateParams]
  }
}

