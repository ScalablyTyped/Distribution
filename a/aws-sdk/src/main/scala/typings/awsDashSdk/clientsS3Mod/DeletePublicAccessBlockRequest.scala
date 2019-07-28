package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePublicAccessBlockRequest extends js.Object {
  /**
    * The Amazon S3 bucket whose PublicAccessBlock configuration you want to delete. 
    */
  var Bucket: BucketName
}

object DeletePublicAccessBlockRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeletePublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[DeletePublicAccessBlockRequest]
  }
}

