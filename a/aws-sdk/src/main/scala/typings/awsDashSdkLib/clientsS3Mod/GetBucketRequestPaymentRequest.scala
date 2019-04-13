package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketRequestPaymentRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketRequestPaymentRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketRequestPaymentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketRequestPaymentRequest]
  }
}

