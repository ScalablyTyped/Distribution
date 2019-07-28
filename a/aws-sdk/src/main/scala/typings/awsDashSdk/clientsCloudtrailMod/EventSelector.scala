package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSelector extends js.Object {
  /**
    * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250 resources for an individual event selector, but the total number of data resources cannot exceed 250 across all event selectors in a trail. This limit does not apply if you configure resource logging for all data events.  For more information, see Data Events and Limits in AWS CloudTrail in the AWS CloudTrail User Guide.
    */
  var DataResources: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.DataResources] = js.undefined
  /**
    * Specify if you want your event selector to include management events for your trail.  For more information, see Management Events in the AWS CloudTrail User Guide. By default, the value is true.
    */
  var IncludeManagementEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.  By default, the value is All.
    */
  var ReadWriteType: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.ReadWriteType] = js.undefined
}

object EventSelector {
  @scala.inline
  def apply(
    DataResources: DataResources = null,
    IncludeManagementEvents: js.UndefOr[Boolean] = js.undefined,
    ReadWriteType: ReadWriteType = null
  ): EventSelector = {
    val __obj = js.Dynamic.literal()
    if (DataResources != null) __obj.updateDynamic("DataResources")(DataResources)
    if (!js.isUndefined(IncludeManagementEvents)) __obj.updateDynamic("IncludeManagementEvents")(IncludeManagementEvents)
    if (ReadWriteType != null) __obj.updateDynamic("ReadWriteType")(ReadWriteType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSelector]
  }
}

