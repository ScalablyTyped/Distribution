package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectsOutput extends js.Object {
  /**
    * 
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
  /**
    * 
    */
  var Contents: js.UndefOr[ObjectList] = js.undefined
  /**
    * 
    */
  var Delimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Delimiter] = js.undefined
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response.
    */
  var EncodingType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.EncodingType] = js.undefined
  /**
    * A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria.
    */
  var IsTruncated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IsTruncated] = js.undefined
  /**
    * 
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Marker] = js.undefined
  /**
    * 
    */
  var MaxKeys: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MaxKeys] = js.undefined
  /**
    * 
    */
  var Name: js.UndefOr[BucketName] = js.undefined
  /**
    * When response is truncated (the IsTruncated element value in the response is true), you can use the key name in this field as marker in the subsequent request to get next set of objects. Amazon S3 lists objects in alphabetical order Note: This element is returned only if you have delimiter request parameter specified. If response does not include the NextMaker and it is truncated, you can use the value of the last Key in the response as the marker in the subsequent request to get the next set of object keys.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.NextMarker] = js.undefined
  /**
    * 
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.undefined
}

object ListObjectsOutput {
  @scala.inline
  def apply(
    CommonPrefixes: CommonPrefixList = null,
    Contents: ObjectList = null,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
    Marker: Marker = null,
    MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
    Name: BucketName = null,
    NextMarker: NextMarker = null,
    Prefix: Prefix = null
  ): ListObjectsOutput = {
    val __obj = js.Dynamic.literal()
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes)
    if (Contents != null) __obj.updateDynamic("Contents")(Contents)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxKeys)) __obj.updateDynamic("MaxKeys")(MaxKeys)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    __obj.asInstanceOf[ListObjectsOutput]
  }
}

