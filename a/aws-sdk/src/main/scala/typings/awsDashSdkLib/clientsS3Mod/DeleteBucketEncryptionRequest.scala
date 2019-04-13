package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketEncryptionRequest extends js.Object {
  /**
    * The name of the bucket containing the server-side encryption configuration to delete.
    */
  var Bucket: BucketName
}

object DeleteBucketEncryptionRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketEncryptionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[DeleteBucketEncryptionRequest]
  }
}

