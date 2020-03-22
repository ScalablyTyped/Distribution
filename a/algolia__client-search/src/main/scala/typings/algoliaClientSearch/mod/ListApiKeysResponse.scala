package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApiKeysResponse extends js.Object {
  /**
    * List of keys
    */
  val keys: js.Array[GetApiKeyResponse]
}

object ListApiKeysResponse {
  @scala.inline
  def apply(keys: js.Array[GetApiKeyResponse]): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListApiKeysResponse]
  }
}

