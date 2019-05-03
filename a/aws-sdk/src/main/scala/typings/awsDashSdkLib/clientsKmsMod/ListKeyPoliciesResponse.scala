package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListKeyPoliciesResponse extends js.Object {
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.undefined
  /**
    * A list of key policy names. The only valid value is default.
    */
  var PolicyNames: js.UndefOr[PolicyNameList] = js.undefined
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.undefined
}

object ListKeyPoliciesResponse {
  @scala.inline
  def apply(
    NextMarker: MarkerType = null,
    PolicyNames: PolicyNameList = null,
    Truncated: js.UndefOr[BooleanType] = js.undefined
  ): ListKeyPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (PolicyNames != null) __obj.updateDynamic("PolicyNames")(PolicyNames)
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated)
    __obj.asInstanceOf[ListKeyPoliciesResponse]
  }
}

