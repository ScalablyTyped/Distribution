package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewayGroupRequest extends js.Object {
  /**
    * The updated description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.native
  /**
    * The ARN of the gateway group to update.
    */
  var GatewayGroupArn: Arn = js.native
  /**
    * The updated name of the gateway group.
    */
  var Name: js.UndefOr[GatewayGroupName] = js.native
}

object UpdateGatewayGroupRequest {
  @scala.inline
  def apply(GatewayGroupArn: Arn, Description: GatewayGroupDescription = null, Name: GatewayGroupName = null): UpdateGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayGroupRequest]
  }
}

