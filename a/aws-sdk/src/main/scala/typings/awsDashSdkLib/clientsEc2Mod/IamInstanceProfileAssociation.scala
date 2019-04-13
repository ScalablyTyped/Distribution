package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IamInstanceProfileAssociation extends js.Object {
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The state of the association.
    */
  var State: js.UndefOr[IamInstanceProfileAssociationState] = js.undefined
  /**
    * The time the IAM instance profile was associated with the instance.
    */
  var Timestamp: js.UndefOr[DateTime] = js.undefined
}

object IamInstanceProfileAssociation {
  @scala.inline
  def apply(
    AssociationId: String = null,
    IamInstanceProfile: IamInstanceProfile = null,
    InstanceId: String = null,
    State: IamInstanceProfileAssociationState = null,
    Timestamp: DateTime = null
  ): IamInstanceProfileAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[IamInstanceProfileAssociation]
  }
}

