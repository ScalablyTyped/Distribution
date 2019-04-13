package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSHPublicKeyMetadata extends js.Object {
  /**
    * The unique identifier for the SSH public key.
    */
  var SSHPublicKeyId: publicKeyIdType
  /**
    * The status of the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
    */
  var Status: statusType
  /**
    * The date and time, in ISO 8601 date-time format, when the SSH public key was uploaded.
    */
  var UploadDate: dateType
  /**
    * The name of the IAM user associated with the SSH public key.
    */
  var UserName: userNameType
}

object SSHPublicKeyMetadata {
  @scala.inline
  def apply(SSHPublicKeyId: publicKeyIdType, Status: statusType, UploadDate: dateType, UserName: userNameType): SSHPublicKeyMetadata = {
    val __obj = js.Dynamic.literal(SSHPublicKeyId = SSHPublicKeyId, Status = Status.asInstanceOf[js.Any], UploadDate = UploadDate, UserName = UserName)
  
    __obj.asInstanceOf[SSHPublicKeyMetadata]
  }
}

