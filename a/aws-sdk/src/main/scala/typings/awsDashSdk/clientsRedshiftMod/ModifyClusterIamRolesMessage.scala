package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyClusterIamRolesMessage extends js.Object {
  /**
    * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN) format. You can associate up to 10 IAM roles with a single cluster in a single request.
    */
  var AddIamRoles: js.UndefOr[IamRoleArnList] = js.undefined
  /**
    * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
    */
  var ClusterIdentifier: String
  /**
    * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles from a single cluster in a single request.
    */
  var RemoveIamRoles: js.UndefOr[IamRoleArnList] = js.undefined
}

object ModifyClusterIamRolesMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    AddIamRoles: IamRoleArnList = null,
    RemoveIamRoles: IamRoleArnList = null
  ): ModifyClusterIamRolesMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier)
    if (AddIamRoles != null) __obj.updateDynamic("AddIamRoles")(AddIamRoles)
    if (RemoveIamRoles != null) __obj.updateDynamic("RemoveIamRoles")(RemoveIamRoles)
    __obj.asInstanceOf[ModifyClusterIamRolesMessage]
  }
}

