package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelfManagedActiveDirectoryConfigurationUpdates extends js.Object {
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
    */
  var DnsIps: js.UndefOr[typings.awsDashSdk.clientsFsxMod.DnsIps] = js.undefined
  /**
    * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
    */
  var Password: js.UndefOr[DirectoryPassword] = js.undefined
  /**
    * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain. This account must have the permission to join computers to the domain in the organizational unit provided in OrganizationalUnitDistinguishedName.
    */
  var UserName: js.UndefOr[DirectoryUserName] = js.undefined
}

object SelfManagedActiveDirectoryConfigurationUpdates {
  @scala.inline
  def apply(DnsIps: DnsIps = null, Password: DirectoryPassword = null, UserName: DirectoryUserName = null): SelfManagedActiveDirectoryConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    if (DnsIps != null) __obj.updateDynamic("DnsIps")(DnsIps)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[SelfManagedActiveDirectoryConfigurationUpdates]
  }
}

