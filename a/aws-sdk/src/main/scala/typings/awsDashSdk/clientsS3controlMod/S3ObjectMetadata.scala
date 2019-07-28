package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ObjectMetadata extends js.Object {
  /**
    * 
    */
  var CacheControl: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var ContentDisposition: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var ContentEncoding: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var ContentLanguage: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var ContentLength: js.UndefOr[S3ContentLength] = js.undefined
  /**
    * 
    */
  var ContentMD5: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var ContentType: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  /**
    * 
    */
  var HttpExpiresDate: js.UndefOr[TimeStamp] = js.undefined
  /**
    * 
    */
  var RequesterCharged: js.UndefOr[Boolean] = js.undefined
  /**
    * 
    */
  var SSEAlgorithm: js.UndefOr[S3SSEAlgorithm] = js.undefined
  /**
    * 
    */
  var UserMetadata: js.UndefOr[S3UserMetadata] = js.undefined
}

object S3ObjectMetadata {
  @scala.inline
  def apply(
    CacheControl: NonEmptyMaxLength1024String = null,
    ContentDisposition: NonEmptyMaxLength1024String = null,
    ContentEncoding: NonEmptyMaxLength1024String = null,
    ContentLanguage: NonEmptyMaxLength1024String = null,
    ContentLength: js.UndefOr[S3ContentLength] = js.undefined,
    ContentMD5: NonEmptyMaxLength1024String = null,
    ContentType: NonEmptyMaxLength1024String = null,
    HttpExpiresDate: TimeStamp = null,
    RequesterCharged: js.UndefOr[Boolean] = js.undefined,
    SSEAlgorithm: S3SSEAlgorithm = null,
    UserMetadata: S3UserMetadata = null
  ): S3ObjectMetadata = {
    val __obj = js.Dynamic.literal()
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl)
    if (ContentDisposition != null) __obj.updateDynamic("ContentDisposition")(ContentDisposition)
    if (ContentEncoding != null) __obj.updateDynamic("ContentEncoding")(ContentEncoding)
    if (ContentLanguage != null) __obj.updateDynamic("ContentLanguage")(ContentLanguage)
    if (!js.isUndefined(ContentLength)) __obj.updateDynamic("ContentLength")(ContentLength)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (HttpExpiresDate != null) __obj.updateDynamic("HttpExpiresDate")(HttpExpiresDate)
    if (!js.isUndefined(RequesterCharged)) __obj.updateDynamic("RequesterCharged")(RequesterCharged)
    if (SSEAlgorithm != null) __obj.updateDynamic("SSEAlgorithm")(SSEAlgorithm.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata)
    __obj.asInstanceOf[S3ObjectMetadata]
  }
}

