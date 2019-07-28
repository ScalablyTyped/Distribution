package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMultipartUploadsOutput extends js.Object {
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  /**
    * 
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
  /**
    * 
    */
  var Delimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Delimiter] = js.undefined
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response.
    */
  var EncodingType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.EncodingType] = js.undefined
  /**
    * Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or specified by max uploads.
    */
  var IsTruncated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IsTruncated] = js.undefined
  /**
    * The key at or after which the listing began.
    */
  var KeyMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.KeyMarker] = js.undefined
  /**
    * Maximum number of multipart uploads that could have been included in the response.
    */
  var MaxUploads: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MaxUploads] = js.undefined
  /**
    * When a list is truncated, this element specifies the value that should be used for the key-marker request parameter in a subsequent request.
    */
  var NextKeyMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.NextKeyMarker] = js.undefined
  /**
    * When a list is truncated, this element specifies the value that should be used for the upload-id-marker request parameter in a subsequent request.
    */
  var NextUploadIdMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.NextUploadIdMarker] = js.undefined
  /**
    * When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys starting with the specified prefix.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.undefined
  /**
    * Upload ID after which listing began.
    */
  var UploadIdMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.UploadIdMarker] = js.undefined
  /**
    * 
    */
  var Uploads: js.UndefOr[MultipartUploadList] = js.undefined
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply(
    Bucket: BucketName = null,
    CommonPrefixes: CommonPrefixList = null,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
    KeyMarker: KeyMarker = null,
    MaxUploads: js.UndefOr[MaxUploads] = js.undefined,
    NextKeyMarker: NextKeyMarker = null,
    NextUploadIdMarker: NextUploadIdMarker = null,
    Prefix: Prefix = null,
    UploadIdMarker: UploadIdMarker = null,
    Uploads: MultipartUploadList = null
  ): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (KeyMarker != null) __obj.updateDynamic("KeyMarker")(KeyMarker)
    if (!js.isUndefined(MaxUploads)) __obj.updateDynamic("MaxUploads")(MaxUploads)
    if (NextKeyMarker != null) __obj.updateDynamic("NextKeyMarker")(NextKeyMarker)
    if (NextUploadIdMarker != null) __obj.updateDynamic("NextUploadIdMarker")(NextUploadIdMarker)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (UploadIdMarker != null) __obj.updateDynamic("UploadIdMarker")(UploadIdMarker)
    if (Uploads != null) __obj.updateDynamic("Uploads")(Uploads)
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
}

