package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectVersionsRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * A delimiter is a character you use to group keys.
    */
  var Delimiter: js.UndefOr[Delimiter] = js.undefined
  var EncodingType: js.UndefOr[EncodingType] = js.undefined
  /**
    * Specifies the key to start with when listing objects in a bucket.
    */
  var KeyMarker: js.UndefOr[KeyMarker] = js.undefined
  /**
    * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
  /**
    * Limits the response to keys that begin with the specified prefix.
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * Specifies the object version you want to start listing from.
    */
  var VersionIdMarker: js.UndefOr[VersionIdMarker] = js.undefined
}

object ListObjectVersionsRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    KeyMarker: KeyMarker = null,
    MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
    Prefix: Prefix = null,
    VersionIdMarker: VersionIdMarker = null
  ): ListObjectVersionsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (KeyMarker != null) __obj.updateDynamic("KeyMarker")(KeyMarker)
    if (!js.isUndefined(MaxKeys)) __obj.updateDynamic("MaxKeys")(MaxKeys)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (VersionIdMarker != null) __obj.updateDynamic("VersionIdMarker")(VersionIdMarker)
    __obj.asInstanceOf[ListObjectVersionsRequest]
  }
}

