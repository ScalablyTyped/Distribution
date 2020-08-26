package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApiKeysResponse extends js.Object {
  /**
    * List of keys
    */
  var keys: js.Array[GetApiKeyResponse] = js.native
}

object ListApiKeysResponse {
  @scala.inline
  def apply(keys: js.Array[GetApiKeyResponse]): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApiKeysResponse]
  }
  @scala.inline
  implicit class ListApiKeysResponseOps[Self <: ListApiKeysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeysVarargs(value: GetApiKeyResponse*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[GetApiKeyResponse]): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
  
}

