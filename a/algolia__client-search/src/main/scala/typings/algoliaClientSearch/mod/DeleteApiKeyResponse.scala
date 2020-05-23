package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApiKeyResponse extends js.Object {
  /**
    * The date when the api key was deleted.
    */
  var deletedAt: String
}

object DeleteApiKeyResponse {
  @scala.inline
  def apply(deletedAt: String): DeleteApiKeyResponse = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiKeyResponse]
  }
}

