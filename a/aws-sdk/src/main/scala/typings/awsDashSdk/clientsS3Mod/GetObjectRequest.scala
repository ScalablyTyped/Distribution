package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
    */
  var IfMatch: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IfMatch] = js.undefined
  /**
    * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
    */
  var IfModifiedSince: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IfModifiedSince] = js.undefined
  /**
    * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
    */
  var IfNoneMatch: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IfNoneMatch] = js.undefined
  /**
    * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
    */
  var IfUnmodifiedSince: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IfUnmodifiedSince] = js.undefined
  /**
    * 
    */
  var Key: ObjectKey
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
    */
  var PartNumber: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PartNumber] = js.undefined
  /**
    * Downloads the specified range bytes of an object. For more information about the HTTP Range header, go to http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.
    */
  var Range: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Range] = js.undefined
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
  /**
    * Sets the Cache-Control header of the response.
    */
  var ResponseCacheControl: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseCacheControl] = js.undefined
  /**
    * Sets the Content-Disposition header of the response
    */
  var ResponseContentDisposition: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseContentDisposition] = js.undefined
  /**
    * Sets the Content-Encoding header of the response.
    */
  var ResponseContentEncoding: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseContentEncoding] = js.undefined
  /**
    * Sets the Content-Language header of the response.
    */
  var ResponseContentLanguage: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseContentLanguage] = js.undefined
  /**
    * Sets the Content-Type header of the response.
    */
  var ResponseContentType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseContentType] = js.undefined
  /**
    * Sets the Expires header of the response.
    */
  var ResponseExpires: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseExpires] = js.undefined
  /**
    * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKey] = js.undefined
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object GetObjectRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    IfMatch: IfMatch = null,
    IfModifiedSince: IfModifiedSince = null,
    IfNoneMatch: IfNoneMatch = null,
    IfUnmodifiedSince: IfUnmodifiedSince = null,
    PartNumber: js.UndefOr[PartNumber] = js.undefined,
    Range: Range = null,
    RequestPayer: RequestPayer = null,
    ResponseCacheControl: ResponseCacheControl = null,
    ResponseContentDisposition: ResponseContentDisposition = null,
    ResponseContentEncoding: ResponseContentEncoding = null,
    ResponseContentLanguage: ResponseContentLanguage = null,
    ResponseContentType: ResponseContentType = null,
    ResponseExpires: ResponseExpires = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKey: SSECustomerKey = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null,
    VersionId: ObjectVersionId = null
  ): GetObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    if (IfModifiedSince != null) __obj.updateDynamic("IfModifiedSince")(IfModifiedSince)
    if (IfNoneMatch != null) __obj.updateDynamic("IfNoneMatch")(IfNoneMatch)
    if (IfUnmodifiedSince != null) __obj.updateDynamic("IfUnmodifiedSince")(IfUnmodifiedSince)
    if (!js.isUndefined(PartNumber)) __obj.updateDynamic("PartNumber")(PartNumber)
    if (Range != null) __obj.updateDynamic("Range")(Range)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (ResponseCacheControl != null) __obj.updateDynamic("ResponseCacheControl")(ResponseCacheControl)
    if (ResponseContentDisposition != null) __obj.updateDynamic("ResponseContentDisposition")(ResponseContentDisposition)
    if (ResponseContentEncoding != null) __obj.updateDynamic("ResponseContentEncoding")(ResponseContentEncoding)
    if (ResponseContentLanguage != null) __obj.updateDynamic("ResponseContentLanguage")(ResponseContentLanguage)
    if (ResponseContentType != null) __obj.updateDynamic("ResponseContentType")(ResponseContentType)
    if (ResponseExpires != null) __obj.updateDynamic("ResponseExpires")(ResponseExpires)
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[GetObjectRequest]
  }
}

