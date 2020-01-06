package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotFleetInstancesResponse extends js.Object {
  /**
    * The running instances. This list is refreshed periodically and might be out of date.
    */
  var ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.native
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
}

object DescribeSpotFleetInstancesResponse {
  @scala.inline
  def apply(
    ActiveInstances: ActiveInstanceSet = null,
    NextToken: String = null,
    SpotFleetRequestId: String = null
  ): DescribeSpotFleetInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (ActiveInstances != null) __obj.updateDynamic("ActiveInstances")(ActiveInstances.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SpotFleetRequestId != null) __obj.updateDynamic("SpotFleetRequestId")(SpotFleetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpotFleetInstancesResponse]
  }
}

