package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserIDsResponse extends js.Object {
  /**
    * List of users id.
    */
  val userIDs: js.Array[UserIDResponse]
}

object ListUserIDsResponse {
  @scala.inline
  def apply(userIDs: js.Array[UserIDResponse]): ListUserIDsResponse = {
    val __obj = js.Dynamic.literal(userIDs = userIDs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListUserIDsResponse]
  }
}

