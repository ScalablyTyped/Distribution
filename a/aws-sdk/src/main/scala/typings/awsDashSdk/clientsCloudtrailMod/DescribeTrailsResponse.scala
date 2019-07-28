package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrailsResponse extends js.Object {
  /**
    * The list of trail objects.
    */
  var trailList: js.UndefOr[TrailList] = js.undefined
}

object DescribeTrailsResponse {
  @scala.inline
  def apply(trailList: TrailList = null): DescribeTrailsResponse = {
    val __obj = js.Dynamic.literal()
    if (trailList != null) __obj.updateDynamic("trailList")(trailList)
    __obj.asInstanceOf[DescribeTrailsResponse]
  }
}

