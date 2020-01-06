package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledInstanceAvailabilityResult extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the available Scheduled Instances.
    */
  var ScheduledInstanceAvailabilitySet: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ScheduledInstanceAvailabilitySet] = js.native
}

object DescribeScheduledInstanceAvailabilityResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    ScheduledInstanceAvailabilitySet: ScheduledInstanceAvailabilitySet = null
  ): DescribeScheduledInstanceAvailabilityResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScheduledInstanceAvailabilitySet != null) __obj.updateDynamic("ScheduledInstanceAvailabilitySet")(ScheduledInstanceAvailabilitySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledInstanceAvailabilityResult]
  }
}

