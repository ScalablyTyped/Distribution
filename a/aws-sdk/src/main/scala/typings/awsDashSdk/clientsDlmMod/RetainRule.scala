package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetainRule extends js.Object {
  /**
    * The number of snapshots to retain for each volume, up to a maximum of 1000.
    */
  var Count: js.UndefOr[typings.awsDashSdk.clientsDlmMod.Count] = js.native
  /**
    * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typings.awsDashSdk.clientsDlmMod.Interval] = js.native
  /**
    * The unit of time for time-based retention.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.native
}

object RetainRule {
  @scala.inline
  def apply(
    Count: Int | Double = null,
    Interval: Int | Double = null,
    IntervalUnit: RetentionIntervalUnitValues = null
  ): RetainRule = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Interval != null) __obj.updateDynamic("Interval")(Interval.asInstanceOf[js.Any])
    if (IntervalUnit != null) __obj.updateDynamic("IntervalUnit")(IntervalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetainRule]
  }
}

