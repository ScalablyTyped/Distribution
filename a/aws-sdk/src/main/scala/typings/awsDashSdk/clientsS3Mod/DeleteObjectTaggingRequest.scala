package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectTaggingRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var Key: ObjectKey
  /**
    * The versionId of the object that the tag-set will be removed from.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object DeleteObjectTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, VersionId: ObjectVersionId = null): DeleteObjectTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[DeleteObjectTaggingRequest]
  }
}

