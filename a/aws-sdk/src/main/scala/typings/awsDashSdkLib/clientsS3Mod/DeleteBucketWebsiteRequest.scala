package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketWebsiteRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object DeleteBucketWebsiteRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketWebsiteRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[DeleteBucketWebsiteRequest]
  }
}

