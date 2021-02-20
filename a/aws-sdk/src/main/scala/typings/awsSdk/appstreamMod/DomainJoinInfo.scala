package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainJoinInfo extends StObject {
  
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
  def apply(): DomainJoinInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainJoinInfo]
  }
  
  @scala.inline
  implicit class DomainJoinInfoMutableBuilder[Self <: DomainJoinInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryName(value: DirectoryName): Self = StObject.set(x, "DirectoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryNameUndefined: Self = StObject.set(x, "DirectoryName", js.undefined)
    
    @scala.inline
    def setOrganizationalUnitDistinguishedName(value: OrganizationalUnitDistinguishedName): Self = StObject.set(x, "OrganizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitDistinguishedNameUndefined: Self = StObject.set(x, "OrganizationalUnitDistinguishedName", js.undefined)
  }
}
