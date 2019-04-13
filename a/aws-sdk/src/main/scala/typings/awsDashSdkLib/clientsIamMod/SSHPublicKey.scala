package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSHPublicKey extends js.Object {
  /**
    * The MD5 message digest of the SSH public key.
    */
  var Fingerprint: publicKeyFingerprintType
  /**
    * The SSH public key.
    */
  var SSHPublicKeyBody: publicKeyMaterialType
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
  var UploadDate: js.UndefOr[dateType] = js.undefined
  /**
    * The name of the IAM user associated with the SSH public key.
    */
  var UserName: userNameType
}

object SSHPublicKey {
  @scala.inline
  def apply(
    Fingerprint: publicKeyFingerprintType,
    SSHPublicKeyBody: publicKeyMaterialType,
    SSHPublicKeyId: publicKeyIdType,
    Status: statusType,
    UserName: userNameType,
    UploadDate: dateType = null
  ): SSHPublicKey = {
    val __obj = js.Dynamic.literal(Fingerprint = Fingerprint, SSHPublicKeyBody = SSHPublicKeyBody, SSHPublicKeyId = SSHPublicKeyId, Status = Status.asInstanceOf[js.Any], UserName = UserName)
    if (UploadDate != null) __obj.updateDynamic("UploadDate")(UploadDate)
    __obj.asInstanceOf[SSHPublicKey]
  }
}

