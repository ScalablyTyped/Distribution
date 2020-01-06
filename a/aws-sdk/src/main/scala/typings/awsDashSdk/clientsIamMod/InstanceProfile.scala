package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceProfile extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  /**
    * The date when the instance profile was created.
    */
  var CreateDate: dateType = js.native
  /**
    *  The stable and unique string identifying the instance profile. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var InstanceProfileId: idType = js.native
  /**
    * The name identifying the instance profile.
    */
  var InstanceProfileName: instanceProfileNameType = js.native
  /**
    *  The path to the instance profile. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
  /**
    * The role associated with the instance profile.
    */
  var Roles: roleListType = js.native
}

object InstanceProfile {
  @scala.inline
  def apply(
    Arn: arnType,
    CreateDate: dateType,
    InstanceProfileId: idType,
    InstanceProfileName: instanceProfileNameType,
    Path: pathType,
    Roles: roleListType
  ): InstanceProfile = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], InstanceProfileId = InstanceProfileId.asInstanceOf[js.Any], InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstanceProfile]
  }
}

