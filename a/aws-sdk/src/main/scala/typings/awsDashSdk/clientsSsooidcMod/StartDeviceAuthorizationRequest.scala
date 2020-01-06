package typings.awsDashSdk.clientsSsooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeviceAuthorizationRequest extends js.Object {
  /**
    * The unique identifier string for the client that is registered with AWS SSO. This value should come from the persisted result of the RegisterClient API operation.
    */
  var clientId: ClientId = js.native
  /**
    * A secret string that is generated for the client. This value should come from the persisted result of the RegisterClient API operation.
    */
  var clientSecret: ClientSecret = js.native
  /**
    * The URL for the AWS SSO user portal. For more information, see Using the User Portal in the AWS Single Sign-On User Guide.
    */
  var startUrl: URI = js.native
}

object StartDeviceAuthorizationRequest {
  @scala.inline
  def apply(clientId: ClientId, clientSecret: ClientSecret, startUrl: URI): StartDeviceAuthorizationRequest = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], startUrl = startUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartDeviceAuthorizationRequest]
  }
}

