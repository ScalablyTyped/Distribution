package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectoryConfigRequest extends js.Object {
  /**
    * The name of the Directory Config object.
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

object UpdateDirectoryConfigRequest {
  @scala.inline
  def apply(DirectoryName: DirectoryName): UpdateDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDirectoryConfigRequest]
  }
  @scala.inline
  implicit class UpdateDirectoryConfigRequestOps[Self <: UpdateDirectoryConfigRequest] (val x: Self) extends AnyVal {
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
    def deleteOrganizationalUnitDistinguishedNames: Self = this.set("OrganizationalUnitDistinguishedNames", js.undefined)
    @scala.inline
    def setServiceAccountCredentials(value: ServiceAccountCredentials): Self = this.set("ServiceAccountCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccountCredentials: Self = this.set("ServiceAccountCredentials", js.undefined)
  }
  
}

