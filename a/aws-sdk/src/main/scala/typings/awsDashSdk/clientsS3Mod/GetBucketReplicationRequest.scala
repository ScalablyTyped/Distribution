package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketReplicationRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketReplicationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketReplicationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketReplicationRequest]
  }
}

