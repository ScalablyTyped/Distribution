package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceIamInstanceProfileAssociationResult extends js.Object {
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.IamInstanceProfileAssociation] = js.undefined
}

object ReplaceIamInstanceProfileAssociationResult {
  @scala.inline
  def apply(IamInstanceProfileAssociation: IamInstanceProfileAssociation = null): ReplaceIamInstanceProfileAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (IamInstanceProfileAssociation != null) __obj.updateDynamic("IamInstanceProfileAssociation")(IamInstanceProfileAssociation)
    __obj.asInstanceOf[ReplaceIamInstanceProfileAssociationResult]
  }
}

