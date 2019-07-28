package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientVpnAuthenticationRequest extends js.Object {
  /**
    * Information about the Active Directory to be used, if applicable. You must provide this information if Type is directory-service-authentication.
    */
  var ActiveDirectory: js.UndefOr[DirectoryServiceAuthenticationRequest] = js.undefined
  /**
    * Information about the authentication certificates to be used, if applicable. You must provide this information if Type is certificate-authentication.
    */
  var MutualAuthentication: js.UndefOr[CertificateAuthenticationRequest] = js.undefined
  /**
    * The type of client authentication to be used. Specify certificate-authentication to use certificate-based authentication, or directory-service-authentication to use Active Directory authentication.
    */
  var Type: js.UndefOr[ClientVpnAuthenticationType] = js.undefined
}

object ClientVpnAuthenticationRequest {
  @scala.inline
  def apply(
    ActiveDirectory: DirectoryServiceAuthenticationRequest = null,
    MutualAuthentication: CertificateAuthenticationRequest = null,
    Type: ClientVpnAuthenticationType = null
  ): ClientVpnAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    if (ActiveDirectory != null) __obj.updateDynamic("ActiveDirectory")(ActiveDirectory)
    if (MutualAuthentication != null) __obj.updateDynamic("MutualAuthentication")(MutualAuthentication)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientVpnAuthenticationRequest]
  }
}

