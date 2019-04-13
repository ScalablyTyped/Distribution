package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketCorsRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object DeleteBucketCorsRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketCorsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[DeleteBucketCorsRequest]
  }
}

