package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateVpcCidrBlockRequest extends js.Object {
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: String
}

object DisassociateVpcCidrBlockRequest {
  @scala.inline
  def apply(AssociationId: String): DisassociateVpcCidrBlockRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId)
  
    __obj.asInstanceOf[DisassociateVpcCidrBlockRequest]
  }
}

