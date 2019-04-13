package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDirectoryConfigRequest extends js.Object {
  /**
    * The name of the Directory Config object.
    */
  var DirectoryName: awsDashSdkLib.clientsAppstreamMod.DirectoryName
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined
  /**
    * The credentials for the service account used by the streaming instance to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined
}

object UpdateDirectoryConfigRequest {
  @scala.inline
  def apply(
    DirectoryName: DirectoryName,
    OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList = null,
    ServiceAccountCredentials: ServiceAccountCredentials = null
  ): UpdateDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName)
    if (OrganizationalUnitDistinguishedNames != null) __obj.updateDynamic("OrganizationalUnitDistinguishedNames")(OrganizationalUnitDistinguishedNames)
    if (ServiceAccountCredentials != null) __obj.updateDynamic("ServiceAccountCredentials")(ServiceAccountCredentials)
    __obj.asInstanceOf[UpdateDirectoryConfigRequest]
  }
}

