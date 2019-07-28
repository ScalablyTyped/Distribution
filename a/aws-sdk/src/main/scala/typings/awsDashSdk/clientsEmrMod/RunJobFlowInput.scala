package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunJobFlowInput extends js.Object {
  /**
    * A JSON string for selecting additional features.
    */
  var AdditionalInfo: js.UndefOr[XmlString] = js.undefined
  /**
    * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later, ReleaseLabel is used. To specify a custom AMI, use CustomAmiID.
    */
  var AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to install and configure when launching the cluster. For a list of applications available for each Amazon EMR release version, see the Amazon EMR Release Guide.
    */
  var Applications: js.UndefOr[ApplicationList] = js.undefined
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.undefined
  /**
    * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
    */
  var BootstrapActions: js.UndefOr[BootstrapActionConfigList] = js.undefined
  /**
    * For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are creating.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  /**
    * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about custom AMIs in Amazon EMR, see Using a Custom AMI in the Amazon EMR Management Guide. If omitted, the cluster uses the base Linux AMI for the ReleaseLabel specified. For Amazon EMR versions 2.x and 3.x, use AmiVersion instead. For information about creating a custom AMI, see Creating an Amazon EBS-Backed Linux AMI in the Amazon Elastic Compute Cloud User Guide for Linux Instances. For information about finding an AMI ID, see Finding a Linux AMI. 
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  var EbsRootVolumeSize: js.UndefOr[Integer] = js.undefined
  /**
    * A specification of the number and type of Amazon EC2 instances.
    */
  var Instances: JobFlowInstancesConfig
  /**
    * Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role. The default role is EMR_EC2_DefaultRole. In order to use the default role, you must have already created it using the CLI or console.
    */
  var JobFlowRole: js.UndefOr[XmlString] = js.undefined
  /**
    * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For more information see Use Kerberos Authentication in the EMR Management Guide.
    */
  var KerberosAttributes: js.UndefOr[typings.awsDashSdk.clientsEmrMod.KerberosAttributes] = js.undefined
  /**
    * The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not created.
    */
  var LogUri: js.UndefOr[XmlString] = js.undefined
  /**
    * The name of the job flow.
    */
  var Name: XmlStringMaxLen256
  /**
    *  For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.  A list of strings that indicates third-party software to use with the job flow that accepts a user argument list. EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action arguments. For more information, see "Launch a Job Flow on the MapR Distribution for Hadoop" in the Amazon EMR Developer Guide. Supported values are:   "mapr-m3" - launch the cluster using MapR M3 Edition.   "mapr-m5" - launch the cluster using MapR M5 Edition.   "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or M5 Edition respectively.   "mapr-m7" - launch the cluster using MapR M7 Edition.   "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.   "hue"- launch the cluster with Hue installed.   "spark" - launch the cluster with Apache Spark installed.   "ganglia" - launch the cluster with the Ganglia Monitoring System installed.  
    */
  var NewSupportedProducts: js.UndefOr[NewSupportedProductsList] = js.undefined
  /**
    * The Amazon EMR release label, which determines the version of open-source application packages installed on the cluster. Release labels are in the form emr-x.x.x, where x.x.x is an Amazon EMR release version, for example, emr-5.14.0. For more information about Amazon EMR release versions and included application versions and features, see https://docs.aws.amazon.com/emr/latest/ReleaseGuide/. The release label applies only to Amazon EMR releases versions 4.x and later. Earlier versions use AmiVersion.
    */
  var ReleaseLabel: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * Applies only when CustomAmiID is used. Specifies which updates from the Amazon Linux AMI package repositories to apply automatically when the instance boots using the AMI. If omitted, the default is SECURITY, which indicates that only security updates are applied. If NONE is specified, no updates are applied, and all updates must be applied manually.
    */
  var RepoUpgradeOnBoot: js.UndefOr[typings.awsDashSdk.clientsEmrMod.RepoUpgradeOnBoot] = js.undefined
  /**
    * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typings.awsDashSdk.clientsEmrMod.ScaleDownBehavior] = js.undefined
  /**
    * The name of a security configuration to apply to the cluster.
    */
  var SecurityConfiguration: js.UndefOr[XmlString] = js.undefined
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.undefined
  /**
    * A list of steps to run.
    */
  var Steps: js.UndefOr[StepConfigList] = js.undefined
  /**
    *  For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.  A list of strings that indicates third-party software to use. For more information, see the Amazon EMR Developer Guide. Currently supported values are:   "mapr-m3" - launch the job flow using MapR M3 Edition.   "mapr-m5" - launch the job flow using MapR M5 Edition.  
    */
  var SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined
  /**
    * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this value is set to true, all IAM users of that AWS account can view and (if they have the proper policy permissions set) manage the cluster. If it is set to false, only the IAM user that created the cluster can view and manage it.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
}

object RunJobFlowInput {
  @scala.inline
  def apply(
    Instances: JobFlowInstancesConfig,
    Name: XmlStringMaxLen256,
    AdditionalInfo: XmlString = null,
    AmiVersion: XmlStringMaxLen256 = null,
    Applications: ApplicationList = null,
    AutoScalingRole: XmlString = null,
    BootstrapActions: BootstrapActionConfigList = null,
    Configurations: ConfigurationList = null,
    CustomAmiId: XmlStringMaxLen256 = null,
    EbsRootVolumeSize: js.UndefOr[Integer] = js.undefined,
    JobFlowRole: XmlString = null,
    KerberosAttributes: KerberosAttributes = null,
    LogUri: XmlString = null,
    NewSupportedProducts: NewSupportedProductsList = null,
    ReleaseLabel: XmlStringMaxLen256 = null,
    RepoUpgradeOnBoot: RepoUpgradeOnBoot = null,
    ScaleDownBehavior: ScaleDownBehavior = null,
    SecurityConfiguration: XmlString = null,
    ServiceRole: XmlString = null,
    Steps: StepConfigList = null,
    SupportedProducts: SupportedProductsList = null,
    Tags: TagList = null,
    VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
  ): RunJobFlowInput = {
    val __obj = js.Dynamic.literal(Instances = Instances, Name = Name)
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo)
    if (AmiVersion != null) __obj.updateDynamic("AmiVersion")(AmiVersion)
    if (Applications != null) __obj.updateDynamic("Applications")(Applications)
    if (AutoScalingRole != null) __obj.updateDynamic("AutoScalingRole")(AutoScalingRole)
    if (BootstrapActions != null) __obj.updateDynamic("BootstrapActions")(BootstrapActions)
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (CustomAmiId != null) __obj.updateDynamic("CustomAmiId")(CustomAmiId)
    if (!js.isUndefined(EbsRootVolumeSize)) __obj.updateDynamic("EbsRootVolumeSize")(EbsRootVolumeSize)
    if (JobFlowRole != null) __obj.updateDynamic("JobFlowRole")(JobFlowRole)
    if (KerberosAttributes != null) __obj.updateDynamic("KerberosAttributes")(KerberosAttributes)
    if (LogUri != null) __obj.updateDynamic("LogUri")(LogUri)
    if (NewSupportedProducts != null) __obj.updateDynamic("NewSupportedProducts")(NewSupportedProducts)
    if (ReleaseLabel != null) __obj.updateDynamic("ReleaseLabel")(ReleaseLabel)
    if (RepoUpgradeOnBoot != null) __obj.updateDynamic("RepoUpgradeOnBoot")(RepoUpgradeOnBoot.asInstanceOf[js.Any])
    if (ScaleDownBehavior != null) __obj.updateDynamic("ScaleDownBehavior")(ScaleDownBehavior.asInstanceOf[js.Any])
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration)
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole)
    if (Steps != null) __obj.updateDynamic("Steps")(Steps)
    if (SupportedProducts != null) __obj.updateDynamic("SupportedProducts")(SupportedProducts)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(VisibleToAllUsers)) __obj.updateDynamic("VisibleToAllUsers")(VisibleToAllUsers)
    __obj.asInstanceOf[RunJobFlowInput]
  }
}

