package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshPublicKey extends js.Object {
  /**
    * The date that the public key was added to the user account.
    */
  var DateImported: typings.awsDashSdk.clientsTransferMod.DateImported
  /**
    * The content of the SSH public key as specified by the PublicKeyId.
    */
  var SshPublicKeyBody: typings.awsDashSdk.clientsTransferMod.SshPublicKeyBody
  /**
    * The SshPublicKeyId parameter contains the identifier of the public key.
    */
  var SshPublicKeyId: typings.awsDashSdk.clientsTransferMod.SshPublicKeyId
}

object SshPublicKey {
  @scala.inline
  def apply(DateImported: DateImported, SshPublicKeyBody: SshPublicKeyBody, SshPublicKeyId: SshPublicKeyId): SshPublicKey = {
    val __obj = js.Dynamic.literal(DateImported = DateImported, SshPublicKeyBody = SshPublicKeyBody, SshPublicKeyId = SshPublicKeyId)
  
    __obj.asInstanceOf[SshPublicKey]
  }
}

