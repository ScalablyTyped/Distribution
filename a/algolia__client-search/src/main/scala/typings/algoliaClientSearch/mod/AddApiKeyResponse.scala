package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApiKeyResponse extends js.Object {
  /**
    * Date of creation of the api key.
    */
  val createdAt: String
  /**
    * The returned api key.
    */
  val key: String
}

object AddApiKeyResponse {
  @scala.inline
  def apply(createdAt: String, key: String): AddApiKeyResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApiKeyResponse]
  }
}

