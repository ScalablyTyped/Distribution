package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingRegistrationTasksResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of bulk thing provisioning task IDs.
    */
  var taskIds: js.UndefOr[TaskIdList] = js.native
}

object ListThingRegistrationTasksResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, taskIds: TaskIdList = null): ListThingRegistrationTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (taskIds != null) __obj.updateDynamic("taskIds")(taskIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingRegistrationTasksResponse]
  }
}

