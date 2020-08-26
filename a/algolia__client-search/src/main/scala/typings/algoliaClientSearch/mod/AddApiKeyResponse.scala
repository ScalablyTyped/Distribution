package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApiKeyResponse extends js.Object {
  /**
    * Date of creation of the api key.
    */
  var createdAt: String = js.native
  /**
    * The returned api key.
    */
  var key: String = js.native
}

object AddApiKeyResponse {
  @scala.inline
  def apply(createdAt: String, key: String): AddApiKeyResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApiKeyResponse]
  }
  @scala.inline
  implicit class AddApiKeyResponseOps[Self <: AddApiKeyResponse] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

