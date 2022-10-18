package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfManagedActiveDirectoryConfiguration extends StObject {
  
  /**
    * A list of up to three IP addresses of DNS servers or domain controllers in the self-managed AD directory. 
    */
  var DnsIps: typings.awsSdk.clientsFsxMod.DnsIps
  
  /**
    * The fully qualified domain name of the self-managed AD directory, such as corp.example.com.
    */
  var DomainName: ActiveDirectoryFullyQualifiedName
  
  /**
    * (Optional) The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, setting audit controls (audit ACLs) on files and folders, and administering the file system remotely by using the FSx Remote PowerShell. The group that you specify must already exist in your domain. If you don't provide one, your AD domain's Domain Admins group is used.
    */
  var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName] = js.undefined
  
  /**
    * (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD directory. Amazon FSx only accepts OU as the direct parent of the file system. An example is OU=FSx,DC=yourdomain,DC=corp,DC=com. To learn more, see RFC 2253. If none is provided, the FSx file system is created in the default location of your self-managed AD directory.   Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating. 
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[typings.awsSdk.clientsFsxMod.OrganizationalUnitDistinguishedName] = js.undefined
  
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
  
  inline def apply(
    DnsIps: DnsIps,
    DomainName: ActiveDirectoryFullyQualifiedName,
    Password: DirectoryPassword,
    UserName: DirectoryUserName
  ): SelfManagedActiveDirectoryConfiguration = {
    val __obj = js.Dynamic.literal(DnsIps = DnsIps.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfManagedActiveDirectoryConfiguration]
  }
  
  extension [Self <: SelfManagedActiveDirectoryConfiguration](x: Self) {
    
    inline def setDnsIps(value: DnsIps): Self = StObject.set(x, "DnsIps", value.asInstanceOf[js.Any])
    
    inline def setDnsIpsVarargs(value: IpAddress*): Self = StObject.set(x, "DnsIps", js.Array(value*))
    
    inline def setDomainName(value: ActiveDirectoryFullyQualifiedName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAdministratorsGroup(value: FileSystemAdministratorsGroupName): Self = StObject.set(x, "FileSystemAdministratorsGroup", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAdministratorsGroupUndefined: Self = StObject.set(x, "FileSystemAdministratorsGroup", js.undefined)
    
    inline def setOrganizationalUnitDistinguishedName(value: OrganizationalUnitDistinguishedName): Self = StObject.set(x, "OrganizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNameUndefined: Self = StObject.set(x, "OrganizationalUnitDistinguishedName", js.undefined)
    
    inline def setPassword(value: DirectoryPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: DirectoryUserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
