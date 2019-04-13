package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicAccessBlockRequest extends js.Object {
  /**
    * The name of the Amazon S3 bucket whose PublicAccessBlock configuration you want to retrieve. 
    */
  var Bucket: BucketName
}

object GetPublicAccessBlockRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetPublicAccessBlockRequest]
  }
}

