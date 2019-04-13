package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampRange extends js.Object {
  /**
    * The minimum value of the timestamp range.
    */
  var beginDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The maximum value of the timestamp range.
    */
  var endDate: js.UndefOr[Timestamp] = js.undefined
}

object TimestampRange {
  @scala.inline
  def apply(beginDate: Timestamp = null, endDate: Timestamp = null): TimestampRange = {
    val __obj = js.Dynamic.literal()
    if (beginDate != null) __obj.updateDynamic("beginDate")(beginDate)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    __obj.asInstanceOf[TimestampRange]
  }
}

