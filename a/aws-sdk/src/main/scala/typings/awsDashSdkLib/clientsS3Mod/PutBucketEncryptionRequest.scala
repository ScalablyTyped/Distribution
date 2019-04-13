package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketEncryptionRequest extends js.Object {
  /**
    * The name of the bucket for which the server-side encryption configuration is set.
    */
  var Bucket: BucketName
  /**
    * The base64-encoded 128-bit MD5 digest of the server-side encryption configuration. This parameter is auto-populated when using the command from the CLI
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  var ServerSideEncryptionConfiguration: awsDashSdkLib.clientsS3Mod.ServerSideEncryptionConfiguration
}

object PutBucketEncryptionRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration,
    ContentMD5: ContentMD5 = null
  ): PutBucketEncryptionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutBucketEncryptionRequest]
  }
}

