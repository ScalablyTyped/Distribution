package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCertificatesByCAResponse extends js.Object {
  /**
    * The device certificates signed by the specified CA certificate.
    */
  var certificates: js.UndefOr[Certificates] = js.undefined
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}

object ListCertificatesByCAResponse {
  @scala.inline
  def apply(certificates: Certificates = null, nextMarker: Marker = null): ListCertificatesByCAResponse = {
    val __obj = js.Dynamic.literal()
    if (certificates != null) __obj.updateDynamic("certificates")(certificates)
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    __obj.asInstanceOf[ListCertificatesByCAResponse]
  }
}

