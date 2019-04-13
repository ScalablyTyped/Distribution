package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object DeleteBucketRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[DeleteBucketRequest]
  }
}

