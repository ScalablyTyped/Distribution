package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumeStatusResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the status of the volumes.
    */
  var VolumeStatuses: js.UndefOr[VolumeStatusList] = js.native
}

object DescribeVolumeStatusResult {
  @scala.inline
  def apply(NextToken: String = null, VolumeStatuses: VolumeStatusList = null): DescribeVolumeStatusResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VolumeStatuses != null) __obj.updateDynamic("VolumeStatuses")(VolumeStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumeStatusResult]
  }
}

