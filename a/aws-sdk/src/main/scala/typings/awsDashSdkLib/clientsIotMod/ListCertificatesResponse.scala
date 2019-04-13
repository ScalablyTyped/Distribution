package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCertificatesResponse extends js.Object {
  /**
    * The descriptions of the certificates.
    */
  var certificates: js.UndefOr[Certificates] = js.undefined
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}

object ListCertificatesResponse {
  @scala.inline
  def apply(certificates: Certificates = null, nextMarker: Marker = null): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (certificates != null) __obj.updateDynamic("certificates")(certificates)
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    __obj.asInstanceOf[ListCertificatesResponse]
  }
}

