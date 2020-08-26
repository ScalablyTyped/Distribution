package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryConfigRequest extends js.Object {
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typings.awsSdk.appstreamMod.DirectoryName = js.native
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList = js.native
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: typings.awsSdk.appstreamMod.ServiceAccountCredentials = js.native
}

object CreateDirectoryConfigRequest {
  @scala.inline
  def apply(
    DirectoryName: DirectoryName,
    OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList,
    ServiceAccountCredentials: ServiceAccountCredentials
  ): CreateDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any], OrganizationalUnitDistinguishedNames = OrganizationalUnitDistinguishedNames.asInstanceOf[js.Any], ServiceAccountCredentials = ServiceAccountCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryConfigRequest]
  }
  @scala.inline
  implicit class CreateDirectoryConfigRequestOps[Self <: CreateDirectoryConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectoryName(value: DirectoryName): Self = this.set("DirectoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationalUnitDistinguishedNamesVarargs(value: OrganizationalUnitDistinguishedName*): Self = this.set("OrganizationalUnitDistinguishedNames", js.Array(value :_*))
    @scala.inline
    def setOrganizationalUnitDistinguishedNames(value: OrganizationalUnitDistinguishedNamesList): Self = this.set("OrganizationalUnitDistinguishedNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceAccountCredentials(value: ServiceAccountCredentials): Self = this.set("ServiceAccountCredentials", value.asInstanceOf[js.Any])
  }
  
}

