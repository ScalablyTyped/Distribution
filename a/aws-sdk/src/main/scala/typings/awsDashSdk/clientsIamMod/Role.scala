package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Role extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide guide. 
    */
  var Arn: arnType = js.native
  /**
    * The policy that grants an entity permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: dateType = js.native
  /**
    * A description of the role that you provide.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.native
  /**
    * The maximum session duration (in seconds) for the specified role. Anyone who uses the AWS CLI, or API to assume the role can specify the duration using the optional DurationSeconds API parameter or duration-seconds CLI parameter.
    */
  var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.native
  /**
    *  The path to the role. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
  /**
    * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.native
  /**
    *  The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var RoleId: idType = js.native
  /**
    * Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see Regions Where Data Is Tracked in the IAM User Guide.
    */
  var RoleLastUsed: js.UndefOr[typings.awsDashSdk.clientsIamMod.RoleLastUsed] = js.native
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: roleNameType = js.native
  /**
    * A list of tags that are attached to the specified role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.native
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
    RoleLastUsed: RoleLastUsed = null,
    Tags: tagListType = null
  ): Role = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], RoleId = RoleId.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    if (AssumeRolePolicyDocument != null) __obj.updateDynamic("AssumeRolePolicyDocument")(AssumeRolePolicyDocument.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (MaxSessionDuration != null) __obj.updateDynamic("MaxSessionDuration")(MaxSessionDuration.asInstanceOf[js.Any])
    if (PermissionsBoundary != null) __obj.updateDynamic("PermissionsBoundary")(PermissionsBoundary.asInstanceOf[js.Any])
    if (RoleLastUsed != null) __obj.updateDynamic("RoleLastUsed")(RoleLastUsed.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
}

