package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/emr", "EMR")
@js.native
object EMRNs extends js.Object {
  
  trait AddInstanceFleetInput extends js.Object {
    /**
         * The unique identifier of the cluster.
         */
    var ClusterId: XmlStringMaxLen256
    /**
         * Specifies the configuration of the instance fleet.
         */
    var InstanceFleet: InstanceFleetConfig
  }
  
  
  trait AddInstanceFleetOutput extends js.Object {
    /**
         * The unique identifier of the cluster.
         */
    var ClusterId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The unique identifier of the instance fleet.
         */
    var InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined
  }
  
  
  trait AddInstanceGroupsInput extends js.Object {
    /**
         * Instance groups to add.
         */
    var InstanceGroups: InstanceGroupConfigList
    /**
         * Job flow in which to add the instance groups.
         */
    var JobFlowId: XmlStringMaxLen256
  }
  
  
  trait AddInstanceGroupsOutput extends js.Object {
    /**
         * Instance group IDs of the newly created instance groups.
         */
    var InstanceGroupIds: js.UndefOr[InstanceGroupIdsList] = js.undefined
    /**
         * The job flow ID in which the instance groups are added.
         */
    var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  }
  
  
  trait AddJobFlowStepsInput extends js.Object {
    /**
         * A string that uniquely identifies the job flow. This identifier is returned by RunJobFlow and can also be obtained from ListClusters. 
         */
    var JobFlowId: XmlStringMaxLen256
    /**
         *  A list of StepConfig to be executed by the job flow. 
         */
    var Steps: StepConfigList
  }
  
  
  trait AddJobFlowStepsOutput extends js.Object {
    /**
         * The identifiers of the list of steps added to the job flow.
         */
    var StepIds: js.UndefOr[StepIdsList] = js.undefined
  }
  
  
  trait AddTagsInput extends js.Object {
    /**
         * The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
         */
    var ResourceId: ResourceId
    /**
         * A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value pairs that consist of a required key string with a maximum of 128 characters, and an optional value string with a maximum of 256 characters.
         */
    var Tags: TagList
  }
  
  
  trait AddTagsOutput extends js.Object
  
  
  trait Application extends js.Object {
    /**
         * This option is for advanced users only. This is meta information about third-party applications that third-party vendors use for testing purposes.
         */
    var AdditionalInfo: js.UndefOr[StringMap] = js.undefined
    /**
         * Arguments for Amazon EMR to pass to the application.
         */
    var Args: js.UndefOr[StringList] = js.undefined
    /**
         * The name of the application.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The version of the application.
         */
    var Version: js.UndefOr[String] = js.undefined
  }
  
  
  trait AutoScalingPolicy extends js.Object {
    /**
         * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
         */
    var Constraints: ScalingConstraints
    /**
         * The scale-in and scale-out rules that comprise the automatic scaling policy.
         */
    var Rules: ScalingRuleList
  }
  
  
  trait AutoScalingPolicyDescription extends js.Object {
    /**
         * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
         */
    var Constraints: js.UndefOr[ScalingConstraints] = js.undefined
    /**
         * The scale-in and scale-out rules that comprise the automatic scaling policy.
         */
    var Rules: js.UndefOr[ScalingRuleList] = js.undefined
    /**
         * The status of an automatic scaling policy. 
         */
    var Status: js.UndefOr[AutoScalingPolicyStatus] = js.undefined
  }
  
  
  trait AutoScalingPolicyStateChangeReason extends js.Object {
    /**
         * The code indicating the reason for the change in status.USER_REQUEST indicates that the scaling policy status was changed by a user. PROVISION_FAILURE indicates that the status change was because the policy failed to provision. CLEANUP_FAILURE indicates an error.
         */
    var Code: js.UndefOr[AutoScalingPolicyStateChangeReasonCode] = js.undefined
    /**
         * A friendly, more verbose message that accompanies an automatic scaling policy state change.
         */
    var Message: js.UndefOr[String] = js.undefined
  }
  
  
  trait AutoScalingPolicyStatus extends js.Object {
    /**
         * Indicates the status of the automatic scaling policy.
         */
    var State: js.UndefOr[AutoScalingPolicyState] = js.undefined
    /**
         * The reason for a change in status.
         */
    var StateChangeReason: js.UndefOr[AutoScalingPolicyStateChangeReason] = js.undefined
  }
  
  
  trait BootstrapActionConfig extends js.Object {
    /**
         * The name of the bootstrap action.
         */
    var Name: XmlStringMaxLen256
    /**
         * The script run by the bootstrap action.
         */
    var ScriptBootstrapAction: ScriptBootstrapActionConfig
  }
  
  
  trait BootstrapActionDetail extends js.Object {
    /**
         * A description of the bootstrap action.
         */
    var BootstrapActionConfig: js.UndefOr[BootstrapActionConfig] = js.undefined
  }
  
  
  trait CancelStepsInfo extends js.Object {
    /**
         * The reason for the failure if the CancelSteps request fails.
         */
    var Reason: js.UndefOr[String] = js.undefined
    /**
         * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
         */
    var Status: js.UndefOr[CancelStepsRequestStatus] = js.undefined
    /**
         * The encrypted StepId of a step.
         */
    var StepId: js.UndefOr[StepId] = js.undefined
  }
  
  
  trait CancelStepsInput extends js.Object {
    /**
         * The ClusterID for which specified steps will be canceled. Use RunJobFlow and ListClusters to get ClusterIDs. 
         */
    var ClusterId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The list of StepIDs to cancel. Use ListSteps to get steps and their states for the specified cluster.
         */
    var StepIds: js.UndefOr[StepIdsList] = js.undefined
  }
  
  
  trait CancelStepsOutput extends js.Object {
    /**
         * A list of CancelStepsInfo, which shows the status of specified cancel requests for each StepID specified.
         */
    var CancelStepsInfoList: js.UndefOr[CancelStepsInfoList] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CloudWatchAlarmDefinition extends js.Object {
    /**
         * Determines how the metric specified by MetricName is compared to the value specified by Threshold.
         */
    var ComparisonOperator: ComparisonOperator
    /**
         * A CloudWatch metric dimension.
         */
    var Dimensions: js.UndefOr[MetricDimensionList] = js.undefined
    /**
         * The number of periods, expressed in seconds using Period, during which the alarm condition must exist before the alarm triggers automatic scaling activity. The default value is 1.
         */
    var EvaluationPeriods: js.UndefOr[Integer] = js.undefined
    /**
         * The name of the CloudWatch metric that is watched to determine an alarm condition.
         */
    var MetricName: String
    /**
         * The namespace for the CloudWatch metric. The default is AWS/ElasticMapReduce.
         */
    var Namespace: js.UndefOr[String] = js.undefined
    /**
         * The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify 300.
         */
    var Period: Integer
    /**
         * The statistic to apply to the metric associated with the alarm. The default is AVERAGE.
         */
    var Statistic: js.UndefOr[Statistic] = js.undefined
    /**
         * The value against which the specified statistic is compared.
         */
    var Threshold: NonNegativeDouble
    /**
         * The unit of measure associated with the CloudWatch metric being watched. The value specified for Unit must correspond to the units specified in the CloudWatch metric.
         */
    var Unit: js.UndefOr[Unit] = js.undefined
  }
  
  
  trait Cluster extends js.Object {
    /**
         * The applications installed on this cluster.
         */
    var Applications: js.UndefOr[ApplicationList] = js.undefined
    /**
         * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
         */
    var AutoScalingRole: js.UndefOr[XmlString] = js.undefined
    /**
         * Specifies whether the cluster should terminate after completing all steps.
         */
    var AutoTerminate: js.UndefOr[Boolean] = js.undefined
    /**
         * Applies only to Amazon EMR releases 4.x and later. The list of Configurations supplied to the EMR cluster.
         */
    var Configurations: js.UndefOr[ConfigurationList] = js.undefined
    /**
         * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
         */
    var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
         */
    var EbsRootVolumeSize: js.UndefOr[Integer] = js.undefined
    /**
         * Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID, IAM instance profile, and so on.
         */
    var Ec2InstanceAttributes: js.UndefOr[Ec2InstanceAttributes] = js.undefined
    /**
         * The unique identifier for the cluster.
         */
    var Id: js.UndefOr[ClusterId] = js.undefined
    /**
         *  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.  The instance group configuration of the cluster. A value of INSTANCE_GROUP indicates a uniform instance group configuration. A value of INSTANCE_FLEET indicates an instance fleets configuration.
         */
    var InstanceCollectionType: js.UndefOr[InstanceCollectionType] = js.undefined
    /**
         * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For more information see Use Kerberos Authentication in the EMR Management Guide.
         */
    var KerberosAttributes: js.UndefOr[KerberosAttributes] = js.undefined
    /**
         * The path to the Amazon S3 location where logs for this cluster are stored.
         */
    var LogUri: js.UndefOr[String] = js.undefined
    /**
         * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
         */
    var MasterPublicDnsName: js.UndefOr[String] = js.undefined
    /**
         * The name of the cluster.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
         */
    var NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined
    /**
         * The Amazon EMR release label, which determines the version of open-source application packages installed on the cluster. Release labels are in the form emr-x.x.x, where x.x.x is an Amazon EMR release version, for example, emr-5.14.0. For more information about Amazon EMR release versions and included application versions and features, see http://docs.aws.amazon.com/emr/latest/ReleaseGuide/. The release label applies only to Amazon EMR releases versions 4.x and later. Earlier versions use AmiVersion.
         */
    var ReleaseLabel: js.UndefOr[String] = js.undefined
    /**
         * Applies only when CustomAmiID is used. Specifies the type of updates that are applied from the Amazon Linux AMI package repositories when an instance boots using the AMI.
         */
    var RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot] = js.undefined
    /**
         * The AMI version requested for this cluster.
         */
    var RequestedAmiVersion: js.UndefOr[String] = js.undefined
    /**
         * The AMI version running on this cluster.
         */
    var RunningAmiVersion: js.UndefOr[String] = js.undefined
    /**
         * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION is available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
         */
    var ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined
    /**
         * The name of the security configuration applied to the cluster.
         */
    var SecurityConfiguration: js.UndefOr[XmlString] = js.undefined
    /**
         * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
         */
    var ServiceRole: js.UndefOr[String] = js.undefined
    /**
         * The current status details about the cluster.
         */
    var Status: js.UndefOr[ClusterStatus] = js.undefined
    /**
         * A list of tags associated with a cluster.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
         * Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by an API call or user intervention, or in the event of a cluster error.
         */
    var TerminationProtected: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this value is set to true, all IAM users of that AWS account can view and manage the cluster if they have the proper policy permissions set. If this value is false, only the IAM user that created the cluster can view and manage it. This value can be changed using the SetVisibleToAllUsers action.
         */
    var VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait ClusterStateChangeReason extends js.Object {
    /**
         * The programmatic code for the state change reason.
         */
    var Code: js.UndefOr[ClusterStateChangeReasonCode] = js.undefined
    /**
         * The descriptive message for the state change reason.
         */
    var Message: js.UndefOr[String] = js.undefined
  }
  
  
  trait ClusterStatus extends js.Object {
    /**
         * The current state of the cluster.
         */
    var State: js.UndefOr[ClusterState] = js.undefined
    /**
         * The reason for the cluster status change.
         */
    var StateChangeReason: js.UndefOr[ClusterStateChangeReason] = js.undefined
    /**
         * A timeline that represents the status of a cluster over the lifetime of the cluster.
         */
    var Timeline: js.UndefOr[ClusterTimeline] = js.undefined
  }
  
  
  trait ClusterSummary extends js.Object {
    /**
         * The unique identifier for the cluster.
         */
    var Id: js.UndefOr[ClusterId] = js.undefined
    /**
         * The name of the cluster.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
         */
    var NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined
    /**
         * The details about the current status of the cluster.
         */
    var Status: js.UndefOr[ClusterStatus] = js.undefined
  }
  
  
  trait ClusterTimeline extends js.Object {
    /**
         * The creation date and time of the cluster.
         */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date and time when the cluster was terminated.
         */
    var EndDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date and time when the cluster was ready to execute steps.
         */
    var ReadyDateTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait Command extends js.Object {
    /**
         * Arguments for Amazon EMR to pass to the command for execution.
         */
    var Args: js.UndefOr[StringList] = js.undefined
    /**
         * The name of the command.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The Amazon S3 location of the command script.
         */
    var ScriptPath: js.UndefOr[String] = js.undefined
  }
  
  
  trait Configuration extends js.Object {
    /**
         * The classification within a configuration.
         */
    var Classification: js.UndefOr[String] = js.undefined
    /**
         * A list of additional configurations to apply within a configuration object.
         */
    var Configurations: js.UndefOr[ConfigurationList] = js.undefined
    /**
         * A set of properties specified within a configuration classification.
         */
    var Properties: js.UndefOr[StringMap] = js.undefined
  }
  
  
  trait CreateSecurityConfigurationInput extends js.Object {
    /**
         * The name of the security configuration.
         */
    var Name: XmlString
    /**
         * The security configuration details in JSON format. For JSON parameters and examples, see Use Security Configurations to Set Up Cluster Security in the Amazon EMR Management Guide.
         */
    var SecurityConfiguration: String
  }
  
  
  trait CreateSecurityConfigurationOutput extends js.Object {
    /**
         * The date and time the security configuration was created.
         */
    var CreationDateTime: _Date
    /**
         * The name of the security configuration.
         */
    var Name: XmlString
  }
  
  
  trait DeleteSecurityConfigurationInput extends js.Object {
    /**
         * The name of the security configuration.
         */
    var Name: XmlString
  }
  
  
  trait DeleteSecurityConfigurationOutput extends js.Object
  
  
  trait DescribeClusterInput extends js.Object {
    /**
         * The identifier of the cluster to describe.
         */
    var ClusterId: ClusterId
  }
  
  
  trait DescribeClusterOutput extends js.Object {
    /**
         * This output contains the details for the requested cluster.
         */
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  
  trait DescribeJobFlowsInput extends js.Object {
    /**
         * Return only job flows created after this date and time.
         */
    var CreatedAfter: js.UndefOr[_Date] = js.undefined
    /**
         * Return only job flows created before this date and time.
         */
    var CreatedBefore: js.UndefOr[_Date] = js.undefined
    /**
         * Return only job flows whose job flow ID is contained in this list.
         */
    var JobFlowIds: js.UndefOr[XmlStringList] = js.undefined
    /**
         * Return only job flows whose state is contained in this list.
         */
    var JobFlowStates: js.UndefOr[JobFlowExecutionStateList] = js.undefined
  }
  
  
  trait DescribeJobFlowsOutput extends js.Object {
    /**
         * A list of job flows matching the parameters supplied.
         */
    var JobFlows: js.UndefOr[JobFlowDetailList] = js.undefined
  }
  
  
  trait DescribeSecurityConfigurationInput extends js.Object {
    /**
         * The name of the security configuration.
         */
    var Name: XmlString
  }
  
  
  trait DescribeSecurityConfigurationOutput extends js.Object {
    /**
         * The date and time the security configuration was created
         */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The name of the security configuration.
         */
    var Name: js.UndefOr[XmlString] = js.undefined
    /**
         * The security configuration details in JSON format.
         */
    var SecurityConfiguration: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeStepInput extends js.Object {
    /**
         * The identifier of the cluster with steps to describe.
         */
    var ClusterId: ClusterId
    /**
         * The identifier of the step to describe.
         */
    var StepId: StepId
  }
  
  
  trait DescribeStepOutput extends js.Object {
    /**
         * The step details for the requested step identifier.
         */
    var Step: js.UndefOr[Step] = js.undefined
  }
  
  
  trait EbsBlockDevice extends js.Object {
    /**
         * The device name that is exposed to the instance, such as /dev/sdh.
         */
    var Device: js.UndefOr[String] = js.undefined
    /**
         * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
         */
    var VolumeSpecification: js.UndefOr[VolumeSpecification] = js.undefined
  }
  
  
  trait EbsBlockDeviceConfig extends js.Object {
    /**
         * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
         */
    var VolumeSpecification: VolumeSpecification
    /**
         * Number of EBS volumes with a specific volume configuration that will be associated with every instance in the instance group
         */
    var VolumesPerInstance: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait EbsConfiguration extends js.Object {
    /**
         * An array of Amazon EBS volume specifications attached to a cluster instance.
         */
    var EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.undefined
    /**
         * Indicates whether an Amazon EBS volume is EBS-optimized.
         */
    var EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
  }
  
  
  trait EbsVolume extends js.Object {
    /**
         * The device name that is exposed to the instance, such as /dev/sdh.
         */
    var Device: js.UndefOr[String] = js.undefined
    /**
         * The volume identifier of the EBS volume.
         */
    var VolumeId: js.UndefOr[String] = js.undefined
  }
  
  
  trait Ec2InstanceAttributes extends js.Object {
    /**
         * A list of additional Amazon EC2 security group IDs for the master node.
         */
    var AdditionalMasterSecurityGroups: js.UndefOr[StringList] = js.undefined
    /**
         * A list of additional Amazon EC2 security group IDs for the slave nodes.
         */
    var AdditionalSlaveSecurityGroups: js.UndefOr[StringList] = js.undefined
    /**
         * The Availability Zone in which the cluster will run. 
         */
    var Ec2AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
         * The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named "hadoop".
         */
    var Ec2KeyName: js.UndefOr[String] = js.undefined
    /**
         * To launch the cluster in Amazon VPC, set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not specify this value, the cluster is launched in the normal AWS cloud, outside of a VPC. Amazon VPC currently does not support cluster compute quadruple extra large (cc1.4xlarge) instances. Thus, you cannot specify the cc1.4xlarge instance type for nodes of a cluster launched in a VPC.
         */
    var Ec2SubnetId: js.UndefOr[String] = js.undefined
    /**
         * The identifier of the Amazon EC2 security group for the master node.
         */
    var EmrManagedMasterSecurityGroup: js.UndefOr[String] = js.undefined
    /**
         * The identifier of the Amazon EC2 security group for the slave nodes.
         */
    var EmrManagedSlaveSecurityGroup: js.UndefOr[String] = js.undefined
    /**
         * The IAM role that was specified when the cluster was launched. The EC2 instances of the cluster assume this role.
         */
    var IamInstanceProfile: js.UndefOr[String] = js.undefined
    /**
         * Applies to clusters configured with the instance fleets option. Specifies one or more Availability Zones in which to launch EC2 cluster instances when the EC2-Classic network configuration is supported. Amazon EMR chooses the Availability Zone with the best fit from among the list of RequestedEc2AvailabilityZones, and then launches all cluster instances within that Availability Zone. If you do not specify this value, Amazon EMR chooses the Availability Zone for you. RequestedEc2SubnetIDs and RequestedEc2AvailabilityZones cannot be specified together.
         */
    var RequestedEc2AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.undefined
    /**
         * Applies to clusters configured with the instance fleets option. Specifies the unique identifier of one or more Amazon EC2 subnets in which to launch EC2 cluster instances. Subnets must exist within the same VPC. Amazon EMR chooses the EC2 subnet with the best fit from among the list of RequestedEc2SubnetIds, and then launches all cluster instances within that Subnet. If this value is not specified, and the account and region support EC2-Classic networks, the cluster launches instances in the EC2-Classic network and uses RequestedEc2AvailabilityZones instead of this setting. If EC2-Classic is not supported, and no Subnet is specified, Amazon EMR chooses the subnet for you. RequestedEc2SubnetIDs and RequestedEc2AvailabilityZones cannot be specified together.
         */
    var RequestedEc2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.undefined
    /**
         * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private subnets.
         */
    var ServiceAccessSecurityGroup: js.UndefOr[String] = js.undefined
  }
  
  
  trait FailureDetails extends js.Object {
    /**
         * The path to the log file where the step failure root cause was originally recorded.
         */
    var LogFile: js.UndefOr[String] = js.undefined
    /**
         * The descriptive message including the error the EMR service has identified as the cause of step failure. This is text from an error log that describes the root cause of the failure.
         */
    var Message: js.UndefOr[String] = js.undefined
    /**
         * The reason for the step failure. In the case where the service cannot successfully determine the root cause of the failure, it returns "Unknown Error" as a reason.
         */
    var Reason: js.UndefOr[String] = js.undefined
  }
  
  
  trait HadoopJarStepConfig extends js.Object {
    /**
         * A list of command line arguments passed to the JAR file's main function when executed.
         */
    var Args: js.UndefOr[XmlStringList] = js.undefined
    /**
         * A path to a JAR file run during the step.
         */
    var Jar: XmlString
    /**
         * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
         */
    var MainClass: js.UndefOr[XmlString] = js.undefined
    /**
         * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
         */
    var Properties: js.UndefOr[KeyValueList] = js.undefined
  }
  
  
  trait HadoopStepConfig extends js.Object {
    /**
         * The list of command line arguments to pass to the JAR file's main function for execution.
         */
    var Args: js.UndefOr[StringList] = js.undefined
    /**
         * The path to the JAR file that runs during the step.
         */
    var Jar: js.UndefOr[String] = js.undefined
    /**
         * The name of the main class in the specified Java file. If not specified, the JAR file should specify a main class in its manifest file.
         */
    var MainClass: js.UndefOr[String] = js.undefined
    /**
         * The list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
         */
    var Properties: js.UndefOr[StringMap] = js.undefined
  }
  
  
  trait Instance extends js.Object {
    /**
         * The list of EBS volumes that are attached to this instance.
         */
    var EbsVolumes: js.UndefOr[EbsVolumeList] = js.undefined
    /**
         * The unique identifier of the instance in Amazon EC2.
         */
    var Ec2InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
         * The unique identifier for the instance in Amazon EMR.
         */
    var Id: js.UndefOr[InstanceId] = js.undefined
    /**
         * The unique identifier of the instance fleet to which an EC2 instance belongs.
         */
    var InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined
    /**
         * The identifier of the instance group to which this instance belongs.
         */
    var InstanceGroupId: js.UndefOr[String] = js.undefined
    /**
         * The EC2 instance type, for example m3.xlarge.
         */
    var InstanceType: js.UndefOr[InstanceType] = js.undefined
    /**
         * The instance purchasing option. Valid values are ON_DEMAND or SPOT. 
         */
    var Market: js.UndefOr[MarketType] = js.undefined
    /**
         * The private DNS name of the instance.
         */
    var PrivateDnsName: js.UndefOr[String] = js.undefined
    /**
         * The private IP address of the instance.
         */
    var PrivateIpAddress: js.UndefOr[String] = js.undefined
    /**
         * The public DNS name of the instance.
         */
    var PublicDnsName: js.UndefOr[String] = js.undefined
    /**
         * The public IP address of the instance.
         */
    var PublicIpAddress: js.UndefOr[String] = js.undefined
    /**
         * The current status of the instance.
         */
    var Status: js.UndefOr[InstanceStatus] = js.undefined
  }
  
  
  trait InstanceFleet extends js.Object {
    /**
         * The unique identifier of the instance fleet.
         */
    var Id: js.UndefOr[InstanceFleetId] = js.undefined
    /**
         * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK. 
         */
    var InstanceFleetType: js.UndefOr[InstanceFleetType] = js.undefined
    /**
         * The specification for the instance types that comprise an instance fleet. Up to five unique instance specifications may be defined for each instance fleet. 
         */
    var InstanceTypeSpecifications: js.UndefOr[InstanceTypeSpecificationList] = js.undefined
    /**
         * Describes the launch specification for an instance fleet. 
         */
    var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined
    /**
         * A friendly name for the instance fleet.
         */
    var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The number of On-Demand units that have been provisioned for the instance fleet to fulfill TargetOnDemandCapacity. This provisioned capacity might be less than or greater than TargetOnDemandCapacity.
         */
    var ProvisionedOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
    /**
         * The number of Spot units that have been provisioned for this instance fleet to fulfill TargetSpotCapacity. This provisioned capacity might be less than or greater than TargetSpotCapacity.
         */
    var ProvisionedSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
    /**
         * The current status of the instance fleet. 
         */
    var Status: js.UndefOr[InstanceFleetStatus] = js.undefined
    /**
         * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedOnDemandCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only Spot instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
         */
    var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
    /**
         * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedSpotCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
         */
    var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
  }
  
  
  trait InstanceFleetConfig extends js.Object {
    /**
         * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
         */
    var InstanceFleetType: InstanceFleetType
    /**
         * The instance type configurations that define the EC2 instances in the instance fleet.
         */
    var InstanceTypeConfigs: js.UndefOr[InstanceTypeConfigList] = js.undefined
    /**
         * The launch specification for the instance fleet.
         */
    var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined
    /**
         * The friendly name of the instance fleet.
         */
    var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only Spot instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
         */
    var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
    /**
         * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
         */
    var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
  }
  
  
  trait InstanceFleetModifyConfig extends js.Object {
    /**
         * A unique identifier for the instance fleet.
         */
    var InstanceFleetId: InstanceFleetId
    /**
         * The target capacity of On-Demand units for the instance fleet. For more information see InstanceFleetConfig$TargetOnDemandCapacity.
         */
    var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
    /**
         * The target capacity of Spot units for the instance fleet. For more information, see InstanceFleetConfig$TargetSpotCapacity.
         */
    var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
  }
  
  
  trait InstanceFleetProvisioningSpecifications extends js.Object {
    /**
         * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning timeout behavior.
         */
    var SpotSpecification: SpotProvisioningSpecification
  }
  
  
  trait InstanceFleetStateChangeReason extends js.Object {
    /**
         * A code corresponding to the reason the state change occurred.
         */
    var Code: js.UndefOr[InstanceFleetStateChangeReasonCode] = js.undefined
    /**
         * An explanatory message.
         */
    var Message: js.UndefOr[String] = js.undefined
  }
  
  
  trait InstanceFleetStatus extends js.Object {
    /**
         * A code representing the instance fleet status.    PROVISIONING—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.    BOOTSTRAPPING—EC2 instances and other resources have been provisioned and the bootstrap actions specified for the instances are underway.    RUNNING—EC2 instances and other resources are running. They are either executing jobs or waiting to execute jobs.    RESIZING—A resize operation is underway. EC2 instances are either being added or removed.    SUSPENDED—A resize operation could not complete. Existing EC2 instances are running, but instances can't be added or removed.    TERMINATING—The instance fleet is terminating EC2 instances.    TERMINATED—The instance fleet is no longer active, and all EC2 instances have been terminated.  
         */
    var State: js.UndefOr[InstanceFleetState] = js.undefined
    /**
         * Provides status change reason details for the instance fleet.
         */
    var StateChangeReason: js.UndefOr[InstanceFleetStateChangeReason] = js.undefined
    /**
         * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready to run jobs, and the time of termination.
         */
    var Timeline: js.UndefOr[InstanceFleetTimeline] = js.undefined
  }
  
  
  trait InstanceFleetTimeline extends js.Object {
    /**
         * The time and date the instance fleet was created.
         */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The time and date the instance fleet terminated.
         */
    var EndDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The time and date the instance fleet was ready to run jobs.
         */
    var ReadyDateTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait InstanceGroup extends js.Object {
    /**
         * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
         */
    var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined
    /**
         * The maximum Spot price your are willing to pay for EC2 instances. An optional, nullable field that applies if the MarketType for the instance group is specified as SPOT. Specify the maximum spot price in USD. If the value is NULL and SPOT is specified, the maximum Spot price is set equal to the On-Demand price.
         */
    var BidPrice: js.UndefOr[String] = js.undefined
    /**
         *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
         */
    var Configurations: js.UndefOr[ConfigurationList] = js.undefined
    /**
         * The EBS block devices that are mapped to this instance group.
         */
    var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined
    /**
         * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack and provides additional, dedicated capacity for Amazon EBS I/O.
         */
    var EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
    /**
         * The identifier of the instance group.
         */
    var Id: js.UndefOr[InstanceGroupId] = js.undefined
    /**
         * The type of the instance group. Valid values are MASTER, CORE or TASK.
         */
    var InstanceGroupType: js.UndefOr[InstanceGroupType] = js.undefined
    /**
         * The EC2 instance type for all instances in the instance group.
         */
    var InstanceType: js.UndefOr[InstanceType] = js.undefined
    /**
         * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
         */
    var Market: js.UndefOr[MarketType] = js.undefined
    /**
         * The name of the instance group.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The target number of instances for the instance group.
         */
    var RequestedInstanceCount: js.UndefOr[Integer] = js.undefined
    /**
         * The number of instances currently running in this instance group.
         */
    var RunningInstanceCount: js.UndefOr[Integer] = js.undefined
    /**
         * Policy for customizing shrink operations.
         */
    var ShrinkPolicy: js.UndefOr[ShrinkPolicy] = js.undefined
    /**
         * The current status of the instance group.
         */
    var Status: js.UndefOr[InstanceGroupStatus] = js.undefined
  }
  
  
  trait InstanceGroupConfig extends js.Object {
    /**
         * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
         */
    var AutoScalingPolicy: js.UndefOr[AutoScalingPolicy] = js.undefined
    /**
         * The maximum Spot price your are willing to pay for EC2 instances. An optional, nullable field that applies if the MarketType for the instance group is specified as SPOT. Specify the maximum spot price in USD. If the value is NULL and SPOT is specified, the maximum Spot price is set equal to the On-Demand price.
         */
    var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
         */
    var Configurations: js.UndefOr[ConfigurationList] = js.undefined
    /**
         * EBS configurations that will be attached to each EC2 instance in the instance group.
         */
    var EbsConfiguration: js.UndefOr[EbsConfiguration] = js.undefined
    /**
         * Target number of instances for the instance group.
         */
    var InstanceCount: Integer
    /**
         * The role of the instance group in the cluster.
         */
    var InstanceRole: InstanceRoleType
    /**
         * The EC2 instance type for all instances in the instance group.
         */
    var InstanceType: InstanceType
    /**
         * Market type of the EC2 instances used to create a cluster node.
         */
    var Market: js.UndefOr[MarketType] = js.undefined
    /**
         * Friendly name given to the instance group.
         */
    var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  }
  
  
  trait InstanceGroupDetail extends js.Object {
    /**
         * The maximum Spot price your are willing to pay for EC2 instances. An optional, nullable field that applies if the MarketType for the instance group is specified as SPOT. Specified in USD. If the value is NULL and SPOT is specified, the maximum Spot price is set equal to the On-Demand price.
         */
    var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The date/time the instance group was created.
         */
    var CreationDateTime: _Date
    /**
         * The date/time the instance group was terminated.
         */
    var EndDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * Unique identifier for the instance group.
         */
    var InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * Target number of instances to run in the instance group.
         */
    var InstanceRequestCount: Integer
    /**
         * Instance group role in the cluster
         */
    var InstanceRole: InstanceRoleType
    /**
         * Actual count of running instances.
         */
    var InstanceRunningCount: Integer
    /**
         * EC2 instance type.
         */
    var InstanceType: InstanceType
    /**
         * Details regarding the state of the instance group.
         */
    var LastStateChangeReason: js.UndefOr[XmlString] = js.undefined
    /**
         * Market type of the EC2 instances used to create a cluster node.
         */
    var Market: MarketType
    /**
         * Friendly name for the instance group.
         */
    var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The date/time the instance group was available to the cluster.
         */
    var ReadyDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date/time the instance group was started.
         */
    var StartDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
         */
    var State: InstanceGroupState
  }
  
  
  trait InstanceGroupModifyConfig extends js.Object {
    /**
         * The EC2 InstanceIds to terminate. After you terminate the instances, the instance group will not return to its original requested size.
         */
    var EC2InstanceIdsToTerminate: js.UndefOr[EC2InstanceIdsToTerminateList] = js.undefined
    /**
         * Target size for the instance group.
         */
    var InstanceCount: js.UndefOr[Integer] = js.undefined
    /**
         * Unique ID of the instance group to expand or shrink.
         */
    var InstanceGroupId: XmlStringMaxLen256
    /**
         * Policy for customizing shrink operations.
         */
    var ShrinkPolicy: js.UndefOr[ShrinkPolicy] = js.undefined
  }
  
  
  trait InstanceGroupStateChangeReason extends js.Object {
    /**
         * The programmable code for the state change reason.
         */
    var Code: js.UndefOr[InstanceGroupStateChangeReasonCode] = js.undefined
    /**
         * The status change reason description.
         */
    var Message: js.UndefOr[String] = js.undefined
  }
  
  
  trait InstanceGroupStatus extends js.Object {
    /**
         * The current state of the instance group.
         */
    var State: js.UndefOr[InstanceGroupState] = js.undefined
    /**
         * The status change reason details for the instance group.
         */
    var StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason] = js.undefined
    /**
         * The timeline of the instance group status over time.
         */
    var Timeline: js.UndefOr[InstanceGroupTimeline] = js.undefined
  }
  
  
  trait InstanceGroupTimeline extends js.Object {
    /**
         * The creation date and time of the instance group.
         */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date and time when the instance group terminated.
         */
    var EndDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date and time when the instance group became ready to perform tasks.
         */
    var ReadyDateTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait InstanceResizePolicy extends js.Object {
    /**
         * Decommissioning timeout override for the specific list of instances to be terminated.
         */
    var InstanceTerminationTimeout: js.UndefOr[Integer] = js.undefined
    /**
         * Specific list of instances to be protected when shrinking an instance group.
         */
    var InstancesToProtect: js.UndefOr[EC2InstanceIdsList] = js.undefined
    /**
         * Specific list of instances to be terminated when shrinking an instance group.
         */
    var InstancesToTerminate: js.UndefOr[EC2InstanceIdsList] = js.undefined
  }
  
  
  trait InstanceStateChangeReason extends js.Object {
    /**
         * The programmable code for the state change reason.
         */
    var Code: js.UndefOr[InstanceStateChangeReasonCode] = js.undefined
    /**
         * The status change reason description.
         */
    var Message: js.UndefOr[String] = js.undefined
  }
  
  
  trait InstanceStatus extends js.Object {
    /**
         * The current state of the instance.
         */
    var State: js.UndefOr[InstanceState] = js.undefined
    /**
         * The details of the status change reason for the instance.
         */
    var StateChangeReason: js.UndefOr[InstanceStateChangeReason] = js.undefined
    /**
         * The timeline of the instance status over time.
         */
    var Timeline: js.UndefOr[InstanceTimeline] = js.undefined
  }
  
  
  trait InstanceTimeline extends js.Object {
    /**
         * The creation date and time of the instance.
         */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date and time when the instance was terminated.
         */
    var EndDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date and time when the instance was ready to perform tasks.
         */
    var ReadyDateTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait InstanceTypeConfig extends js.Object {
    /**
         * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%. 
         */
    var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%). If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
         */
    var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined
    /**
         * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster.
         */
    var Configurations: js.UndefOr[ConfigurationList] = js.undefined
    /**
         * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by InstanceType. 
         */
    var EbsConfiguration: js.UndefOr[EbsConfiguration] = js.undefined
    /**
         * An EC2 instance type, such as m3.xlarge. 
         */
    var InstanceType: InstanceType
    /**
         * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. This value is 1 for a master instance fleet, and must be 1 or greater for core and task instance fleets. Defaults to 1 if not specified. 
         */
    var WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined
  }
  
  
  trait InstanceTypeSpecification extends js.Object {
    /**
         * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD.
         */
    var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%).
         */
    var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined
    /**
         * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software bundled with Amazon EMR.
         */
    var Configurations: js.UndefOr[ConfigurationList] = js.undefined
    /**
         * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by InstanceType.
         */
    var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined
    /**
         * Evaluates to TRUE when the specified InstanceType is EBS-optimized.
         */
    var EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
    /**
         * The EC2 instance type, for example m3.xlarge.
         */
    var InstanceType: js.UndefOr[InstanceType] = js.undefined
    /**
         * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. Capacity values represent performance characteristics such as vCPUs, memory, or I/O. If not specified, the default value is 1.
         */
    var WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined
  }
  
  
  trait JobFlowDetail extends js.Object {
    /**
         * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later, ReleaseLabel is used. To specify a custom AMI, use CustomAmiID.
         */
    var AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides a way for the automatic scaling feature to get the required permissions it needs to launch and terminate EC2 instances in an instance group.
         */
    var AutoScalingRole: js.UndefOr[XmlString] = js.undefined
    /**
         * A list of the bootstrap actions run by the job flow.
         */
    var BootstrapActions: js.UndefOr[BootstrapActionDetailList] = js.undefined
    /**
         * Describes the execution status of the job flow.
         */
    var ExecutionStatusDetail: JobFlowExecutionStatusDetail
    /**
         * Describes the Amazon EC2 instances of the job flow.
         */
    var Instances: JobFlowInstancesDetail
    /**
         * The job flow identifier.
         */
    var JobFlowId: XmlStringMaxLen256
    /**
         * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this role.
         */
    var JobFlowRole: js.UndefOr[XmlString] = js.undefined
    /**
         * The location in Amazon S3 where log files for the job are stored.
         */
    var LogUri: js.UndefOr[XmlString] = js.undefined
    /**
         * The name of the job flow.
         */
    var Name: XmlStringMaxLen256
    /**
         * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
         */
    var ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined
    /**
         * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
         */
    var ServiceRole: js.UndefOr[XmlString] = js.undefined
    /**
         * A list of steps run by the job flow.
         */
    var Steps: js.UndefOr[StepDetailList] = js.undefined
    /**
         * A list of strings set by third party software when the job flow is launched. If you are not using third party software to manage the job flow this value is empty.
         */
    var SupportedProducts: js.UndefOr[SupportedProductsList] = js.undefined
    /**
         * Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this value is set to true, all IAM users of that AWS account can view and (if they have the proper policy permissions set) manage the cluster. If it is set to false, only the IAM user that created the cluster can view and manage it. This value can be changed using the SetVisibleToAllUsers action.
         */
    var VisibleToAllUsers: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait JobFlowExecutionStatusDetail extends js.Object {
    /**
         * The creation date and time of the job flow.
         */
    var CreationDateTime: _Date
    /**
         * The completion date and time of the job flow.
         */
    var EndDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * Description of the job flow last changed state.
         */
    var LastStateChangeReason: js.UndefOr[XmlString] = js.undefined
    /**
         * The date and time when the job flow was ready to start running bootstrap actions.
         */
    var ReadyDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The start date and time of the job flow.
         */
    var StartDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The state of the job flow.
         */
    var State: JobFlowExecutionState
  }
  
  
  trait JobFlowInstancesConfig extends js.Object {
    /**
         * A list of additional Amazon EC2 security group IDs for the master node.
         */
    var AdditionalMasterSecurityGroups: js.UndefOr[SecurityGroupsList] = js.undefined
    /**
         * A list of additional Amazon EC2 security group IDs for the slave nodes.
         */
    var AdditionalSlaveSecurityGroups: js.UndefOr[SecurityGroupsList] = js.undefined
    /**
         * The name of the EC2 key pair that can be used to ssh to the master node as the user called "hadoop."
         */
    var Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * Applies to clusters that use the uniform instance group configuration. To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not specify this value, the cluster launches in the normal Amazon Web Services cloud, outside of an Amazon VPC, if the account launching the cluster supports EC2 Classic networks in the region where the cluster launches. Amazon VPC currently does not support cluster compute quadruple extra large (cc1.4xlarge) instances. Thus you cannot specify the cc1.4xlarge instance type for clusters launched in an Amazon VPC.
         */
    var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * Applies to clusters that use the instance fleet configuration. When multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and launches instances in the optimal subnet.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
         */
    var Ec2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.undefined
    /**
         * The identifier of the Amazon EC2 security group for the master node.
         */
    var EmrManagedMasterSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The identifier of the Amazon EC2 security group for the slave nodes.
         */
    var EmrManagedSlaveSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop version for the cluster. Valid inputs are "0.18" (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3", "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18 is used, unless the AmiVersion parameter is set in the RunJobFlow call, in which case the default version of Hadoop for that AMI version is used.
         */
    var HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The number of EC2 instances in the cluster.
         */
    var InstanceCount: js.UndefOr[Integer] = js.undefined
    /**
         *  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.  Describes the EC2 instances and instance configurations for clusters that use the instance fleet configuration.
         */
    var InstanceFleets: js.UndefOr[InstanceFleetConfigList] = js.undefined
    /**
         * Configuration for the instance groups in a cluster.
         */
    var InstanceGroups: js.UndefOr[InstanceGroupConfigList] = js.undefined
    /**
         * Specifies whether the cluster should remain available after completing all steps.
         */
    var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.undefined
    /**
         * The EC2 instance type of the master node.
         */
    var MasterInstanceType: js.UndefOr[InstanceType] = js.undefined
    /**
         * The Availability Zone in which the cluster runs.
         */
    var Placement: js.UndefOr[PlacementType] = js.undefined
    /**
         * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private subnets.
         */
    var ServiceAccessSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The EC2 instance type of the slave nodes.
         */
    var SlaveInstanceType: js.UndefOr[InstanceType] = js.undefined
    /**
         * Specifies whether to lock the cluster to prevent the Amazon EC2 instances from being terminated by API call, user intervention, or in the event of a job-flow error.
         */
    var TerminationProtected: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait JobFlowInstancesDetail extends js.Object {
    /**
         * The name of an Amazon EC2 key pair that can be used to ssh to the master node.
         */
    var Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * For clusters launched within Amazon Virtual Private Cloud, this is the identifier of the subnet where the cluster was launched.
         */
    var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The Hadoop version for the cluster.
         */
    var HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The number of Amazon EC2 instances in the cluster. If the value is 1, the same instance serves as both the master and slave node. If the value is greater than 1, one instance is the master node and all others are slave nodes.
         */
    var InstanceCount: Integer
    /**
         * Details about the instance groups in a cluster.
         */
    var InstanceGroups: js.UndefOr[InstanceGroupDetailList] = js.undefined
    /**
         * Specifies whether the cluster should remain available after completing all steps.
         */
    var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.undefined
    /**
         * The Amazon EC2 instance identifier of the master node.
         */
    var MasterInstanceId: js.UndefOr[XmlString] = js.undefined
    /**
         * The Amazon EC2 master node instance type.
         */
    var MasterInstanceType: InstanceType
    /**
         * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
         */
    var MasterPublicDnsName: js.UndefOr[XmlString] = js.undefined
    /**
         * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour that an m1.small runs. Larger instances are weighted more, so an Amazon EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
         */
    var NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined
    /**
         * The Amazon EC2 Availability Zone for the cluster.
         */
    var Placement: js.UndefOr[PlacementType] = js.undefined
    /**
         * The Amazon EC2 slave node instance type.
         */
    var SlaveInstanceType: InstanceType
    /**
         * Specifies whether the Amazon EC2 instances in the cluster are protected from termination by API calls, user intervention, or in the event of a job-flow error.
         */
    var TerminationProtected: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait KerberosAttributes extends js.Object {
    /**
         * The Active Directory password for ADDomainJoinUser.
         */
    var ADDomainJoinPassword: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain.
         */
    var ADDomainJoinUser: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms.
         */
    var CrossRealmTrustPrincipalPassword: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster.
         */
    var KdcAdminPassword: XmlStringMaxLen256
    /**
         * The name of the Kerberos realm to which all nodes in a cluster belong. For example, EC2.INTERNAL. 
         */
    var Realm: XmlStringMaxLen256
  }
  
  
  trait KeyValue extends js.Object {
    /**
         * The unique identifier of a key value pair.
         */
    var Key: js.UndefOr[XmlString] = js.undefined
    /**
         * The value part of the identified key.
         */
    var Value: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait ListBootstrapActionsInput extends js.Object {
    /**
         * The cluster identifier for the bootstrap actions to list.
         */
    var ClusterId: ClusterId
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListBootstrapActionsOutput extends js.Object {
    /**
         * The bootstrap actions associated with the cluster.
         */
    var BootstrapActions: js.UndefOr[CommandList] = js.undefined
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListClustersInput extends js.Object {
    /**
         * The cluster state filters to apply when listing clusters.
         */
    var ClusterStates: js.UndefOr[ClusterStateList] = js.undefined
    /**
         * The creation date and time beginning value filter for listing clusters.
         */
    var CreatedAfter: js.UndefOr[_Date] = js.undefined
    /**
         * The creation date and time end value filter for listing clusters.
         */
    var CreatedBefore: js.UndefOr[_Date] = js.undefined
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListClustersOutput extends js.Object {
    /**
         * The list of clusters for the account based on the given filters.
         */
    var Clusters: js.UndefOr[ClusterSummaryList] = js.undefined
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListInstanceFleetsInput extends js.Object {
    /**
         * The unique identifier of the cluster.
         */
    var ClusterId: ClusterId
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListInstanceFleetsOutput extends js.Object {
    /**
         * The list of instance fleets for the cluster and given filters.
         */
    var InstanceFleets: js.UndefOr[InstanceFleetList] = js.undefined
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListInstanceGroupsInput extends js.Object {
    /**
         * The identifier of the cluster for which to list the instance groups.
         */
    var ClusterId: ClusterId
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListInstanceGroupsOutput extends js.Object {
    /**
         * The list of instance groups for the cluster and given filters.
         */
    var InstanceGroups: js.UndefOr[InstanceGroupList] = js.undefined
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListInstancesInput extends js.Object {
    /**
         * The identifier of the cluster for which to list the instances.
         */
    var ClusterId: ClusterId
    /**
         * The unique identifier of the instance fleet.
         */
    var InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined
    /**
         * The node type of the instance fleet. For example MASTER, CORE, or TASK.
         */
    var InstanceFleetType: js.UndefOr[InstanceFleetType] = js.undefined
    /**
         * The identifier of the instance group for which to list the instances.
         */
    var InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined
    /**
         * The type of instance group for which to list the instances.
         */
    var InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList] = js.undefined
    /**
         * A list of instance states that will filter the instances returned with this request.
         */
    var InstanceStates: js.UndefOr[InstanceStateList] = js.undefined
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListInstancesOutput extends js.Object {
    /**
         * The list of instances for the cluster and given filters.
         */
    var Instances: js.UndefOr[InstanceList] = js.undefined
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListSecurityConfigurationsInput extends js.Object {
    /**
         * The pagination token that indicates the set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
  }
  
  
  trait ListSecurityConfigurationsOutput extends js.Object {
    /**
         * A pagination token that indicates the next set of results to retrieve. Include the marker in the next ListSecurityConfiguration call to retrieve the next page of results, if required.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The creation date and time, and name, of each security configuration.
         */
    var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
  }
  
  
  trait ListStepsInput extends js.Object {
    /**
         * The identifier of the cluster for which to list the steps.
         */
    var ClusterId: ClusterId
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The filter to limit the step list based on the identifier of the steps.
         */
    var StepIds: js.UndefOr[XmlStringList] = js.undefined
    /**
         * The filter to limit the step list based on certain states.
         */
    var StepStates: js.UndefOr[StepStateList] = js.undefined
  }
  
  
  trait ListStepsOutput extends js.Object {
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
         * The filtered list of steps for the cluster.
         */
    var Steps: js.UndefOr[StepSummaryList] = js.undefined
  }
  
  
  trait MetricDimension extends js.Object {
    /**
         * The dimension name.
         */
    var Key: js.UndefOr[String] = js.undefined
    /**
         * The dimension value.
         */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  
  trait ModifyInstanceFleetInput extends js.Object {
    /**
         * The unique identifier of the cluster.
         */
    var ClusterId: ClusterId
    /**
         * The unique identifier of the instance fleet.
         */
    var InstanceFleet: InstanceFleetModifyConfig
  }
  
  
  trait ModifyInstanceGroupsInput extends js.Object {
    /**
         * The ID of the cluster to which the instance group belongs.
         */
    var ClusterId: js.UndefOr[ClusterId] = js.undefined
    /**
         * Instance groups to change.
         */
    var InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.undefined
  }
  
  
  trait PlacementType extends js.Object {
    /**
         * The Amazon EC2 Availability Zone for the cluster. AvailabilityZone is used for uniform instance groups, while AvailabilityZones (plural) is used for instance fleets.
         */
    var AvailabilityZone: js.UndefOr[XmlString] = js.undefined
    /**
         * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the optimal Availability Zone. AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used for uniform instance groups.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
         */
    var AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.undefined
  }
  
  
  trait PutAutoScalingPolicyInput extends js.Object {
    /**
         * Specifies the definition of the automatic scaling policy.
         */
    var AutoScalingPolicy: AutoScalingPolicy
    /**
         * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
         */
    var ClusterId: ClusterId
    /**
         * Specifies the ID of the instance group to which the automatic scaling policy is applied.
         */
    var InstanceGroupId: InstanceGroupId
  }
  
  
  trait PutAutoScalingPolicyOutput extends js.Object {
    /**
         * The automatic scaling policy definition.
         */
    var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined
    /**
         * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
         */
    var ClusterId: js.UndefOr[ClusterId] = js.undefined
    /**
         * Specifies the ID of the instance group to which the scaling policy is applied.
         */
    var InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined
  }
  
  
  trait RemoveAutoScalingPolicyInput extends js.Object {
    /**
         * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
         */
    var ClusterId: ClusterId
    /**
         * Specifies the ID of the instance group to which the scaling policy is applied.
         */
    var InstanceGroupId: InstanceGroupId
  }
  
  
  trait RemoveAutoScalingPolicyOutput extends js.Object
  
  
  trait RemoveTagsInput extends js.Object {
    /**
         * The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster identifier.
         */
    var ResourceId: ResourceId
    /**
         * A list of tag keys to remove from a resource.
         */
    var TagKeys: StringList
  }
  
  
  trait RemoveTagsOutput extends js.Object
  
  
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
         * For Amazon EMR releases 4.0 and later. A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark." They are case insensitive.
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
    var KerberosAttributes: js.UndefOr[KerberosAttributes] = js.undefined
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
         * The Amazon EMR release label, which determines the version of open-source application packages installed on the cluster. Release labels are in the form emr-x.x.x, where x.x.x is an Amazon EMR release version, for example, emr-5.14.0. For more information about Amazon EMR release versions and included application versions and features, see http://docs.aws.amazon.com/emr/latest/ReleaseGuide/. The release label applies only to Amazon EMR releases versions 4.x and later. Earlier versions use AmiVersion.
         */
    var ReleaseLabel: js.UndefOr[XmlStringMaxLen256] = js.undefined
    /**
         * Applies only when CustomAmiID is used. Specifies which updates from the Amazon Linux AMI package repositories to apply automatically when the instance boots using the AMI. If omitted, the default is SECURITY, which indicates that only security updates are applied. If NONE is specified, no updates are applied, and all updates must be applied manually.
         */
    var RepoUpgradeOnBoot: js.UndefOr[RepoUpgradeOnBoot] = js.undefined
    /**
         * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
         */
    var ScaleDownBehavior: js.UndefOr[ScaleDownBehavior] = js.undefined
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
  
  
  trait RunJobFlowOutput extends js.Object {
    /**
         * An unique identifier for the job flow.
         */
    var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  }
  
  
  trait ScalingAction extends js.Object {
    /**
         * Not available for instance groups. Instance groups use the market type specified for the group.
         */
    var Market: js.UndefOr[MarketType] = js.undefined
    /**
         * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the adjustment.
         */
    var SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration
  }
  
  
  trait ScalingConstraints extends js.Object {
    /**
         * The upper boundary of EC2 instances in an instance group beyond which scaling activities are not allowed to grow. Scale-out activities will not add instances beyond this boundary.
         */
    var MaxCapacity: Integer
    /**
         * The lower boundary of EC2 instances in an instance group below which scaling activities are not allowed to shrink. Scale-in activities will not terminate instances below this boundary.
         */
    var MinCapacity: Integer
  }
  
  
  trait ScalingRule extends js.Object {
    /**
         * The conditions that trigger an automatic scaling activity.
         */
    var Action: ScalingAction
    /**
         * A friendly, more verbose description of the automatic scaling rule.
         */
    var Description: js.UndefOr[String] = js.undefined
    /**
         * The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
         */
    var Name: String
    /**
         * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
         */
    var Trigger: ScalingTrigger
  }
  
  
  trait ScalingTrigger extends js.Object {
    /**
         * The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other trigger parameters, scaling activity begins.
         */
    var CloudWatchAlarmDefinition: CloudWatchAlarmDefinition
  }
  
  
  trait ScriptBootstrapActionConfig extends js.Object {
    /**
         * A list of command line arguments to pass to the bootstrap action script.
         */
    var Args: js.UndefOr[XmlStringList] = js.undefined
    /**
         * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system.
         */
    var Path: XmlString
  }
  
  
  trait SecurityConfigurationSummary extends js.Object {
    /**
         * The date and time the security configuration was created.
         */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The name of the security configuration.
         */
    var Name: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait SetTerminationProtectionInput extends js.Object {
    /**
         *  A list of strings that uniquely identify the clusters to protect. This identifier is returned by RunJobFlow and can also be obtained from DescribeJobFlows . 
         */
    var JobFlowIds: XmlStringList
    /**
         * A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the cluster from shutting down due to API calls, user intervention, or job-flow error.
         */
    var TerminationProtected: Boolean
  }
  
  
  trait SetVisibleToAllUsersInput extends js.Object {
    /**
         * Identifiers of the job flows to receive the new visibility setting.
         */
    var JobFlowIds: XmlStringList
    /**
         * Whether the specified clusters are visible to all IAM users of the AWS account associated with the cluster. If this value is set to True, all IAM users of that AWS account can view and, if they have the proper IAM policy permissions set, manage the clusters. If it is set to False, only the IAM user that created a cluster can view and manage it.
         */
    var VisibleToAllUsers: Boolean
  }
  
  
  trait ShrinkPolicy extends js.Object {
    /**
         * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
         */
    var DecommissionTimeout: js.UndefOr[Integer] = js.undefined
    /**
         * Custom policy for requesting termination protection or termination of specific instances when shrinking an instance group.
         */
    var InstanceResizePolicy: js.UndefOr[InstanceResizePolicy] = js.undefined
  }
  
  
  trait SimpleScalingPolicyConfiguration extends js.Object {
    /**
         * The way in which EC2 instances are added (if ScalingAdjustment is a positive number) or terminated (if ScalingAdjustment is a negative number) each time the scaling activity is triggered. CHANGE_IN_CAPACITY is the default. CHANGE_IN_CAPACITY indicates that the EC2 instance count increments or decrements by ScalingAdjustment, which should be expressed as an integer. PERCENT_CHANGE_IN_CAPACITY indicates the instance count increments or decrements by the percentage specified by ScalingAdjustment, which should be expressed as an integer. For example, 20 indicates an increase in 20% increments of cluster capacity. EXACT_CAPACITY indicates the scaling activity results in an instance group with the number of EC2 instances specified by ScalingAdjustment, which should be expressed as a positive integer.
         */
    var AdjustmentType: js.UndefOr[AdjustmentType] = js.undefined
    /**
         * The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start. The default value is 0.
         */
    var CoolDown: js.UndefOr[Integer] = js.undefined
    /**
         * The amount by which to scale in or scale out, based on the specified AdjustmentType. A positive value adds to the instance group's EC2 instance count while a negative number removes instances. If AdjustmentType is set to EXACT_CAPACITY, the number should only be a positive integer. If AdjustmentType is set to PERCENT_CHANGE_IN_CAPACITY, the value should express the percentage as an integer. For example, -20 indicates a decrease in 20% increments of cluster capacity.
         */
    var ScalingAdjustment: Integer
  }
  
  
  trait SpotProvisioningSpecification extends js.Object {
    /**
         * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates. 
         */
    var BlockDurationMinutes: js.UndefOr[WholeNumber] = js.undefined
    /**
         * The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired. Spot instances are not uprovisioned within the Spot provisioining timeout. Valid values are TERMINATE_CLUSTER and SWITCH_TO_ON_DEMAND. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
         */
    var TimeoutAction: SpotProvisioningTimeoutAction
    /**
         * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
         */
    var TimeoutDurationMinutes: WholeNumber
  }
  
  
  trait Step extends js.Object {
    /**
         * This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE.
         */
    var ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined
    /**
         * The Hadoop job configuration of the cluster step.
         */
    var Config: js.UndefOr[HadoopStepConfig] = js.undefined
    /**
         * The identifier of the cluster step.
         */
    var Id: js.UndefOr[StepId] = js.undefined
    /**
         * The name of the cluster step.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The current execution status details of the cluster step.
         */
    var Status: js.UndefOr[StepStatus] = js.undefined
  }
  
  
  trait StepConfig extends js.Object {
    /**
         * The action to take if the step fails.
         */
    var ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined
    /**
         * The JAR file used for the step.
         */
    var HadoopJarStep: HadoopJarStepConfig
    /**
         * The name of the step.
         */
    var Name: XmlStringMaxLen256
  }
  
  
  trait StepDetail extends js.Object {
    /**
         * The description of the step status.
         */
    var ExecutionStatusDetail: StepExecutionStatusDetail
    /**
         * The step configuration.
         */
    var StepConfig: StepConfig
  }
  
  
  trait StepExecutionStatusDetail extends js.Object {
    /**
         * The creation date and time of the step.
         */
    var CreationDateTime: _Date
    /**
         * The completion date and time of the step.
         */
    var EndDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * A description of the step's current state.
         */
    var LastStateChangeReason: js.UndefOr[XmlString] = js.undefined
    /**
         * The start date and time of the step.
         */
    var StartDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The state of the step.
         */
    var State: StepExecutionState
  }
  
  
  trait StepStateChangeReason extends js.Object {
    /**
         * The programmable code for the state change reason. Note: Currently, the service provides no code for the state change.
         */
    var Code: js.UndefOr[StepStateChangeReasonCode] = js.undefined
    /**
         * The descriptive message for the state change reason.
         */
    var Message: js.UndefOr[String] = js.undefined
  }
  
  
  trait StepStatus extends js.Object {
    /**
         * The details for the step failure including reason, message, and log file path where the root cause was identified.
         */
    var FailureDetails: js.UndefOr[FailureDetails] = js.undefined
    /**
         * The execution state of the cluster step.
         */
    var State: js.UndefOr[StepState] = js.undefined
    /**
         * The reason for the step execution status change.
         */
    var StateChangeReason: js.UndefOr[StepStateChangeReason] = js.undefined
    /**
         * The timeline of the cluster step status over time.
         */
    var Timeline: js.UndefOr[StepTimeline] = js.undefined
  }
  
  
  trait StepSummary extends js.Object {
    /**
         * This specifies what action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE.
         */
    var ActionOnFailure: js.UndefOr[ActionOnFailure] = js.undefined
    /**
         * The Hadoop job configuration of the cluster step.
         */
    var Config: js.UndefOr[HadoopStepConfig] = js.undefined
    /**
         * The identifier of the cluster step.
         */
    var Id: js.UndefOr[StepId] = js.undefined
    /**
         * The name of the cluster step.
         */
    var Name: js.UndefOr[String] = js.undefined
    /**
         * The current execution status details of the cluster step.
         */
    var Status: js.UndefOr[StepStatus] = js.undefined
  }
  
  
  trait StepTimeline extends js.Object {
    /**
         * The date and time when the cluster step was created.
         */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date and time when the cluster step execution completed or failed.
         */
    var EndDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date and time when the cluster step execution started.
         */
    var StartDateTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait StringMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[String]
  
  
  trait SupportedProductConfig extends js.Object {
    /**
         * The list of user-supplied arguments.
         */
    var Args: js.UndefOr[XmlStringList] = js.undefined
    /**
         * The name of the product configuration.
         */
    var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * A user-defined key, which is the minimum required information for a valid tag. For more information, see Tag . 
         */
    var Key: js.UndefOr[String] = js.undefined
    /**
         * A user-defined value, which is optional in a tag. For more information, see Tag Clusters. 
         */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  
  trait TerminateJobFlowsInput extends js.Object {
    /**
         * A list of job flows to be shutdown.
         */
    var JobFlowIds: XmlStringList
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Adds an instance fleet to a running cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x. 
       */
    def addInstanceFleet(): awsDashSdkLib.libRequestMod.Request[AddInstanceFleetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an instance fleet to a running cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x. 
       */
    def addInstanceFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddInstanceFleetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddInstanceFleetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an instance fleet to a running cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x. 
       */
    def addInstanceFleet(params: AddInstanceFleetInput): awsDashSdkLib.libRequestMod.Request[AddInstanceFleetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds an instance fleet to a running cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x. 
       */
    def addInstanceFleet(
      params: AddInstanceFleetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddInstanceFleetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddInstanceFleetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds one or more instance groups to a running cluster.
       */
    def addInstanceGroups(): awsDashSdkLib.libRequestMod.Request[AddInstanceGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds one or more instance groups to a running cluster.
       */
    def addInstanceGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddInstanceGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddInstanceGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds one or more instance groups to a running cluster.
       */
    def addInstanceGroups(params: AddInstanceGroupsInput): awsDashSdkLib.libRequestMod.Request[AddInstanceGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds one or more instance groups to a running cluster.
       */
    def addInstanceGroups(
      params: AddInstanceGroupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddInstanceGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddInstanceGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each step is performed by the main function of the main class of the JAR file. The main class can be specified either in the manifest of the JAR or by using the MainFunction parameter of the step. Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run successfully. You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
       */
    def addJobFlowSteps(): awsDashSdkLib.libRequestMod.Request[AddJobFlowStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each step is performed by the main function of the main class of the JAR file. The main class can be specified either in the manifest of the JAR or by using the MainFunction parameter of the step. Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run successfully. You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
       */
    def addJobFlowSteps(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddJobFlowStepsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddJobFlowStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each step is performed by the main function of the main class of the JAR file. The main class can be specified either in the manifest of the JAR or by using the MainFunction parameter of the step. Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run successfully. You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
       */
    def addJobFlowSteps(params: AddJobFlowStepsInput): awsDashSdkLib.libRequestMod.Request[AddJobFlowStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each step is performed by the main function of the main class of the JAR file. The main class can be specified either in the manifest of the JAR or by using the MainFunction parameter of the step. Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run successfully. You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
       */
    def addJobFlowSteps(
      params: AddJobFlowStepsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddJobFlowStepsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddJobFlowStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters. 
       */
    def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters. 
       */
    def addTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters. 
       */
    def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters. 
       */
    def addTags(
      params: AddTagsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully submitted. You can only cancel steps that are in a PENDING state.
       */
    def cancelSteps(): awsDashSdkLib.libRequestMod.Request[CancelStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully submitted. You can only cancel steps that are in a PENDING state.
       */
    def cancelSteps(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelStepsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully submitted. You can only cancel steps that are in a PENDING state.
       */
    def cancelSteps(params: CancelStepsInput): awsDashSdkLib.libRequestMod.Request[CancelStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully submitted. You can only cancel steps that are in a PENDING state.
       */
    def cancelSteps(
      params: CancelStepsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelStepsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
       */
    def createSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
       */
    def createSecurityConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSecurityConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
       */
    def createSecurityConfiguration(params: CreateSecurityConfigurationInput): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
       */
    def createSecurityConfiguration(
      params: CreateSecurityConfigurationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSecurityConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a security configuration.
       */
    def deleteSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a security configuration.
       */
    def deleteSecurityConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSecurityConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a security configuration.
       */
    def deleteSecurityConfiguration(params: DeleteSecurityConfigurationInput): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a security configuration.
       */
    def deleteSecurityConfiguration(
      params: DeleteSecurityConfigurationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSecurityConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on. 
       */
    def describeCluster(): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on. 
       */
    def describeCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on. 
       */
    def describeCluster(params: DescribeClusterInput): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on. 
       */
    def describeCluster(
      params: DescribeClusterInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This API is deprecated and will eventually be removed. We recommend you use ListClusters, DescribeCluster, ListSteps, ListInstanceGroups and ListBootstrapActions instead. DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time. Regardless of supplied parameters, only job flows created within the last two months are returned. If no parameters are supplied, then job flows matching either of the following criteria are returned:   Job flows created and completed in the last two weeks    Job flows created within the last two months that are in one of the following states: RUNNING, WAITING, SHUTTING_DOWN, STARTING    Amazon EMR can return a maximum of 512 job flow descriptions.
       */
    def describeJobFlows(): awsDashSdkLib.libRequestMod.Request[DescribeJobFlowsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This API is deprecated and will eventually be removed. We recommend you use ListClusters, DescribeCluster, ListSteps, ListInstanceGroups and ListBootstrapActions instead. DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time. Regardless of supplied parameters, only job flows created within the last two months are returned. If no parameters are supplied, then job flows matching either of the following criteria are returned:   Job flows created and completed in the last two weeks    Job flows created within the last two months that are in one of the following states: RUNNING, WAITING, SHUTTING_DOWN, STARTING    Amazon EMR can return a maximum of 512 job flow descriptions.
       */
    def describeJobFlows(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobFlowsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobFlowsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This API is deprecated and will eventually be removed. We recommend you use ListClusters, DescribeCluster, ListSteps, ListInstanceGroups and ListBootstrapActions instead. DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time. Regardless of supplied parameters, only job flows created within the last two months are returned. If no parameters are supplied, then job flows matching either of the following criteria are returned:   Job flows created and completed in the last two weeks    Job flows created within the last two months that are in one of the following states: RUNNING, WAITING, SHUTTING_DOWN, STARTING    Amazon EMR can return a maximum of 512 job flow descriptions.
       */
    def describeJobFlows(params: DescribeJobFlowsInput): awsDashSdkLib.libRequestMod.Request[DescribeJobFlowsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * This API is deprecated and will eventually be removed. We recommend you use ListClusters, DescribeCluster, ListSteps, ListInstanceGroups and ListBootstrapActions instead. DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time. Regardless of supplied parameters, only job flows created within the last two months are returned. If no parameters are supplied, then job flows matching either of the following criteria are returned:   Job flows created and completed in the last two weeks    Job flows created within the last two months that are in one of the following states: RUNNING, WAITING, SHUTTING_DOWN, STARTING    Amazon EMR can return a maximum of 512 job flow descriptions.
       */
    def describeJobFlows(
      params: DescribeJobFlowsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeJobFlowsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeJobFlowsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the details of a security configuration by returning the configuration JSON.
       */
    def describeSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the details of a security configuration by returning the configuration JSON.
       */
    def describeSecurityConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSecurityConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the details of a security configuration by returning the configuration JSON.
       */
    def describeSecurityConfiguration(params: DescribeSecurityConfigurationInput): awsDashSdkLib.libRequestMod.Request[DescribeSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the details of a security configuration by returning the configuration JSON.
       */
    def describeSecurityConfiguration(
      params: DescribeSecurityConfigurationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSecurityConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSecurityConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides more detail about the cluster step.
       */
    def describeStep(): awsDashSdkLib.libRequestMod.Request[DescribeStepOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides more detail about the cluster step.
       */
    def describeStep(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStepOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStepOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides more detail about the cluster step.
       */
    def describeStep(params: DescribeStepInput): awsDashSdkLib.libRequestMod.Request[DescribeStepOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides more detail about the cluster step.
       */
    def describeStep(
      params: DescribeStepInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStepOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStepOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information about the bootstrap actions associated with a cluster.
       */
    def listBootstrapActions(): awsDashSdkLib.libRequestMod.Request[ListBootstrapActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information about the bootstrap actions associated with a cluster.
       */
    def listBootstrapActions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBootstrapActionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBootstrapActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information about the bootstrap actions associated with a cluster.
       */
    def listBootstrapActions(params: ListBootstrapActionsInput): awsDashSdkLib.libRequestMod.Request[ListBootstrapActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information about the bootstrap actions associated with a cluster.
       */
    def listBootstrapActions(
      params: ListBootstrapActionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBootstrapActionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBootstrapActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListClusters calls.
       */
    def listClusters(): awsDashSdkLib.libRequestMod.Request[ListClustersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListClusters calls.
       */
    def listClusters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListClustersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListClustersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListClusters calls.
       */
    def listClusters(params: ListClustersInput): awsDashSdkLib.libRequestMod.Request[ListClustersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListClusters calls.
       */
    def listClusters(
      params: ListClustersInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListClustersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListClustersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available details about the instance fleets in a cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
       */
    def listInstanceFleets(): awsDashSdkLib.libRequestMod.Request[ListInstanceFleetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available details about the instance fleets in a cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
       */
    def listInstanceFleets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstanceFleetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstanceFleetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available details about the instance fleets in a cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
       */
    def listInstanceFleets(params: ListInstanceFleetsInput): awsDashSdkLib.libRequestMod.Request[ListInstanceFleetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available details about the instance fleets in a cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
       */
    def listInstanceFleets(
      params: ListInstanceFleetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstanceFleetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstanceFleetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides all available details about the instance groups in a cluster.
       */
    def listInstanceGroups(): awsDashSdkLib.libRequestMod.Request[ListInstanceGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides all available details about the instance groups in a cluster.
       */
    def listInstanceGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstanceGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstanceGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides all available details about the instance groups in a cluster.
       */
    def listInstanceGroups(params: ListInstanceGroupsInput): awsDashSdkLib.libRequestMod.Request[ListInstanceGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides all available details about the instance groups in a cluster.
       */
    def listInstanceGroups(
      params: ListInstanceGroupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstanceGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstanceGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
       */
    def listInstances(): awsDashSdkLib.libRequestMod.Request[ListInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
       */
    def listInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
       */
    def listInstances(params: ListInstancesInput): awsDashSdkLib.libRequestMod.Request[ListInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
       */
    def listInstances(
      params: ListInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the security configurations visible to this account, providing their creation dates and times, and their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListSecurityConfigurations calls.
       */
    def listSecurityConfigurations(): awsDashSdkLib.libRequestMod.Request[ListSecurityConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the security configurations visible to this account, providing their creation dates and times, and their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListSecurityConfigurations calls.
       */
    def listSecurityConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSecurityConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSecurityConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the security configurations visible to this account, providing their creation dates and times, and their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListSecurityConfigurations calls.
       */
    def listSecurityConfigurations(params: ListSecurityConfigurationsInput): awsDashSdkLib.libRequestMod.Request[ListSecurityConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the security configurations visible to this account, providing their creation dates and times, and their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListSecurityConfigurations calls.
       */
    def listSecurityConfigurations(
      params: ListSecurityConfigurationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSecurityConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSecurityConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
       */
    def listSteps(): awsDashSdkLib.libRequestMod.Request[ListStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
       */
    def listSteps(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListStepsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
       */
    def listSteps(params: ListStepsInput): awsDashSdkLib.libRequestMod.Request[ListStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
       */
    def listSteps(
      params: ListStepsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListStepsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListStepsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
       */
    def modifyInstanceFleet(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
       */
    def modifyInstanceFleet(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
       */
    def modifyInstanceFleet(params: ModifyInstanceFleetInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
       */
    def modifyInstanceFleet(
      params: ModifyInstanceFleetInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input parameters include the new target instance count for the group and the instance group ID. The call will either succeed or fail atomically.
       */
    def modifyInstanceGroups(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input parameters include the new target instance count for the group and the instance group ID. The call will either succeed or fail atomically.
       */
    def modifyInstanceGroups(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input parameters include the new target instance count for the group and the instance group ID. The call will either succeed or fail atomically.
       */
    def modifyInstanceGroups(params: ModifyInstanceGroupsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input parameters include the new target instance count for the group and the instance group ID. The call will either succeed or fail atomically.
       */
    def modifyInstanceGroups(
      params: ModifyInstanceGroupsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric.
       */
    def putAutoScalingPolicy(): awsDashSdkLib.libRequestMod.Request[PutAutoScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric.
       */
    def putAutoScalingPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutAutoScalingPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutAutoScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric.
       */
    def putAutoScalingPolicy(params: PutAutoScalingPolicyInput): awsDashSdkLib.libRequestMod.Request[PutAutoScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric.
       */
    def putAutoScalingPolicy(
      params: PutAutoScalingPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutAutoScalingPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutAutoScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
       */
    def removeAutoScalingPolicy(): awsDashSdkLib.libRequestMod.Request[RemoveAutoScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
       */
    def removeAutoScalingPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveAutoScalingPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveAutoScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
       */
    def removeAutoScalingPolicy(params: RemoveAutoScalingPolicyInput): awsDashSdkLib.libRequestMod.Request[RemoveAutoScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
       */
    def removeAutoScalingPolicy(
      params: RemoveAutoScalingPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveAutoScalingPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveAutoScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.  The following example removes the stack tag with value Prod from a cluster:
       */
    def removeTags(): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.  The following example removes the stack tag with value Prod from a cluster:
       */
    def removeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.  The following example removes the stack tag with value Prod from a cluster:
       */
    def removeTags(params: RemoveTagsInput): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.  The following example removes the stack tag with value Prod from a cluster:
       */
    def removeTags(
      params: RemoveTagsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last step of the job flow to store results in Amazon S3. If the JobFlowInstancesConfig KeepJobFlowAliveWhenNoSteps parameter is set to TRUE, the cluster transitions to the WAITING state rather than shutting down after the steps have completed.  For additional protection, you can set the JobFlowInstancesConfig TerminationProtected parameter to TRUE to lock the cluster and prevent it from being terminated by API call, user intervention, or in the event of a job flow error. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. For long running clusters, we recommend that you periodically store your results.  The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not both. 
       */
    def runJobFlow(): awsDashSdkLib.libRequestMod.Request[RunJobFlowOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last step of the job flow to store results in Amazon S3. If the JobFlowInstancesConfig KeepJobFlowAliveWhenNoSteps parameter is set to TRUE, the cluster transitions to the WAITING state rather than shutting down after the steps have completed.  For additional protection, you can set the JobFlowInstancesConfig TerminationProtected parameter to TRUE to lock the cluster and prevent it from being terminated by API call, user intervention, or in the event of a job flow error. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. For long running clusters, we recommend that you periodically store your results.  The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not both. 
       */
    def runJobFlow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RunJobFlowOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RunJobFlowOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last step of the job flow to store results in Amazon S3. If the JobFlowInstancesConfig KeepJobFlowAliveWhenNoSteps parameter is set to TRUE, the cluster transitions to the WAITING state rather than shutting down after the steps have completed.  For additional protection, you can set the JobFlowInstancesConfig TerminationProtected parameter to TRUE to lock the cluster and prevent it from being terminated by API call, user intervention, or in the event of a job flow error. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. For long running clusters, we recommend that you periodically store your results.  The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not both. 
       */
    def runJobFlow(params: RunJobFlowInput): awsDashSdkLib.libRequestMod.Request[RunJobFlowOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last step of the job flow to store results in Amazon S3. If the JobFlowInstancesConfig KeepJobFlowAliveWhenNoSteps parameter is set to TRUE, the cluster transitions to the WAITING state rather than shutting down after the steps have completed.  For additional protection, you can set the JobFlowInstancesConfig TerminationProtected parameter to TRUE to lock the cluster and prevent it from being terminated by API call, user intervention, or in the event of a job flow error. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. For long running clusters, we recommend that you periodically store your results.  The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not both. 
       */
    def runJobFlow(
      params: RunJobFlowInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RunJobFlowOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RunJobFlowOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful completion of the job flow. Calling SetTerminationProtection on a cluster is similar to calling the Amazon EC2 DisableAPITermination API on all EC2 instances in a cluster.  SetTerminationProtection is used to prevent accidental termination of a cluster and to ensure that in the event of an error, the instances persist so that you can recover any data stored in their ephemeral instance storage.  To terminate a cluster that has been locked by setting SetTerminationProtection to true, you must first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to false.   For more information, seeManaging Cluster Termination in the Amazon EMR Management Guide. 
       */
    def setTerminationProtection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful completion of the job flow. Calling SetTerminationProtection on a cluster is similar to calling the Amazon EC2 DisableAPITermination API on all EC2 instances in a cluster.  SetTerminationProtection is used to prevent accidental termination of a cluster and to ensure that in the event of an error, the instances persist so that you can recover any data stored in their ephemeral instance storage.  To terminate a cluster that has been locked by setting SetTerminationProtection to true, you must first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to false.   For more information, seeManaging Cluster Termination in the Amazon EMR Management Guide. 
       */
    def setTerminationProtection(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful completion of the job flow. Calling SetTerminationProtection on a cluster is similar to calling the Amazon EC2 DisableAPITermination API on all EC2 instances in a cluster.  SetTerminationProtection is used to prevent accidental termination of a cluster and to ensure that in the event of an error, the instances persist so that you can recover any data stored in their ephemeral instance storage.  To terminate a cluster that has been locked by setting SetTerminationProtection to true, you must first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to false.   For more information, seeManaging Cluster Termination in the Amazon EMR Management Guide. 
       */
    def setTerminationProtection(params: SetTerminationProtectionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful completion of the job flow. Calling SetTerminationProtection on a cluster is similar to calling the Amazon EC2 DisableAPITermination API on all EC2 instances in a cluster.  SetTerminationProtection is used to prevent accidental termination of a cluster and to ensure that in the event of an error, the instances persist so that you can recover any data stored in their ephemeral instance storage.  To terminate a cluster that has been locked by setting SetTerminationProtection to true, you must first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to false.   For more information, seeManaging Cluster Termination in the Amazon EMR Management Guide. 
       */
    def setTerminationProtection(
      params: SetTerminationProtectionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when you launch it using the VisibleToAllUsers parameter of RunJobFlow. The SetVisibleToAllUsers action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.
       */
    def setVisibleToAllUsers(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when you launch it using the VisibleToAllUsers parameter of RunJobFlow. The SetVisibleToAllUsers action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.
       */
    def setVisibleToAllUsers(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when you launch it using the VisibleToAllUsers parameter of RunJobFlow. The SetVisibleToAllUsers action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.
       */
    def setVisibleToAllUsers(params: SetVisibleToAllUsersInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when you launch it using the VisibleToAllUsers parameter of RunJobFlow. The SetVisibleToAllUsers action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.
       */
    def setVisibleToAllUsers(
      params: SetVisibleToAllUsersInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created. The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely terminate and release allocated resources, such as Amazon EC2 instances.
       */
    def terminateJobFlows(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created. The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely terminate and release allocated resources, such as Amazon EC2 instances.
       */
    def terminateJobFlows(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created. The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely terminate and release allocated resources, such as Amazon EC2 instances.
       */
    def terminateJobFlows(params: TerminateJobFlowsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created. The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely terminate and release allocated resources, such as Amazon EC2 instances.
       */
    def terminateJobFlows(
      params: TerminateJobFlowsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the clusterRunning state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_clusterRunning(state: awsDashSdkLib.awsDashSdkLibStrings.clusterRunning): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the clusterRunning state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_clusterRunning(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterRunning,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the clusterRunning state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_clusterRunning(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterRunning,
      params: DescribeClusterInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the clusterRunning state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_clusterRunning(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterRunning,
      params: DescribeClusterInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the clusterTerminated state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_clusterTerminated(state: awsDashSdkLib.awsDashSdkLibStrings.clusterTerminated): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the clusterTerminated state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_clusterTerminated(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterTerminated,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the clusterTerminated state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_clusterTerminated(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterTerminated,
      params: DescribeClusterInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the clusterTerminated state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_clusterTerminated(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterTerminated,
      params: DescribeClusterInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the stepComplete state by periodically calling the underlying EMR.describeStepoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_stepComplete(state: awsDashSdkLib.awsDashSdkLibStrings.stepComplete): awsDashSdkLib.libRequestMod.Request[DescribeStepOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the stepComplete state by periodically calling the underlying EMR.describeStepoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_stepComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stepComplete,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStepOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStepOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the stepComplete state by periodically calling the underlying EMR.describeStepoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_stepComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stepComplete,
      params: DescribeStepInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeStepOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Waits for the stepComplete state by periodically calling the underlying EMR.describeStepoperation every 30 seconds (at most 60 times).
       */
    @JSName("waitFor")
    def waitFor_stepComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stepComplete,
      params: DescribeStepInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStepOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStepOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait VolumeSpecification extends js.Object {
    /**
         * The number of I/O operations per second (IOPS) that the volume supports.
         */
    var Iops: js.UndefOr[Integer] = js.undefined
    /**
         * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
         */
    var SizeInGB: Integer
    /**
         * The volume type. Volume types supported are gp2, io1, standard.
         */
    var VolumeType: String
  }
  
  val TypesNs: this.type = js.native
  type ActionOnFailure = awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_JOB_FLOW | awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_CLUSTER | awsDashSdkLib.awsDashSdkLibStrings.CANCEL_AND_WAIT | awsDashSdkLib.awsDashSdkLibStrings.CONTINUE | java.lang.String
  type AdjustmentType = awsDashSdkLib.awsDashSdkLibStrings.CHANGE_IN_CAPACITY | awsDashSdkLib.awsDashSdkLibStrings.PERCENT_CHANGE_IN_CAPACITY | awsDashSdkLib.awsDashSdkLibStrings.EXACT_CAPACITY | java.lang.String
  type ApplicationList = js.Array[Application]
  type AutoScalingPolicyState = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.ATTACHING | awsDashSdkLib.awsDashSdkLibStrings.ATTACHED | awsDashSdkLib.awsDashSdkLibStrings.DETACHING | awsDashSdkLib.awsDashSdkLibStrings.DETACHED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type AutoScalingPolicyStateChangeReasonCode = awsDashSdkLib.awsDashSdkLibStrings.USER_REQUEST | awsDashSdkLib.awsDashSdkLibStrings.PROVISION_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.CLEANUP_FAILURE | java.lang.String
  type Boolean = scala.Boolean
  type BooleanObject = scala.Boolean
  type BootstrapActionConfigList = js.Array[BootstrapActionConfig]
  type BootstrapActionDetailList = js.Array[BootstrapActionDetail]
  type CancelStepsInfoList = js.Array[CancelStepsInfo]
  type CancelStepsRequestStatus = awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  type ClusterState = awsDashSdkLib.awsDashSdkLibStrings.STARTING | awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.WAITING | awsDashSdkLib.awsDashSdkLibStrings.TERMINATING | awsDashSdkLib.awsDashSdkLibStrings.TERMINATED | awsDashSdkLib.awsDashSdkLibStrings.TERMINATED_WITH_ERRORS | java.lang.String
  type ClusterStateChangeReasonCode = awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR | awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_ERROR | awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FLEET_TIMEOUT | awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAP_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.USER_REQUEST | awsDashSdkLib.awsDashSdkLibStrings.STEP_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.ALL_STEPS_COMPLETED | java.lang.String
  type ClusterStateList = js.Array[ClusterState]
  type ClusterSummaryList = js.Array[ClusterSummary]
  type CommandList = js.Array[Command]
  type ComparisonOperator = awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN_OR_EQUAL | awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN | awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN | awsDashSdkLib.awsDashSdkLibStrings.LESS_THAN_OR_EQUAL | java.lang.String
  type ConfigurationList = js.Array[Configuration]
  type EC2InstanceIdsList = js.Array[InstanceId]
  type EC2InstanceIdsToTerminateList = js.Array[InstanceId]
  type EbsBlockDeviceConfigList = js.Array[EbsBlockDeviceConfig]
  type EbsBlockDeviceList = js.Array[EbsBlockDevice]
  type EbsVolumeList = js.Array[EbsVolume]
  type InstanceCollectionType = awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FLEET | awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_GROUP | java.lang.String
  type InstanceFleetConfigList = js.Array[InstanceFleetConfig]
  type InstanceFleetId = java.lang.String
  type InstanceFleetList = js.Array[InstanceFleet]
  type InstanceFleetState = awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING | awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.RESIZING | awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED | awsDashSdkLib.awsDashSdkLibStrings.TERMINATING | awsDashSdkLib.awsDashSdkLibStrings.TERMINATED | java.lang.String
  type InstanceFleetStateChangeReasonCode = awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR | awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_ERROR | awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.CLUSTER_TERMINATED | java.lang.String
  type InstanceFleetType = awsDashSdkLib.awsDashSdkLibStrings.MASTER | awsDashSdkLib.awsDashSdkLibStrings.CORE | awsDashSdkLib.awsDashSdkLibStrings.TASK | java.lang.String
  type InstanceGroupConfigList = js.Array[InstanceGroupConfig]
  type InstanceGroupDetailList = js.Array[InstanceGroupDetail]
  type InstanceGroupId = java.lang.String
  type InstanceGroupIdsList = js.Array[XmlStringMaxLen256]
  type InstanceGroupList = js.Array[InstanceGroup]
  type InstanceGroupModifyConfigList = js.Array[InstanceGroupModifyConfig]
  type InstanceGroupState = awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING | awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.RESIZING | awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED | awsDashSdkLib.awsDashSdkLibStrings.TERMINATING | awsDashSdkLib.awsDashSdkLibStrings.TERMINATED | awsDashSdkLib.awsDashSdkLibStrings.ARRESTED | awsDashSdkLib.awsDashSdkLibStrings.SHUTTING_DOWN | awsDashSdkLib.awsDashSdkLibStrings.ENDED | java.lang.String
  type InstanceGroupStateChangeReasonCode = awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR | awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_ERROR | awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.CLUSTER_TERMINATED | java.lang.String
  type InstanceGroupType = awsDashSdkLib.awsDashSdkLibStrings.MASTER | awsDashSdkLib.awsDashSdkLibStrings.CORE | awsDashSdkLib.awsDashSdkLibStrings.TASK | java.lang.String
  type InstanceGroupTypeList = js.Array[InstanceGroupType]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[Instance]
  type InstanceRoleType = awsDashSdkLib.awsDashSdkLibStrings.MASTER | awsDashSdkLib.awsDashSdkLibStrings.CORE | awsDashSdkLib.awsDashSdkLibStrings.TASK | java.lang.String
  type InstanceState = awsDashSdkLib.awsDashSdkLibStrings.AWAITING_FULFILLMENT | awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING | awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.TERMINATED | java.lang.String
  type InstanceStateChangeReasonCode = awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR | awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_ERROR | awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAP_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.CLUSTER_TERMINATED | java.lang.String
  type InstanceStateList = js.Array[InstanceState]
  type InstanceType = java.lang.String
  type InstanceTypeConfigList = js.Array[InstanceTypeConfig]
  type InstanceTypeSpecificationList = js.Array[InstanceTypeSpecification]
  type Integer = scala.Double
  type JobFlowDetailList = js.Array[JobFlowDetail]
  type JobFlowExecutionState = awsDashSdkLib.awsDashSdkLibStrings.STARTING | awsDashSdkLib.awsDashSdkLibStrings.BOOTSTRAPPING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.WAITING | awsDashSdkLib.awsDashSdkLibStrings.SHUTTING_DOWN | awsDashSdkLib.awsDashSdkLibStrings.TERMINATED | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type JobFlowExecutionStateList = js.Array[JobFlowExecutionState]
  type KeyValueList = js.Array[KeyValue]
  type Marker = java.lang.String
  type MarketType = awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND | awsDashSdkLib.awsDashSdkLibStrings.SPOT | java.lang.String
  type MetricDimensionList = js.Array[MetricDimension]
  type NewSupportedProductsList = js.Array[SupportedProductConfig]
  type NonNegativeDouble = scala.Double
  type RepoUpgradeOnBoot = awsDashSdkLib.awsDashSdkLibStrings.SECURITY | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type ResourceId = java.lang.String
  type ScaleDownBehavior = awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_AT_INSTANCE_HOUR | awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_AT_TASK_COMPLETION | java.lang.String
  type ScalingRuleList = js.Array[ScalingRule]
  type SecurityConfigurationList = js.Array[SecurityConfigurationSummary]
  type SecurityGroupsList = js.Array[XmlStringMaxLen256]
  type SpotProvisioningTimeoutAction = awsDashSdkLib.awsDashSdkLibStrings.SWITCH_TO_ON_DEMAND | awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_CLUSTER | java.lang.String
  type Statistic = awsDashSdkLib.awsDashSdkLibStrings.SAMPLE_COUNT | awsDashSdkLib.awsDashSdkLibStrings.AVERAGE | awsDashSdkLib.awsDashSdkLibStrings.SUM | awsDashSdkLib.awsDashSdkLibStrings.MINIMUM | awsDashSdkLib.awsDashSdkLibStrings.MAXIMUM | java.lang.String
  type StepConfigList = js.Array[StepConfig]
  type StepDetailList = js.Array[StepDetail]
  type StepExecutionState = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.CONTINUE | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.CANCELLED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.INTERRUPTED | java.lang.String
  type StepId = java.lang.String
  type StepIdsList = js.Array[XmlStringMaxLen256]
  type StepState = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.CANCEL_PENDING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.CANCELLED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.INTERRUPTED | java.lang.String
  type StepStateChangeReasonCode = awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type StepStateList = js.Array[StepState]
  type StepSummaryList = js.Array[StepSummary]
  type String = java.lang.String
  type StringList = js.Array[String]
  type SupportedProductsList = js.Array[XmlStringMaxLen256]
  type TagList = js.Array[Tag]
  type Unit = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.SECONDS | awsDashSdkLib.awsDashSdkLibStrings.MICRO_SECONDS | awsDashSdkLib.awsDashSdkLibStrings.MILLI_SECONDS | awsDashSdkLib.awsDashSdkLibStrings.BYTES | awsDashSdkLib.awsDashSdkLibStrings.KILO_BYTES | awsDashSdkLib.awsDashSdkLibStrings.MEGA_BYTES | awsDashSdkLib.awsDashSdkLibStrings.GIGA_BYTES | awsDashSdkLib.awsDashSdkLibStrings.TERA_BYTES | awsDashSdkLib.awsDashSdkLibStrings.BITS | awsDashSdkLib.awsDashSdkLibStrings.KILO_BITS | awsDashSdkLib.awsDashSdkLibStrings.MEGA_BITS | awsDashSdkLib.awsDashSdkLibStrings.GIGA_BITS | awsDashSdkLib.awsDashSdkLibStrings.TERA_BITS | awsDashSdkLib.awsDashSdkLibStrings.PERCENT | awsDashSdkLib.awsDashSdkLibStrings.COUNT | awsDashSdkLib.awsDashSdkLibStrings.BYTES_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.KILO_BYTES_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.MEGA_BYTES_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.GIGA_BYTES_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.TERA_BYTES_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.BITS_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.KILO_BITS_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.MEGA_BITS_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.GIGA_BITS_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.TERA_BITS_PER_SECOND | awsDashSdkLib.awsDashSdkLibStrings.COUNT_PER_SECOND | java.lang.String
  type WholeNumber = scala.Double
  type XmlString = java.lang.String
  type XmlStringList = js.Array[XmlString]
  type XmlStringMaxLen256 = java.lang.String
  type XmlStringMaxLen256List = js.Array[XmlStringMaxLen256]
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2009-03-31` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

