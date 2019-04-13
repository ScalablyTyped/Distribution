package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCACertificateRequest extends js.Object {
  /**
    * The CA certificate identifier.
    */
  var certificateId: CertificateId
  /**
    * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
    */
  var newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined
  /**
    * The updated status of the CA certificate.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var newStatus: js.UndefOr[CACertificateStatus] = js.undefined
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
  /**
    * If true, remove auto registration.
    */
  var removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.undefined
}

object UpdateCACertificateRequest {
  @scala.inline
  def apply(
    certificateId: CertificateId,
    newAutoRegistrationStatus: AutoRegistrationStatus = null,
    newStatus: CACertificateStatus = null,
    registrationConfig: RegistrationConfig = null,
    removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.undefined
  ): UpdateCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId)
    if (newAutoRegistrationStatus != null) __obj.updateDynamic("newAutoRegistrationStatus")(newAutoRegistrationStatus.asInstanceOf[js.Any])
    if (newStatus != null) __obj.updateDynamic("newStatus")(newStatus.asInstanceOf[js.Any])
    if (registrationConfig != null) __obj.updateDynamic("registrationConfig")(registrationConfig)
    if (!js.isUndefined(removeAutoRegistration)) __obj.updateDynamic("removeAutoRegistration")(removeAutoRegistration)
    __obj.asInstanceOf[UpdateCACertificateRequest]
  }
}

