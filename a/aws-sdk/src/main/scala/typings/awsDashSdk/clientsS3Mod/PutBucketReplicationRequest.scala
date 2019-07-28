package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketReplicationRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit.
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.undefined
  /**
    * 
    */
  var ReplicationConfiguration: typings.awsDashSdk.clientsS3Mod.ReplicationConfiguration
  /**
    * A token that allows Amazon S3 object lock to be enabled for an existing bucket.
    */
  var Token: js.UndefOr[ObjectLockToken] = js.undefined
}

object PutBucketReplicationRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ReplicationConfiguration: ReplicationConfiguration,
    ContentMD5: ContentMD5 = null,
    Token: ObjectLockToken = null
  ): PutBucketReplicationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, ReplicationConfiguration = ReplicationConfiguration)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[PutBucketReplicationRequest]
  }
}

