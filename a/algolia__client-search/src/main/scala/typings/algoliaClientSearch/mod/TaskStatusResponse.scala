package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskStatusResponse extends js.Object {
  /**
    * If the operation is pending.
    */
  var pendingTask: Boolean
  /**
    * The operation status. When the value is `published` the
    * operation is completed.
    */
  var status: String
}

object TaskStatusResponse {
  @scala.inline
  def apply(pendingTask: Boolean, status: String): TaskStatusResponse = {
    val __obj = js.Dynamic.literal(pendingTask = pendingTask.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatusResponse]
  }
}

