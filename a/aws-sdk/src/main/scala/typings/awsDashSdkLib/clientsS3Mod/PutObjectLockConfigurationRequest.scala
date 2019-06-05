package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectLockConfigurationRequest extends js.Object {
  /**
    * The bucket whose object lock configuration you want to create or replace.
    */
  var Bucket: BucketName
  /**
    * The MD5 hash for the request body.
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  /**
    * The object lock configuration that you want to apply to the specified bucket.
    */
  var ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration] = js.undefined
  var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  /**
    * A token to allow Amazon S3 object lock to be enabled for an existing bucket.
    */
  var Token: js.UndefOr[ObjectLockToken] = js.undefined
}

object PutObjectLockConfigurationRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ContentMD5: ContentMD5 = null,
    ObjectLockConfiguration: ObjectLockConfiguration = null,
    RequestPayer: RequestPayer = null,
    Token: ObjectLockToken = null
  ): PutObjectLockConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (ObjectLockConfiguration != null) __obj.updateDynamic("ObjectLockConfiguration")(ObjectLockConfiguration)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[PutObjectLockConfigurationRequest]
  }
}

