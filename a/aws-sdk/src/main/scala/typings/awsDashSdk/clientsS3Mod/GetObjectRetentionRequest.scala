package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectRetentionRequest extends js.Object {
  /**
    * The bucket containing the object whose retention settings you want to retrieve.
    */
  var Bucket: BucketName
  /**
    * The key name for the object whose retention settings you want to retrieve.
    */
  var Key: ObjectKey
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
  /**
    * The version ID for the object whose retention settings you want to retrieve.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object GetObjectRetentionRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    RequestPayer: RequestPayer = null,
    VersionId: ObjectVersionId = null
  ): GetObjectRetentionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[GetObjectRetentionRequest]
  }
}

