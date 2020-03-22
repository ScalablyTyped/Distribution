package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreApiKeyResponse extends js.Object {
  /**
    * Restoration date of the API key.
    */
  val createdAt: String
}

object RestoreApiKeyResponse {
  @scala.inline
  def apply(createdAt: String): RestoreApiKeyResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestoreApiKeyResponse]
  }
}

