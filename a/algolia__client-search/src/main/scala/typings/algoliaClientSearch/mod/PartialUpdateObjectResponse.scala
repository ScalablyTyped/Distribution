package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialUpdateObjectResponse extends js.Object {
  /**
    * The object id updated.
    */
  val objectID: String
  /**
    * The operation task id. May be used to perform a wait task.
    */
  val taskID: Double
}

object PartialUpdateObjectResponse {
  @scala.inline
  def apply(objectID: String, taskID: Double): PartialUpdateObjectResponse = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUpdateObjectResponse]
  }
}

