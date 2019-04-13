package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HsmClientCertificate extends js.Object {
  /**
    * The identifier of the HSM client certificate.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key in the HSM.
    */
  var HsmClientCertificatePublicKey: js.UndefOr[String] = js.undefined
  /**
    * The list of tags for the HSM client certificate.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object HsmClientCertificate {
  @scala.inline
  def apply(
    HsmClientCertificateIdentifier: String = null,
    HsmClientCertificatePublicKey: String = null,
    Tags: TagList = null
  ): HsmClientCertificate = {
    val __obj = js.Dynamic.literal()
    if (HsmClientCertificateIdentifier != null) __obj.updateDynamic("HsmClientCertificateIdentifier")(HsmClientCertificateIdentifier)
    if (HsmClientCertificatePublicKey != null) __obj.updateDynamic("HsmClientCertificatePublicKey")(HsmClientCertificatePublicKey)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[HsmClientCertificate]
  }
}

