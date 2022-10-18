package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stack extends StObject {
  
  /**
    * The agent version. This parameter is set to LATEST for auto-update. or a version number for a fixed agent version.
    */
  var AgentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The stack's ARN.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The stack's attributes.
    */
  var Attributes: js.UndefOr[StackAttributes] = js.undefined
  
  /**
    * A ChefConfiguration object that specifies whether to enable Berkshelf and the Berkshelf version. For more information, see Create a New Stack.
    */
  var ChefConfiguration: js.UndefOr[typings.awsSdk.clientsOpsworksMod.ChefConfiguration] = js.undefined
  
  /**
    * The configuration manager.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
  
  /**
    * The date when the stack was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Contains the information required to retrieve an app or cookbook from a repository. For more information, see Adding Apps or Cookbooks and Recipes.
    */
  var CustomCookbooksSource: js.UndefOr[Source] = js.undefined
  
  /**
    * A JSON object that contains user-defined attributes to be added to the stack configuration and deployment attributes. You can use custom JSON to override the corresponding default stack configuration attribute values or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information on custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
    */
  var CustomJson: js.UndefOr[String] = js.undefined
  
  /**
    * The stack's default Availability Zone. For more information, see Regions and Endpoints.
    */
  var DefaultAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined
  
  /**
    * The stack's default operating system.
    */
  var DefaultOs: js.UndefOr[String] = js.undefined
  
  /**
    * The default root device type. This value is used by default for all instances in the stack, but you can override it when you create an instance. For more information, see Storage for the Root Device.
    */
  var DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined
  
  /**
    * A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or update an instance.
    */
  var DefaultSshKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The default subnet ID; applicable only if the stack is running in a VPC.
    */
  var DefaultSubnetId: js.UndefOr[String] = js.undefined
  
  /**
    * The stack host name theme, with spaces replaced by underscores.
    */
  var HostnameTheme: js.UndefOr[String] = js.undefined
  
  /**
    * The stack name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * The stack AWS Identity and Access Management (IAM) role.
    */
  var ServiceRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the stack uses custom cookbooks.
    */
  var UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the stack's layers.
    */
  var UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The VPC ID; applicable only if the stack is running in a VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object Stack {
  
  inline def apply(): Stack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stack]
  }
  
  extension [Self <: Stack](x: Self) {
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "AgentVersion", js.undefined)
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAttributes(value: StackAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setChefConfiguration(value: ChefConfiguration): Self = StObject.set(x, "ChefConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChefConfigurationUndefined: Self = StObject.set(x, "ChefConfiguration", js.undefined)
    
    inline def setConfigurationManager(value: StackConfigurationManager): Self = StObject.set(x, "ConfigurationManager", value.asInstanceOf[js.Any])
    
    inline def setConfigurationManagerUndefined: Self = StObject.set(x, "ConfigurationManager", js.undefined)
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setCustomCookbooksSource(value: Source): Self = StObject.set(x, "CustomCookbooksSource", value.asInstanceOf[js.Any])
    
    inline def setCustomCookbooksSourceUndefined: Self = StObject.set(x, "CustomCookbooksSource", js.undefined)
    
    inline def setCustomJson(value: String): Self = StObject.set(x, "CustomJson", value.asInstanceOf[js.Any])
    
    inline def setCustomJsonUndefined: Self = StObject.set(x, "CustomJson", js.undefined)
    
    inline def setDefaultAvailabilityZone(value: String): Self = StObject.set(x, "DefaultAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setDefaultAvailabilityZoneUndefined: Self = StObject.set(x, "DefaultAvailabilityZone", js.undefined)
    
    inline def setDefaultInstanceProfileArn(value: String): Self = StObject.set(x, "DefaultInstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstanceProfileArnUndefined: Self = StObject.set(x, "DefaultInstanceProfileArn", js.undefined)
    
    inline def setDefaultOs(value: String): Self = StObject.set(x, "DefaultOs", value.asInstanceOf[js.Any])
    
    inline def setDefaultOsUndefined: Self = StObject.set(x, "DefaultOs", js.undefined)
    
    inline def setDefaultRootDeviceType(value: RootDeviceType): Self = StObject.set(x, "DefaultRootDeviceType", value.asInstanceOf[js.Any])
    
    inline def setDefaultRootDeviceTypeUndefined: Self = StObject.set(x, "DefaultRootDeviceType", js.undefined)
    
    inline def setDefaultSshKeyName(value: String): Self = StObject.set(x, "DefaultSshKeyName", value.asInstanceOf[js.Any])
    
    inline def setDefaultSshKeyNameUndefined: Self = StObject.set(x, "DefaultSshKeyName", js.undefined)
    
    inline def setDefaultSubnetId(value: String): Self = StObject.set(x, "DefaultSubnetId", value.asInstanceOf[js.Any])
    
    inline def setDefaultSubnetIdUndefined: Self = StObject.set(x, "DefaultSubnetId", js.undefined)
    
    inline def setHostnameTheme(value: String): Self = StObject.set(x, "HostnameTheme", value.asInstanceOf[js.Any])
    
    inline def setHostnameThemeUndefined: Self = StObject.set(x, "HostnameTheme", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setServiceRoleArn(value: String): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setUseCustomCookbooks(value: Boolean): Self = StObject.set(x, "UseCustomCookbooks", value.asInstanceOf[js.Any])
    
    inline def setUseCustomCookbooksUndefined: Self = StObject.set(x, "UseCustomCookbooks", js.undefined)
    
    inline def setUseOpsworksSecurityGroups(value: Boolean): Self = StObject.set(x, "UseOpsworksSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setUseOpsworksSecurityGroupsUndefined: Self = StObject.set(x, "UseOpsworksSecurityGroups", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
