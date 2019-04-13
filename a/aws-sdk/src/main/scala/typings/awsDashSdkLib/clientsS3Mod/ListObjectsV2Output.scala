package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectsV2Output extends js.Object {
  /**
    * CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by delimiter
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
  /**
    * Metadata about each object returned.
    */
  var Contents: js.UndefOr[ObjectList] = js.undefined
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
    * A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria.
    */
  var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
  /**
    * KeyCount is the number of keys returned with this request. KeyCount will always be less than equals to MaxKeys field. Say you ask for 50 keys, your result will include less than equals 50 keys 
    */
  var KeyCount: js.UndefOr[KeyCount] = js.undefined
  /**
    * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
  /**
    * Name of the bucket to list.
    */
  var Name: js.UndefOr[BucketName] = js.undefined
  /**
    * NextContinuationToken is sent when isTruncated is true which means there are more keys in the bucket that can be listed. The next list requests to Amazon S3 can be continued with this NextContinuationToken. NextContinuationToken is obfuscated and is not a real key
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Limits the response to keys that begin with the specified prefix.
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket
    */
  var StartAfter: js.UndefOr[StartAfter] = js.undefined
}

object ListObjectsV2Output {
  @scala.inline
  def apply(
    CommonPrefixes: CommonPrefixList = null,
    Contents: ObjectList = null,
    ContinuationToken: Token = null,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
    KeyCount: js.UndefOr[KeyCount] = js.undefined,
    MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
    Name: BucketName = null,
    NextContinuationToken: NextToken = null,
    Prefix: Prefix = null,
    StartAfter: StartAfter = null
  ): ListObjectsV2Output = {
    val __obj = js.Dynamic.literal()
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes)
    if (Contents != null) __obj.updateDynamic("Contents")(Contents)
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (!js.isUndefined(KeyCount)) __obj.updateDynamic("KeyCount")(KeyCount)
    if (!js.isUndefined(MaxKeys)) __obj.updateDynamic("MaxKeys")(MaxKeys)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (StartAfter != null) __obj.updateDynamic("StartAfter")(StartAfter)
    __obj.asInstanceOf[ListObjectsV2Output]
  }
}

