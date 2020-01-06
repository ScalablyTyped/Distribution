package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCACertificateRequest extends js.Object {
  /**
    * Allows this CA certificate to be used for auto registration of device certificates.
    */
  var allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.native
  /**
    * The CA certificate.
    */
  var caCertificate: CertificatePem = js.native
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.native
  /**
    * A boolean value that specifies if the CA certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
  /**
    * The private key verification certificate.
    */
  var verificationCertificate: CertificatePem = js.native
}

object RegisterCACertificateRequest {
  @scala.inline
  def apply(
    caCertificate: CertificatePem,
    verificationCertificate: CertificatePem,
    allowAutoRegistration: js.UndefOr[scala.Boolean] = js.undefined,
    registrationConfig: RegistrationConfig = null,
    setAsActive: js.UndefOr[scala.Boolean] = js.undefined
  ): RegisterCACertificateRequest = {
    val __obj = js.Dynamic.literal(caCertificate = caCertificate.asInstanceOf[js.Any], verificationCertificate = verificationCertificate.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAutoRegistration)) __obj.updateDynamic("allowAutoRegistration")(allowAutoRegistration.asInstanceOf[js.Any])
    if (registrationConfig != null) __obj.updateDynamic("registrationConfig")(registrationConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCACertificateRequest]
  }
}

