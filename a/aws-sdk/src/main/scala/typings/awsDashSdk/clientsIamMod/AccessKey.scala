package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessKey extends js.Object {
  /**
    * The ID for this access key.
    */
  var AccessKeyId: accessKeyIdType
  /**
    * The date when the access key was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * The secret key used to sign requests.
    */
  var SecretAccessKey: accessKeySecretType
  /**
    * The status of the access key. Active means that the key is valid for API calls, while Inactive means it is not. 
    */
  var Status: statusType
  /**
    * The name of the IAM user that the access key is associated with.
    */
  var UserName: userNameType
}

object AccessKey {
  @scala.inline
  def apply(
    AccessKeyId: accessKeyIdType,
    SecretAccessKey: accessKeySecretType,
    Status: statusType,
    UserName: userNameType,
    CreateDate: dateType = null
  ): AccessKey = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId, SecretAccessKey = SecretAccessKey, Status = Status.asInstanceOf[js.Any], UserName = UserName)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    __obj.asInstanceOf[AccessKey]
  }
}

