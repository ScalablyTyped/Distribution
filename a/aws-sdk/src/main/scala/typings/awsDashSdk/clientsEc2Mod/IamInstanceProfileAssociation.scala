package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IamInstanceProfileAssociation extends js.Object {
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.IamInstanceProfile] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The state of the association.
    */
  var State: js.UndefOr[IamInstanceProfileAssociationState] = js.native
  /**
    * The time the IAM instance profile was associated with the instance.
    */
  var Timestamp: js.UndefOr[DateTime] = js.native
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
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (IamInstanceProfile != null) __obj.updateDynamic("IamInstanceProfile")(IamInstanceProfile.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamInstanceProfileAssociation]
  }
}

