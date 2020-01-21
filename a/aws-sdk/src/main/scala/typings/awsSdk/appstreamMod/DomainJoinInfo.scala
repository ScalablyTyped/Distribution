package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainJoinInfo extends js.Object {
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: js.UndefOr[typings.awsSdk.appstreamMod.DirectoryName] = js.native
  /**
    * The distinguished name of the organizational unit for computer accounts.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[typings.awsSdk.appstreamMod.OrganizationalUnitDistinguishedName] = js.native
}

object DomainJoinInfo {
  @scala.inline
  def apply(
    DirectoryName: DirectoryName = null,
    OrganizationalUnitDistinguishedName: OrganizationalUnitDistinguishedName = null
  ): DomainJoinInfo = {
    val __obj = js.Dynamic.literal()
    if (DirectoryName != null) __obj.updateDynamic("DirectoryName")(DirectoryName.asInstanceOf[js.Any])
    if (OrganizationalUnitDistinguishedName != null) __obj.updateDynamic("OrganizationalUnitDistinguishedName")(OrganizationalUnitDistinguishedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainJoinInfo]
  }
}

