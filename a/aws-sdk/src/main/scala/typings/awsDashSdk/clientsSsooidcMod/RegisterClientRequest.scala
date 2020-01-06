package typings.awsDashSdk.clientsSsooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterClientRequest extends js.Object {
  /**
    * The friendly name of the client.
    */
  var clientName: ClientName = js.native
  /**
    * The type of client. The service supports only public as a client type. Anything other than public will be rejected by the service.
    */
  var clientType: ClientType = js.native
  /**
    * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions when granting an access token.
    */
  var scopes: js.UndefOr[Scopes] = js.native
}

object RegisterClientRequest {
  @scala.inline
  def apply(clientName: ClientName, clientType: ClientType, scopes: Scopes = null): RegisterClientRequest = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], clientType = clientType.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterClientRequest]
  }
}

