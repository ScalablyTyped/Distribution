package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVolumesModificationsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The filters. Supported filters: volume-id, modification-state, target-size, target-iops, target-volume-type, original-size, original-iops, original-volume-type, start-time. 
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results (up to a limit of 500) to be returned in a paginated request.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The nextToken value returned by a previous paginated request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the volumes for which in-progress modifications will be described.
    */
  var VolumeIds: js.UndefOr[VolumeIdStringList] = js.undefined
}

object DescribeVolumesModificationsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null,
    VolumeIds: VolumeIdStringList = null
  ): DescribeVolumesModificationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VolumeIds != null) __obj.updateDynamic("VolumeIds")(VolumeIds)
    __obj.asInstanceOf[DescribeVolumesModificationsRequest]
  }
}

