package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignUserIDResponse extends js.Object {
  /**
    * Date of creation of the userId.
    */
  var createdAt: String
}

object AssignUserIDResponse {
  @scala.inline
  def apply(createdAt: String): AssignUserIDResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignUserIDResponse]
  }
}

