package typings.amcharts

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Double
  var endDate: Date
  var predefinedPeriod: String
  var startDate: Date
  var `type`: String
}

object Anon_Count {
  @scala.inline
  def apply(count: Double, endDate: Date, predefinedPeriod: String, startDate: Date, `type`: String): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], predefinedPeriod = predefinedPeriod.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Count]
  }
}

