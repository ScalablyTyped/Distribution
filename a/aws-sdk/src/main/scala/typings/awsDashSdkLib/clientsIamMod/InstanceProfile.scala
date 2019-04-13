package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceProfile extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use them in policies, see IAM Identifiers in the Using IAM guide. 
    */
  var Arn: arnType
  /**
    * The date when the instance profile was created.
    */
  var CreateDate: dateType
  /**
    *  The stable and unique string identifying the instance profile. For more information about IDs, see IAM Identifiers in the Using IAM guide. 
    */
  var InstanceProfileId: idType
  /**
    * The name identifying the instance profile.
    */
  var InstanceProfileName: instanceProfileNameType
  /**
    *  The path to the instance profile. For more information about paths, see IAM Identifiers in the Using IAM guide. 
    */
  var Path: pathType
  /**
    * The role associated with the instance profile.
    */
  var Roles: roleListType
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
    val __obj = js.Dynamic.literal(Arn = Arn, CreateDate = CreateDate, InstanceProfileId = InstanceProfileId, InstanceProfileName = InstanceProfileName, Path = Path, Roles = Roles)
  
    __obj.asInstanceOf[InstanceProfile]
  }
}

