package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectTaggingRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var Key: ObjectKey
  /**
    * 
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object GetObjectTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, VersionId: ObjectVersionId = null): GetObjectTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[GetObjectTaggingRequest]
  }
}

