package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCACertificatesRequest extends js.Object {
  /**
    * Determines the order of the results.
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
}

object ListCACertificatesRequest {
  @scala.inline
  def apply(
    ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
    marker: Marker = null,
    pageSize: js.UndefOr[PageSize] = js.undefined
  ): ListCACertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascendingOrder)) __obj.updateDynamic("ascendingOrder")(ascendingOrder)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize)
    __obj.asInstanceOf[ListCACertificatesRequest]
  }
}

