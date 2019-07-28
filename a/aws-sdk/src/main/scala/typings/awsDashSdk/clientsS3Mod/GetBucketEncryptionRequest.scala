package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketEncryptionRequest extends js.Object {
  /**
    * The name of the bucket from which the server-side encryption configuration is retrieved.
    */
  var Bucket: BucketName
}

object GetBucketEncryptionRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketEncryptionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketEncryptionRequest]
  }
}

