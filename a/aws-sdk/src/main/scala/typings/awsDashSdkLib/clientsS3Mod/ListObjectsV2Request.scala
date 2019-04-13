package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectsV2Request extends js.Object {
  /**
    * Name of the bucket to list.
    */
  var Bucket: BucketName
  /**
    * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token. ContinuationToken is obfuscated and is not a real key
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
  /**
    * A delimiter is a character you use to group keys.
    */
  var Delimiter: js.UndefOr[Delimiter] = js.undefined
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response.
    */
  var EncodingType: js.UndefOr[EncodingType] = js.undefined
  /**
    * The owner field is not present in listV2 by default, if you want to return owner field with each key in the result then set the fetch owner field to true
    */
  var FetchOwner: js.UndefOr[FetchOwner] = js.undefined
  /**
    * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
  /**
    * Limits the response to keys that begin with the specified prefix.
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * Confirms that the requester knows that she or he will be charged for the list objects request in V2 style. Bucket owners need not specify this parameter in their requests.
    */
  var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  /**
    * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket
    */
  var StartAfter: js.UndefOr[StartAfter] = js.undefined
}

object ListObjectsV2Request {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ContinuationToken: Token = null,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    FetchOwner: js.UndefOr[FetchOwner] = js.undefined,
    MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
    Prefix: Prefix = null,
    RequestPayer: RequestPayer = null,
    StartAfter: StartAfter = null
  ): ListObjectsV2Request = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(FetchOwner)) __obj.updateDynamic("FetchOwner")(FetchOwner)
    if (!js.isUndefined(MaxKeys)) __obj.updateDynamic("MaxKeys")(MaxKeys)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (StartAfter != null) __obj.updateDynamic("StartAfter")(StartAfter)
    __obj.asInstanceOf[ListObjectsV2Request]
  }
}

