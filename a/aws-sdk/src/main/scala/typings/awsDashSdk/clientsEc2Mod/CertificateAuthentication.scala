package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateAuthentication extends js.Object {
  /**
    * The ARN of the client certificate. 
    */
  var ClientRootCertificateChain: js.UndefOr[String] = js.undefined
}

object CertificateAuthentication {
  @scala.inline
  def apply(ClientRootCertificateChain: String = null): CertificateAuthentication = {
    val __obj = js.Dynamic.literal()
    if (ClientRootCertificateChain != null) __obj.updateDynamic("ClientRootCertificateChain")(ClientRootCertificateChain)
    __obj.asInstanceOf[CertificateAuthentication]
  }
}

