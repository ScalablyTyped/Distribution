package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayGroup extends js.Object {
  /**
    * The ARN of the gateway group.
    */
  var Arn: js.UndefOr[Arn] = js.undefined
  /**
    * The description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.undefined
  /**
    * The name of the gateway group.
    */
  var Name: js.UndefOr[GatewayGroupName] = js.undefined
}

object GatewayGroup {
  @scala.inline
  def apply(Arn: Arn = null, Description: GatewayGroupDescription = null, Name: GatewayGroupName = null): GatewayGroup = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[GatewayGroup]
  }
}

