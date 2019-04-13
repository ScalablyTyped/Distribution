package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketReplicationRequest extends js.Object {
  /**
    *  The bucket name.   It can take a while to propagate the deletion of a replication configuration to all Amazon S3 systems. 
    */
  var Bucket: BucketName
}

object DeleteBucketReplicationRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketReplicationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[DeleteBucketReplicationRequest]
  }
}

