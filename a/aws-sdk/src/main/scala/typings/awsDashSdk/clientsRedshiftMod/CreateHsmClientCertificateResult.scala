package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmClientCertificateResult extends js.Object {
  var HsmClientCertificate: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.HsmClientCertificate] = js.native
}

object CreateHsmClientCertificateResult {
  @scala.inline
  def apply(HsmClientCertificate: HsmClientCertificate = null): CreateHsmClientCertificateResult = {
    val __obj = js.Dynamic.literal()
    if (HsmClientCertificate != null) __obj.updateDynamic("HsmClientCertificate")(HsmClientCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmClientCertificateResult]
  }
}

