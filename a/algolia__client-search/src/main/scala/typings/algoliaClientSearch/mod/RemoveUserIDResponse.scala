package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveUserIDResponse extends js.Object {
  /**
    * When the given `userID` got removed.
    */
  val deletedAt: String
}

object RemoveUserIDResponse {
  @scala.inline
  def apply(deletedAt: String): RemoveUserIDResponse = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveUserIDResponse]
  }
}

