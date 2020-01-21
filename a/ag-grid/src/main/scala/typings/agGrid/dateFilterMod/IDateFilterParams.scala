package typings.agGrid.dateFilterMod

import typings.agGrid.baseFilterMod.IComparableFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateFilterParams extends IComparableFilterParams {
  var browserDatePicker: js.UndefOr[Boolean] = js.native
  var comparator: js.UndefOr[IDateComparatorFunc] = js.native
}

