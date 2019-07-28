package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLocationRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketLocationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketLocationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketLocationRequest]
  }
}

