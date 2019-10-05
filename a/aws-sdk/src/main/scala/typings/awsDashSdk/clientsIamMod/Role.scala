package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide guide. 
    */
  var Arn: arnType
  /**
    * The policy that grants an entity permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: dateType
  /**
    * A description of the role that you provide.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.undefined
  /**
    * The maximum session duration (in seconds) for the specified role. Anyone who uses the AWS CLI, or API to assume the role can specify the duration using the optional DurationSeconds API parameter or duration-seconds CLI parameter.
    */
  var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined
  /**
    *  The path to the role. For more information about paths, see IAM Identifiers in the Using IAM guide. 
    */
  var Path: pathType
  /**
    * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
  /**
    *  The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the Using IAM guide. 
    */
  var RoleId: idType
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: roleNameType
  /**
    * A list of tags that are attached to the specified role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
}

object Role {
  @scala.inline
  def apply(
    Arn: arnType,
    CreateDate: dateType,
    Path: pathType,
    RoleId: idType,
    RoleName: roleNameType,
    AssumeRolePolicyDocument: policyDocumentType = null,
    Description: roleDescriptionType = null,
    MaxSessionDuration: Int | Double = null,
    PermissionsBoundary: AttachedPermissionsBoundary = null,
    Tags: tagListType = null
  ): Role = {
    val __obj = js.Dynamic.literal(Arn = Arn, CreateDate = CreateDate, Path = Path, RoleId = RoleId, RoleName = RoleName)
    if (AssumeRolePolicyDocument != null) __obj.updateDynamic("AssumeRolePolicyDocument")(AssumeRolePolicyDocument)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (MaxSessionDuration != null) __obj.updateDynamic("MaxSessionDuration")(MaxSessionDuration.asInstanceOf[js.Any])
    if (PermissionsBoundary != null) __obj.updateDynamic("PermissionsBoundary")(PermissionsBoundary)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[Role]
  }
}

