package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStudioInput extends StObject {
  
  /**
    * Specifies whether the Studio authenticates users using IAM or Amazon Web Services SSO.
    */
  var AuthMode: typings.awsSdk.clientsEmrMod.AuthMode
  
  /**
    * The Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
    */
  var DefaultS3Location: XmlString
  
  /**
    * A detailed description of the Amazon EMR Studio.
    */
  var Description: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic from the Workspace security group, and it must be in the same VPC specified by VpcId.
    */
  var EngineSecurityGroupId: XmlStringMaxLen256
  
  /**
    * The authentication endpoint of your identity provider (IdP). Specify this value when you use IAM authentication and want to let federated users log in to a Studio with the Studio URL and credentials from your IdP. Amazon EMR Studio redirects users to this endpoint to enter credentials.
    */
  var IdpAuthUrl: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The name that your identity provider (IdP) uses for its RelayState parameter. For example, RelayState or TargetSource. Specify this value when you use IAM authentication and want to let federated users log in to a Studio using the Studio URL. The RelayState parameter differs by IdP.
    */
  var IdpRelayStateParameterName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * A descriptive name for the Amazon EMR Studio.
    */
  var Name: XmlStringMaxLen256
  
  /**
    * The IAM role that the Amazon EMR Studio assumes. The service role provides a way for Amazon EMR Studio to interoperate with other Amazon Web Services services.
    */
  var ServiceRole: XmlString
  
  /**
    * A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by VpcId. Studio users can create a Workspace in any of the specified subnets.
    */
  var SubnetIds: SubnetIdList
  
  /**
    * A list of tags to associate with the Amazon EMR Studio. Tags are user-defined key-value pairs that consist of a required key string with a maximum of 128 characters, and an optional value string with a maximum of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The IAM user role that users and groups assume when logged in to an Amazon EMR Studio. Only specify a UserRole when you use Amazon Web Services SSO authentication. The permissions attached to the UserRole can be scoped down for each user or group using session policies.
    */
  var UserRole: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
    */
  var VpcId: XmlStringMaxLen256
  
  /**
    * The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network traffic to resources in the Engine security group, and it must be in the same VPC specified by VpcId.
    */
  var WorkspaceSecurityGroupId: XmlStringMaxLen256
}
object CreateStudioInput {
  
  inline def apply(
    AuthMode: AuthMode,
    DefaultS3Location: XmlString,
    EngineSecurityGroupId: XmlStringMaxLen256,
    Name: XmlStringMaxLen256,
    ServiceRole: XmlString,
    SubnetIds: SubnetIdList,
    VpcId: XmlStringMaxLen256,
    WorkspaceSecurityGroupId: XmlStringMaxLen256
  ): CreateStudioInput = {
    val __obj = js.Dynamic.literal(AuthMode = AuthMode.asInstanceOf[js.Any], DefaultS3Location = DefaultS3Location.asInstanceOf[js.Any], EngineSecurityGroupId = EngineSecurityGroupId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ServiceRole = ServiceRole.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any], WorkspaceSecurityGroupId = WorkspaceSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStudioInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStudioInput] (val x: Self) extends AnyVal {
    
    inline def setAuthMode(value: AuthMode): Self = StObject.set(x, "AuthMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultS3Location(value: XmlString): Self = StObject.set(x, "DefaultS3Location", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: XmlStringMaxLen256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngineSecurityGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "EngineSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setIdpAuthUrl(value: XmlString): Self = StObject.set(x, "IdpAuthUrl", value.asInstanceOf[js.Any])
    
    inline def setIdpAuthUrlUndefined: Self = StObject.set(x, "IdpAuthUrl", js.undefined)
    
    inline def setIdpRelayStateParameterName(value: XmlStringMaxLen256): Self = StObject.set(x, "IdpRelayStateParameterName", value.asInstanceOf[js.Any])
    
    inline def setIdpRelayStateParameterNameUndefined: Self = StObject.set(x, "IdpRelayStateParameterName", js.undefined)
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setServiceRole(value: XmlString): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserRole(value: XmlString): Self = StObject.set(x, "UserRole", value.asInstanceOf[js.Any])
    
    inline def setUserRoleUndefined: Self = StObject.set(x, "UserRole", js.undefined)
    
    inline def setVpcId(value: XmlStringMaxLen256): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceSecurityGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "WorkspaceSecurityGroupId", value.asInstanceOf[js.Any])
  }
}
