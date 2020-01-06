package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HsmClientCertificate extends js.Object {
  /**
    * The identifier of the HSM client certificate.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key in the HSM.
    */
  var HsmClientCertificatePublicKey: js.UndefOr[String] = js.native
  /**
    * The list of tags for the HSM client certificate.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object HsmClientCertificate {
  @scala.inline
  def apply(
    HsmClientCertificateIdentifier: String = null,
    HsmClientCertificatePublicKey: String = null,
    Tags: TagList = null
  ): HsmClientCertificate = {
    val __obj = js.Dynamic.literal()
    if (HsmClientCertificateIdentifier != null) __obj.updateDynamic("HsmClientCertificateIdentifier")(HsmClientCertificateIdentifier.asInstanceOf[js.Any])
    if (HsmClientCertificatePublicKey != null) __obj.updateDynamic("HsmClientCertificatePublicKey")(HsmClientCertificatePublicKey.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HsmClientCertificate]
  }
}

