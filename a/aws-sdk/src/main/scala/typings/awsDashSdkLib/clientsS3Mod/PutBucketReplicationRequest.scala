package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketReplicationRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  var ReplicationConfiguration: awsDashSdkLib.clientsS3Mod.ReplicationConfiguration
}

object PutBucketReplicationRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ReplicationConfiguration: ReplicationConfiguration,
    ContentMD5: ContentMD5 = null
  ): PutBucketReplicationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, ReplicationConfiguration = ReplicationConfiguration)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutBucketReplicationRequest]
  }
}

