package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectoryConfigRequest extends js.Object {
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typings.awsDashSdk.clientsAppstreamMod.DirectoryName
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: typings.awsDashSdk.clientsAppstreamMod.ServiceAccountCredentials
}

object CreateDirectoryConfigRequest {
  @scala.inline
  def apply(
    DirectoryName: DirectoryName,
    OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList,
    ServiceAccountCredentials: ServiceAccountCredentials
  ): CreateDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName, OrganizationalUnitDistinguishedNames = OrganizationalUnitDistinguishedNames, ServiceAccountCredentials = ServiceAccountCredentials)
  
    __obj.asInstanceOf[CreateDirectoryConfigRequest]
  }
}

