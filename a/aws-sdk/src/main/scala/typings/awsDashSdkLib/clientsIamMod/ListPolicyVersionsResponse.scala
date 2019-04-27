package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPolicyVersionsResponse extends js.Object {
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
  /**
    * A list of policy versions. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  var Versions: js.UndefOr[policyDocumentVersionListType] = js.undefined
}

object ListPolicyVersionsResponse {
  @scala.inline
  def apply(
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    Marker: responseMarkerType = null,
    Versions: policyDocumentVersionListType = null
  ): ListPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Versions != null) __obj.updateDynamic("Versions")(Versions)
    __obj.asInstanceOf[ListPolicyVersionsResponse]
  }
}

