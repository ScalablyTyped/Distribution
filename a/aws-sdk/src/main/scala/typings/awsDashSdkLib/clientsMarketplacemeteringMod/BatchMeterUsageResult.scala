package typings
package awsDashSdkLib.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchMeterUsageResult extends js.Object {
  /**
    * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace Metering Service or were invalid.
    */
  var Results: js.UndefOr[UsageRecordResultList] = js.undefined
  /**
    * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can retry the failed request by making another BatchMeterUsage call with this list as input in the BatchMeterUsageRequest.
    */
  var UnprocessedRecords: js.UndefOr[UsageRecordList] = js.undefined
}

object BatchMeterUsageResult {
  @scala.inline
  def apply(Results: UsageRecordResultList = null, UnprocessedRecords: UsageRecordList = null): BatchMeterUsageResult = {
    val __obj = js.Dynamic.literal()
    if (Results != null) __obj.updateDynamic("Results")(Results)
    if (UnprocessedRecords != null) __obj.updateDynamic("UnprocessedRecords")(UnprocessedRecords)
    __obj.asInstanceOf[BatchMeterUsageResult]
  }
}

