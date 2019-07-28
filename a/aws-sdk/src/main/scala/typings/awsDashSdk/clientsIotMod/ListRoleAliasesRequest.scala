package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRoleAliasesRequest extends js.Object {
  /**
    * Return the list of role aliases in ascending alphabetical order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
  /**
    * A marker used to get the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  /**
    * The maximum number of results to return at one time.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
}

object ListRoleAliasesRequest {
  @scala.inline
  def apply(
    ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
    marker: Marker = null,
    pageSize: js.UndefOr[PageSize] = js.undefined
  ): ListRoleAliasesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascendingOrder)) __obj.updateDynamic("ascendingOrder")(ascendingOrder)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize)
    __obj.asInstanceOf[ListRoleAliasesRequest]
  }
}

