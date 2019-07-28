package typings.awsDashSdk.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageRecordResult extends js.Object {
  /**
    * The MeteringRecordId is a unique identifier for this metering event.
    */
  var MeteringRecordId: js.UndefOr[String] = js.undefined
  /**
    * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.    Success- The UsageRecord was accepted and honored by BatchMeterUsage.    CustomerNotSubscribed- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.    DuplicateRecord- Indicates that the UsageRecord was invalid and not honored. A previously metered UsageRecord had the same customer, dimension, and time, but a different quantity.  
    */
  var Status: js.UndefOr[UsageRecordResultStatus] = js.undefined
  /**
    * The UsageRecord that was part of the BatchMeterUsage request.
    */
  var UsageRecord: js.UndefOr[typings.awsDashSdk.clientsMarketplacemeteringMod.UsageRecord] = js.undefined
}

object UsageRecordResult {
  @scala.inline
  def apply(
    MeteringRecordId: String = null,
    Status: UsageRecordResultStatus = null,
    UsageRecord: UsageRecord = null
  ): UsageRecordResult = {
    val __obj = js.Dynamic.literal()
    if (MeteringRecordId != null) __obj.updateDynamic("MeteringRecordId")(MeteringRecordId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UsageRecord != null) __obj.updateDynamic("UsageRecord")(UsageRecord)
    __obj.asInstanceOf[UsageRecordResult]
  }
}

