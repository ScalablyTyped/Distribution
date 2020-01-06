package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOutgoingCertificatesResponse extends js.Object {
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The certificates that are being transferred but not yet accepted.
    */
  var outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.native
}

object ListOutgoingCertificatesResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, outgoingCertificates: OutgoingCertificates = null): ListOutgoingCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    if (outgoingCertificates != null) __obj.updateDynamic("outgoingCertificates")(outgoingCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOutgoingCertificatesResponse]
  }
}

