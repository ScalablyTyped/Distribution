package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketTaggingRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketTaggingRequest]
  }
}

