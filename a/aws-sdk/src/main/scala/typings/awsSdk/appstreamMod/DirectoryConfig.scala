package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryConfig extends StObject {
  
  /**
    * The time the directory configuration was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typings.awsSdk.appstreamMod.DirectoryName
  
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined
  
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[typings.awsSdk.appstreamMod.ServiceAccountCredentials] = js.undefined
}
object DirectoryConfig {
  
  @scala.inline
  def apply(DirectoryName: DirectoryName): DirectoryConfig = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConfig]
  }
  
  @scala.inline
  implicit class DirectoryConfigMutableBuilder[Self <: DirectoryConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDirectoryName(value: DirectoryName): Self = StObject.set(x, "DirectoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitDistinguishedNames(value: OrganizationalUnitDistinguishedNamesList): Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitDistinguishedNamesUndefined: Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", js.undefined)
    
    @scala.inline
    def setOrganizationalUnitDistinguishedNamesVarargs(value: OrganizationalUnitDistinguishedName*): Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", js.Array(value :_*))
    
    @scala.inline
    def setServiceAccountCredentials(value: ServiceAccountCredentials): Self = StObject.set(x, "ServiceAccountCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountCredentialsUndefined: Self = StObject.set(x, "ServiceAccountCredentials", js.undefined)
  }
}
