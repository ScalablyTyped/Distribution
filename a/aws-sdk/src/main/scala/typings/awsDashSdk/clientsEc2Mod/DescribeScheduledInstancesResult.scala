package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledInstancesResult extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ScheduledInstanceSet] = js.native
}

object DescribeScheduledInstancesResult {
  @scala.inline
  def apply(NextToken: String = null, ScheduledInstanceSet: ScheduledInstanceSet = null): DescribeScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScheduledInstanceSet != null) __obj.updateDynamic("ScheduledInstanceSet")(ScheduledInstanceSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledInstancesResult]
  }
}

