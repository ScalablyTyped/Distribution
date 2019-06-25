package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelfManagedActiveDirectoryConfiguration extends js.Object {
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file system is being created, or in the private IP version 4 (Iv4) address ranges, as specified in RFC 1918:   10.0.0.0 - 10.255.255.255 (10/8 prefix)   172.16.0.0 - 172.31.255.255 (172.16/12 prefix)   192.168.0.0 - 192.168.255.255 (192.168/16 prefix)  
    */
  var DnsIps: awsDashSdkLib.clientsFsxMod.DnsIps
  /**
    * The fully qualified domain name of the self-managed AD directory, such as corp.example.com.
    */
  var DomainName: ActiveDirectoryFullyQualifiedName
  /**
    * (Optional) The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. If you don't provide one, your AD domain's Domain Admins group is used.
    */
  var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName] = js.undefined
  /**
    * (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. Amazon FSx only accepts OU as the direct parent of the file system. An example is OU=FSx,DC=yourdomain,DC=corp,DC=com. To learn more, see RFC 2253. If none is provided, the FSx file system is created in the default location of your self-managed AD directory.   Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating. 
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName] = js.undefined
  /**
    * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
    */
  var Password: DirectoryPassword
  /**
    * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain. This account must have the permission to join computers to the domain in the organizational unit provided in OrganizationalUnitDistinguishedName, or in the default location of your AD domain.
    */
  var UserName: DirectoryUserName
}

object SelfManagedActiveDirectoryConfiguration {
  @scala.inline
  def apply(
    DnsIps: DnsIps,
    DomainName: ActiveDirectoryFullyQualifiedName,
    Password: DirectoryPassword,
    UserName: DirectoryUserName,
    FileSystemAdministratorsGroup: FileSystemAdministratorsGroupName = null,
    OrganizationalUnitDistinguishedName: OrganizationalUnitDistinguishedName = null
  ): SelfManagedActiveDirectoryConfiguration = {
    val __obj = js.Dynamic.literal(DnsIps = DnsIps, DomainName = DomainName, Password = Password, UserName = UserName)
    if (FileSystemAdministratorsGroup != null) __obj.updateDynamic("FileSystemAdministratorsGroup")(FileSystemAdministratorsGroup)
    if (OrganizationalUnitDistinguishedName != null) __obj.updateDynamic("OrganizationalUnitDistinguishedName")(OrganizationalUnitDistinguishedName)
    __obj.asInstanceOf[SelfManagedActiveDirectoryConfiguration]
  }
}

