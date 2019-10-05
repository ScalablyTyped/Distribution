package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIPSetsRequest extends js.Object {
  /**
    * Specifies the number of IPSet objects that you want AWS WAF to return for this request. If you have more IPSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of IPSet objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  /**
    * AWS WAF returns a NextMarker value in the response that allows you to list another group of IPSets. For the second and subsequent ListIPSets requests, specify the value of NextMarker from the previous response to get information about another batch of IPSets.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafMod.NextMarker] = js.undefined
}

object ListIPSetsRequest {
  @scala.inline
  def apply(Limit: Int | Double = null, NextMarker: NextMarker = null): ListIPSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListIPSetsRequest]
  }
}

