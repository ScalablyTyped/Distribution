package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessReportRecurrence extends js.Object {
  /**
    * The start date.
    */
  var StartDate: js.UndefOr[_Date] = js.undefined
}

object BusinessReportRecurrence {
  @scala.inline
  def apply(StartDate: _Date = null): BusinessReportRecurrence = {
    val __obj = js.Dynamic.literal()
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    __obj.asInstanceOf[BusinessReportRecurrence]
  }
}

