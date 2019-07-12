package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromVaultInput extends js.Object {
  /**
    * A list of tag keys. Each corresponding tag is removed from the vault.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.undefined
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: java.lang.String
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object RemoveTagsFromVaultInput {
  @scala.inline
  def apply(accountId: java.lang.String, vaultName: java.lang.String, TagKeys: TagKeyList = null): RemoveTagsFromVaultInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys)
    __obj.asInstanceOf[RemoveTagsFromVaultInput]
  }
}

