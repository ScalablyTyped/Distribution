package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateIamInstanceProfileResult extends js.Object {
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.IamInstanceProfileAssociation] = js.undefined
}

object AssociateIamInstanceProfileResult {
  @scala.inline
  def apply(IamInstanceProfileAssociation: IamInstanceProfileAssociation = null): AssociateIamInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    if (IamInstanceProfileAssociation != null) __obj.updateDynamic("IamInstanceProfileAssociation")(IamInstanceProfileAssociation)
    __obj.asInstanceOf[AssociateIamInstanceProfileResult]
  }
}

