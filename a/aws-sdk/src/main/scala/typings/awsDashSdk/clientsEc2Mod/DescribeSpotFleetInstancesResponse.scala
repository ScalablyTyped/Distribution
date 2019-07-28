package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSpotFleetInstancesResponse extends js.Object {
  /**
    * The running instances. This list is refreshed periodically and might be out of date.
    */
  var ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.undefined
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
}

object DescribeSpotFleetInstancesResponse {
  @scala.inline
  def apply(
    ActiveInstances: ActiveInstanceSet = null,
    NextToken: String = null,
    SpotFleetRequestId: String = null
  ): DescribeSpotFleetInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (ActiveInstances != null) __obj.updateDynamic("ActiveInstances")(ActiveInstances)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SpotFleetRequestId != null) __obj.updateDynamic("SpotFleetRequestId")(SpotFleetRequestId)
    __obj.asInstanceOf[DescribeSpotFleetInstancesResponse]
  }
}

