package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGraphqlApiRequest extends js.Object {
  /**
    * The API ID for the GraphQL API.
    */
  var apiId: String = js.native
}

object GetGraphqlApiRequest {
  @scala.inline
  def apply(apiId: String): GetGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGraphqlApiRequest]
  }
  @scala.inline
  implicit class GetGraphqlApiRequestOps[Self <: GetGraphqlApiRequest] (val x: Self) extends AnyVal {
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
  }
  
}

