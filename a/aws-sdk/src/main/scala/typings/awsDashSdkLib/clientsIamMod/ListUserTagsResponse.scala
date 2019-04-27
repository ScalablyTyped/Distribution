package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserTagsResponse extends js.Object {
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can use the Marker request parameter to make a subsequent pagination request that retrieves more items. Note that IAM might return fewer than the MaxItems number of results even when more results are available. Check IsTruncated after every call to ensure that you receive all of your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
  /**
    * The list of tags that are currently attached to the user. Each tag consists of a key name and an associated value. If no tags are attached to the specified user, the response contains an empty list.
    */
  var Tags: tagListType
}

object ListUserTagsResponse {
  @scala.inline
  def apply(
    Tags: tagListType,
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    Marker: responseMarkerType = null
  ): ListUserTagsResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags)
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListUserTagsResponse]
  }
}

