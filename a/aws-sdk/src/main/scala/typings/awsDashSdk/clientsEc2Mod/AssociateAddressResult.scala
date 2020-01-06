package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateAddressResult extends js.Object {
  /**
    * [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
    */
  var AssociationId: js.UndefOr[String] = js.native
}

object AssociateAddressResult {
  @scala.inline
  def apply(AssociationId: String = null): AssociateAddressResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAddressResult]
  }
}

