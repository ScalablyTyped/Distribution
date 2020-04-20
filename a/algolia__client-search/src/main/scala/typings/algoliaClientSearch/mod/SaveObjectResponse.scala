package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveObjectResponse extends js.Object {
  /**
    * The object id saved.
    */
  val objectID: String
  /**
    * The operation task id. May be used to perform a wait task.
    */
  val taskID: Double
}

object SaveObjectResponse {
  @scala.inline
  def apply(objectID: String, taskID: Double): SaveObjectResponse = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveObjectResponse]
  }
}

