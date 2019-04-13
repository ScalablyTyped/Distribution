package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateClientVpnTargetNetworkResult extends js.Object {
  /**
    * The ID of the target network association.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  /**
    * The current state of the target network association.
    */
  var Status: js.UndefOr[AssociationStatus] = js.undefined
}

object DisassociateClientVpnTargetNetworkResult {
  @scala.inline
  def apply(AssociationId: String = null, Status: AssociationStatus = null): DisassociateClientVpnTargetNetworkResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DisassociateClientVpnTargetNetworkResult]
  }
}

