package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestIdentityProviderResponse extends js.Object {
  /**
    * A message that indicates whether the test was successful or not. 
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsTransferMod.Message] = js.native
  /**
    * The response that is returned from your API Gateway.
    */
  var Response: js.UndefOr[typings.awsDashSdk.clientsTransferMod.Response] = js.native
  /**
    * The HTTP status code that is the response from your API Gateway.
    */
  var StatusCode: typings.awsDashSdk.clientsTransferMod.StatusCode = js.native
  /**
    * The endpoint of the service used to authenticate a user.
    */
  var Url: typings.awsDashSdk.clientsTransferMod.Url = js.native
}

object TestIdentityProviderResponse {
  @scala.inline
  def apply(StatusCode: StatusCode, Url: Url, Message: Message = null, Response: Response = null): TestIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Response != null) __obj.updateDynamic("Response")(Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIdentityProviderResponse]
  }
}

