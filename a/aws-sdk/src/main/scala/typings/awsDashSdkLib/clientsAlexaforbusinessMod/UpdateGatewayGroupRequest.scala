package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGatewayGroupRequest extends js.Object {
  /**
    * The updated description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.undefined
  /**
    * The ARN of the gateway group to update.
    */
  var GatewayGroupArn: Arn
  /**
    * The updated name of the gateway group.
    */
  var Name: js.UndefOr[GatewayGroupName] = js.undefined
}

object UpdateGatewayGroupRequest {
  @scala.inline
  def apply(GatewayGroupArn: Arn, Description: GatewayGroupDescription = null, Name: GatewayGroupName = null): UpdateGatewayGroupRequest = {
    val __obj = js.Dynamic.literal(GatewayGroupArn = GatewayGroupArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateGatewayGroupRequest]
  }
}

