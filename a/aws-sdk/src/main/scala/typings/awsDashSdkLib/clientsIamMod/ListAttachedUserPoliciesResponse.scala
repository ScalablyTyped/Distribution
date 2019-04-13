package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAttachedUserPoliciesResponse extends js.Object {
  /**
    * A list of the attached policies.
    */
  var AttachedPolicies: js.UndefOr[attachedPoliciesListType] = js.undefined
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
}

object ListAttachedUserPoliciesResponse {
  @scala.inline
  def apply(
    AttachedPolicies: attachedPoliciesListType = null,
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    Marker: markerType = null
  ): ListAttachedUserPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedPolicies != null) __obj.updateDynamic("AttachedPolicies")(AttachedPolicies)
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListAttachedUserPoliciesResponse]
  }
}

