package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstancesResponse extends js.Object {
  /**
    * Summary information about the instances that are associated with the specified service.
    */
  var Instances: js.UndefOr[InstanceSummaryList] = js.undefined
  /**
    * If more than MaxResults instances match the specified criteria, you can submit another ListInstances request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.NextToken] = js.undefined
}

object ListInstancesResponse {
  @scala.inline
  def apply(Instances: InstanceSummaryList = null, NextToken: NextToken = null): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInstancesResponse]
  }
}

