package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMultipartUploadsRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * Character you use to group keys.
    */
  var Delimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Delimiter] = js.undefined
  var EncodingType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.EncodingType] = js.undefined
  /**
    * Together with upload-id-marker, this parameter specifies the multipart upload after which listing should begin.
    */
  var KeyMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.KeyMarker] = js.undefined
  /**
    * Sets the maximum number of multipart uploads, from 1 to 1,000, to return in the response body. 1,000 is the maximum number of uploads that can be returned in a response.
    */
  var MaxUploads: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MaxUploads] = js.undefined
  /**
    * Lists in-progress uploads only for those keys that begin with the specified prefix.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.undefined
  /**
    * Together with key-marker, specifies the multipart upload after which listing should begin. If key-marker is not specified, the upload-id-marker parameter is ignored.
    */
  var UploadIdMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.UploadIdMarker] = js.undefined
}

object ListMultipartUploadsRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    KeyMarker: KeyMarker = null,
    MaxUploads: Int | Double = null,
    Prefix: Prefix = null,
    UploadIdMarker: UploadIdMarker = null
  ): ListMultipartUploadsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (KeyMarker != null) __obj.updateDynamic("KeyMarker")(KeyMarker)
    if (MaxUploads != null) __obj.updateDynamic("MaxUploads")(MaxUploads.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (UploadIdMarker != null) __obj.updateDynamic("UploadIdMarker")(UploadIdMarker)
    __obj.asInstanceOf[ListMultipartUploadsRequest]
  }
}

