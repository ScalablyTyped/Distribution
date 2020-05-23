package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApiKeyResponse extends js.Object {
  /**
    * The api key.
    */
  var key: String
  /**
    * Date of update
    */
  var updatedAt: String
}

object UpdateApiKeyResponse {
  @scala.inline
  def apply(key: String, updatedAt: String): UpdateApiKeyResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiKeyResponse]
  }
}

