package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVaultAccessPolicyInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: java.lang.String
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object GetVaultAccessPolicyInput {
  @scala.inline
  def apply(accountId: java.lang.String, vaultName: java.lang.String): GetVaultAccessPolicyInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
  
    __obj.asInstanceOf[GetVaultAccessPolicyInput]
  }
}

