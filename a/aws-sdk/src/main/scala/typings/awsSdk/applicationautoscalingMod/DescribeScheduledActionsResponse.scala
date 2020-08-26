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
  def apply(): DescribeScheduledActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledActionsResponse]
  }
  @scala.inline
  implicit class DescribeScheduledActionsResponseOps[Self <: DescribeScheduledActionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScheduledActionsVarargs(value: ScheduledAction*): Self = this.set("ScheduledActions", js.Array(value :_*))
    @scala.inline
    def setScheduledActions(value: ScheduledActions): Self = this.set("ScheduledActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledActions: Self = this.set("ScheduledActions", js.undefined)
  }
  
}

