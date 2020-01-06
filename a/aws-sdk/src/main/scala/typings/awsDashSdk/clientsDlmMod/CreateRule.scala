package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRule extends js.Object {
  /**
    * The interval between snapshots. The supported values are 2, 3, 4, 6, 8, 12, and 24.
    */
  var Interval: typings.awsDashSdk.clientsDlmMod.Interval = js.native
  /**
    * The interval unit.
    */
  var IntervalUnit: IntervalUnitValues = js.native
  /**
    * The time, in UTC, to start the operation. The supported format is hh:mm. The operation occurs within a one-hour window following the specified time.
    */
  var Times: js.UndefOr[TimesList] = js.native
}

object CreateRule {
  @scala.inline
  def apply(Interval: Interval, IntervalUnit: IntervalUnitValues, Times: TimesList = null): CreateRule = {
    val __obj = js.Dynamic.literal(Interval = Interval.asInstanceOf[js.Any], IntervalUnit = IntervalUnit.asInstanceOf[js.Any])
    if (Times != null) __obj.updateDynamic("Times")(Times.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRule]
  }
}

