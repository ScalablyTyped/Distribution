package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnAuthentication extends js.Object {
  /**
    * Information about the Active Directory, if applicable.
    */
  var ActiveDirectory: js.UndefOr[DirectoryServiceAuthentication] = js.native
  /**
    * Information about the authentication certificates, if applicable.
    */
  var MutualAuthentication: js.UndefOr[CertificateAuthentication] = js.native
  /**
    * The authentication type used.
    */
  var Type: js.UndefOr[ClientVpnAuthenticationType] = js.native
}

object ClientVpnAuthentication {
  @scala.inline
  def apply(
    ActiveDirectory: DirectoryServiceAuthentication = null,
    MutualAuthentication: CertificateAuthentication = null,
    Type: ClientVpnAuthenticationType = null
  ): ClientVpnAuthentication = {
    val __obj = js.Dynamic.literal()
    if (ActiveDirectory != null) __obj.updateDynamic("ActiveDirectory")(ActiveDirectory.asInstanceOf[js.Any])
    if (MutualAuthentication != null) __obj.updateDynamic("MutualAuthentication")(MutualAuthentication.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientVpnAuthentication]
  }
}

