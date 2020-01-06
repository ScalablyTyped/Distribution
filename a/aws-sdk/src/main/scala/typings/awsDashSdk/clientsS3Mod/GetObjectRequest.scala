package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectRequest extends js.Object {
  /**
    * The bucket name containing the object.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
    */
  var IfMatch: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IfMatch] = js.native
  /**
    * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
    */
  var IfModifiedSince: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IfModifiedSince] = js.native
  /**
    * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
    */
  var IfNoneMatch: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IfNoneMatch] = js.native
  /**
    * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
    */
  var IfUnmodifiedSince: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IfUnmodifiedSince] = js.native
  /**
    * Key of the object to get.
    */
  var Key: ObjectKey = js.native
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
    */
  var PartNumber: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PartNumber] = js.native
  /**
    * Downloads the specified range bytes of an object. For more information about the HTTP Range header, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.
    */
  var Range: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Range] = js.native
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.native
  /**
    * Sets the Cache-Control header of the response.
    */
  var ResponseCacheControl: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseCacheControl] = js.native
  /**
    * Sets the Content-Disposition header of the response
    */
  var ResponseContentDisposition: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseContentDisposition] = js.native
  /**
    * Sets the Content-Encoding header of the response.
    */
  var ResponseContentEncoding: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseContentEncoding] = js.native
  /**
    * Sets the Content-Language header of the response.
    */
  var ResponseContentLanguage: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseContentLanguage] = js.native
  /**
    * Sets the Content-Type header of the response.
    */
  var ResponseContentType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseContentType] = js.native
  /**
    * Sets the Expires header of the response.
    */
  var ResponseExpires: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ResponseExpires] = js.native
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKeyMD5] = js.native
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
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
    PartNumber: Int | Double = null,
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
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch.asInstanceOf[js.Any])
    if (IfModifiedSince != null) __obj.updateDynamic("IfModifiedSince")(IfModifiedSince.asInstanceOf[js.Any])
    if (IfNoneMatch != null) __obj.updateDynamic("IfNoneMatch")(IfNoneMatch.asInstanceOf[js.Any])
    if (IfUnmodifiedSince != null) __obj.updateDynamic("IfUnmodifiedSince")(IfUnmodifiedSince.asInstanceOf[js.Any])
    if (PartNumber != null) __obj.updateDynamic("PartNumber")(PartNumber.asInstanceOf[js.Any])
    if (Range != null) __obj.updateDynamic("Range")(Range.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (ResponseCacheControl != null) __obj.updateDynamic("ResponseCacheControl")(ResponseCacheControl.asInstanceOf[js.Any])
    if (ResponseContentDisposition != null) __obj.updateDynamic("ResponseContentDisposition")(ResponseContentDisposition.asInstanceOf[js.Any])
    if (ResponseContentEncoding != null) __obj.updateDynamic("ResponseContentEncoding")(ResponseContentEncoding.asInstanceOf[js.Any])
    if (ResponseContentLanguage != null) __obj.updateDynamic("ResponseContentLanguage")(ResponseContentLanguage.asInstanceOf[js.Any])
    if (ResponseContentType != null) __obj.updateDynamic("ResponseContentType")(ResponseContentType.asInstanceOf[js.Any])
    if (ResponseExpires != null) __obj.updateDynamic("ResponseExpires")(ResponseExpires.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectRequest]
  }
}

