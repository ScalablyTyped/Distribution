package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryConfig extends js.Object {
  /**
    * The time the directory configuration was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typings.awsSdk.appstreamMod.DirectoryName = js.native
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.native
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[typings.awsSdk.appstreamMod.ServiceAccountCredentials] = js.native
}

object DirectoryConfig {
  @scala.inline
  def apply(
    DirectoryName: DirectoryName,
    CreatedTime: Timestamp = null,
    OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList = null,
    ServiceAccountCredentials: ServiceAccountCredentials = null
  ): DirectoryConfig = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (OrganizationalUnitDistinguishedNames != null) __obj.updateDynamic("OrganizationalUnitDistinguishedNames")(OrganizationalUnitDistinguishedNames.asInstanceOf[js.Any])
    if (ServiceAccountCredentials != null) __obj.updateDynamic("ServiceAccountCredentials")(ServiceAccountCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConfig]
  }
}

