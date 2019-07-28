package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateSubnetCidrBlockRequest extends js.Object {
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: String
}

object DisassociateSubnetCidrBlockRequest {
  @scala.inline
  def apply(AssociationId: String): DisassociateSubnetCidrBlockRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId)
  
    __obj.asInstanceOf[DisassociateSubnetCidrBlockRequest]
  }
}

