package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastRestoreRule extends js.Object {
  /**
    * The Availability Zones in which to enable fast snapshot restore.
    */
  var AvailabilityZones: AvailabilityZoneList = js.native
  /**
    * The number of snapshots to be enabled with fast snapshot restore.
    */
  var Count: js.UndefOr[typings.awsDashSdk.clientsDlmMod.Count] = js.native
  /**
    * The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typings.awsDashSdk.clientsDlmMod.Interval] = js.native
  /**
    * The unit of time for enabling fast snapshot restore.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.native
}

object FastRestoreRule {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZoneList,
    Count: Int | Double = null,
    Interval: Int | Double = null,
    IntervalUnit: RetentionIntervalUnitValues = null
  ): FastRestoreRule = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any])
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Interval != null) __obj.updateDynamic("Interval")(Interval.asInstanceOf[js.Any])
    if (IntervalUnit != null) __obj.updateDynamic("IntervalUnit")(IntervalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastRestoreRule]
  }
}

