package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the user. For more information about ARNs and how to use ARNs in policies, see IAM Identifiers in the Using IAM guide. 
    */
  var Arn: arnType
  /**
    * The date and time, in ISO 8601 date-time format, when the user was created.
    */
  var CreateDate: dateType
  /**
    * The date and time, in ISO 8601 date-time format, when the user's password was last used to sign in to an AWS website. For a list of AWS websites that capture a user's last sign-in time, see the Credential Reports topic in the Using IAM guide. If a password is used more than once in a five-minute span, only the first use is returned in this field. If the field is null (no value), then it indicates that they never signed in with a password. This can be because:   The user never had a password.   A password exists but has not been used since IAM started tracking this information on October 20, 2014.   A null value does not mean that the user never had a password. Also, if the user does not currently have a password, but had one in the past, then this field contains the date and time the most recent password was used. This value is returned only in the GetUser and ListUsers operations. 
    */
  var PasswordLastUsed: js.UndefOr[dateType] = js.undefined
  /**
    * The path to the user. For more information about paths, see IAM Identifiers in the Using IAM guide.
    */
  var Path: pathType
  /**
    * The ARN of the policy used to set the permissions boundary for the user. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.undefined
  /**
    * A list of tags that are associated with the specified user. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
  /**
    * The stable and unique string identifying the user. For more information about IDs, see IAM Identifiers in the Using IAM guide.
    */
  var UserId: idType
  /**
    * The friendly name identifying the user.
    */
  var UserName: userNameType
}

object User {
  @scala.inline
  def apply(
    Arn: arnType,
    CreateDate: dateType,
    Path: pathType,
    UserId: idType,
    UserName: userNameType,
    PasswordLastUsed: dateType = null,
    PermissionsBoundary: AttachedPermissionsBoundary = null,
    Tags: tagListType = null
  ): User = {
    val __obj = js.Dynamic.literal(Arn = Arn, CreateDate = CreateDate, Path = Path, UserId = UserId, UserName = UserName)
    if (PasswordLastUsed != null) __obj.updateDynamic("PasswordLastUsed")(PasswordLastUsed)
    if (PermissionsBoundary != null) __obj.updateDynamic("PermissionsBoundary")(PermissionsBoundary)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[User]
  }
}

