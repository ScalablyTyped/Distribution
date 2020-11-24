package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryConfig extends js.Object {
  
  /**
    * The time the directory configuration was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typings.awsSdk.appstreamMod.DirectoryName = js.native
  
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.native
  
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[typings.awsSdk.appstreamMod.ServiceAccountCredentials] = js.native
}
object DirectoryConfig {
  
  @scala.inline
  def apply(DirectoryName: DirectoryName): DirectoryConfig = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConfig]
  }
  
  @scala.inline
  implicit class DirectoryConfigOps[Self <: DirectoryConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectoryName(value: DirectoryName): Self = this.set("DirectoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setOrganizationalUnitDistinguishedNamesVarargs(value: OrganizationalUnitDistinguishedName*): Self = this.set("OrganizationalUnitDistinguishedNames", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationalUnitDistinguishedNames(value: OrganizationalUnitDistinguishedNamesList): Self = this.set("OrganizationalUnitDistinguishedNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnitDistinguishedNames: Self = this.set("OrganizationalUnitDistinguishedNames", js.undefined)
    
    @scala.inline
    def setServiceAccountCredentials(value: ServiceAccountCredentials): Self = this.set("ServiceAccountCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountCredentials: Self = this.set("ServiceAccountCredentials", js.undefined)
  }
}
