package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScheduledActionsResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  /**
    * Information about the scheduled actions.
    */
  var ScheduledActions: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.ScheduledActions] = js.undefined
}

object DescribeScheduledActionsResponse {
  @scala.inline
  def apply(NextToken: XmlString = null, ScheduledActions: ScheduledActions = null): DescribeScheduledActionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScheduledActions != null) __obj.updateDynamic("ScheduledActions")(ScheduledActions)
    __obj.asInstanceOf[DescribeScheduledActionsResponse]
  }
}

