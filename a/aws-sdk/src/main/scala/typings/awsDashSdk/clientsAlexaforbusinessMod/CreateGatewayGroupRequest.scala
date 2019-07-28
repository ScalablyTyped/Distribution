package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGatewayGroupRequest extends js.Object {
  /**
    *  A unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: typings.awsDashSdk.clientsAlexaforbusinessMod.ClientRequestToken
  /**
    * The description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.undefined
  /**
    * The name of the gateway group.
    */
  var Name: GatewayGroupName
}

object CreateGatewayGroupRequest {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestToken,
    Name: GatewayGroupName,
    Description: GatewayGroupDescription = null
  ): CreateGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken, Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateGatewayGroupRequest]
  }
}

