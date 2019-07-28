package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryConfig extends js.Object {
  /**
    * The time the directory configuration was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typings.awsDashSdk.clientsAppstreamMod.DirectoryName
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ServiceAccountCredentials] = js.undefined
}

object DirectoryConfig {
  @scala.inline
  def apply(
    DirectoryName: DirectoryName,
    CreatedTime: Timestamp = null,
    OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList = null,
    ServiceAccountCredentials: ServiceAccountCredentials = null
  ): DirectoryConfig = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (OrganizationalUnitDistinguishedNames != null) __obj.updateDynamic("OrganizationalUnitDistinguishedNames")(OrganizationalUnitDistinguishedNames)
    if (ServiceAccountCredentials != null) __obj.updateDynamic("ServiceAccountCredentials")(ServiceAccountCredentials)
    __obj.asInstanceOf[DirectoryConfig]
  }
}

