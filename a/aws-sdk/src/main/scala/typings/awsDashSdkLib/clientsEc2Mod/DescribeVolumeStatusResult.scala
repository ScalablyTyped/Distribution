package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVolumeStatusResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of volumes.
    */
  var VolumeStatuses: js.UndefOr[VolumeStatusList] = js.undefined
}

object DescribeVolumeStatusResult {
  @scala.inline
  def apply(NextToken: String = null, VolumeStatuses: VolumeStatusList = null): DescribeVolumeStatusResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (VolumeStatuses != null) __obj.updateDynamic("VolumeStatuses")(VolumeStatuses)
    __obj.asInstanceOf[DescribeVolumeStatusResult]
  }
}

