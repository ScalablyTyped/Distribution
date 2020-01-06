package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetAssociation extends js.Object {
  /**
    * The state of the subnet association.
    */
  var State: js.UndefOr[TransitGatewayMulitcastDomainAssociationState] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
}

object SubnetAssociation {
  @scala.inline
  def apply(State: TransitGatewayMulitcastDomainAssociationState = null, SubnetId: String = null): SubnetAssociation = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetAssociation]
  }
}

