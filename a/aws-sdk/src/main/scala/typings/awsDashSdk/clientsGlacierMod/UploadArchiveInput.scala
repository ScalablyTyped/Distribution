package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadArchiveInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String
  /**
    * The optional description of the archive you are uploading.
    */
  var archiveDescription: js.UndefOr[String] = js.undefined
  /**
    * The data to upload.
    */
  var body: js.UndefOr[Stream] = js.undefined
  /**
    * The SHA256 tree hash of the data being uploaded.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * The name of the vault.
    */
  var vaultName: String
}

object UploadArchiveInput {
  @scala.inline
  def apply(
    accountId: String,
    vaultName: String,
    archiveDescription: String = null,
    body: Stream = null,
    checksum: String = null
  ): UploadArchiveInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
    if (archiveDescription != null) __obj.updateDynamic("archiveDescription")(archiveDescription)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    __obj.asInstanceOf[UploadArchiveInput]
  }
}

