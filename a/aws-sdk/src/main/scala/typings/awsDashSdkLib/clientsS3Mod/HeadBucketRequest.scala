package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadBucketRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object HeadBucketRequest {
  @scala.inline
  def apply(Bucket: BucketName): HeadBucketRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[HeadBucketRequest]
  }
}

