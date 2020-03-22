package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResponse extends js.Object {
  /**
    * The operation task id. May be used to perform a wait task.
    */
  val taskID: Double
}

object DeleteResponse {
  @scala.inline
  def apply(taskID: Double): DeleteResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteResponse]
  }
}

