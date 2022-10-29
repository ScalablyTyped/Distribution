package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectoryConfigRequest extends StObject {
  
  /**
    * The certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider (IdP) user identities to Active Directory domain-joined streaming instances. Fallback is turned on by default when certificate-based authentication is Enabled . Fallback allows users to log in using their AD domain password if certificate-based authentication is unsuccessful, or to unlock a desktop lock screen. Enabled_no_directory_login_fallback enables certificate-based authentication, but does not allow users to log in using their AD domain password. Users will be disconnected to re-authenticate using certificates.
    */
  var CertificateBasedAuthProperties: js.UndefOr[typings.awsSdk.clientsAppstreamMod.CertificateBasedAuthProperties] = js.undefined
  
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typings.awsSdk.clientsAppstreamMod.DirectoryName
  
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
  
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ServiceAccountCredentials] = js.undefined
}
object CreateDirectoryConfigRequest {
  
  inline def apply(
    DirectoryName: DirectoryName,
    OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
  ): CreateDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any], OrganizationalUnitDistinguishedNames = OrganizationalUnitDistinguishedNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryConfigRequest]
  }
  
  extension [Self <: CreateDirectoryConfigRequest](x: Self) {
    
    inline def setCertificateBasedAuthProperties(value: CertificateBasedAuthProperties): Self = StObject.set(x, "CertificateBasedAuthProperties", value.asInstanceOf[js.Any])
    
    inline def setCertificateBasedAuthPropertiesUndefined: Self = StObject.set(x, "CertificateBasedAuthProperties", js.undefined)
    
    inline def setDirectoryName(value: DirectoryName): Self = StObject.set(x, "DirectoryName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNames(value: OrganizationalUnitDistinguishedNamesList): Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNamesVarargs(value: OrganizationalUnitDistinguishedName*): Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", js.Array(value*))
    
    inline def setServiceAccountCredentials(value: ServiceAccountCredentials): Self = StObject.set(x, "ServiceAccountCredentials", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountCredentialsUndefined: Self = StObject.set(x, "ServiceAccountCredentials", js.undefined)
  }
}
