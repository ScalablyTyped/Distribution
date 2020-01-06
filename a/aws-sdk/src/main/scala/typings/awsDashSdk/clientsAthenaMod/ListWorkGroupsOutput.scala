package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkGroupsOutput extends js.Object {
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The list of workgroups, including their names, descriptions, creation times, and states.
    */
  var WorkGroups: js.UndefOr[WorkGroupsList] = js.native
}

object ListWorkGroupsOutput {
  @scala.inline
  def apply(NextToken: Token = null, WorkGroups: WorkGroupsList = null): ListWorkGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WorkGroups != null) __obj.updateDynamic("WorkGroups")(WorkGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkGroupsOutput]
  }
}

