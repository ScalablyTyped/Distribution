package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainJoinInfo extends StObject {
  
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: js.UndefOr[typings.awsSdk.clientsAppstreamMod.DirectoryName] = js.undefined
  
  /**
    * The distinguished name of the organizational unit for computer accounts.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[typings.awsSdk.clientsAppstreamMod.OrganizationalUnitDistinguishedName] = js.undefined
}
object DomainJoinInfo {
  
  inline def apply(): DomainJoinInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainJoinInfo]
  }
  
  extension [Self <: DomainJoinInfo](x: Self) {
    
    inline def setDirectoryName(value: DirectoryName): Self = StObject.set(x, "DirectoryName", value.asInstanceOf[js.Any])
    
    inline def setDirectoryNameUndefined: Self = StObject.set(x, "DirectoryName", js.undefined)
    
    inline def setOrganizationalUnitDistinguishedName(value: OrganizationalUnitDistinguishedName): Self = StObject.set(x, "OrganizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNameUndefined: Self = StObject.set(x, "OrganizationalUnitDistinguishedName", js.undefined)
  }
}
