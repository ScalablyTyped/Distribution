package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMultipartPartInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: java.lang.String
  /**
    * The data to upload.
    */
  var body: js.UndefOr[Stream] = js.undefined
  /**
    * The SHA256 tree hash of the data being uploaded.
    */
  var checksum: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier uses this information to assemble the archive in the proper sequence. The format of this header follows RFC 2616. An example header is Content-Range:bytes 0-4194303/ *.
    */
  var range: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The upload ID of the multipart upload.
    */
  var uploadId: java.lang.String
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object UploadMultipartPartInput {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    uploadId: java.lang.String,
    vaultName: java.lang.String,
    body: Stream = null,
    checksum: java.lang.String = null,
    range: java.lang.String = null
  ): UploadMultipartPartInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, uploadId = uploadId, vaultName = vaultName)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[UploadMultipartPartInput]
  }
}

