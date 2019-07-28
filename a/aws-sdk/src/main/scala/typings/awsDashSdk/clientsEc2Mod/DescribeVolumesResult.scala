package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVolumesResult extends js.Object {
  /**
    * The NextToken value to include in a future DescribeVolumes request. When the results of a DescribeVolumes request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the volumes.
    */
  var Volumes: js.UndefOr[VolumeList] = js.undefined
}

object DescribeVolumesResult {
  @scala.inline
  def apply(NextToken: String = null, Volumes: VolumeList = null): DescribeVolumesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Volumes != null) __obj.updateDynamic("Volumes")(Volumes)
    __obj.asInstanceOf[DescribeVolumesResult]
  }
}

