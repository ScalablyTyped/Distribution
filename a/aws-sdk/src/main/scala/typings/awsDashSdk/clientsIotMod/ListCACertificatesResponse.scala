package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCACertificatesResponse extends js.Object {
  /**
    * The CA certificates registered in your AWS account.
    */
  var certificates: js.UndefOr[CACertificates] = js.undefined
  /**
    * The current position within the list of CA certificates.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}

object ListCACertificatesResponse {
  @scala.inline
  def apply(certificates: CACertificates = null, nextMarker: Marker = null): ListCACertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (certificates != null) __obj.updateDynamic("certificates")(certificates)
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    __obj.asInstanceOf[ListCACertificatesResponse]
  }
}

