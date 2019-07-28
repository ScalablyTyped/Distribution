package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSpotInstanceRequestsResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.undefined
}

object DescribeSpotInstanceRequestsResult {
  @scala.inline
  def apply(NextToken: String = null, SpotInstanceRequests: SpotInstanceRequestList = null): DescribeSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SpotInstanceRequests != null) __obj.updateDynamic("SpotInstanceRequests")(SpotInstanceRequests)
    __obj.asInstanceOf[DescribeSpotInstanceRequestsResult]
  }
}

