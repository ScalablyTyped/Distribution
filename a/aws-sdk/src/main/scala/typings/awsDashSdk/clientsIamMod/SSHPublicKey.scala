package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSHPublicKey extends js.Object {
  /**
    * The MD5 message digest of the SSH public key.
    */
  var Fingerprint: publicKeyFingerprintType = js.native
  /**
    * The SSH public key.
    */
  var SSHPublicKeyBody: publicKeyMaterialType = js.native
  /**
    * The unique identifier for the SSH public key.
    */
  var SSHPublicKeyId: publicKeyIdType = js.native
  /**
    * The status of the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
    */
  var Status: statusType = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the SSH public key was uploaded.
    */
  var UploadDate: js.UndefOr[dateType] = js.native
  /**
    * The name of the IAM user associated with the SSH public key.
    */
  var UserName: userNameType = js.native
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
    val __obj = js.Dynamic.literal(Fingerprint = Fingerprint.asInstanceOf[js.Any], SSHPublicKeyBody = SSHPublicKeyBody.asInstanceOf[js.Any], SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (UploadDate != null) __obj.updateDynamic("UploadDate")(UploadDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHPublicKey]
  }
}

