package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOutgoingCertificatesResponse extends js.Object {
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * The certificates that are being transferred but not yet accepted.
    */
  var outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.undefined
}

object ListOutgoingCertificatesResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, outgoingCertificates: OutgoingCertificates = null): ListOutgoingCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    if (outgoingCertificates != null) __obj.updateDynamic("outgoingCertificates")(outgoingCertificates)
    __obj.asInstanceOf[ListOutgoingCertificatesResponse]
  }
}

