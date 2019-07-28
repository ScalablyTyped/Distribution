package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCertificatesByCARequest extends js.Object {
  /**
    * Specifies the order for results. If True, the results are returned in ascending order, based on the creation date.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
  /**
    * The ID of the CA certificate. This operation will list all registered device certificate that were signed by this CA certificate.
    */
  var caCertificateId: CertificateId
  /**
    * The marker for the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
}

object ListCertificatesByCARequest {
  @scala.inline
  def apply(
    caCertificateId: CertificateId,
    ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
    marker: Marker = null,
    pageSize: js.UndefOr[PageSize] = js.undefined
  ): ListCertificatesByCARequest = {
    val __obj = js.Dynamic.literal(caCertificateId = caCertificateId)
    if (!js.isUndefined(ascendingOrder)) __obj.updateDynamic("ascendingOrder")(ascendingOrder)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize)
    __obj.asInstanceOf[ListCertificatesByCARequest]
  }
}

