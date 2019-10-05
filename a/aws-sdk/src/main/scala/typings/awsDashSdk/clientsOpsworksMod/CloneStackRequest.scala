package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneStackRequest extends js.Object {
  /**
    * The default AWS OpsWorks Stacks agent version. You have the following options:   Auto-update - Set this parameter to LATEST. AWS OpsWorks Stacks automatically installs new agent versions on the stack's instances as soon as they are available.   Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the stack's instances.   The default setting is LATEST. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.  You can also specify an agent version when you create or update an instance, which overrides the stack's default setting. 
    */
  var AgentVersion: js.UndefOr[String] = js.undefined
  /**
    * A list of stack attributes and values as key/value pairs to be added to the cloned stack.
    */
  var Attributes: js.UndefOr[StackAttributes] = js.undefined
  /**
    * A ChefConfiguration object that specifies whether to enable Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see Create a New Stack.
    */
  var ChefConfiguration: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.ChefConfiguration] = js.undefined
  /**
    * A list of source stack app IDs to be included in the cloned stack.
    */
  var CloneAppIds: js.UndefOr[Strings] = js.undefined
  /**
    * Whether to clone the source stack's permissions.
    */
  var ClonePermissions: js.UndefOr[Boolean] = js.undefined
  /**
    * The configuration manager. When you clone a stack we recommend that you use the configuration manager to specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux stacks is currently 12.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
  /**
    * Contains the information required to retrieve an app or cookbook from a repository. For more information, see Adding Apps or Cookbooks and Recipes.
    */
  var CustomCookbooksSource: js.UndefOr[Source] = js.undefined
  /**
    * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack configuration JSON values. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes 
    */
  var CustomJson: js.UndefOr[String] = js.undefined
  /**
    * The cloned stack's default Availability Zone, which must be in the specified region. For more information, see Regions and Endpoints. If you also specify a value for DefaultSubnetId, the subnet must be in the same zone. For more information, see the VpcId parameter description. 
    */
  var DefaultAvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var DefaultInstanceProfileArn: js.UndefOr[String] = js.undefined
  /**
    * The stack's operating system, which must be set to one of the following.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2018.03, Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7     Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   A custom AMI: Custom. You specify the custom AMI you want to use when you create instances. For more information about how to use custom AMIs with OpsWorks, see Using Custom AMIs.   The default option is the parent stack's operating system. For more information about supported operating systems, see AWS OpsWorks Stacks Operating Systems.  You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux to Windows or Windows to Linux. 
    */
  var DefaultOs: js.UndefOr[String] = js.undefined
  /**
    * The default root device type. This value is used by default for all instances in the cloned stack, but you can override it when you create an instance. For more information, see Storage for the Root Device.
    */
  var DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.undefined
  /**
    * A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS OpsWorks installs the public key on the instance and you can use the private key with an SSH client to log in to the instance. For more information, see  Using SSH to Communicate with an Instance and  Managing SSH Access. You can override this setting by specifying a different key pair, or no key pair, when you  create an instance. 
    */
  var DefaultSshKeyName: js.UndefOr[String] = js.undefined
  /**
    * The stack's default VPC subnet ID. This parameter is required if you specify a value for the VpcId parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance. If you also specify a value for DefaultAvailabilityZone, the subnet must be in that zone. For information on default values and when this parameter is required, see the VpcId parameter description. 
    */
  var DefaultSubnetId: js.UndefOr[String] = js.undefined
  /**
    * The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host names for the stack's instances. By default, HostnameTheme is set to Layer_Dependent, which creates host names by appending integers to the layer's short name. The other themes are:    Baked_Goods     Clouds     Europe_Cities     Fruits     Greek_Deities_and_Titans     Legendary_creatures_from_Japan     Planets_and_Moons     Roman_Deities     Scottish_Islands     US_Cities     Wild_Cats    To obtain a generated host name, call GetHostNameSuggestion, which returns a host name based on the current theme.
    */
  var HostnameTheme: js.UndefOr[String] = js.undefined
  /**
    * The cloned stack name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.undefined
  /**
    * The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks Stacks to work with AWS resources on your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. If you create a stack by using the AWS OpsWorks Stacks console, it creates the role for you. You can obtain an existing stack's IAM ARN programmatically by calling DescribePermissions. For more information about IAM ARNs, see Using Identifiers.  You must set this parameter to a valid service role ARN or the action will fail; there is no default value. You can specify the source stack's service role ARN, if you prefer, but you must do so explicitly. 
    */
  var ServiceRoleArn: String
  /**
    * The source stack ID.
    */
  var SourceStackId: String
  /**
    * Whether to use custom cookbooks.
    */
  var UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers. AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated with layers by default. With UseOpsworksSecurityGroups you can instead provide your own custom security groups. UseOpsworksSecurityGroups has the following settings:    True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer (default setting). You can associate additional security groups with a layer after you create it but you cannot delete the built-in security group.   False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate Amazon Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer that you create. However, you can still manually associate a built-in security group with a layer on creation; custom security groups are required only for those layers that need custom settings.   For more information, see Create a New Stack.
    */
  var UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All instances are launched into this VPC, and you cannot change the ID later.   If your account supports EC2 Classic, the default value is no VPC.   If your account does not support EC2 Classic, the default value is the default VPC for the specified region.   If the VPC ID corresponds to a default VPC and you have specified either the DefaultAvailabilityZone or the DefaultSubnetId parameter only, AWS OpsWorks Stacks infers the value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets these parameters to the first valid Availability Zone for the specified region and the corresponding default VPC subnet ID, respectively.  If you specify a nondefault VPC ID, note the following:   It must belong to a VPC in your account that is in the specified region.   You must specify a value for DefaultSubnetId.   For more information about how to use AWS OpsWorks Stacks with a VPC, see Running a Stack in a VPC. For more information about default VPC and EC2 Classic, see Supported Platforms. 
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object CloneStackRequest {
  @scala.inline
  def apply(
    ServiceRoleArn: String,
    SourceStackId: String,
    AgentVersion: String = null,
    Attributes: StackAttributes = null,
    ChefConfiguration: ChefConfiguration = null,
    CloneAppIds: Strings = null,
    ClonePermissions: js.UndefOr[scala.Boolean] = js.undefined,
    ConfigurationManager: StackConfigurationManager = null,
    CustomCookbooksSource: Source = null,
    CustomJson: String = null,
    DefaultAvailabilityZone: String = null,
    DefaultInstanceProfileArn: String = null,
    DefaultOs: String = null,
    DefaultRootDeviceType: RootDeviceType = null,
    DefaultSshKeyName: String = null,
    DefaultSubnetId: String = null,
    HostnameTheme: String = null,
    Name: String = null,
    Region: String = null,
    UseCustomCookbooks: js.UndefOr[scala.Boolean] = js.undefined,
    UseOpsworksSecurityGroups: js.UndefOr[scala.Boolean] = js.undefined,
    VpcId: String = null
  ): CloneStackRequest = {
    val __obj = js.Dynamic.literal(ServiceRoleArn = ServiceRoleArn, SourceStackId = SourceStackId)
    if (AgentVersion != null) __obj.updateDynamic("AgentVersion")(AgentVersion)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ChefConfiguration != null) __obj.updateDynamic("ChefConfiguration")(ChefConfiguration)
    if (CloneAppIds != null) __obj.updateDynamic("CloneAppIds")(CloneAppIds)
    if (!js.isUndefined(ClonePermissions)) __obj.updateDynamic("ClonePermissions")(ClonePermissions)
    if (ConfigurationManager != null) __obj.updateDynamic("ConfigurationManager")(ConfigurationManager)
    if (CustomCookbooksSource != null) __obj.updateDynamic("CustomCookbooksSource")(CustomCookbooksSource)
    if (CustomJson != null) __obj.updateDynamic("CustomJson")(CustomJson)
    if (DefaultAvailabilityZone != null) __obj.updateDynamic("DefaultAvailabilityZone")(DefaultAvailabilityZone)
    if (DefaultInstanceProfileArn != null) __obj.updateDynamic("DefaultInstanceProfileArn")(DefaultInstanceProfileArn)
    if (DefaultOs != null) __obj.updateDynamic("DefaultOs")(DefaultOs)
    if (DefaultRootDeviceType != null) __obj.updateDynamic("DefaultRootDeviceType")(DefaultRootDeviceType.asInstanceOf[js.Any])
    if (DefaultSshKeyName != null) __obj.updateDynamic("DefaultSshKeyName")(DefaultSshKeyName)
    if (DefaultSubnetId != null) __obj.updateDynamic("DefaultSubnetId")(DefaultSubnetId)
    if (HostnameTheme != null) __obj.updateDynamic("HostnameTheme")(HostnameTheme)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (!js.isUndefined(UseCustomCookbooks)) __obj.updateDynamic("UseCustomCookbooks")(UseCustomCookbooks)
    if (!js.isUndefined(UseOpsworksSecurityGroups)) __obj.updateDynamic("UseOpsworksSecurityGroups")(UseOpsworksSecurityGroups)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[CloneStackRequest]
  }
}

