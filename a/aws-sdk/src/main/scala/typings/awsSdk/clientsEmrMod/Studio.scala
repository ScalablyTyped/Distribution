package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Studio extends StObject {
  
  /**
    * Specifies whether the Amazon EMR Studio authenticates users with IAM or IAM Identity Center.
    */
  var AuthMode: js.UndefOr[typings.awsSdk.clientsEmrMod.AuthMode] = js.undefined
  
  /**
    * The time the Amazon EMR Studio was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
    */
  var DefaultS3Location: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The detailed description of the Amazon EMR Studio.
    */
  var Description: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The ID of the Engine security group associated with the Amazon EMR Studio. The Engine security group allows inbound network traffic from resources in the Workspace security group.
    */
  var EngineSecurityGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Your identity provider's authentication endpoint. Amazon EMR Studio redirects federated users to this endpoint for authentication when logging in to a Studio with the Studio URL.
    */
  var IdpAuthUrl: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The name of your identity provider's RelayState parameter.
    */
  var IdpRelayStateParameterName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The name of the Amazon EMR Studio.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The name of the IAM role assumed by the Amazon EMR Studio.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EMR Studio.
    */
  var StudioArn: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The ID of the Amazon EMR Studio.
    */
  var StudioId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The list of IDs of the subnets associated with the Amazon EMR Studio.
    */
  var SubnetIds: js.UndefOr[SubnetIdList] = js.undefined
  
  /**
    * A list of tags associated with the Amazon EMR Studio.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The unique access URL of the Amazon EMR Studio.
    */
  var Url: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The name of the IAM role assumed by users logged in to the Amazon EMR Studio. A Studio only requires a UserRole when you use IAM authentication.
    */
  var UserRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The ID of the VPC associated with the Amazon EMR Studio.
    */
  var VpcId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The ID of the Workspace security group associated with the Amazon EMR Studio. The Workspace security group allows outbound network traffic to resources in the Engine security group and to the internet.
    */
  var WorkspaceSecurityGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
}
object Studio {
  
  inline def apply(): Studio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Studio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Studio] (val x: Self) extends AnyVal {
    
    inline def setAuthMode(value: AuthMode): Self = StObject.set(x, "AuthMode", value.asInstanceOf[js.Any])
    
    inline def setAuthModeUndefined: Self = StObject.set(x, "AuthMode", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDefaultS3Location(value: XmlString): Self = StObject.set(x, "DefaultS3Location", value.asInstanceOf[js.Any])
    
    inline def setDefaultS3LocationUndefined: Self = StObject.set(x, "DefaultS3Location", js.undefined)
    
    inline def setDescription(value: XmlStringMaxLen256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngineSecurityGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "EngineSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setEngineSecurityGroupIdUndefined: Self = StObject.set(x, "EngineSecurityGroupId", js.undefined)
    
    inline def setIdpAuthUrl(value: XmlString): Self = StObject.set(x, "IdpAuthUrl", value.asInstanceOf[js.Any])
    
    inline def setIdpAuthUrlUndefined: Self = StObject.set(x, "IdpAuthUrl", js.undefined)
    
    inline def setIdpRelayStateParameterName(value: XmlStringMaxLen256): Self = StObject.set(x, "IdpRelayStateParameterName", value.asInstanceOf[js.Any])
    
    inline def setIdpRelayStateParameterNameUndefined: Self = StObject.set(x, "IdpRelayStateParameterName", js.undefined)
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setServiceRole(value: XmlString): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    inline def setStudioArn(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioArn", value.asInstanceOf[js.Any])
    
    inline def setStudioArnUndefined: Self = StObject.set(x, "StudioArn", js.undefined)
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
    
    inline def setStudioIdUndefined: Self = StObject.set(x, "StudioId", js.undefined)
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUrl(value: XmlString): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setUserRole(value: XmlString): Self = StObject.set(x, "UserRole", value.asInstanceOf[js.Any])
    
    inline def setUserRoleUndefined: Self = StObject.set(x, "UserRole", js.undefined)
    
    inline def setVpcId(value: XmlStringMaxLen256): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setWorkspaceSecurityGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "WorkspaceSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceSecurityGroupIdUndefined: Self = StObject.set(x, "WorkspaceSecurityGroupId", js.undefined)
  }
}
