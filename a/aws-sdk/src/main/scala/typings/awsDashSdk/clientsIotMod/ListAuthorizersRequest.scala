package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAuthorizersRequest extends js.Object {
  /**
    * Return the list of authorizers in ascending alphabetical order.
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
  /**
    * The status of the list authorizers request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.undefined
}

object ListAuthorizersRequest {
  @scala.inline
  def apply(
    ascendingOrder: js.UndefOr[scala.Boolean] = js.undefined,
    marker: Marker = null,
    pageSize: Int | Double = null,
    status: AuthorizerStatus = null
  ): ListAuthorizersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascendingOrder)) __obj.updateDynamic("ascendingOrder")(ascendingOrder)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuthorizersRequest]
  }
}

