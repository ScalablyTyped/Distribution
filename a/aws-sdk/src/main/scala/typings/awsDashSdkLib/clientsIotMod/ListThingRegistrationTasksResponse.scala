package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingRegistrationTasksResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of bulk thing provisioning task IDs.
    */
  var taskIds: js.UndefOr[TaskIdList] = js.undefined
}

object ListThingRegistrationTasksResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, taskIds: TaskIdList = null): ListThingRegistrationTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (taskIds != null) __obj.updateDynamic("taskIds")(taskIds)
    __obj.asInstanceOf[ListThingRegistrationTasksResponse]
  }
}

