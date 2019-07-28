package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterCACertificateRequest extends js.Object {
  /**
    * Allows this CA certificate to be used for auto registration of device certificates.
    */
  var allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.undefined
  /**
    * The CA certificate.
    */
  var caCertificate: CertificatePem
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
  /**
    * A boolean value that specifies if the CA certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.undefined
  /**
    * The private key verification certificate.
    */
  var verificationCertificate: CertificatePem
}

object RegisterCACertificateRequest {
  @scala.inline
  def apply(
    caCertificate: CertificatePem,
    verificationCertificate: CertificatePem,
    allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.undefined,
    registrationConfig: RegistrationConfig = null,
    setAsActive: js.UndefOr[SetAsActive] = js.undefined
  ): RegisterCACertificateRequest = {
    val __obj = js.Dynamic.literal(caCertificate = caCertificate, verificationCertificate = verificationCertificate)
    if (!js.isUndefined(allowAutoRegistration)) __obj.updateDynamic("allowAutoRegistration")(allowAutoRegistration)
    if (registrationConfig != null) __obj.updateDynamic("registrationConfig")(registrationConfig)
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive)
    __obj.asInstanceOf[RegisterCACertificateRequest]
  }
}

