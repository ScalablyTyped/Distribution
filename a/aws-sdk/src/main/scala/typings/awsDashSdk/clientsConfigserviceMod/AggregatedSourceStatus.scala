package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedSourceStatus extends js.Object {
  /**
    * The region authorized to collect aggregated data.
    */
  var AwsRegion: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AwsRegion] = js.native
  /**
    * The error code that AWS Config returned when the source account aggregation last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.native
  /**
    * The message indicating that the source account aggregation failed due to an error.
    */
  var LastErrorMessage: js.UndefOr[String] = js.native
  /**
    * Filters the last updated status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
    */
  var LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType] = js.native
  /**
    * The time of the last update.
    */
  var LastUpdateTime: js.UndefOr[_Date] = js.native
  /**
    * The source account ID or an organization.
    */
  var SourceId: js.UndefOr[String] = js.native
  /**
    * The source account or an organization.
    */
  var SourceType: js.UndefOr[AggregatedSourceType] = js.native
}

object AggregatedSourceStatus {
  @scala.inline
  def apply(
    AwsRegion: AwsRegion = null,
    LastErrorCode: String = null,
    LastErrorMessage: String = null,
    LastUpdateStatus: AggregatedSourceStatusType = null,
    LastUpdateTime: _Date = null,
    SourceId: String = null,
    SourceType: AggregatedSourceType = null
  ): AggregatedSourceStatus = {
    val __obj = js.Dynamic.literal()
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion.asInstanceOf[js.Any])
    if (LastErrorCode != null) __obj.updateDynamic("LastErrorCode")(LastErrorCode.asInstanceOf[js.Any])
    if (LastErrorMessage != null) __obj.updateDynamic("LastErrorMessage")(LastErrorMessage.asInstanceOf[js.Any])
    if (LastUpdateStatus != null) __obj.updateDynamic("LastUpdateStatus")(LastUpdateStatus.asInstanceOf[js.Any])
    if (LastUpdateTime != null) __obj.updateDynamic("LastUpdateTime")(LastUpdateTime.asInstanceOf[js.Any])
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedSourceStatus]
  }
}

