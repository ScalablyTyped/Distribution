package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshPublicKey extends js.Object {
  /**
    * The date that the public key was added to the user account.
    */
  var DateImported: awsDashSdkLib.clientsTransferMod.DateImported
  /**
    * The content of the SSH public key as specified by the PublicKeyId.
    */
  var SshPublicKeyBody: awsDashSdkLib.clientsTransferMod.SshPublicKeyBody
  /**
    * The SshPublicKeyId parameter contains the identifier of the public key.
    */
  var SshPublicKeyId: awsDashSdkLib.clientsTransferMod.SshPublicKeyId
}

object SshPublicKey {
  @scala.inline
  def apply(DateImported: DateImported, SshPublicKeyBody: SshPublicKeyBody, SshPublicKeyId: SshPublicKeyId): SshPublicKey = {
    val __obj = js.Dynamic.literal(DateImported = DateImported, SshPublicKeyBody = SshPublicKeyBody, SshPublicKeyId = SshPublicKeyId)
  
    __obj.asInstanceOf[SshPublicKey]
  }
}

