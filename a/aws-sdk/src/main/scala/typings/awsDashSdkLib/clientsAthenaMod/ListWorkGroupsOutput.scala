package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkGroupsOutput extends js.Object {
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The list of workgroups, including their names, descriptions, creation times, and states.
    */
  var WorkGroups: js.UndefOr[WorkGroupsList] = js.undefined
}

object ListWorkGroupsOutput {
  @scala.inline
  def apply(NextToken: Token = null, WorkGroups: WorkGroupsList = null): ListWorkGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WorkGroups != null) __obj.updateDynamic("WorkGroups")(WorkGroups)
    __obj.asInstanceOf[ListWorkGroupsOutput]
  }
}

