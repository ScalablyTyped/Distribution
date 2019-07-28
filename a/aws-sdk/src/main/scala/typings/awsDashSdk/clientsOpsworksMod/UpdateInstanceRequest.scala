package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInstanceRequest extends js.Object {
  /**
    * The default AWS OpsWorks Stacks agent version. You have the following options:    INHERIT - Use the stack's default agent version setting.    version_number - Use the specified agent version. This value overrides the stack's default setting. To update the agent version, you must edit the instance configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the instance.   The default setting is INHERIT. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.
    */
  var AgentVersion: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI ID that the instance is already using. You cannot apply a new AMI to an instance by running UpdateInstance. UpdateInstance does not work on instances that are using custom AMIs. 
    */
  var AmiId: js.UndefOr[String] = js.undefined
  /**
    * The instance architecture. Instance types do not necessarily support both architectures. For a list of the architectures that are supported by the different instance types, see Instance Families and Types.
    */
  var Architecture: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Architecture] = js.undefined
  /**
    * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
    */
  var AutoScalingType: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.AutoScalingType] = js.undefined
  /**
    * This property cannot be updated.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance host name.
    */
  var Hostname: js.UndefOr[String] = js.undefined
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: String
  /**
    * The instance type, such as t2.micro. For a list of supported instance types, open the stack in the console, choose Instances, and choose + Instance. The Size list contains the currently supported types. For more information, see Instance Families and Types. The parameter values that you use to specify the various types are in the API Name column of the Available Instance Types table.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The instance's layer IDs.
    */
  var LayerIds: js.UndefOr[Strings] = js.undefined
  /**
    * The instance's operating system, which must be set to one of the following. You cannot update an instance that is using a custom AMI.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2018.03, Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7    A supported Windows operating system, such as Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   For more information about supported operating systems, see AWS OpsWorks Stacks Operating Systems. The default option is the current Amazon Linux version. If you set this parameter to Custom, you must use the AmiId parameter to specify the custom AMI that you want to use. For more information about supported operating systems, see Operating Systems. For more information about how to use custom AMIs with OpsWorks, see Using Custom AMIs.  You can specify a different Linux operating system for the updated stack, but you cannot change from Linux to Windows or Windows to Linux. 
    */
  var Os: js.UndefOr[String] = js.undefined
  /**
    * The instance's Amazon EC2 key name.
    */
  var SshKeyName: js.UndefOr[String] = js.undefined
}

object UpdateInstanceRequest {
  @scala.inline
  def apply(
    InstanceId: String,
    AgentVersion: String = null,
    AmiId: String = null,
    Architecture: Architecture = null,
    AutoScalingType: AutoScalingType = null,
    EbsOptimized: js.UndefOr[Boolean] = js.undefined,
    Hostname: String = null,
    InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
    InstanceType: String = null,
    LayerIds: Strings = null,
    Os: String = null,
    SshKeyName: String = null
  ): UpdateInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (AgentVersion != null) __obj.updateDynamic("AgentVersion")(AgentVersion)
    if (AmiId != null) __obj.updateDynamic("AmiId")(AmiId)
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (AutoScalingType != null) __obj.updateDynamic("AutoScalingType")(AutoScalingType.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname)
    if (!js.isUndefined(InstallUpdatesOnBoot)) __obj.updateDynamic("InstallUpdatesOnBoot")(InstallUpdatesOnBoot)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (LayerIds != null) __obj.updateDynamic("LayerIds")(LayerIds)
    if (Os != null) __obj.updateDynamic("Os")(Os)
    if (SshKeyName != null) __obj.updateDynamic("SshKeyName")(SshKeyName)
    __obj.asInstanceOf[UpdateInstanceRequest]
  }
}

