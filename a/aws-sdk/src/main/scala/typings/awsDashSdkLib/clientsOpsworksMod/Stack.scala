package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stack extends js.Object {
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
  var ChefConfiguration: js.UndefOr[ChefConfiguration] = js.undefined
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
  @scala.inline
  def apply(
    AgentVersion: String = null,
    Arn: String = null,
    Attributes: StackAttributes = null,
    ChefConfiguration: ChefConfiguration = null,
    ConfigurationManager: StackConfigurationManager = null,
    CreatedAt: DateTime = null,
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
    ServiceRoleArn: String = null,
    StackId: String = null,
    UseCustomCookbooks: js.UndefOr[Boolean] = js.undefined,
    UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.undefined,
    VpcId: String = null
  ): Stack = {
    val __obj = js.Dynamic.literal()
    if (AgentVersion != null) __obj.updateDynamic("AgentVersion")(AgentVersion)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (ChefConfiguration != null) __obj.updateDynamic("ChefConfiguration")(ChefConfiguration)
    if (ConfigurationManager != null) __obj.updateDynamic("ConfigurationManager")(ConfigurationManager)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
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
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (!js.isUndefined(UseCustomCookbooks)) __obj.updateDynamic("UseCustomCookbooks")(UseCustomCookbooks)
    if (!js.isUndefined(UseOpsworksSecurityGroups)) __obj.updateDynamic("UseOpsworksSecurityGroups")(UseOpsworksSecurityGroups)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[Stack]
  }
}

