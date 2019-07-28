package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceIamInstanceProfileAssociationRequest extends js.Object {
  /**
    * The ID of the existing IAM instance profile association.
    */
  var AssociationId: String
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: IamInstanceProfileSpecification
}

object ReplaceIamInstanceProfileAssociationRequest {
  @scala.inline
  def apply(AssociationId: String, IamInstanceProfile: IamInstanceProfileSpecification): ReplaceIamInstanceProfileAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId, IamInstanceProfile = IamInstanceProfile)
  
    __obj.asInstanceOf[ReplaceIamInstanceProfileAssociationRequest]
  }
}

