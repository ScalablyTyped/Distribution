package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetVaultAccessPolicyInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: java.lang.String
  /**
    * The vault access policy as a JSON string.
    */
  var policy: js.UndefOr[VaultAccessPolicy] = js.undefined
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object SetVaultAccessPolicyInput {
  @scala.inline
  def apply(accountId: java.lang.String, vaultName: java.lang.String, policy: VaultAccessPolicy = null): SetVaultAccessPolicyInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    __obj.asInstanceOf[SetVaultAccessPolicyInput]
  }
}

