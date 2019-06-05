package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeRangeFilter extends js.Object {
  /**
    * The end time of the time range filter
    */
  var EndTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The start time of the time range filter
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
}

object TimeRangeFilter {
  @scala.inline
  def apply(EndTime: TStamp = null, StartTime: TStamp = null): TimeRangeFilter = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[TimeRangeFilter]
  }
}

