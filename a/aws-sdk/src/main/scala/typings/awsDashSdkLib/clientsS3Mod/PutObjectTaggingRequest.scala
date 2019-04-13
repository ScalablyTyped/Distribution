package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectTaggingRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  /**
    * 
    */
  var Key: ObjectKey
  /**
    * 
    */
  var Tagging: awsDashSdkLib.clientsS3Mod.Tagging
  /**
    * 
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object PutObjectTaggingRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    Tagging: Tagging,
    ContentMD5: ContentMD5 = null,
    VersionId: ObjectVersionId = null
  ): PutObjectTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key, Tagging = Tagging)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[PutObjectTaggingRequest]
  }
}

