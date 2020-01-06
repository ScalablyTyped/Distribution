package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLayerRequest extends js.Object {
  /**
    * One or more user-defined key/value pairs to be added to the stack attributes.
    */
  var Attributes: js.UndefOr[LayerAttributes] = js.native
  /**
    * Whether to automatically assign an Elastic IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignElasticIps: js.UndefOr[Boolean] = js.native
  /**
    * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignPublicIps: js.UndefOr[Boolean] = js.native
  /**
    * Specifies CloudWatch Logs configuration options for the layer. For more information, see CloudWatchLogsLogStream.
    */
  var CloudWatchLogsConfiguration: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.CloudWatchLogsConfiguration] = js.native
  /**
    * The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the layer's instances. For more information, see  Using Custom JSON. 
    */
  var CustomJson: js.UndefOr[String] = js.native
  /**
    * A LayerCustomRecipes object that specifies the layer's custom recipes.
    */
  var CustomRecipes: js.UndefOr[Recipes] = js.native
  /**
    * An array containing the layer's custom security group IDs.
    */
  var CustomSecurityGroupIds: js.UndefOr[Strings] = js.native
  /**
    * Whether to disable auto healing for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.native
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  /**
    * The layer ID.
    */
  var LayerId: String = js.native
  /**
    * 
    */
  var LifecycleEventConfiguration: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.LifecycleEventConfiguration] = js.native
  /**
    * The layer name, which is used by the console.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of Package objects that describe the layer's packages.
    */
  var Packages: js.UndefOr[Strings] = js.native
  /**
    * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app files are installed. It can have a maximum of 200 characters and must be in the following format: /\A[a-z0-9\-\_\.]+\Z/. The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the Layer Reference 
    */
  var Shortname: js.UndefOr[String] = js.native
  /**
    * Whether to use Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.native
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.VolumeConfigurations] = js.native
}

object UpdateLayerRequest {
  @scala.inline
  def apply(
    LayerId: String,
    Attributes: LayerAttributes = null,
    AutoAssignElasticIps: js.UndefOr[scala.Boolean] = js.undefined,
    AutoAssignPublicIps: js.UndefOr[scala.Boolean] = js.undefined,
    CloudWatchLogsConfiguration: CloudWatchLogsConfiguration = null,
    CustomInstanceProfileArn: String = null,
    CustomJson: String = null,
    CustomRecipes: Recipes = null,
    CustomSecurityGroupIds: Strings = null,
    EnableAutoHealing: js.UndefOr[scala.Boolean] = js.undefined,
    InstallUpdatesOnBoot: js.UndefOr[scala.Boolean] = js.undefined,
    LifecycleEventConfiguration: LifecycleEventConfiguration = null,
    Name: String = null,
    Packages: Strings = null,
    Shortname: String = null,
    UseEbsOptimizedInstances: js.UndefOr[scala.Boolean] = js.undefined,
    VolumeConfigurations: VolumeConfigurations = null
  ): UpdateLayerRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoAssignElasticIps)) __obj.updateDynamic("AutoAssignElasticIps")(AutoAssignElasticIps.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoAssignPublicIps)) __obj.updateDynamic("AutoAssignPublicIps")(AutoAssignPublicIps.asInstanceOf[js.Any])
    if (CloudWatchLogsConfiguration != null) __obj.updateDynamic("CloudWatchLogsConfiguration")(CloudWatchLogsConfiguration.asInstanceOf[js.Any])
    if (CustomInstanceProfileArn != null) __obj.updateDynamic("CustomInstanceProfileArn")(CustomInstanceProfileArn.asInstanceOf[js.Any])
    if (CustomJson != null) __obj.updateDynamic("CustomJson")(CustomJson.asInstanceOf[js.Any])
    if (CustomRecipes != null) __obj.updateDynamic("CustomRecipes")(CustomRecipes.asInstanceOf[js.Any])
    if (CustomSecurityGroupIds != null) __obj.updateDynamic("CustomSecurityGroupIds")(CustomSecurityGroupIds.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableAutoHealing)) __obj.updateDynamic("EnableAutoHealing")(EnableAutoHealing.asInstanceOf[js.Any])
    if (!js.isUndefined(InstallUpdatesOnBoot)) __obj.updateDynamic("InstallUpdatesOnBoot")(InstallUpdatesOnBoot.asInstanceOf[js.Any])
    if (LifecycleEventConfiguration != null) __obj.updateDynamic("LifecycleEventConfiguration")(LifecycleEventConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Packages != null) __obj.updateDynamic("Packages")(Packages.asInstanceOf[js.Any])
    if (Shortname != null) __obj.updateDynamic("Shortname")(Shortname.asInstanceOf[js.Any])
    if (!js.isUndefined(UseEbsOptimizedInstances)) __obj.updateDynamic("UseEbsOptimizedInstances")(UseEbsOptimizedInstances.asInstanceOf[js.Any])
    if (VolumeConfigurations != null) __obj.updateDynamic("VolumeConfigurations")(VolumeConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLayerRequest]
  }
}

