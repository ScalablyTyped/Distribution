package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignUserIDsResponse extends js.Object {
  /**
    * Date of creation of the userId
    */
  val createdAt: String
}

object AssignUserIDsResponse {
  @scala.inline
  def apply(createdAt: String): AssignUserIDsResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignUserIDsResponse]
  }
}

