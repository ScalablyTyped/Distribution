package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHsmClientCertificateMessage extends js.Object {
  /**
    * The identifier of the HSM client certificate to be deleted.
    */
  var HsmClientCertificateIdentifier: String = js.native
}

object DeleteHsmClientCertificateMessage {
  @scala.inline
  def apply(HsmClientCertificateIdentifier: String): DeleteHsmClientCertificateMessage = {
    val __obj = js.Dynamic.literal(HsmClientCertificateIdentifier = HsmClientCertificateIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHsmClientCertificateMessage]
  }
}

