package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectVersionsOutput extends js.Object {
  /**
    * 
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
  /**
    * 
    */
  var DeleteMarkers: js.UndefOr[DeleteMarkers] = js.undefined
  /**
    * 
    */
  var Delimiter: js.UndefOr[Delimiter] = js.undefined
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response.
    */
  var EncodingType: js.UndefOr[EncodingType] = js.undefined
  /**
    * A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria. If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.
    */
  var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
  /**
    * Marks the last Key returned in a truncated response.
    */
  var KeyMarker: js.UndefOr[KeyMarker] = js.undefined
  /**
    * 
    */
  var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
  /**
    * 
    */
  var Name: js.UndefOr[BucketName] = js.undefined
  /**
    * Use this value for the key marker request parameter in a subsequent request.
    */
  var NextKeyMarker: js.UndefOr[NextKeyMarker] = js.undefined
  /**
    * Use this value for the next version id marker parameter in a subsequent request.
    */
  var NextVersionIdMarker: js.UndefOr[NextVersionIdMarker] = js.undefined
  /**
    * 
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * 
    */
  var VersionIdMarker: js.UndefOr[VersionIdMarker] = js.undefined
  /**
    * 
    */
  var Versions: js.UndefOr[ObjectVersionList] = js.undefined
}

object ListObjectVersionsOutput {
  @scala.inline
  def apply(
    CommonPrefixes: CommonPrefixList = null,
    DeleteMarkers: DeleteMarkers = null,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
    KeyMarker: KeyMarker = null,
    MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
    Name: BucketName = null,
    NextKeyMarker: NextKeyMarker = null,
    NextVersionIdMarker: NextVersionIdMarker = null,
    Prefix: Prefix = null,
    VersionIdMarker: VersionIdMarker = null,
    Versions: ObjectVersionList = null
  ): ListObjectVersionsOutput = {
    val __obj = js.Dynamic.literal()
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes)
    if (DeleteMarkers != null) __obj.updateDynamic("DeleteMarkers")(DeleteMarkers)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (KeyMarker != null) __obj.updateDynamic("KeyMarker")(KeyMarker)
    if (!js.isUndefined(MaxKeys)) __obj.updateDynamic("MaxKeys")(MaxKeys)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextKeyMarker != null) __obj.updateDynamic("NextKeyMarker")(NextKeyMarker)
    if (NextVersionIdMarker != null) __obj.updateDynamic("NextVersionIdMarker")(NextVersionIdMarker)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (VersionIdMarker != null) __obj.updateDynamic("VersionIdMarker")(VersionIdMarker)
    if (Versions != null) __obj.updateDynamic("Versions")(Versions)
    __obj.asInstanceOf[ListObjectVersionsOutput]
  }
}

