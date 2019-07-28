package typings.awsDashSdk.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeterUsageResult extends js.Object {
  /**
    * Metering record id.
    */
  var MeteringRecordId: js.UndefOr[String] = js.undefined
}

object MeterUsageResult {
  @scala.inline
  def apply(MeteringRecordId: String = null): MeterUsageResult = {
    val __obj = js.Dynamic.literal()
    if (MeteringRecordId != null) __obj.updateDynamic("MeteringRecordId")(MeteringRecordId)
    __obj.asInstanceOf[MeterUsageResult]
  }
}

