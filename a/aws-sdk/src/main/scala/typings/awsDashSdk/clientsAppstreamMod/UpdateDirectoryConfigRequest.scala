package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectoryConfigRequest extends js.Object {
  /**
    * The name of the Directory Config object.
    */
  var DirectoryName: typings.awsDashSdk.clientsAppstreamMod.DirectoryName = js.native
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.native
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ServiceAccountCredentials] = js.native
}

object UpdateDirectoryConfigRequest {
  @scala.inline
  def apply(
    DirectoryName: DirectoryName,
    OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList = null,
    ServiceAccountCredentials: ServiceAccountCredentials = null
  ): UpdateDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    if (OrganizationalUnitDistinguishedNames != null) __obj.updateDynamic("OrganizationalUnitDistinguishedNames")(OrganizationalUnitDistinguishedNames.asInstanceOf[js.Any])
    if (ServiceAccountCredentials != null) __obj.updateDynamic("ServiceAccountCredentials")(ServiceAccountCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDirectoryConfigRequest]
  }
}

