package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectVersionsOutput extends js.Object {
  /**
    * All of the keys rolled up into a common prefix count as a single return when calculating the number of returns.
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.native
  /**
    * Container for an object that is a delete marker.
    */
  var DeleteMarkers: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DeleteMarkers] = js.native
  /**
    * The delimiter grouping the included keys. A delimiter is a character that you specify to group keys. All keys that contain the same string between the prefix and the first occurrence of the delimiter are grouped under a single result element in CommonPrefixes. These groups are counted as one result against the max-keys limitation. These keys are not returned elsewhere in the response.
    */
  var Delimiter: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Delimiter] = js.native
  /**
    *  Encoding type used by Amazon S3 to encode object key names in the XML response. If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  KeyMarker, NextKeyMarker, Prefix, Key, and Delimiter.
    */
  var EncodingType: js.UndefOr[typings.awsDashSdk.clientsS3Mod.EncodingType] = js.native
  /**
    * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search criteria. If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.
    */
  var IsTruncated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IsTruncated] = js.native
  /**
    * Marks the last key returned in a truncated response.
    */
  var KeyMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.KeyMarker] = js.native
  /**
    * Specifies the maximum number of objects to return.
    */
  var MaxKeys: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MaxKeys] = js.native
  /**
    * Bucket name.
    */
  var Name: js.UndefOr[BucketName] = js.native
  /**
    * When the number of responses exceeds the value of MaxKeys, NextKeyMarker specifies the first key not returned that satisfies the search criteria. Use this value for the key-marker request parameter in a subsequent request.
    */
  var NextKeyMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.NextKeyMarker] = js.native
  /**
    * When the number of responses exceeds the value of MaxKeys, NextVersionIdMarker specifies the first object version not returned that satisfies the search criteria. Use this value for the version-id-marker request parameter in a subsequent request.
    */
  var NextVersionIdMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.NextVersionIdMarker] = js.native
  /**
    * Selects objects that start with the value supplied by this parameter.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.native
  /**
    * Marks the last version of the key returned in a truncated response.
    */
  var VersionIdMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.VersionIdMarker] = js.native
  /**
    * Container for version information.
    */
  var Versions: js.UndefOr[ObjectVersionList] = js.native
}

object ListObjectVersionsOutput {
  @scala.inline
  def apply(
    CommonPrefixes: CommonPrefixList = null,
    DeleteMarkers: DeleteMarkers = null,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    KeyMarker: KeyMarker = null,
    MaxKeys: Int | Double = null,
    Name: BucketName = null,
    NextKeyMarker: NextKeyMarker = null,
    NextVersionIdMarker: NextVersionIdMarker = null,
    Prefix: Prefix = null,
    VersionIdMarker: VersionIdMarker = null,
    Versions: ObjectVersionList = null
  ): ListObjectVersionsOutput = {
    val __obj = js.Dynamic.literal()
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes.asInstanceOf[js.Any])
    if (DeleteMarkers != null) __obj.updateDynamic("DeleteMarkers")(DeleteMarkers.asInstanceOf[js.Any])
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter.asInstanceOf[js.Any])
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (KeyMarker != null) __obj.updateDynamic("KeyMarker")(KeyMarker.asInstanceOf[js.Any])
    if (MaxKeys != null) __obj.updateDynamic("MaxKeys")(MaxKeys.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NextKeyMarker != null) __obj.updateDynamic("NextKeyMarker")(NextKeyMarker.asInstanceOf[js.Any])
    if (NextVersionIdMarker != null) __obj.updateDynamic("NextVersionIdMarker")(NextVersionIdMarker.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (VersionIdMarker != null) __obj.updateDynamic("VersionIdMarker")(VersionIdMarker.asInstanceOf[js.Any])
    if (Versions != null) __obj.updateDynamic("Versions")(Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectVersionsOutput]
  }
}

