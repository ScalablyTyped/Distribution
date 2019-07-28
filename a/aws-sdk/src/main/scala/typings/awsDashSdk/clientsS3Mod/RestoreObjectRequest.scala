package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreObjectRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var Key: ObjectKey
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
  /**
    * 
    */
  var RestoreRequest: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RestoreRequest] = js.undefined
  /**
    * 
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object RestoreObjectRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    RequestPayer: RequestPayer = null,
    RestoreRequest: RestoreRequest = null,
    VersionId: ObjectVersionId = null
  ): RestoreObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (RestoreRequest != null) __obj.updateDynamic("RestoreRequest")(RestoreRequest)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[RestoreObjectRequest]
  }
}

