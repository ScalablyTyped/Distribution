package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromVaultInput extends js.Object {
  /**
    * A list of tag keys. Each corresponding tag is removed from the vault.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.native
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object RemoveTagsFromVaultInput {
  @scala.inline
  def apply(accountId: String, vaultName: String, TagKeys: TagKeyList = null): RemoveTagsFromVaultInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromVaultInput]
  }
}

