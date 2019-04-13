package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedSourceStatus extends js.Object {
  /**
    * The region authorized to collect aggregated data.
    */
  var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
  /**
    * The error code that AWS Config returned when the source account aggregation last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.undefined
  /**
    * The message indicating that the source account aggregation failed due to an error.
    */
  var LastErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * Filters the last updated status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
    */
  var LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType] = js.undefined
  /**
    * The time of the last update.
    */
  var LastUpdateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The source account ID or an organization.
    */
  var SourceId: js.UndefOr[String] = js.undefined
  /**
    * The source account or an organization.
    */
  var SourceType: js.UndefOr[AggregatedSourceType] = js.undefined
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
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion)
    if (LastErrorCode != null) __obj.updateDynamic("LastErrorCode")(LastErrorCode)
    if (LastErrorMessage != null) __obj.updateDynamic("LastErrorMessage")(LastErrorMessage)
    if (LastUpdateStatus != null) __obj.updateDynamic("LastUpdateStatus")(LastUpdateStatus.asInstanceOf[js.Any])
    if (LastUpdateTime != null) __obj.updateDynamic("LastUpdateTime")(LastUpdateTime)
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedSourceStatus]
  }
}

