package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteMultipartUploadInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String
  /**
    * The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the individual parts that you uploaded.
    */
  var archiveSize: js.UndefOr[String] = js.undefined
  /**
    * The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled archive as computed by Amazon S3 Glacier (Glacier), Glacier returns an error and the request fails.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * The upload ID of the multipart upload.
    */
  var uploadId: String
  /**
    * The name of the vault.
    */
  var vaultName: String
}

object CompleteMultipartUploadInput {
  @scala.inline
  def apply(
    accountId: String,
    uploadId: String,
    vaultName: String,
    archiveSize: String = null,
    checksum: String = null
  ): CompleteMultipartUploadInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, uploadId = uploadId, vaultName = vaultName)
    if (archiveSize != null) __obj.updateDynamic("archiveSize")(archiveSize)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    __obj.asInstanceOf[CompleteMultipartUploadInput]
  }
}

