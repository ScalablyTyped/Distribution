package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainJoinInfo extends js.Object {
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DirectoryName] = js.undefined
  /**
    * The distinguished name of the organizational unit for computer accounts.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.OrganizationalUnitDistinguishedName] = js.undefined
}

object DomainJoinInfo {
  @scala.inline
  def apply(
    DirectoryName: DirectoryName = null,
    OrganizationalUnitDistinguishedName: OrganizationalUnitDistinguishedName = null
  ): DomainJoinInfo = {
    val __obj = js.Dynamic.literal()
    if (DirectoryName != null) __obj.updateDynamic("DirectoryName")(DirectoryName)
    if (OrganizationalUnitDistinguishedName != null) __obj.updateDynamic("OrganizationalUnitDistinguishedName")(OrganizationalUnitDistinguishedName)
    __obj.asInstanceOf[DomainJoinInfo]
  }
}

