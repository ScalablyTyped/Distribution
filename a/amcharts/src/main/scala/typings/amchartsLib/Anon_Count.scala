package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: scala.Double
  var endDate: stdLib.Date
  var predefinedPeriod: java.lang.String
  var startDate: stdLib.Date
  var `type`: java.lang.String
}

object Anon_Count {
  @scala.inline
  def apply(
    count: scala.Double,
    endDate: stdLib.Date,
    predefinedPeriod: java.lang.String,
    startDate: stdLib.Date,
    `type`: java.lang.String
  ): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count, endDate = endDate, predefinedPeriod = predefinedPeriod, startDate = startDate)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Count]
  }
}

