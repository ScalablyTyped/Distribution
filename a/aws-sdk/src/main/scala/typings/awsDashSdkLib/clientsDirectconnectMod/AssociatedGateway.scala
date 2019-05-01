package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedGateway extends js.Object {
  /**
    * The ID of the associated gateway.
    */
  var id: js.UndefOr[GatewayIdentifier] = js.undefined
  /**
    * The ID of the AWS account that owns the associated virtual private gateway or transit gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  /**
    * The Region where the associated gateway is located.
    */
  var region: js.UndefOr[Region] = js.undefined
  /**
    * The type of associated gateway.
    */
  var `type`: js.UndefOr[GatewayType] = js.undefined
}

object AssociatedGateway {
  @scala.inline
  def apply(
    id: GatewayIdentifier = null,
    ownerAccount: OwnerAccount = null,
    region: Region = null,
    `type`: GatewayType = null
  ): AssociatedGateway = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount)
    if (region != null) __obj.updateDynamic("region")(region)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedGateway]
  }
}

