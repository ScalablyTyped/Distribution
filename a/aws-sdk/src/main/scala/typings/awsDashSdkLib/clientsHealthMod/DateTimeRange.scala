package typings
package awsDashSdkLib.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeRange extends js.Object {
  /**
    * The starting date and time of a time range.
    */
  var from: js.UndefOr[timestamp] = js.undefined
  /**
    * The ending date and time of a time range.
    */
  var to: js.UndefOr[timestamp] = js.undefined
}

object DateTimeRange {
  @scala.inline
  def apply(from: timestamp = null, to: timestamp = null): DateTimeRange = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[DateTimeRange]
  }
}

