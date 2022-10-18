package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryConfig extends StObject {
  
  /**
    * The time the directory configuration was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typings.awsSdk.clientsAppstreamMod.DirectoryName
  
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined
  
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ServiceAccountCredentials] = js.undefined
}
object DirectoryConfig {
  
  inline def apply(DirectoryName: DirectoryName): DirectoryConfig = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConfig]
  }
  
  extension [Self <: DirectoryConfig](x: Self) {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDirectoryName(value: DirectoryName): Self = StObject.set(x, "DirectoryName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNames(value: OrganizationalUnitDistinguishedNamesList): Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNamesUndefined: Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", js.undefined)
    
    inline def setOrganizationalUnitDistinguishedNamesVarargs(value: OrganizationalUnitDistinguishedName*): Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", js.Array(value*))
    
    inline def setServiceAccountCredentials(value: ServiceAccountCredentials): Self = StObject.set(x, "ServiceAccountCredentials", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountCredentialsUndefined: Self = StObject.set(x, "ServiceAccountCredentials", js.undefined)
  }
}
