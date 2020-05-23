package typings.amcharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var endDate: typings.std.Date
  var predefinedPeriod: String
  var startDate: typings.std.Date
  var `type`: String
}

object Count {
  @scala.inline
  def apply(
    count: Double,
    endDate: typings.std.Date,
    predefinedPeriod: String,
    startDate: typings.std.Date,
    `type`: String
  ): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], predefinedPeriod = predefinedPeriod.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

