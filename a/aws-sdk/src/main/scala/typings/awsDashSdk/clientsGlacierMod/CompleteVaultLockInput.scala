package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteVaultLockInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String
  /**
    * The lockId value is the lock ID obtained from a InitiateVaultLock request.
    */
  var lockId: String
  /**
    * The name of the vault.
    */
  var vaultName: String
}

object CompleteVaultLockInput {
  @scala.inline
  def apply(accountId: String, lockId: String, vaultName: String): CompleteVaultLockInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, lockId = lockId, vaultName = vaultName)
  
    __obj.asInstanceOf[CompleteVaultLockInput]
  }
}

