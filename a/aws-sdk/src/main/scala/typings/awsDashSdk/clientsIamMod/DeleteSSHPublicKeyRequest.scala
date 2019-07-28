package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSSHPublicKeyRequest extends js.Object {
  /**
    * The unique identifier for the SSH public key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var SSHPublicKeyId: publicKeyIdType
  /**
    * The name of the IAM user associated with the SSH public key. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}

object DeleteSSHPublicKeyRequest {
  @scala.inline
  def apply(SSHPublicKeyId: publicKeyIdType, UserName: userNameType): DeleteSSHPublicKeyRequest = {
    val __obj = js.Dynamic.literal(SSHPublicKeyId = SSHPublicKeyId, UserName = UserName)
  
    __obj.asInstanceOf[DeleteSSHPublicKeyRequest]
  }
}

