package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexOperationResponse extends js.Object {
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double
}

object IndexOperationResponse {
  @scala.inline
  def apply(taskID: Double): IndexOperationResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexOperationResponse]
  }
}

