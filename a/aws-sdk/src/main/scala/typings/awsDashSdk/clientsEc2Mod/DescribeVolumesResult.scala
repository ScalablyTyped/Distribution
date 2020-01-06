package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesResult extends js.Object {
  /**
    * The NextToken value to include in a future DescribeVolumes request. When the results of a DescribeVolumes request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the volumes.
    */
  var Volumes: js.UndefOr[VolumeList] = js.native
}

object DescribeVolumesResult {
  @scala.inline
  def apply(NextToken: String = null, Volumes: VolumeList = null): DescribeVolumesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Volumes != null) __obj.updateDynamic("Volumes")(Volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumesResult]
  }
}

