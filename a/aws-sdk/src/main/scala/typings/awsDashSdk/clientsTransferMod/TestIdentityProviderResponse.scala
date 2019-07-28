package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIdentityProviderResponse extends js.Object {
  /**
    * The result of the authorization test as a message. 
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsTransferMod.Message] = js.undefined
  /**
    * The HTTP status code that is the response from your API Gateway.
    */
  var StatusCode: typings.awsDashSdk.clientsTransferMod.StatusCode
  /**
    * The endpoint of the service used to authenticate a user.
    */
  var Url: typings.awsDashSdk.clientsTransferMod.Url
}

object TestIdentityProviderResponse {
  @scala.inline
  def apply(StatusCode: StatusCode, Url: Url, Message: Message = null): TestIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode, Url = Url)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[TestIdentityProviderResponse]
  }
}

