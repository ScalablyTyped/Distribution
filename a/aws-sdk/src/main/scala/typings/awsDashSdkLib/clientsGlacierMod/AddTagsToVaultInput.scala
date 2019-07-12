package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsToVaultInput extends js.Object {
  /**
    * The tags to add to the vault. Each tag is composed of a key and a value. The value can be an empty string.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: java.lang.String
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object AddTagsToVaultInput {
  @scala.inline
  def apply(accountId: java.lang.String, vaultName: java.lang.String, Tags: TagMap = null): AddTagsToVaultInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[AddTagsToVaultInput]
  }
}

