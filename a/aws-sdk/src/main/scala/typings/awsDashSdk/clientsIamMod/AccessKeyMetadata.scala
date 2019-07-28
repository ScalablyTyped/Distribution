package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessKeyMetadata extends js.Object {
  /**
    * The ID for this access key.
    */
  var AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined
  /**
    * The date when the access key was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * The status of the access key. Active means that the key is valid for API calls; Inactive means it is not.
    */
  var Status: js.UndefOr[statusType] = js.undefined
  /**
    * The name of the IAM user that the key is associated with.
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
}

object AccessKeyMetadata {
  @scala.inline
  def apply(
    AccessKeyId: accessKeyIdType = null,
    CreateDate: dateType = null,
    Status: statusType = null,
    UserName: userNameType = null
  ): AccessKeyMetadata = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[AccessKeyMetadata]
  }
}

