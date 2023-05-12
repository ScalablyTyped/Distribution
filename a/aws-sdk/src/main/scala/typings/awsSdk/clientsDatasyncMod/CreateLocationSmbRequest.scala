package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationSmbRequest extends StObject {
  
  /**
    * Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify an agent by using its Amazon Resource Name (ARN).
    */
  var AgentArns: AgentArnList
  
  /**
    * Specifies the Windows domain name that your SMB file server belongs to.  For more information, see required permissions for SMB locations.
    */
  var Domain: js.UndefOr[SmbDomain] = js.undefined
  
  /**
    * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
    */
  var MountOptions: js.UndefOr[SmbMountOptions] = js.undefined
  
  /**
    * Specifies the password of the user who can mount your SMB file server and has permission to access the files and folders involved in your transfer. For more information, see required permissions for SMB locations.
    */
  var Password: SmbPassword
  
  /**
    * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your DataSync agent will mount.  You can't specify an IP version 6 (IPv6) address. 
    */
  var ServerHostname: typings.awsSdk.clientsDatasyncMod.ServerHostname
  
  /**
    * Specifies the name of the share exported by your SMB file server where DataSync will read or write data. You can include a subdirectory in the share path (for example, /path/to/subdirectory). Make sure that other SMB clients in your network can also mount this path. To copy all data in the specified subdirectory, DataSync must be able to mount the SMB share and access all of its data. For more information, see required permissions for SMB locations.
    */
  var Subdirectory: SmbSubdirectory
  
  /**
    * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We recommend creating at least a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
  
  /**
    * Specifies the user name that can mount your SMB file server and has permission to access the files and folders involved in your transfer. For information about choosing a user with the right level of access for your transfer, see required permissions for SMB locations.
    */
  var User: SmbUser
}
object CreateLocationSmbRequest {
  
  inline def apply(
    AgentArns: AgentArnList,
    Password: SmbPassword,
    ServerHostname: ServerHostname,
    Subdirectory: SmbSubdirectory,
    User: SmbUser
  ): CreateLocationSmbRequest = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], ServerHostname = ServerHostname.asInstanceOf[js.Any], Subdirectory = Subdirectory.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationSmbRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocationSmbRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setDomain(value: SmbDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setMountOptions(value: SmbMountOptions): Self = StObject.set(x, "MountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsUndefined: Self = StObject.set(x, "MountOptions", js.undefined)
    
    inline def setPassword(value: SmbPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setServerHostname(value: ServerHostname): Self = StObject.set(x, "ServerHostname", value.asInstanceOf[js.Any])
    
    inline def setSubdirectory(value: SmbSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUser(value: SmbUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
