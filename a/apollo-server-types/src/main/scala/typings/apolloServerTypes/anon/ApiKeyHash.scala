package typings.apolloServerTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyHash extends js.Object {
  var apiKeyHash: js.UndefOr[String] = js.native
  var serviceID: js.UndefOr[String] = js.native
}

object ApiKeyHash {
  @scala.inline
  def apply(): ApiKeyHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyHash]
  }
  @scala.inline
  implicit class ApiKeyHashOps[Self <: ApiKeyHash] (val x: Self) extends AnyVal {
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
    def setApiKeyHash(value: String): Self = this.set("apiKeyHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKeyHash: Self = this.set("apiKeyHash", js.undefined)
    @scala.inline
    def setServiceID(value: String): Self = this.set("serviceID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceID: Self = this.set("serviceID", js.undefined)
  }
  
}

