package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApiKeyRequest extends js.Object {
  /**
    * The ID for the GraphQL API.
    */
  var apiId: String = js.native
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time from update time after which the API key expires. The date is represented as seconds since the epoch. For more information, see .
    */
  var expires: js.UndefOr[Long] = js.native
  /**
    * The API key ID.
    */
  var id: String = js.native
}

object UpdateApiKeyRequest {
  @scala.inline
  def apply(apiId: String, id: String): UpdateApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiKeyRequest]
  }
  @scala.inline
  implicit class UpdateApiKeyRequestOps[Self <: UpdateApiKeyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExpires(value: Long): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
  }
  
}

