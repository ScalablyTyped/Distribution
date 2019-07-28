package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryS3BucketDestination extends js.Object {
  /**
    * The ID of the account that owns the destination bucket.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AccountId] = js.undefined
  /**
    * The Amazon resource name (ARN) of the bucket where inventory results will be published.
    */
  var Bucket: BucketName
  /**
    * Contains the type of server-side encryption used to encrypt the inventory results.
    */
  var Encryption: js.UndefOr[InventoryEncryption] = js.undefined
  /**
    * Specifies the output format of the inventory results.
    */
  var Format: InventoryFormat
  /**
    * The prefix that is prepended to all inventory results.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.undefined
}

object InventoryS3BucketDestination {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Format: InventoryFormat,
    AccountId: AccountId = null,
    Encryption: InventoryEncryption = null,
    Prefix: Prefix = null
  ): InventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Format = Format.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    __obj.asInstanceOf[InventoryS3BucketDestination]
  }
}

