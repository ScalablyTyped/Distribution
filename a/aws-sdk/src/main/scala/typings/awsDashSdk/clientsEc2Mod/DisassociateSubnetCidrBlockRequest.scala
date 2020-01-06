package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateSubnetCidrBlockRequest extends js.Object {
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: String = js.native
}

object DisassociateSubnetCidrBlockRequest {
  @scala.inline
  def apply(AssociationId: String): DisassociateSubnetCidrBlockRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateSubnetCidrBlockRequest]
  }
}

