package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectLegalHoldRequest extends js.Object {
  /**
    * The bucket containing the object that you want to place a Legal Hold on.
    */
  var Bucket: BucketName
  /**
    * The MD5 hash for the request body.
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.undefined
  /**
    * The key name for the object that you want to place a Legal Hold on.
    */
  var Key: ObjectKey
  /**
    * Container element for the Legal Hold configuration you want to apply to the specified object.
    */
  var LegalHold: js.UndefOr[ObjectLockLegalHold] = js.undefined
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
  /**
    * The version ID of the object that you want to place a Legal Hold on.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object PutObjectLegalHoldRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    ContentMD5: ContentMD5 = null,
    LegalHold: ObjectLockLegalHold = null,
    RequestPayer: RequestPayer = null,
    VersionId: ObjectVersionId = null
  ): PutObjectLegalHoldRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (LegalHold != null) __obj.updateDynamic("LegalHold")(LegalHold)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[PutObjectLegalHoldRequest]
  }
}

