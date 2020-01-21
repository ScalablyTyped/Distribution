package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledActionsResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  /**
    * Information about the scheduled actions.
    */
  var ScheduledActions: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ScheduledActions] = js.native
}

object DescribeScheduledActionsResponse {
  @scala.inline
  def apply(NextToken: XmlString = null, ScheduledActions: ScheduledActions = null): DescribeScheduledActionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScheduledActions != null) __obj.updateDynamic("ScheduledActions")(ScheduledActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledActionsResponse]
  }
}

