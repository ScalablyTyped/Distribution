package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGatewayGroupRequest extends js.Object {
  /**
    *  A unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: typings.awsSdk.alexaforbusinessMod.ClientRequestToken = js.native
  /**
    * The description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.native
  /**
    * The name of the gateway group.
    */
  var Name: GatewayGroupName = js.native
}

object CreateGatewayGroupRequest {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestToken,
    Name: GatewayGroupName,
    Description: GatewayGroupDescription = null
  ): CreateGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayGroupRequest]
  }
}

