package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPrincipalPoliciesRequest extends js.Object {
  /**
    * Specifies the order for results. If true, results are returned in ascending creation order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
  /**
    * The marker for the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * The principal.
    */
  var principal: Principal
}

object ListPrincipalPoliciesRequest {
  @scala.inline
  def apply(
    principal: Principal,
    ascendingOrder: js.UndefOr[scala.Boolean] = js.undefined,
    marker: Marker = null,
    pageSize: Int | Double = null
  ): ListPrincipalPoliciesRequest = {
    val __obj = js.Dynamic.literal(principal = principal)
    if (!js.isUndefined(ascendingOrder)) __obj.updateDynamic("ascendingOrder")(ascendingOrder)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalPoliciesRequest]
  }
}

