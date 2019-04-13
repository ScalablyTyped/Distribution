package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSpotFleetRequestsResponse extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the configuration of your Spot Fleet.
    */
  var SpotFleetRequestConfigs: js.UndefOr[SpotFleetRequestConfigSet] = js.undefined
}

object DescribeSpotFleetRequestsResponse {
  @scala.inline
  def apply(NextToken: String = null, SpotFleetRequestConfigs: SpotFleetRequestConfigSet = null): DescribeSpotFleetRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SpotFleetRequestConfigs != null) __obj.updateDynamic("SpotFleetRequestConfigs")(SpotFleetRequestConfigs)
    __obj.asInstanceOf[DescribeSpotFleetRequestsResponse]
  }
}

