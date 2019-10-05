package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthlyTransfer extends js.Object {
  /**
    * The amount allocated per month (in GB).
    */
  var gbPerMonthAllocated: js.UndefOr[integer] = js.undefined
}

object MonthlyTransfer {
  @scala.inline
  def apply(gbPerMonthAllocated: Int | Double = null): MonthlyTransfer = {
    val __obj = js.Dynamic.literal()
    if (gbPerMonthAllocated != null) __obj.updateDynamic("gbPerMonthAllocated")(gbPerMonthAllocated.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthlyTransfer]
  }
}

