package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningClaimResponse extends js.Object {
  /**
    * The ID of the certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The provisioning claim certificate.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The provisioning claim expiration time.
    */
  var expiration: js.UndefOr[DateType] = js.native
  /**
    * The provisioning claim key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
}

object CreateProvisioningClaimResponse {
  @scala.inline
  def apply(
    certificateId: CertificateId = null,
    certificatePem: CertificatePem = null,
    expiration: DateType = null,
    keyPair: KeyPair = null
  ): CreateProvisioningClaimResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (keyPair != null) __obj.updateDynamic("keyPair")(keyPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningClaimResponse]
  }
}

