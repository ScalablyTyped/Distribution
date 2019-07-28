package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMultipartPartInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String
  /**
    * The data to upload.
    */
  var body: js.UndefOr[Stream] = js.undefined
  /**
    * The SHA256 tree hash of the data being uploaded.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon S3 Glacier uses this information to assemble the archive in the proper sequence. The format of this header follows RFC 2616. An example header is Content-Range:bytes 0-4194303/ *.
    */
  var range: js.UndefOr[String] = js.undefined
  /**
    * The upload ID of the multipart upload.
    */
  var uploadId: String
  /**
    * The name of the vault.
    */
  var vaultName: String
}

object UploadMultipartPartInput {
  @scala.inline
  def apply(
    accountId: String,
    uploadId: String,
    vaultName: String,
    body: Stream = null,
    checksum: String = null,
    range: String = null
  ): UploadMultipartPartInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, uploadId = uploadId, vaultName = vaultName)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[UploadMultipartPartInput]
  }
}

