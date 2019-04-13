package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTasksResponse extends js.Object {
  /**
    * An opaque string that indicates the position at which to begin returning the next list of tasks.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of all the tasks that are returned.
    */
  var Tasks: js.UndefOr[TaskList] = js.undefined
}

object ListTasksResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Tasks: TaskList = null): ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tasks != null) __obj.updateDynamic("Tasks")(Tasks)
    __obj.asInstanceOf[ListTasksResponse]
  }
}

