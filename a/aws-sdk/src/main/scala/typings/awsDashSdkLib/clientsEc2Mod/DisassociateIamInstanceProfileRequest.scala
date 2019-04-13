package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateIamInstanceProfileRequest extends js.Object {
  /**
    * The ID of the IAM instance profile association.
    */
  var AssociationId: String
}

object DisassociateIamInstanceProfileRequest {
  @scala.inline
  def apply(AssociationId: String): DisassociateIamInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId)
  
    __obj.asInstanceOf[DisassociateIamInstanceProfileRequest]
  }
}

