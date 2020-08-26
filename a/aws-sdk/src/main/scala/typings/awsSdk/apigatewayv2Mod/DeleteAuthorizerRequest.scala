package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAuthorizerRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: string = js.native
}

object DeleteAuthorizerRequest {
  @scala.inline
  def apply(ApiId: string, AuthorizerId: string): DeleteAuthorizerRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], AuthorizerId = AuthorizerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuthorizerRequest]
  }
  @scala.inline
  implicit class DeleteAuthorizerRequestOps[Self <: DeleteAuthorizerRequest] (val x: Self) extends AnyVal {
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
    def setApiId(value: string): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizerId(value: string): Self = this.set("AuthorizerId", value.asInstanceOf[js.Any])
  }
  
}

