package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectsRequest extends js.Object {
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
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
  /**
    * Limits the response to keys that begin with the specified prefix.
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * Confirms that the requester knows that she or he will be charged for the list objects request. Bucket owners need not specify this parameter in their requests.
    */
  var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
}

object ListObjectsRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    Marker: Marker = null,
    MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
    Prefix: Prefix = null,
    RequestPayer: RequestPayer = null
  ): ListObjectsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxKeys)) __obj.updateDynamic("MaxKeys")(MaxKeys)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsRequest]
  }
}

