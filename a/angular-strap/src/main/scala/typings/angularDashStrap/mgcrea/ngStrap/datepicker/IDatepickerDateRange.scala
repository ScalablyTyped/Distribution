package typings.angularDashStrap.mgcrea.ngStrap.datepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatepickerDateRange extends js.Object {
  var end: Date
  var start: Date
}

object IDatepickerDateRange {
  @scala.inline
  def apply(end: Date, start: Date): IDatepickerDateRange = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[IDatepickerDateRange]
  }
}

