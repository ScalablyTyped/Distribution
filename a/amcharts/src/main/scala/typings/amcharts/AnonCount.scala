package typings.amcharts

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Double
  var endDate: Date
  var predefinedPeriod: String
  var startDate: Date
  var `type`: String
}

object AnonCount {
  @scala.inline
  def apply(count: Double, endDate: Date, predefinedPeriod: String, startDate: Date, `type`: String): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], predefinedPeriod = predefinedPeriod.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

