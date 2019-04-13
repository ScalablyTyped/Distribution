package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketWebsiteRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketWebsiteRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketWebsiteRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketWebsiteRequest]
  }
}

