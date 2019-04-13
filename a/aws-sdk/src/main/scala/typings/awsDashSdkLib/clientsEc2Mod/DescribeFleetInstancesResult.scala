package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetInstancesResult extends js.Object {
  /**
    * The running instances. This list is refreshed periodically and might be out of date.
    */
  var ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.undefined
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[FleetIdentifier] = js.undefined
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeFleetInstancesResult {
  @scala.inline
  def apply(
    ActiveInstances: ActiveInstanceSet = null,
    FleetId: FleetIdentifier = null,
    NextToken: String = null
  ): DescribeFleetInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (ActiveInstances != null) __obj.updateDynamic("ActiveInstances")(ActiveInstances)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFleetInstancesResult]
  }
}

