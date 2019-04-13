package typings
package awsDashSdkLib.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRule extends js.Object {
  /**
    * The interval. The supported values are 12 and 24.
    */
  var Interval: awsDashSdkLib.clientsDlmMod.Interval
  /**
    * The interval unit.
    */
  var IntervalUnit: IntervalUnitValues
  /**
    * The time, in UTC, to start the operation. The operation occurs within a one-hour window following the specified time.
    */
  var Times: js.UndefOr[TimesList] = js.undefined
}

object CreateRule {
  @scala.inline
  def apply(Interval: Interval, IntervalUnit: IntervalUnitValues, Times: TimesList = null): CreateRule = {
    val __obj = js.Dynamic.literal(Interval = Interval, IntervalUnit = IntervalUnit.asInstanceOf[js.Any])
    if (Times != null) __obj.updateDynamic("Times")(Times)
    __obj.asInstanceOf[CreateRule]
  }
}

