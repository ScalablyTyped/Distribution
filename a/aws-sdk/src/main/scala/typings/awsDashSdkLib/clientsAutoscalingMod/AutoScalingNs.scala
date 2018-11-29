package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/autoscaling", "AutoScaling")
@js.native
object AutoScalingNs extends js.Object {
  
  trait ActivitiesType extends js.Object {
    /**
         * The scaling activities. Activities are sorted by start time. Activities still in progress are described first.
         */
    var Activities: Activities
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait Activity extends js.Object {
    /**
         * The ID of the activity.
         */
    var ActivityId: XmlString
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: XmlStringMaxLen255
    /**
         * The reason the activity began.
         */
    var Cause: XmlStringMaxLen1023
    /**
         * A friendly, more verbose description of the activity.
         */
    var Description: js.UndefOr[XmlString] = js.undefined
    /**
         * The details about the activity.
         */
    var Details: js.UndefOr[XmlString] = js.undefined
    /**
         * The end time of the activity.
         */
    var EndTime: js.UndefOr[TimestampType] = js.undefined
    /**
         * A value between 0 and 100 that indicates the progress of the activity.
         */
    var Progress: js.UndefOr[Progress] = js.undefined
    /**
         * The start time of the activity.
         */
    var StartTime: TimestampType
    /**
         * The current status of the activity.
         */
    var StatusCode: ScalingActivityStatusCode
    /**
         * A friendly, more verbose description of the activity status.
         */
    var StatusMessage: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait ActivityType extends js.Object {
    /**
         * A scaling activity.
         */
    var Activity: js.UndefOr[Activity] = js.undefined
  }
  
  
  trait AdjustmentType extends js.Object {
    /**
         * The policy adjustment type. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
         */
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait Alarm extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the alarm.
         */
    var AlarmARN: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name of the alarm.
         */
    var AlarmName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait AttachInstancesQuery extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The IDs of the instances. You can specify up to 20 instances.
         */
    var InstanceIds: js.UndefOr[InstanceIds] = js.undefined
  }
  
  
  trait AttachLoadBalancerTargetGroupsResultType extends js.Object
  
  
  trait AttachLoadBalancerTargetGroupsType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
         */
    var TargetGroupARNs: TargetGroupARNs
  }
  
  
  trait AttachLoadBalancersResultType extends js.Object
  
  
  trait AttachLoadBalancersType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The names of the load balancers. You can specify up to 10 load balancers.
         */
    var LoadBalancerNames: LoadBalancerNames
  }
  
  
  trait AutoScalingGroup extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the Auto Scaling group.
         */
    var AutoScalingGroupARN: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: XmlStringMaxLen255
    /**
         * One or more Availability Zones for the group.
         */
    var AvailabilityZones: AvailabilityZones
    /**
         * The date and time the group was created.
         */
    var CreatedTime: TimestampType
    /**
         * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
         */
    var DefaultCooldown: Cooldown
    /**
         * The desired size of the group.
         */
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    /**
         * The metrics enabled for the group.
         */
    var EnabledMetrics: js.UndefOr[EnabledMetrics] = js.undefined
    /**
         * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
         */
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined
    /**
         * The service to use for the health checks. The valid values are EC2 and ELB.
         */
    var HealthCheckType: XmlStringMaxLen32
    /**
         * The EC2 instances associated with the group.
         */
    var Instances: js.UndefOr[Instances] = js.undefined
    /**
         * The name of the associated launch configuration.
         */
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The launch template for the group.
         */
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
    /**
         * One or more load balancers associated with the group.
         */
    var LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined
    /**
         * The maximum size of the group.
         */
    var MaxSize: AutoScalingGroupMaxSize
    /**
         * The minimum size of the group.
         */
    var MinSize: AutoScalingGroupMinSize
    /**
         * The mixed instances policy for the group. 
         */
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined
    /**
         * Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
         */
    var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined
    /**
         * The name of the placement group into which to launch your instances, if any. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
         */
    var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
         */
    var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined
    /**
         * The current state of the group when DeleteAutoScalingGroup is in progress.
         */
    var Status: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The suspended processes associated with the group.
         */
    var SuspendedProcesses: js.UndefOr[SuspendedProcesses] = js.undefined
    /**
         * The tags for the group.
         */
    var Tags: js.UndefOr[TagDescriptionList] = js.undefined
    /**
         * The Amazon Resource Names (ARN) of the target groups for your load balancer.
         */
    var TargetGroupARNs: js.UndefOr[TargetGroupARNs] = js.undefined
    /**
         * The termination policies for the group.
         */
    var TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined
    /**
         * One or more subnet IDs, if applicable, separated by commas. If you specify VPCZoneIdentifier and AvailabilityZones, ensure that the Availability Zones of the subnets match the values for AvailabilityZones.
         */
    var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
  }
  
  
  trait AutoScalingGroupNamesType extends js.Object {
    /**
         * The names of the Auto Scaling groups. You can specify up to MaxRecords names. If you omit this parameter, all Auto Scaling groups are described.
         */
    var AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames] = js.undefined
    /**
         * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait AutoScalingGroupsType extends js.Object {
    /**
         * The groups.
         */
    var AutoScalingGroups: AutoScalingGroups
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait AutoScalingInstanceDetails extends js.Object {
    /**
         * The name of the Auto Scaling group for the instance.
         */
    var AutoScalingGroupName: XmlStringMaxLen255
    /**
         * The Availability Zone for the instance.
         */
    var AvailabilityZone: XmlStringMaxLen255
    /**
         * The last reported health status of this instance. "Healthy" means that the instance is healthy and should remain in service. "Unhealthy" means that the instance is unhealthy and Amazon EC2 Auto Scaling should terminate and replace it.
         */
    var HealthStatus: XmlStringMaxLen32
    /**
         * The ID of the instance.
         */
    var InstanceId: XmlStringMaxLen19
    /**
         * The launch configuration used to launch the instance. This value is not available if you attached the instance to the Auto Scaling group.
         */
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The launch template for the instance.
         */
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
    /**
         * The lifecycle state for the instance. For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
         */
    var LifecycleState: XmlStringMaxLen32
    /**
         * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
         */
    var ProtectedFromScaleIn: InstanceProtected
  }
  
  
  trait AutoScalingInstancesType extends js.Object {
    /**
         * The instances.
         */
    var AutoScalingInstances: js.UndefOr[AutoScalingInstances] = js.undefined
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait BatchDeleteScheduledActionAnswer extends js.Object {
    /**
         * The names of the scheduled actions that could not be deleted, including an error message. 
         */
    var FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined
  }
  
  
  trait BatchDeleteScheduledActionType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The names of the scheduled actions to delete. The maximum number allowed is 50. 
         */
    var ScheduledActionNames: ScheduledActionNames
  }
  
  
  trait BatchPutScheduledUpdateGroupActionAnswer extends js.Object {
    /**
         * The names of the scheduled actions that could not be created or updated, including an error message.
         */
    var FailedScheduledUpdateGroupActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined
  }
  
  
  trait BatchPutScheduledUpdateGroupActionType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * One or more scheduled actions. The maximum number allowed is 50. 
         */
    var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
  }
  
  
  trait BlockDeviceMapping extends js.Object {
    /**
         * The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh).
         */
    var DeviceName: XmlStringMaxLen255
    /**
         * The information about the Amazon EBS volume.
         */
    var Ebs: js.UndefOr[Ebs] = js.undefined
    /**
         * Suppresses a device mapping. If this parameter is true for the root device, the instance might fail the EC2 health check. In that case, Amazon EC2 Auto Scaling launches a replacement instance.
         */
    var NoDevice: js.UndefOr[NoDevice] = js.undefined
    /**
         * The name of the virtual device (for example, ephemeral0).
         */
    var VirtualName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CompleteLifecycleActionAnswer extends js.Object
  
  
  trait CompleteLifecycleActionType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The ID of the instance.
         */
    var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined
    /**
         * The action for the group to take. This parameter can be either CONTINUE or ABANDON.
         */
    var LifecycleActionResult: LifecycleActionResult
    /**
         * A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an instance. Amazon EC2 Auto Scaling sends this token to the notification target you specified when you created the lifecycle hook.
         */
    var LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined
    /**
         * The name of the lifecycle hook.
         */
    var LifecycleHookName: AsciiStringMaxLen255
  }
  
  
  trait CreateAutoScalingGroupType extends js.Object {
    /**
         * The name of the Auto Scaling group. This name must be unique within the scope of your AWS account.
         */
    var AutoScalingGroupName: XmlStringMaxLen255
    /**
         * One or more Availability Zones for the group. This parameter is optional if you specify one or more subnets.
         */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
         * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default is 300. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
         */
    var DefaultCooldown: js.UndefOr[Cooldown] = js.undefined
    /**
         * The number of EC2 instances that should be running in the group. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a desired capacity, the default is the minimum size of the group.
         */
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
    /**
         * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. During this time, any health check failures for the instance are ignored. The default is 0. This parameter is required if you are adding an ELB health check. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
         */
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined
    /**
         * The service to use for the health checks. The valid values are EC2 and ELB. By default, health checks use Amazon EC2 instance status checks to determine the health of an instance. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
         */
    var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined
    /**
         * The ID of the instance used to create a launch configuration for the group. This parameter, a launch configuration, a launch template, or a mixed instances policy must be specified. When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and associates it with the group. This launch configuration derives its attributes from the specified instance, except for the block device mapping. For more information, see Create an Auto Scaling Group Using an EC2 Instance in the Amazon EC2 Auto Scaling User Guide.
         */
    var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined
    /**
         * The name of the launch configuration. This parameter, a launch template, a mixed instances policy, or an EC2 instance must be specified.
         */
    var LaunchConfigurationName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The launch template to use to launch instances. This parameter, a launch configuration, a mixed instances policy, or an EC2 instance must be specified.
         */
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
    /**
         * One or more lifecycle hooks.
         */
    var LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications] = js.undefined
    /**
         * One or more Classic Load Balancers. To specify an Application Load Balancer, use TargetGroupARNs instead. For more information, see Using a Load Balancer With an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
         */
    var LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined
    /**
         * The maximum size of the group.
         */
    var MaxSize: AutoScalingGroupMaxSize
    /**
         * The minimum size of the group.
         */
    var MinSize: AutoScalingGroupMinSize
    /**
         * The mixed instances policy to use to launch instances. This parameter, a launch template, a launch configuration, or an EC2 instance must be specified.
         */
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined
    /**
         * Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
         */
    var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined
    /**
         * The name of the placement group into which to launch your instances, if any. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
         */
    var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named AWSServiceRoleForAutoScaling, which it creates if it does not exist.
         */
    var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined
    /**
         * One or more tags. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
         */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
         * The Amazon Resource Names (ARN) of the target groups.
         */
    var TargetGroupARNs: js.UndefOr[TargetGroupARNs] = js.undefined
    /**
         * One or more termination policies used to select the instance to terminate. These policies are executed in the order that they are listed. For more information, see Controlling Which Instances Auto Scaling Terminates During Scale In in the Auto Scaling User Guide.
         */
    var TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined
    /**
         * A comma-separated list of subnet identifiers for your virtual private cloud (VPC). If you specify subnets and Availability Zones with this call, ensure that the subnets' Availability Zones match the Availability Zones specified. For more information, see Launching Auto Scaling Instances in a VPC in the Amazon EC2 Auto Scaling User Guide.
         */
    var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
  }
  
  
  trait CreateLaunchConfigurationType extends js.Object {
    /**
         * Used for groups that launch instances into a virtual private cloud (VPC). Specifies whether to assign a public IP address to each instance. For more information, see Launching Auto Scaling Instances in a VPC in the Amazon EC2 Auto Scaling User Guide. If you specify this parameter, be sure to specify at least one subnet when you create your group. Default: If the instance is launched into a default subnet, the default is to assign a public IP address. If the instance is launched into a nondefault subnet, the default is not to assign a public IP address.
         */
    var AssociatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined
    /**
         * One or more mappings that specify how block devices are exposed to the instance. For more information, see Block Device Mapping in the Amazon Elastic Compute Cloud User Guide.
         */
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined
    /**
         * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. This parameter is supported only if you are launching EC2-Classic instances. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
         */
    var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The IDs of one or more security groups for the specified ClassicLink-enabled VPC. This parameter is required if you specify a ClassicLink-enabled VPC, and is not supported otherwise. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
         */
    var ClassicLinkVPCSecurityGroups: js.UndefOr[ClassicLinkVPCSecurityGroups] = js.undefined
    /**
         * Indicates whether the instance is optimized for Amazon EBS I/O. By default, the instance is not optimized for EBS I/O. The optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization is not available with all instance types. Additional usage charges apply. For more information, see Amazon EBS-Optimized Instances in the Amazon Elastic Compute Cloud User Guide.
         */
    var EbsOptimized: js.UndefOr[EbsOptimized] = js.undefined
    /**
         * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. EC2 instances launched with an IAM role automatically have AWS security credentials available. You can use IAM roles with Amazon EC2 Auto Scaling to automatically enable applications running on your EC2 instances to securely access other AWS resources. For more information, see Launch Auto Scaling Instances with an IAM Role in the Amazon EC2 Auto Scaling User Guide.
         */
    var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined
    /**
         * The ID of the Amazon Machine Image (AMI) to use to launch your EC2 instances. If you do not specify InstanceId, you must specify ImageId. For more information, see Finding an AMI in the Amazon Elastic Compute Cloud User Guide.
         */
    var ImageId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The ID of the instance to use to create the launch configuration. The new launch configuration derives attributes from the instance, except for the block device mapping. If you do not specify InstanceId, you must specify both ImageId and InstanceType. To create a launch configuration with a block device mapping or override any other instance attributes, specify them as part of the same request. For more information, see Create a Launch Configuration Using an EC2 Instance in the Amazon EC2 Auto Scaling User Guide.
         */
    var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined
    /**
         * Enables detailed monitoring (true) or basic monitoring (false) for the Auto Scaling instances. The default is true.
         */
    var InstanceMonitoring: js.UndefOr[InstanceMonitoring] = js.undefined
    /**
         * The instance type of the EC2 instance. If you do not specify InstanceId, you must specify InstanceType. For information about available instance types, see Available Instance Types in the Amazon Elastic Compute Cloud User Guide. 
         */
    var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The ID of the kernel associated with the AMI.
         */
    var KernelId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The name of the key pair. For more information, see Amazon EC2 Key Pairs in the Amazon Elastic Compute Cloud User Guide.
         */
    var KeyName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The name of the launch configuration. This name must be unique within the scope of your AWS account.
         */
    var LaunchConfigurationName: XmlStringMaxLen255
    /**
         * The tenancy of the instance. An instance with a tenancy of dedicated runs on single-tenant hardware and can only be launched into a VPC. To launch Dedicated Instances into a shared tenancy VPC (a VPC with the instance placement tenancy attribute set to default), you must set the value of this parameter to dedicated. If you specify this parameter, be sure to specify at least one subnet when you create your group. For more information, see Launching Auto Scaling Instances in a VPC in the Amazon EC2 Auto Scaling User Guide. Valid values: default | dedicated 
         */
    var PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined
    /**
         * The ID of the RAM disk associated with the AMI.
         */
    var RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * One or more security groups with which to associate the instances. If your instances are launched in EC2-Classic, you can either specify security group names or the security group IDs. For more information, see Amazon EC2 Security Groups in the Amazon Elastic Compute Cloud User Guide. If your instances are launched into a VPC, specify security group IDs. For more information, see Security Groups for Your VPC in the Amazon Virtual Private Cloud User Guide.
         */
    var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
         * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request. Spot Instances are launched when the price you specify exceeds the current Spot market price. For more information, see Launching Spot Instances in Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
         */
    var SpotPrice: js.UndefOr[SpotPrice] = js.undefined
    /**
         * The user data to make available to the launched EC2 instances. For more information, see Instance Metadata and User Data in the Amazon Elastic Compute Cloud User Guide.
         */
    var UserData: js.UndefOr[XmlStringUserData] = js.undefined
  }
  
  
  trait CreateOrUpdateTagsType extends js.Object {
    /**
         * One or more tags.
         */
    var Tags: Tags
  }
  
  
  trait CustomizedMetricSpecification extends js.Object {
    /**
         * The dimensions of the metric.
         */
    var Dimensions: js.UndefOr[MetricDimensions] = js.undefined
    /**
         * The name of the metric.
         */
    var MetricName: MetricName
    /**
         * The namespace of the metric.
         */
    var Namespace: MetricNamespace
    /**
         * The statistic of the metric.
         */
    var Statistic: MetricStatistic
    /**
         * The unit of the metric.
         */
    var Unit: js.UndefOr[MetricUnit] = js.undefined
  }
  
  
  trait DeleteAutoScalingGroupType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * Specifies that the group is to be deleted along with all instances associated with the group, without waiting for all instances to be terminated. This parameter also deletes any lifecycle actions associated with the group.
         */
    var ForceDelete: js.UndefOr[ForceDelete] = js.undefined
  }
  
  
  trait DeleteLifecycleHookAnswer extends js.Object
  
  
  trait DeleteLifecycleHookType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The name of the lifecycle hook.
         */
    var LifecycleHookName: AsciiStringMaxLen255
  }
  
  
  trait DeleteNotificationConfigurationType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
         */
    var TopicARN: ResourceName
  }
  
  
  trait DeletePolicyType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name or Amazon Resource Name (ARN) of the policy.
         */
    var PolicyName: ResourceName
  }
  
  
  trait DeleteScheduledActionType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The name of the action to delete.
         */
    var ScheduledActionName: ResourceName
  }
  
  
  trait DeleteTagsType extends js.Object {
    /**
         * One or more tags.
         */
    var Tags: Tags
  }
  
  
  trait DescribeAccountLimitsAnswer extends js.Object {
    /**
         * The maximum number of groups allowed for your AWS account. The default limit is 20 per region.
         */
    var MaxNumberOfAutoScalingGroups: js.UndefOr[MaxNumberOfAutoScalingGroups] = js.undefined
    /**
         * The maximum number of launch configurations allowed for your AWS account. The default limit is 100 per region.
         */
    var MaxNumberOfLaunchConfigurations: js.UndefOr[MaxNumberOfLaunchConfigurations] = js.undefined
    /**
         * The current number of groups for your AWS account.
         */
    var NumberOfAutoScalingGroups: js.UndefOr[NumberOfAutoScalingGroups] = js.undefined
    /**
         * The current number of launch configurations for your AWS account.
         */
    var NumberOfLaunchConfigurations: js.UndefOr[NumberOfLaunchConfigurations] = js.undefined
  }
  
  
  trait DescribeAdjustmentTypesAnswer extends js.Object {
    /**
         * The policy adjustment types.
         */
    var AdjustmentTypes: js.UndefOr[AdjustmentTypes] = js.undefined
  }
  
  
  trait DescribeAutoScalingInstancesType extends js.Object {
    /**
         * The IDs of the instances. You can specify up to MaxRecords IDs. If you omit this parameter, all Auto Scaling instances are described. If you specify an ID that does not exist, it is ignored with no error.
         */
    var InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    /**
         * The maximum number of items to return with this call. The default value is 50 and the maximum value is 50.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait DescribeAutoScalingNotificationTypesAnswer extends js.Object {
    /**
         * The notification types.
         */
    var AutoScalingNotificationTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
  }
  
  
  trait DescribeLifecycleHookTypesAnswer extends js.Object {
    /**
         * The lifecycle hook types.
         */
    var LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
  }
  
  
  trait DescribeLifecycleHooksAnswer extends js.Object {
    /**
         * The lifecycle hooks for the specified group.
         */
    var LifecycleHooks: js.UndefOr[LifecycleHooks] = js.undefined
  }
  
  
  trait DescribeLifecycleHooksType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The names of one or more lifecycle hooks. If you omit this parameter, all lifecycle hooks are described.
         */
    var LifecycleHookNames: js.UndefOr[LifecycleHookNames] = js.undefined
  }
  
  
  trait DescribeLoadBalancerTargetGroupsRequest extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The maximum number of items to return with this call. The default value is 100 and the maximum value is 100.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait DescribeLoadBalancerTargetGroupsResponse extends js.Object {
    /**
         * Information about the target groups.
         */
    var LoadBalancerTargetGroups: js.UndefOr[LoadBalancerTargetGroupStates] = js.undefined
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait DescribeLoadBalancersRequest extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The maximum number of items to return with this call. The default value is 100 and the maximum value is 100.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait DescribeLoadBalancersResponse extends js.Object {
    /**
         * The load balancers.
         */
    var LoadBalancers: js.UndefOr[LoadBalancerStates] = js.undefined
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait DescribeMetricCollectionTypesAnswer extends js.Object {
    /**
         * The granularities for the metrics.
         */
    var Granularities: js.UndefOr[MetricGranularityTypes] = js.undefined
    /**
         * One or more metrics.
         */
    var Metrics: js.UndefOr[MetricCollectionTypes] = js.undefined
  }
  
  
  trait DescribeNotificationConfigurationsAnswer extends js.Object {
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The notification configurations.
         */
    var NotificationConfigurations: NotificationConfigurations
  }
  
  
  trait DescribeNotificationConfigurationsType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupNames: js.UndefOr[AutoScalingGroupNames] = js.undefined
    /**
         * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait DescribePoliciesType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The maximum number of items to be returned with each call. The default value is 50 and the maximum value is 100.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The names of one or more policies. If you omit this parameter, all policies are described. If a group name is provided, the results are limited to that group. This list is limited to 50 items. If you specify an unknown policy name, it is ignored with no error.
         */
    var PolicyNames: js.UndefOr[PolicyNames] = js.undefined
    /**
         * One or more policy types. Valid values are SimpleScaling and StepScaling.
         */
    var PolicyTypes: js.UndefOr[PolicyTypes] = js.undefined
  }
  
  
  trait DescribeScalingActivitiesType extends js.Object {
    /**
         * The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this parameter, all activities for the past six weeks are described. If unknown activities are requested, they are ignored with no error. If you specify an Auto Scaling group, the results are limited to that group.
         */
    var ActivityIds: js.UndefOr[ActivityIds] = js.undefined
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The maximum number of items to return with this call. The default value is 100 and the maximum value is 100.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait DescribeScheduledActionsType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The latest scheduled start time to return. If scheduled action names are provided, this parameter is ignored.
         */
    var EndTime: js.UndefOr[TimestampType] = js.undefined
    /**
         * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The names of one or more scheduled actions. You can specify up to 50 actions. If you omit this parameter, all scheduled actions are described. If you specify an unknown scheduled action, it is ignored with no error.
         */
    var ScheduledActionNames: js.UndefOr[ScheduledActionNames] = js.undefined
    /**
         * The earliest scheduled start time to return. If scheduled action names are provided, this parameter is ignored.
         */
    var StartTime: js.UndefOr[TimestampType] = js.undefined
  }
  
  
  trait DescribeTagsType extends js.Object {
    /**
         * One or more filters to scope the tags to return. The maximum number of filters per filter type (for example, auto-scaling-group) is 1000.
         */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
         * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait DescribeTerminationPolicyTypesAnswer extends js.Object {
    /**
         * The termination policies supported by Amazon EC2 Auto Scaling: OldestInstance, OldestLaunchConfiguration, NewestInstance, ClosestToNextInstanceHour, Default, OldestLaunchTemplate, and AllocationStrategy. Currently, the OldestLaunchTemplate and AllocationStrategy policies are only supported for Auto Scaling groups with MixedInstancesPolicy.
         */
    var TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.undefined
  }
  
  
  trait DetachInstancesAnswer extends js.Object {
    /**
         * The activities related to detaching the instances from the Auto Scaling group.
         */
    var Activities: js.UndefOr[Activities] = js.undefined
  }
  
  
  trait DetachInstancesQuery extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The IDs of the instances. You can specify up to 20 instances.
         */
    var InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    /**
         * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances detached.
         */
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  }
  
  
  trait DetachLoadBalancerTargetGroupsResultType extends js.Object
  
  
  trait DetachLoadBalancerTargetGroupsType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
         */
    var TargetGroupARNs: TargetGroupARNs
  }
  
  
  trait DetachLoadBalancersResultType extends js.Object
  
  
  trait DetachLoadBalancersType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The names of the load balancers. You can specify up to 10 load balancers.
         */
    var LoadBalancerNames: LoadBalancerNames
  }
  
  
  trait DisableMetricsCollectionQuery extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * One or more of the following metrics. If you omit this parameter, all metrics are disabled.    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances   
         */
    var Metrics: js.UndefOr[Metrics] = js.undefined
  }
  
  
  trait Ebs extends js.Object {
    /**
         * Indicates whether the volume is deleted on instance termination. The default is true.
         */
    var DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination] = js.undefined
    /**
         * Indicates whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted volume from an encrypted snapshot. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
         */
    var Encrypted: js.UndefOr[BlockDeviceEbsEncrypted] = js.undefined
    /**
         * The number of I/O operations per second (IOPS) to provision for the volume. Constraint: Required when the volume type is io1.
         */
    var Iops: js.UndefOr[BlockDeviceEbsIops] = js.undefined
    /**
         * The ID of the snapshot.
         */
    var SnapshotId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The volume size, in GiB. For standard volumes, specify a value from 1 to 1,024. For io1 volumes, specify a value from 4 to 16,384. For gp2 volumes, specify a value from 1 to 16,384. If you specify a snapshot, the volume size must be equal to or larger than the snapshot size. Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the snapshot size.
         */
    var VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize] = js.undefined
    /**
         * The volume type. For more information, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud User Guide. Valid values: standard | io1 | gp2 
         */
    var VolumeType: js.UndefOr[BlockDeviceEbsVolumeType] = js.undefined
  }
  
  
  trait EnableMetricsCollectionQuery extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The granularity to associate with the metrics to collect. The only valid value is 1Minute.
         */
    var Granularity: XmlStringMaxLen255
    /**
         * One or more of the following metrics. If you omit this parameter, all metrics are enabled.    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances   
         */
    var Metrics: js.UndefOr[Metrics] = js.undefined
  }
  
  
  trait EnabledMetric extends js.Object {
    /**
         * The granularity of the metric. The only valid value is 1Minute.
         */
    var Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * One of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances   
         */
    var Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait EnterStandbyAnswer extends js.Object {
    /**
         * The activities related to moving instances into Standby mode.
         */
    var Activities: js.UndefOr[Activities] = js.undefined
  }
  
  
  trait EnterStandbyQuery extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The IDs of the instances. You can specify up to 20 instances.
         */
    var InstanceIds: js.UndefOr[InstanceIds] = js.undefined
    /**
         * Indicates whether to decrement the desired capacity of the Auto Scaling group by the number of instances moved to Standby mode.
         */
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  }
  
  
  trait ExecutePolicyType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The breach threshold for the alarm. This parameter is required if the policy type is StepScaling and not supported otherwise.
         */
    var BreachThreshold: js.UndefOr[MetricScale] = js.undefined
    /**
         * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before executing the policy. This parameter is not supported if the policy type is StepScaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
         */
    var HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined
    /**
         * The metric value to compare to BreachThreshold. This enables you to execute a policy of type StepScaling and determine which step adjustment to use. For example, if the breach threshold is 50 and you want to use a step adjustment with a lower bound of 0 and an upper bound of 10, you can set the metric value to 59. If you specify a metric value that doesn't correspond to a step adjustment for the policy, the call returns an error. This parameter is required if the policy type is StepScaling and not supported otherwise.
         */
    var MetricValue: js.UndefOr[MetricScale] = js.undefined
    /**
         * The name or ARN of the policy.
         */
    var PolicyName: ResourceName
  }
  
  
  trait ExitStandbyAnswer extends js.Object {
    /**
         * The activities related to moving instances out of Standby mode.
         */
    var Activities: js.UndefOr[Activities] = js.undefined
  }
  
  
  trait ExitStandbyQuery extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The IDs of the instances. You can specify up to 20 instances.
         */
    var InstanceIds: js.UndefOr[InstanceIds] = js.undefined
  }
  
  
  trait FailedScheduledUpdateGroupActionRequest extends js.Object {
    /**
         * The error code.
         */
    var ErrorCode: js.UndefOr[XmlStringMaxLen64] = js.undefined
    /**
         * The error message accompanying the error code.
         */
    var ErrorMessage: js.UndefOr[XmlString] = js.undefined
    /**
         * The name of the scheduled action.
         */
    var ScheduledActionName: XmlStringMaxLen255
  }
  
  
  trait Filter extends js.Object {
    /**
         * The name of the filter. The valid values are: "auto-scaling-group", "key", "value", and "propagate-at-launch".
         */
    var Name: js.UndefOr[XmlString] = js.undefined
    /**
         * The value of the filter.
         */
    var Values: js.UndefOr[Values] = js.undefined
  }
  
  
  trait Instance extends js.Object {
    /**
         * The Availability Zone in which the instance is running.
         */
    var AvailabilityZone: XmlStringMaxLen255
    /**
         * The last reported health status of the instance. "Healthy" means that the instance is healthy and should remain in service. "Unhealthy" means that the instance is unhealthy and that Amazon EC2 Auto Scaling should terminate and replace it.
         */
    var HealthStatus: XmlStringMaxLen32
    /**
         * The ID of the instance.
         */
    var InstanceId: XmlStringMaxLen19
    /**
         * The launch configuration associated with the instance.
         */
    var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The launch template for the instance.
         */
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
    /**
         * A description of the current lifecycle state. The Quarantined state is not used.
         */
    var LifecycleState: LifecycleState
    /**
         * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
         */
    var ProtectedFromScaleIn: InstanceProtected
  }
  
  
  trait InstanceMonitoring extends js.Object {
    /**
         * If true, detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
         */
    var Enabled: js.UndefOr[MonitoringEnabled] = js.undefined
  }
  
  
  trait InstancesDistribution extends js.Object {
    /**
         * Indicates how to allocate instance types to fulfill On-Demand capacity.  The only valid value is prioritized, which is also the default value. This strategy uses the order of instance types in the Overrides array of LaunchTemplate to define the launch priority of each instance type. The first instance type in the array is prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest priority instance, then the Auto Scaling groups launches the remaining capacity using the second priority instance type, and so on. 
         */
    var OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.undefined
    /**
         * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales. The default value is 0. If you leave this parameter set to 0, On-Demand Instances are launched as a percentage of the Auto Scaling group's desired capacity, per the OnDemandPercentageAboveBaseCapacity setting.
         */
    var OnDemandBaseCapacity: js.UndefOr[OnDemandBaseCapacity] = js.undefined
    /**
         * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.  The range is 0–100. The default value is 100. If you leave this parameter set to 100, the percentages are 100% for On-Demand Instances and 0% for Spot Instances. 
         */
    var OnDemandPercentageAboveBaseCapacity: js.UndefOr[OnDemandPercentageAboveBaseCapacity] = js.undefined
    /**
         * Indicates how to allocate Spot capacity across Spot pools. The only valid value is lowest-price, which is also the default value. The Auto Scaling group selects the cheapest Spot pools and evenly allocates your Spot capacity across the number of Spot pools that you specify. 
         */
    var SpotAllocationStrategy: js.UndefOr[XmlString] = js.undefined
    /**
         * The number of Spot pools to use to allocate your Spot capacity. The Spot pools are determined from the different instance types in the Overrides array of LaunchTemplate.  The range is 1–20 and the default is 2. 
         */
    var SpotInstancePools: js.UndefOr[SpotInstancePools] = js.undefined
    /**
         * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave this value blank (which is the default), the maximum Spot price is set at the On-Demand price. 
         */
    var SpotMaxPrice: js.UndefOr[SpotPrice] = js.undefined
  }
  
  
  trait LaunchConfiguration extends js.Object {
    /**
         * [EC2-VPC] Indicates whether to assign a public IP address to each instance.
         */
    var AssociatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined
    /**
         * A block device mapping, which specifies the block devices for the instance.
         */
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappings] = js.undefined
    /**
         * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. This parameter can only be used if you are launching EC2-Classic instances. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
         */
    var ClassicLinkVPCId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The IDs of one or more security groups for the VPC specified in ClassicLinkVPCId. This parameter is required if you specify a ClassicLink-enabled VPC, and cannot be used otherwise. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide.
         */
    var ClassicLinkVPCSecurityGroups: js.UndefOr[ClassicLinkVPCSecurityGroups] = js.undefined
    /**
         * The creation date and time for the launch configuration.
         */
    var CreatedTime: TimestampType
    /**
         * Controls whether the instance is optimized for EBS I/O (true) or not (false).
         */
    var EbsOptimized: js.UndefOr[EbsOptimized] = js.undefined
    /**
         * The name or Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance.
         */
    var IamInstanceProfile: js.UndefOr[XmlStringMaxLen1600] = js.undefined
    /**
         * The ID of the Amazon Machine Image (AMI).
         */
    var ImageId: XmlStringMaxLen255
    /**
         * Controls whether instances in this group are launched with detailed (true) or basic (false) monitoring.
         */
    var InstanceMonitoring: js.UndefOr[InstanceMonitoring] = js.undefined
    /**
         * The instance type for the instances.
         */
    var InstanceType: XmlStringMaxLen255
    /**
         * The ID of the kernel associated with the AMI.
         */
    var KernelId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The name of the key pair.
         */
    var KeyName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the launch configuration.
         */
    var LaunchConfigurationARN: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name of the launch configuration.
         */
    var LaunchConfigurationName: XmlStringMaxLen255
    /**
         * The tenancy of the instance, either default or dedicated. An instance with dedicated tenancy runs in an isolated, single-tenant hardware and can only be launched into a VPC.
         */
    var PlacementTenancy: js.UndefOr[XmlStringMaxLen64] = js.undefined
    /**
         * The ID of the RAM disk associated with the AMI.
         */
    var RamdiskId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The security groups to associate with the instances.
         */
    var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
         * The price to bid when launching Spot Instances.
         */
    var SpotPrice: js.UndefOr[SpotPrice] = js.undefined
    /**
         * The user data available to the instances.
         */
    var UserData: js.UndefOr[XmlStringUserData] = js.undefined
  }
  
  
  trait LaunchConfigurationNameType extends js.Object {
    /**
         * The name of the launch configuration.
         */
    var LaunchConfigurationName: ResourceName
  }
  
  
  trait LaunchConfigurationNamesType extends js.Object {
    /**
         * The launch configuration names. If you omit this parameter, all launch configurations are described.
         */
    var LaunchConfigurationNames: js.UndefOr[LaunchConfigurationNames] = js.undefined
    /**
         * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
         */
    var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
    /**
         * The token for the next set of items to return. (You received this token from a previous call.)
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait LaunchConfigurationsType extends js.Object {
    /**
         * The launch configurations.
         */
    var LaunchConfigurations: LaunchConfigurations
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
  }
  
  
  trait LaunchTemplate extends js.Object {
    /**
         * The launch template to use. You must specify either the launch template ID or launch template name in the request. 
         */
    var LaunchTemplateSpecification: js.UndefOr[LaunchTemplateSpecification] = js.undefined
    /**
         * Any parameters that you specify override the same parameters in the launch template. Currently, the only supported override is instance type.  You must specify between 2 and 20 overrides.
         */
    var Overrides: js.UndefOr[Overrides] = js.undefined
  }
  
  
  trait LaunchTemplateOverrides extends js.Object {
    /**
         * The instance type.  For information about available instance types, see Available Instance Types in the Amazon Elastic Compute Cloud User Guide. 
         */
    var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait LaunchTemplateSpecification extends js.Object {
    /**
         * The ID of the launch template. You must specify either a template ID or a template name.
         */
    var LaunchTemplateId: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The name of the launch template. You must specify either a template name or a template ID.
         */
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined
    /**
         * The version number, $Latest, or $Default. If the value is $Latest, Amazon EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the value is $Default, Amazon EC2 Auto Scaling selects the default version of the launch template when launching instances. The default value is $Default.
         */
    var Version: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait LifecycleHook extends js.Object {
    /**
         * The name of the Auto Scaling group for the lifecycle hook.
         */
    var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    /**
         * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON. The default value is CONTINUE.
         */
    var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
    /**
         * The maximum time, in seconds, that an instance can remain in a Pending:Wait or Terminating:Wait state. The maximum is 172800 seconds (48 hours) or 100 times HeartbeatTimeout, whichever is smaller.
         */
    var GlobalTimeout: js.UndefOr[GlobalTimeout] = js.undefined
    /**
         * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the default action. You can prevent the lifecycle hook from timing out by calling RecordLifecycleActionHeartbeat.
         */
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined
    /**
         * The name of the lifecycle hook.
         */
    var LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined
    /**
         * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
         */
    var LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined
    /**
         * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the notification target.
         */
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
    /**
         * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
         */
    var NotificationTargetARN: js.UndefOr[ResourceName] = js.undefined
    /**
         * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
         */
    var RoleARN: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait LifecycleHookSpecification extends js.Object {
    /**
         * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON.
         */
    var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
    /**
         * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the default action. You can prevent the lifecycle hook from timing out by calling RecordLifecycleActionHeartbeat.
         */
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined
    /**
         * The name of the lifecycle hook.
         */
    var LifecycleHookName: AsciiStringMaxLen255
    /**
         * The state of the EC2 instance to which you want to attach the lifecycle hook. The possible values are:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
         */
    var LifecycleTransition: LifecycleTransition
    /**
         * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the notification target.
         */
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
    /**
         * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
         */
    var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined
    /**
         * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
         */
    var RoleARN: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait LoadBalancerState extends js.Object {
    /**
         * The name of the load balancer.
         */
    var LoadBalancerName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * One of the following load balancer states:    Adding - The instances in the group are being registered with the load balancer.    Added - All instances in the group are registered with the load balancer.    InService - At least one instance in the group passed an ELB health check.    Removing - The instances in the group are being deregistered from the load balancer. If connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the instances.    Removed - All instances in the group are deregistered from the load balancer.  
         */
    var State: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait LoadBalancerTargetGroupState extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the target group.
         */
    var LoadBalancerTargetGroupARN: js.UndefOr[XmlStringMaxLen511] = js.undefined
    /**
         * The state of the target group.    Adding - The Auto Scaling instances are being registered with the target group.    Added - All Auto Scaling instances are registered with the target group.    InService - At least one Auto Scaling instance passed an ELB health check.    Removing - The Auto Scaling instances are being deregistered from the target group. If connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the instances.    Removed - All Auto Scaling instances are deregistered from the target group.  
         */
    var State: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait MetricCollectionType extends js.Object {
    /**
         * One of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances   
         */
    var Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait MetricDimension extends js.Object {
    /**
         * The name of the dimension.
         */
    var Name: MetricDimensionName
    /**
         * The value of the dimension.
         */
    var Value: MetricDimensionValue
  }
  
  
  trait MetricGranularityType extends js.Object {
    /**
         * The granularity. The only valid value is 1Minute.
         */
    var Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait MixedInstancesPolicy extends js.Object {
    /**
         * The instances distribution to use.  If you leave this parameter unspecified when creating the group, the default values are used.
         */
    var InstancesDistribution: js.UndefOr[InstancesDistribution] = js.undefined
    /**
         * The launch template and overrides. This parameter is required when creating an Auto Scaling group with a mixed instances policy, but is not required when updating the group.
         */
    var LaunchTemplate: js.UndefOr[LaunchTemplate] = js.undefined
  }
  
  
  trait NotificationConfiguration extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
    /**
         * One of the following event notification types:    autoscaling:EC2_INSTANCE_LAUNCH     autoscaling:EC2_INSTANCE_LAUNCH_ERROR     autoscaling:EC2_INSTANCE_TERMINATE     autoscaling:EC2_INSTANCE_TERMINATE_ERROR     autoscaling:TEST_NOTIFICATION   
         */
    var NotificationType: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
         */
    var TopicARN: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait PoliciesType extends js.Object {
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The scaling policies.
         */
    var ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined
  }
  
  
  trait PolicyARNType extends js.Object {
    /**
         * The CloudWatch alarms created for the target tracking policy.
         */
    var Alarms: js.UndefOr[Alarms] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the policy.
         */
    var PolicyARN: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait PredefinedMetricSpecification extends js.Object {
    /**
         * The metric type.
         */
    var PredefinedMetricType: MetricType
    /**
         * Identifies the resource associated with the metric type. The following predefined metrics are available:    ASGAverageCPUUtilization - Average CPU utilization of the Auto Scaling group.    ASGAverageNetworkIn - Average number of bytes received on all network interfaces by the Auto Scaling group.    ASGAverageNetworkOut - Average number of bytes sent out on all network interfaces by the Auto Scaling group.    ALBRequestCountPerTarget - Number of requests completed per target in an Application Load Balancer target group.   For predefined metric types ASGAverageCPUUtilization, ASGAverageNetworkIn, and ASGAverageNetworkOut, the parameter must not be specified as the resource associated with the metric type is the Auto Scaling group. For predefined metric type ALBRequestCountPerTarget, the parameter must be specified in the format: app/load-balancer-name/load-balancer-id/targetgroup/target-group-name/target-group-id , where app/load-balancer-name/load-balancer-id  is the final portion of the load balancer ARN, and targetgroup/target-group-name/target-group-id  is the final portion of the target group ARN. The target group must be attached to the Auto Scaling group.
         */
    var ResourceLabel: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  }
  
  
  trait ProcessType extends js.Object {
    /**
         * One of the following processes:    Launch     Terminate     AddToLoadBalancer     AlarmNotification     AZRebalance     HealthCheck     ReplaceUnhealthy     ScheduledActions   
         */
    var ProcessName: XmlStringMaxLen255
  }
  
  
  trait ProcessesType extends js.Object {
    /**
         * The names of the process types.
         */
    var Processes: js.UndefOr[Processes] = js.undefined
  }
  
  
  trait PutLifecycleHookAnswer extends js.Object
  
  
  trait PutLifecycleHookType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. This parameter can be either CONTINUE or ABANDON. The default value is ABANDON.
         */
    var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
    /**
         * The maximum time, in seconds, that can elapse before the lifecycle hook times out. The range is from 30 to 7200 seconds. The default is 3600 seconds (1 hour). If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the default action. You can prevent the lifecycle hook from timing out by calling RecordLifecycleActionHeartbeat.
         */
    var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined
    /**
         * The name of the lifecycle hook.
         */
    var LifecycleHookName: AsciiStringMaxLen255
    /**
         * The instance state to which you want to attach the lifecycle hook. The possible values are:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING   This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
         */
    var LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined
    /**
         * Contains additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the notification target.
         */
    var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
    /**
         * The ARN of the notification target that Amazon EC2 Auto Scaling uses to notify you when an instance is in the transition state for the lifecycle hook. This target can be either an SQS queue or an SNS topic. If you specify an empty string, this overrides the current ARN. This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email key-value pair format when sending notifications to an Amazon SNS topic. When you specify a notification target, Amazon EC2 Auto Scaling sends it a test message. Test messages contain the following additional key-value pair: "Event": "autoscaling:TEST_NOTIFICATION".
         */
    var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined
    /**
         * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target. This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
         */
    var RoleARN: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait PutNotificationConfigurationType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The type of event that causes the notification to be sent. For more information about notification types supported by Amazon EC2 Auto Scaling, see DescribeAutoScalingNotificationTypes.
         */
    var NotificationTypes: AutoScalingNotificationTypes
    /**
         * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic.
         */
    var TopicARN: ResourceName
  }
  
  
  trait PutScalingPolicyType extends js.Object {
    /**
         * The adjustment type. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity. This parameter is supported if the policy type is SimpleScaling or StepScaling. For more information, see Dynamic Scaling in the Amazon EC2 Auto Scaling User Guide.
         */
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start. If this parameter is not specified, the default cooldown period for the group applies. This parameter is supported if the policy type is SimpleScaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
         */
    var Cooldown: js.UndefOr[Cooldown] = js.undefined
    /**
         * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. The default is to use the value specified for the default cooldown period for the group. This parameter is supported if the policy type is StepScaling or TargetTrackingScaling.
         */
    var EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined
    /**
         * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average. If the aggregation type is null, the value is treated as Average. This parameter is supported if the policy type is StepScaling.
         */
    var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined
    /**
         * The minimum number of instances to scale. If the value of AdjustmentType is PercentChangeInCapacity, the scaling policy changes the DesiredCapacity of the Auto Scaling group by at least this many instances. Otherwise, the error is ValidationError. This parameter is supported if the policy type is SimpleScaling or StepScaling.
         */
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined
    /**
         * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
         */
    var MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined
    /**
         * The name of the policy.
         */
    var PolicyName: XmlStringMaxLen255
    /**
         * The policy type. The valid values are SimpleScaling, StepScaling, and TargetTrackingScaling. If the policy type is null, the value is treated as SimpleScaling.
         */
    var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined
    /**
         * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity. This parameter is required if the policy type is SimpleScaling and not supported otherwise.
         */
    var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined
    /**
         * A set of adjustments that enable you to scale based on the size of the alarm breach. This parameter is required if the policy type is StepScaling and not supported otherwise.
         */
    var StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined
    /**
         * A target tracking policy. This parameter is required if the policy type is TargetTrackingScaling and not supported otherwise.
         */
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
  }
  
  
  trait PutScheduledUpdateGroupActionType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The number of EC2 instances that should be running in the group.
         */
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
    /**
         * The time for the recurring schedule to end. Amazon EC2 Auto Scaling does not perform the action after this time.
         */
    var EndTime: js.UndefOr[TimestampType] = js.undefined
    /**
         * The maximum size for the Auto Scaling group.
         */
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined
    /**
         * The minimum size for the Auto Scaling group.
         */
    var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined
    /**
         * The recurring schedule for this action, in Unix cron syntax format. For more information about this format, see Crontab.
         */
    var Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The name of this scaling action.
         */
    var ScheduledActionName: XmlStringMaxLen255
    /**
         * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z). If you specify Recurrence and StartTime, Amazon EC2 Auto Scaling performs the action at this time, and then performs the action based on the specified recurrence. If you try to schedule your action in the past, Amazon EC2 Auto Scaling returns an error message.
         */
    var StartTime: js.UndefOr[TimestampType] = js.undefined
    /**
         * This parameter is deprecated.
         */
    var Time: js.UndefOr[TimestampType] = js.undefined
  }
  
  
  trait RecordLifecycleActionHeartbeatAnswer extends js.Object
  
  
  trait RecordLifecycleActionHeartbeatType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The ID of the instance.
         */
    var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined
    /**
         * A token that uniquely identifies a specific lifecycle action associated with an instance. Amazon EC2 Auto Scaling sends this token to the notification target that you specified when you created the lifecycle hook.
         */
    var LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined
    /**
         * The name of the lifecycle hook.
         */
    var LifecycleHookName: AsciiStringMaxLen255
  }
  
  
  trait ScalingPolicy extends js.Object {
    /**
         * The adjustment type, which specifies how ScalingAdjustment is interpreted. Valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
         */
    var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The CloudWatch alarms related to the policy.
         */
    var Alarms: js.UndefOr[Alarms] = js.undefined
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The amount of time, in seconds, after a scaling activity completes before any further dynamic scaling activities can start.
         */
    var Cooldown: js.UndefOr[Cooldown] = js.undefined
    /**
         * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
         */
    var EstimatedInstanceWarmup: js.UndefOr[EstimatedInstanceWarmup] = js.undefined
    /**
         * The aggregation type for the CloudWatch metrics. Valid values are Minimum, Maximum, and Average.
         */
    var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.undefined
    /**
         * The minimum number of instances to scale. If the value of AdjustmentType is PercentChangeInCapacity, the scaling policy changes the DesiredCapacity of the Auto Scaling group by at least this many instances. Otherwise, the error is ValidationError.
         */
    var MinAdjustmentMagnitude: js.UndefOr[MinAdjustmentMagnitude] = js.undefined
    /**
         * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
         */
    var MinAdjustmentStep: js.UndefOr[MinAdjustmentStep] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the policy.
         */
    var PolicyARN: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name of the scaling policy.
         */
    var PolicyName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The policy type. Valid values are SimpleScaling and StepScaling.
         */
    var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.undefined
    /**
         * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity.
         */
    var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.undefined
    /**
         * A set of adjustments that enable you to scale based on the size of the alarm breach.
         */
    var StepAdjustments: js.UndefOr[StepAdjustments] = js.undefined
    /**
         * A target tracking policy.
         */
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
  }
  
  
  trait ScalingProcessQuery extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * One or more of the following processes. If you omit this parameter, all processes are specified.    Launch     Terminate     HealthCheck     ReplaceUnhealthy     AZRebalance     AlarmNotification     ScheduledActions     AddToLoadBalancer   
         */
    var ScalingProcesses: js.UndefOr[ProcessNames] = js.undefined
  }
  
  
  trait ScheduledActionsType extends js.Object {
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * The scheduled actions.
         */
    var ScheduledUpdateGroupActions: js.UndefOr[ScheduledUpdateGroupActions] = js.undefined
  }
  
  
  trait ScheduledUpdateGroupAction extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The number of instances you prefer to maintain in the group.
         */
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
    /**
         * The date and time that the action is scheduled to end. This date and time can be up to one month in the future.
         */
    var EndTime: js.UndefOr[TimestampType] = js.undefined
    /**
         * The maximum size of the group.
         */
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined
    /**
         * The minimum size of the group.
         */
    var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined
    /**
         * The recurring schedule for the action.
         */
    var Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the scheduled action.
         */
    var ScheduledActionARN: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name of the scheduled action.
         */
    var ScheduledActionName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The date and time that the action is scheduled to begin. This date and time can be up to one month in the future. When StartTime and EndTime are specified with Recurrence, they form the boundaries of when the recurring action starts and stops.
         */
    var StartTime: js.UndefOr[TimestampType] = js.undefined
    /**
         * This parameter is deprecated.
         */
    var Time: js.UndefOr[TimestampType] = js.undefined
  }
  
  
  trait ScheduledUpdateGroupActionRequest extends js.Object {
    /**
         * The number of EC2 instances that should be running in the group.
         */
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
    /**
         * The time for the recurring schedule to end. Amazon EC2 Auto Scaling does not perform the action after this time.
         */
    var EndTime: js.UndefOr[TimestampType] = js.undefined
    /**
         * The maximum size of the group.
         */
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined
    /**
         * The minimum size of the group.
         */
    var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined
    /**
         * The recurring schedule for the action, in Unix cron syntax format. For more information about this format, see Crontab.
         */
    var Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The name of the scaling action.
         */
    var ScheduledActionName: XmlStringMaxLen255
    /**
         * The time for the action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z). If you specify Recurrence and StartTime, Amazon EC2 Auto Scaling performs the action at this time, and then performs the action based on the specified recurrence. If you try to schedule the action in the past, Amazon EC2 Auto Scaling returns an error message.
         */
    var StartTime: js.UndefOr[TimestampType] = js.undefined
  }
  
  
  trait SetDesiredCapacityType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * The number of EC2 instances that should be running in the Auto Scaling group.
         */
    var DesiredCapacity: AutoScalingGroupDesiredCapacity
    /**
         * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor the cooldown period during manual scaling activities.
         */
    var HonorCooldown: js.UndefOr[HonorCooldown] = js.undefined
  }
  
  
  trait SetInstanceHealthQuery extends js.Object {
    /**
         * The health status of the instance. Set to Healthy to have the instance remain in service. Set to Unhealthy to have the instance be out of service. Amazon EC2 Auto Scaling terminates and replaces the unhealthy instance.
         */
    var HealthStatus: XmlStringMaxLen32
    /**
         * The ID of the instance.
         */
    var InstanceId: XmlStringMaxLen19
    /**
         * If the Auto Scaling group of the specified instance has a HealthCheckGracePeriod specified for the group, by default, this call respects the grace period. Set this to False, to have the call not respect the grace period associated with the group. For more information about the health check grace period, see CreateAutoScalingGroup.
         */
    var ShouldRespectGracePeriod: js.UndefOr[ShouldRespectGracePeriod] = js.undefined
  }
  
  
  trait SetInstanceProtectionAnswer extends js.Object
  
  
  trait SetInstanceProtectionQuery extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * One or more instance IDs.
         */
    var InstanceIds: InstanceIds
    /**
         * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
         */
    var ProtectedFromScaleIn: ProtectedFromScaleIn
  }
  
  
  trait StepAdjustment extends js.Object {
    /**
         * The lower bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the lower bound is inclusive (the metric must be greater than or equal to the threshold plus the lower bound). Otherwise, it is exclusive (the metric must be greater than the threshold plus the lower bound). A null value indicates negative infinity.
         */
    var MetricIntervalLowerBound: js.UndefOr[MetricScale] = js.undefined
    /**
         * The upper bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the upper bound is exclusive (the metric must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric must be less than or equal to the threshold plus the upper bound). A null value indicates positive infinity. The upper bound must be greater than the lower bound.
         */
    var MetricIntervalUpperBound: js.UndefOr[MetricScale] = js.undefined
    /**
         * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity.
         */
    var ScalingAdjustment: PolicyIncrement
  }
  
  
  trait SuspendedProcess extends js.Object {
    /**
         * The name of the suspended process.
         */
    var ProcessName: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The reason that the process was suspended.
         */
    var SuspensionReason: js.UndefOr[XmlStringMaxLen255] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * The tag key.
         */
    var Key: TagKey
    /**
         * Determines whether the tag is added to new instances as they are launched in the group.
         */
    var PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined
    /**
         * The name of the group.
         */
    var ResourceId: js.UndefOr[XmlString] = js.undefined
    /**
         * The type of resource. The only supported value is auto-scaling-group.
         */
    var ResourceType: js.UndefOr[XmlString] = js.undefined
    /**
         * The tag value.
         */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait TagDescription extends js.Object {
    /**
         * The tag key.
         */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
         * Determines whether the tag is added to new instances as they are launched in the group.
         */
    var PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined
    /**
         * The name of the group.
         */
    var ResourceId: js.UndefOr[XmlString] = js.undefined
    /**
         * The type of resource. The only supported value is auto-scaling-group.
         */
    var ResourceType: js.UndefOr[XmlString] = js.undefined
    /**
         * The tag value.
         */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait TagsType extends js.Object {
    /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
    var NextToken: js.UndefOr[XmlString] = js.undefined
    /**
         * One or more tags.
         */
    var Tags: js.UndefOr[TagDescriptionList] = js.undefined
  }
  
  
  trait TargetTrackingConfiguration extends js.Object {
    /**
         * A customized metric.
         */
    var CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification] = js.undefined
    /**
         * Indicates whether scaling in by the target tracking policy is disabled. If scaling in is disabled, the target tracking policy doesn't remove instances from the Auto Scaling group. Otherwise, the target tracking policy can remove instances from the Auto Scaling group. The default is disabled.
         */
    var DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined
    /**
         * A predefined metric. You can specify either a predefined metric or a customized metric.
         */
    var PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification] = js.undefined
    /**
         * The target value for the metric.
         */
    var TargetValue: MetricScale
  }
  
  
  trait TerminateInstanceInAutoScalingGroupType extends js.Object {
    /**
         * The ID of the instance.
         */
    var InstanceId: XmlStringMaxLen19
    /**
         * Indicates whether terminating the instance also decrements the size of the Auto Scaling group.
         */
    var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachInstances(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachInstances(params: AttachInstancesQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachInstances(
      params: AttachInstancesQuery,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachLoadBalancerTargetGroups(): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachLoadBalancerTargetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachLoadBalancerTargetGroupsResultType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachLoadBalancerTargetGroups(params: AttachLoadBalancerTargetGroupsType): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachLoadBalancerTargetGroups(
      params: AttachLoadBalancerTargetGroupsType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachLoadBalancerTargetGroupsResultType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachLoadBalancers(): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachLoadBalancers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachLoadBalancersResultType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachLoadBalancers(params: AttachLoadBalancersType): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def attachLoadBalancers(
      params: AttachLoadBalancersType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachLoadBalancersResultType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more scheduled actions for the specified Auto Scaling group.
       */
    def batchDeleteScheduledAction(): awsDashSdkLib.libRequestMod.Request[BatchDeleteScheduledActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more scheduled actions for the specified Auto Scaling group.
       */
    def batchDeleteScheduledAction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteScheduledActionAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteScheduledActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more scheduled actions for the specified Auto Scaling group.
       */
    def batchDeleteScheduledAction(params: BatchDeleteScheduledActionType): awsDashSdkLib.libRequestMod.Request[BatchDeleteScheduledActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more scheduled actions for the specified Auto Scaling group.
       */
    def batchDeleteScheduledAction(
      params: BatchDeleteScheduledActionType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteScheduledActionAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteScheduledActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.
       */
    def batchPutScheduledUpdateGroupAction(): awsDashSdkLib.libRequestMod.Request[BatchPutScheduledUpdateGroupActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.
       */
    def batchPutScheduledUpdateGroupAction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchPutScheduledUpdateGroupActionAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchPutScheduledUpdateGroupActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.
       */
    def batchPutScheduledUpdateGroupAction(params: BatchPutScheduledUpdateGroupActionType): awsDashSdkLib.libRequestMod.Request[BatchPutScheduledUpdateGroupActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.
       */
    def batchPutScheduledUpdateGroupAction(
      params: BatchPutScheduledUpdateGroupActionType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchPutScheduledUpdateGroupActionAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchPutScheduledUpdateGroupActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
       */
    def completeLifecycleAction(): awsDashSdkLib.libRequestMod.Request[CompleteLifecycleActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
       */
    def completeLifecycleAction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CompleteLifecycleActionAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CompleteLifecycleActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
       */
    def completeLifecycleAction(params: CompleteLifecycleActionType): awsDashSdkLib.libRequestMod.Request[CompleteLifecycleActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
       */
    def completeLifecycleAction(
      params: CompleteLifecycleActionType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CompleteLifecycleActionAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CompleteLifecycleActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling Groups in the Amazon EC2 Auto Scaling User Guide.
       */
    def createAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling Groups in the Amazon EC2 Auto Scaling User Guide.
       */
    def createAutoScalingGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling Groups in the Amazon EC2 Auto Scaling User Guide.
       */
    def createAutoScalingGroup(params: CreateAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling Groups in the Amazon EC2 Auto Scaling User Guide.
       */
    def createAutoScalingGroup(
      params: CreateAutoScalingGroupType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
       */
    def createLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
       */
    def createLaunchConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
       */
    def createLaunchConfiguration(params: CreateLaunchConfigurationType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
       */
    def createLaunchConfiguration(
      params: CreateLaunchConfigurationType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
       */
    def createOrUpdateTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
       */
    def createOrUpdateTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
       */
    def createOrUpdateTags(params: CreateOrUpdateTagsType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
       */
    def createOrUpdateTags(
      params: CreateOrUpdateTagsType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
       */
    def deleteAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
       */
    def deleteAutoScalingGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
       */
    def deleteAutoScalingGroup(params: DeleteAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
       */
    def deleteAutoScalingGroup(
      params: DeleteAutoScalingGroupType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
       */
    def deleteLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
       */
    def deleteLaunchConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
       */
    def deleteLaunchConfiguration(params: LaunchConfigurationNameType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
       */
    def deleteLaunchConfiguration(
      params: LaunchConfigurationNameType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
       */
    def deleteLifecycleHook(): awsDashSdkLib.libRequestMod.Request[DeleteLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
       */
    def deleteLifecycleHook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLifecycleHookAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
       */
    def deleteLifecycleHook(params: DeleteLifecycleHookType): awsDashSdkLib.libRequestMod.Request[DeleteLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
       */
    def deleteLifecycleHook(
      params: DeleteLifecycleHookType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLifecycleHookAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified notification.
       */
    def deleteNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified notification.
       */
    def deleteNotificationConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified notification.
       */
    def deleteNotificationConfiguration(params: DeleteNotificationConfigurationType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified notification.
       */
    def deleteNotificationConfiguration(
      params: DeleteNotificationConfigurationType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Auto Scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
       */
    def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Auto Scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
       */
    def deletePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Auto Scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
       */
    def deletePolicy(params: DeletePolicyType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified Auto Scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
       */
    def deletePolicy(
      params: DeletePolicyType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified scheduled action.
       */
    def deleteScheduledAction(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified scheduled action.
       */
    def deleteScheduledAction(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified scheduled action.
       */
    def deleteScheduledAction(params: DeleteScheduledActionType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified scheduled action.
       */
    def deleteScheduledAction(
      params: DeleteScheduledActionType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified tags.
       */
    def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified tags.
       */
    def deleteTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified tags.
       */
    def deleteTags(params: DeleteTagsType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified tags.
       */
    def deleteTags(
      params: DeleteTagsType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the current Auto Scaling resource limits for your AWS account. For information about requesting an increase in these limits, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide.
       */
    def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the current Auto Scaling resource limits for your AWS account. For information about requesting an increase in these limits, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide.
       */
    def describeAccountLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountLimitsAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the policy adjustment types for use with PutScalingPolicy.
       */
    def describeAdjustmentTypes(): awsDashSdkLib.libRequestMod.Request[DescribeAdjustmentTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the policy adjustment types for use with PutScalingPolicy.
       */
    def describeAdjustmentTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAdjustmentTypesAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAdjustmentTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more Auto Scaling groups.
       */
    def describeAutoScalingGroups(): awsDashSdkLib.libRequestMod.Request[AutoScalingGroupsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more Auto Scaling groups.
       */
    def describeAutoScalingGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AutoScalingGroupsType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AutoScalingGroupsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more Auto Scaling groups.
       */
    def describeAutoScalingGroups(params: AutoScalingGroupNamesType): awsDashSdkLib.libRequestMod.Request[AutoScalingGroupsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more Auto Scaling groups.
       */
    def describeAutoScalingGroups(
      params: AutoScalingGroupNamesType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AutoScalingGroupsType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AutoScalingGroupsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more Auto Scaling instances.
       */
    def describeAutoScalingInstances(): awsDashSdkLib.libRequestMod.Request[AutoScalingInstancesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more Auto Scaling instances.
       */
    def describeAutoScalingInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AutoScalingInstancesType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AutoScalingInstancesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more Auto Scaling instances.
       */
    def describeAutoScalingInstances(params: DescribeAutoScalingInstancesType): awsDashSdkLib.libRequestMod.Request[AutoScalingInstancesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more Auto Scaling instances.
       */
    def describeAutoScalingInstances(
      params: DescribeAutoScalingInstancesType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AutoScalingInstancesType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AutoScalingInstancesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
       */
    def describeAutoScalingNotificationTypes(): awsDashSdkLib.libRequestMod.Request[DescribeAutoScalingNotificationTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
       */
    def describeAutoScalingNotificationTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAutoScalingNotificationTypesAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAutoScalingNotificationTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more launch configurations.
       */
    def describeLaunchConfigurations(): awsDashSdkLib.libRequestMod.Request[LaunchConfigurationsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more launch configurations.
       */
    def describeLaunchConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LaunchConfigurationsType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LaunchConfigurationsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more launch configurations.
       */
    def describeLaunchConfigurations(params: LaunchConfigurationNamesType): awsDashSdkLib.libRequestMod.Request[LaunchConfigurationsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more launch configurations.
       */
    def describeLaunchConfigurations(
      params: LaunchConfigurationNamesType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LaunchConfigurationsType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LaunchConfigurationsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the available types of lifecycle hooks. The following hook types are supported:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
       */
    def describeLifecycleHookTypes(): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHookTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the available types of lifecycle hooks. The following hook types are supported:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
       */
    def describeLifecycleHookTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLifecycleHookTypesAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHookTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the lifecycle hooks for the specified Auto Scaling group.
       */
    def describeLifecycleHooks(): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHooksAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the lifecycle hooks for the specified Auto Scaling group.
       */
    def describeLifecycleHooks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLifecycleHooksAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHooksAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the lifecycle hooks for the specified Auto Scaling group.
       */
    def describeLifecycleHooks(params: DescribeLifecycleHooksType): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHooksAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the lifecycle hooks for the specified Auto Scaling group.
       */
    def describeLifecycleHooks(
      params: DescribeLifecycleHooksType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLifecycleHooksAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHooksAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the target groups for the specified Auto Scaling group.
       */
    def describeLoadBalancerTargetGroups(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerTargetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the target groups for the specified Auto Scaling group.
       */
    def describeLoadBalancerTargetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerTargetGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerTargetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the target groups for the specified Auto Scaling group.
       */
    def describeLoadBalancerTargetGroups(params: DescribeLoadBalancerTargetGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerTargetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the target groups for the specified Auto Scaling group.
       */
    def describeLoadBalancerTargetGroups(
      params: DescribeLoadBalancerTargetGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancerTargetGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerTargetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the load balancers for the specified Auto Scaling group. This operation describes only Classic Load Balancers. If you have Application Load Balancers, use DescribeLoadBalancerTargetGroups instead.
       */
    def describeLoadBalancers(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the load balancers for the specified Auto Scaling group. This operation describes only Classic Load Balancers. If you have Application Load Balancers, use DescribeLoadBalancerTargetGroups instead.
       */
    def describeLoadBalancers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the load balancers for the specified Auto Scaling group. This operation describes only Classic Load Balancers. If you have Application Load Balancers, use DescribeLoadBalancerTargetGroups instead.
       */
    def describeLoadBalancers(params: DescribeLoadBalancersRequest): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the load balancers for the specified Auto Scaling group. This operation describes only Classic Load Balancers. If you have Application Load Balancers, use DescribeLoadBalancerTargetGroups instead.
       */
    def describeLoadBalancers(
      params: DescribeLoadBalancersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLoadBalancersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling. The GroupStandbyInstances metric is not returned by default. You must explicitly request this metric when calling EnableMetricsCollection.
       */
    def describeMetricCollectionTypes(): awsDashSdkLib.libRequestMod.Request[DescribeMetricCollectionTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling. The GroupStandbyInstances metric is not returned by default. You must explicitly request this metric when calling EnableMetricsCollection.
       */
    def describeMetricCollectionTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMetricCollectionTypesAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMetricCollectionTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the notification actions associated with the specified Auto Scaling group.
       */
    def describeNotificationConfigurations(): awsDashSdkLib.libRequestMod.Request[DescribeNotificationConfigurationsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the notification actions associated with the specified Auto Scaling group.
       */
    def describeNotificationConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNotificationConfigurationsAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationConfigurationsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the notification actions associated with the specified Auto Scaling group.
       */
    def describeNotificationConfigurations(params: DescribeNotificationConfigurationsType): awsDashSdkLib.libRequestMod.Request[DescribeNotificationConfigurationsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the notification actions associated with the specified Auto Scaling group.
       */
    def describeNotificationConfigurations(
      params: DescribeNotificationConfigurationsType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNotificationConfigurationsAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationConfigurationsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the policies for the specified Auto Scaling group.
       */
    def describePolicies(): awsDashSdkLib.libRequestMod.Request[PoliciesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the policies for the specified Auto Scaling group.
       */
    def describePolicies(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PoliciesType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PoliciesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the policies for the specified Auto Scaling group.
       */
    def describePolicies(params: DescribePoliciesType): awsDashSdkLib.libRequestMod.Request[PoliciesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the policies for the specified Auto Scaling group.
       */
    def describePolicies(
      params: DescribePoliciesType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PoliciesType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PoliciesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more scaling activities for the specified Auto Scaling group.
       */
    def describeScalingActivities(): awsDashSdkLib.libRequestMod.Request[ActivitiesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more scaling activities for the specified Auto Scaling group.
       */
    def describeScalingActivities(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivitiesType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ActivitiesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more scaling activities for the specified Auto Scaling group.
       */
    def describeScalingActivities(params: DescribeScalingActivitiesType): awsDashSdkLib.libRequestMod.Request[ActivitiesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes one or more scaling activities for the specified Auto Scaling group.
       */
    def describeScalingActivities(
      params: DescribeScalingActivitiesType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivitiesType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ActivitiesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scaling process types for use with ResumeProcesses and SuspendProcesses.
       */
    def describeScalingProcessTypes(): awsDashSdkLib.libRequestMod.Request[ProcessesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the scaling process types for use with ResumeProcesses and SuspendProcesses.
       */
    def describeScalingProcessTypes(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ProcessesType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ProcessesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
       */
    def describeScheduledActions(): awsDashSdkLib.libRequestMod.Request[ScheduledActionsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
       */
    def describeScheduledActions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ScheduledActionsType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ScheduledActionsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
       */
    def describeScheduledActions(params: DescribeScheduledActionsType): awsDashSdkLib.libRequestMod.Request[ScheduledActionsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
       */
    def describeScheduledActions(
      params: DescribeScheduledActionsType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ScheduledActionsType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ScheduledActionsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
       */
    def describeTags(): awsDashSdkLib.libRequestMod.Request[TagsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
       */
    def describeTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagsType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
       */
    def describeTags(params: DescribeTagsType): awsDashSdkLib.libRequestMod.Request[TagsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
       */
    def describeTags(
      params: DescribeTagsType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagsType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the termination policies supported by Amazon EC2 Auto Scaling. For more information, see Controlling Which Auto Scaling Instances Terminate During Scale In in the Amazon EC2 Auto Scaling User Guide.
       */
    def describeTerminationPolicyTypes(): awsDashSdkLib.libRequestMod.Request[DescribeTerminationPolicyTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the termination policies supported by Amazon EC2 Auto Scaling. For more information, see Controlling Which Auto Scaling Instances Terminate During Scale In in the Amazon EC2 Auto Scaling User Guide.
       */
    def describeTerminationPolicyTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTerminationPolicyTypesAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTerminationPolicyTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def detachInstances(): awsDashSdkLib.libRequestMod.Request[DetachInstancesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def detachInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachInstancesAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachInstancesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def detachInstances(params: DetachInstancesQuery): awsDashSdkLib.libRequestMod.Request[DetachInstancesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def detachInstances(
      params: DetachInstancesQuery,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachInstancesAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachInstancesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches one or more target groups from the specified Auto Scaling group.
       */
    def detachLoadBalancerTargetGroups(): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches one or more target groups from the specified Auto Scaling group.
       */
    def detachLoadBalancerTargetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachLoadBalancerTargetGroupsResultType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches one or more target groups from the specified Auto Scaling group.
       */
    def detachLoadBalancerTargetGroups(params: DetachLoadBalancerTargetGroupsType): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches one or more target groups from the specified Auto Scaling group.
       */
    def detachLoadBalancerTargetGroups(
      params: DetachLoadBalancerTargetGroupsType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachLoadBalancerTargetGroupsResultType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. This operation detaches only Classic Load Balancers. If you have Application Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. The instances remain running.
       */
    def detachLoadBalancers(): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. This operation detaches only Classic Load Balancers. If you have Application Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. The instances remain running.
       */
    def detachLoadBalancers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachLoadBalancersResultType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. This operation detaches only Classic Load Balancers. If you have Application Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. The instances remain running.
       */
    def detachLoadBalancers(params: DetachLoadBalancersType): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. This operation detaches only Classic Load Balancers. If you have Application Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. The instances remain running.
       */
    def detachLoadBalancers(
      params: DetachLoadBalancersType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachLoadBalancersResultType, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables group metrics for the specified Auto Scaling group.
       */
    def disableMetricsCollection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables group metrics for the specified Auto Scaling group.
       */
    def disableMetricsCollection(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables group metrics for the specified Auto Scaling group.
       */
    def disableMetricsCollection(params: DisableMetricsCollectionQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables group metrics for the specified Auto Scaling group.
       */
    def disableMetricsCollection(
      params: DisableMetricsCollectionQuery,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
       */
    def enableMetricsCollection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
       */
    def enableMetricsCollection(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
       */
    def enableMetricsCollection(params: EnableMetricsCollectionQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
       */
    def enableMetricsCollection(
      params: EnableMetricsCollectionQuery,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def enterStandby(): awsDashSdkLib.libRequestMod.Request[EnterStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def enterStandby(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnterStandbyAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnterStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def enterStandby(params: EnterStandbyQuery): awsDashSdkLib.libRequestMod.Request[EnterStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def enterStandby(
      params: EnterStandbyQuery,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnterStandbyAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnterStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Executes the specified policy.
       */
    def executePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Executes the specified policy.
       */
    def executePolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Executes the specified policy.
       */
    def executePolicy(params: ExecutePolicyType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Executes the specified policy.
       */
    def executePolicy(
      params: ExecutePolicyType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def exitStandby(): awsDashSdkLib.libRequestMod.Request[ExitStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def exitStandby(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExitStandbyAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExitStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def exitStandby(params: ExitStandbyQuery): awsDashSdkLib.libRequestMod.Request[ExitStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
       */
    def exitStandby(
      params: ExitStandbyQuery,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExitStandbyAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExitStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a lifecycle hook for the specified Auto Scaling group. A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance that is not actively in service; for example, either when the instance launches or before the instance terminates. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.   If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
       */
    def putLifecycleHook(): awsDashSdkLib.libRequestMod.Request[PutLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a lifecycle hook for the specified Auto Scaling group. A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance that is not actively in service; for example, either when the instance launches or before the instance terminates. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.   If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
       */
    def putLifecycleHook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLifecycleHookAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a lifecycle hook for the specified Auto Scaling group. A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance that is not actively in service; for example, either when the instance launches or before the instance terminates. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.   If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
       */
    def putLifecycleHook(params: PutLifecycleHookType): awsDashSdkLib.libRequestMod.Request[PutLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a lifecycle hook for the specified Auto Scaling group. A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance that is not actively in service; for example, either when the instance launches or before the instance terminates. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.   If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
       */
    def putLifecycleHook(
      params: PutLifecycleHookType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLifecycleHookAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information, see Getting SNS Notifications When Your Auto Scaling Group Scales in the Auto Scaling User Guide.
       */
    def putNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information, see Getting SNS Notifications When Your Auto Scaling Group Scales in the Auto Scaling User Guide.
       */
    def putNotificationConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information, see Getting SNS Notifications When Your Auto Scaling Group Scales in the Auto Scaling User Guide.
       */
    def putNotificationConfiguration(params: PutNotificationConfigurationType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information, see Getting SNS Notifications When Your Auto Scaling Group Scales in the Auto Scaling User Guide.
       */
    def putNotificationConfiguration(
      params: PutNotificationConfigurationType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request. If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
       */
    def putScalingPolicy(): awsDashSdkLib.libRequestMod.Request[PolicyARNType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request. If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
       */
    def putScalingPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PolicyARNType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PolicyARNType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request. If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
       */
    def putScalingPolicy(params: PutScalingPolicyType): awsDashSdkLib.libRequestMod.Request[PolicyARNType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request. If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
       */
    def putScalingPolicy(
      params: PutScalingPolicyType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PolicyARNType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PolicyARNType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
       */
    def putScheduledUpdateGroupAction(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
       */
    def putScheduledUpdateGroupAction(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
       */
    def putScheduledUpdateGroupAction(params: PutScheduledUpdateGroupActionType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
       */
    def putScheduledUpdateGroupAction(
      params: PutScheduledUpdateGroupActionType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
       */
    def recordLifecycleActionHeartbeat(): awsDashSdkLib.libRequestMod.Request[RecordLifecycleActionHeartbeatAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
       */
    def recordLifecycleActionHeartbeat(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RecordLifecycleActionHeartbeatAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RecordLifecycleActionHeartbeatAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
       */
    def recordLifecycleActionHeartbeat(params: RecordLifecycleActionHeartbeatType): awsDashSdkLib.libRequestMod.Request[RecordLifecycleActionHeartbeatAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
       */
    def recordLifecycleActionHeartbeat(
      params: RecordLifecycleActionHeartbeatType,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RecordLifecycleActionHeartbeatAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RecordLifecycleActionHeartbeatAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
       */
    def resumeProcesses(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
       */
    def resumeProcesses(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
       */
    def resumeProcesses(params: ScalingProcessQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
       */
    def resumeProcesses(
      params: ScalingProcessQuery,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
       */
    def setDesiredCapacity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
       */
    def setDesiredCapacity(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
       */
    def setDesiredCapacity(params: SetDesiredCapacityType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
       */
    def setDesiredCapacity(
      params: SetDesiredCapacityType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the health status of the specified instance. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
       */
    def setInstanceHealth(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the health status of the specified instance. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
       */
    def setInstanceHealth(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the health status of the specified instance. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
       */
    def setInstanceHealth(params: SetInstanceHealthQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the health status of the specified instance. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
       */
    def setInstanceHealth(
      params: SetInstanceHealthQuery,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the instance protection settings of the specified instances. For more information, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
       */
    def setInstanceProtection(): awsDashSdkLib.libRequestMod.Request[SetInstanceProtectionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the instance protection settings of the specified instances. For more information, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
       */
    def setInstanceProtection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetInstanceProtectionAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetInstanceProtectionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the instance protection settings of the specified instances. For more information, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
       */
    def setInstanceProtection(params: SetInstanceProtectionQuery): awsDashSdkLib.libRequestMod.Request[SetInstanceProtectionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the instance protection settings of the specified instances. For more information, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
       */
    def setInstanceProtection(
      params: SetInstanceProtectionQuery,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetInstanceProtectionAnswer, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetInstanceProtectionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. If you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
       */
    def suspendProcesses(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. If you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
       */
    def suspendProcesses(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. If you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
       */
    def suspendProcesses(params: ScalingProcessQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. If you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
       */
    def suspendProcesses(
      params: ScalingProcessQuery,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
       */
    def terminateInstanceInAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[ActivityType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
       */
    def terminateInstanceInAutoScalingGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivityType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ActivityType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
       */
    def terminateInstanceInAutoScalingGroup(params: TerminateInstanceInAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[ActivityType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
       */
    def terminateInstanceInAutoScalingGroup(
      params: TerminateInstanceInAutoScalingGroupType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivityType, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ActivityType, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
       */
    def updateAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
       */
    def updateAutoScalingGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
       */
    def updateAutoScalingGroup(params: UpdateAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
       */
    def updateAutoScalingGroup(
      params: UpdateAutoScalingGroupType,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateAutoScalingGroupType extends js.Object {
    /**
         * The name of the Auto Scaling group.
         */
    var AutoScalingGroupName: ResourceName
    /**
         * One or more Availability Zones for the group.
         */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
         * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default is 300. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
         */
    var DefaultCooldown: js.UndefOr[Cooldown] = js.undefined
    /**
         * The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group.
         */
    var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
    /**
         * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. The default is 0. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
         */
    var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined
    /**
         * The service to use for the health checks. The valid values are EC2 and ELB.
         */
    var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined
    /**
         * The name of the launch configuration. If you specify this parameter, you can't specify a launch template or a mixed instances policy.
         */
    var LaunchConfigurationName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The launch template and version to use to specify the updates. If you specify this parameter, you can't specify a launch configuration or a mixed instances policy.
         */
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
    /**
         * The maximum size of the Auto Scaling group.
         */
    var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined
    /**
         * The minimum size of the Auto Scaling group.
         */
    var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined
    /**
         * The mixed instances policy to use to specify the updates. If you specify this parameter, you can't specify a launch configuration or a launch template. 
         */
    var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined
    /**
         * Indicates whether newly launched instances are protected from termination by Auto Scaling when scaling in.
         */
    var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined
    /**
         * The name of the placement group into which to launch your instances, if any. For more information, see Placement Groups in the Amazon Elastic Compute Cloud User Guide.
         */
    var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
         */
    var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined
    /**
         * A standalone termination policy or a list of termination policies used to select the instance to terminate. The policies are executed in the order that they are listed. For more information, see Controlling Which Instances Auto Scaling Terminates During Scale In in the Auto Scaling User Guide.
         */
    var TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined
    /**
         * The ID of the subnet, if you are launching into a VPC. You can specify several subnets in a comma-separated list. When you specify VPCZoneIdentifier with AvailabilityZones, ensure that the subnets' Availability Zones match the values you specify for AvailabilityZones. For more information, see Launching Auto Scaling Instances in a VPC in the Amazon EC2 Auto Scaling User Guide.
         */
    var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Activities = js.Array[Activity]
  type ActivityIds = js.Array[XmlString]
  type AdjustmentTypes = js.Array[AdjustmentType]
  type Alarms = js.Array[Alarm]
  type AsciiStringMaxLen255 = java.lang.String
  type AssociatePublicIpAddress = scala.Boolean
  type AutoScalingGroupDesiredCapacity = scala.Double
  type AutoScalingGroupMaxSize = scala.Double
  type AutoScalingGroupMinSize = scala.Double
  type AutoScalingGroupNames = js.Array[ResourceName]
  type AutoScalingGroups = js.Array[AutoScalingGroup]
  type AutoScalingInstances = js.Array[AutoScalingInstanceDetails]
  type AutoScalingNotificationTypes = js.Array[XmlStringMaxLen255]
  type AvailabilityZones = js.Array[XmlStringMaxLen255]
  type BlockDeviceEbsDeleteOnTermination = scala.Boolean
  type BlockDeviceEbsEncrypted = scala.Boolean
  type BlockDeviceEbsIops = scala.Double
  type BlockDeviceEbsVolumeSize = scala.Double
  type BlockDeviceEbsVolumeType = java.lang.String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type ClassicLinkVPCSecurityGroups = js.Array[XmlStringMaxLen255]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = scala.Double
  type DisableScaleIn = scala.Boolean
  type EbsOptimized = scala.Boolean
  type EnabledMetrics = js.Array[EnabledMetric]
  type EstimatedInstanceWarmup = scala.Double
  type FailedScheduledUpdateGroupActionRequests = js.Array[FailedScheduledUpdateGroupActionRequest]
  type Filters = js.Array[Filter]
  type ForceDelete = scala.Boolean
  type GlobalTimeout = scala.Double
  type HealthCheckGracePeriod = scala.Double
  type HeartbeatTimeout = scala.Double
  type HonorCooldown = scala.Boolean
  type InstanceIds = js.Array[XmlStringMaxLen19]
  type InstanceProtected = scala.Boolean
  type Instances = js.Array[Instance]
  type LaunchConfigurationNames = js.Array[ResourceName]
  type LaunchConfigurations = js.Array[LaunchConfiguration]
  type LaunchTemplateName = java.lang.String
  type LifecycleActionResult = java.lang.String
  type LifecycleActionToken = java.lang.String
  type LifecycleHookNames = js.Array[AsciiStringMaxLen255]
  type LifecycleHookSpecifications = js.Array[LifecycleHookSpecification]
  type LifecycleHooks = js.Array[LifecycleHook]
  type LifecycleState = awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.`Pending:Wait` | awsDashSdkLib.awsDashSdkLibStrings.`Pending:Proceed` | awsDashSdkLib.awsDashSdkLibStrings.Quarantined | awsDashSdkLib.awsDashSdkLibStrings.InService | awsDashSdkLib.awsDashSdkLibStrings.Terminating | awsDashSdkLib.awsDashSdkLibStrings.`Terminating:Wait` | awsDashSdkLib.awsDashSdkLibStrings.`Terminating:Proceed` | awsDashSdkLib.awsDashSdkLibStrings.Terminated | awsDashSdkLib.awsDashSdkLibStrings.Detaching | awsDashSdkLib.awsDashSdkLibStrings.Detached | awsDashSdkLib.awsDashSdkLibStrings.EnteringStandby | awsDashSdkLib.awsDashSdkLibStrings.Standby | java.lang.String
  type LifecycleTransition = java.lang.String
  type LoadBalancerNames = js.Array[XmlStringMaxLen255]
  type LoadBalancerStates = js.Array[LoadBalancerState]
  type LoadBalancerTargetGroupStates = js.Array[LoadBalancerTargetGroupState]
  type MaxNumberOfAutoScalingGroups = scala.Double
  type MaxNumberOfLaunchConfigurations = scala.Double
  type MaxRecords = scala.Double
  type MetricCollectionTypes = js.Array[MetricCollectionType]
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricGranularityTypes = js.Array[MetricGranularityType]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricScale = scala.Double
  type MetricStatistic = awsDashSdkLib.awsDashSdkLibStrings.Average | awsDashSdkLib.awsDashSdkLibStrings.Minimum | awsDashSdkLib.awsDashSdkLibStrings.Maximum | awsDashSdkLib.awsDashSdkLibStrings.SampleCount | awsDashSdkLib.awsDashSdkLibStrings.Sum | java.lang.String
  type MetricType = awsDashSdkLib.awsDashSdkLibStrings.ASGAverageCPUUtilization | awsDashSdkLib.awsDashSdkLibStrings.ASGAverageNetworkIn | awsDashSdkLib.awsDashSdkLibStrings.ASGAverageNetworkOut | awsDashSdkLib.awsDashSdkLibStrings.ALBRequestCountPerTarget | java.lang.String
  type MetricUnit = java.lang.String
  type Metrics = js.Array[XmlStringMaxLen255]
  type MinAdjustmentMagnitude = scala.Double
  type MinAdjustmentStep = scala.Double
  type MonitoringEnabled = scala.Boolean
  type NoDevice = scala.Boolean
  type NotificationConfigurations = js.Array[NotificationConfiguration]
  type NotificationTargetResourceName = java.lang.String
  type NumberOfAutoScalingGroups = scala.Double
  type NumberOfLaunchConfigurations = scala.Double
  type OnDemandBaseCapacity = scala.Double
  type OnDemandPercentageAboveBaseCapacity = scala.Double
  type Overrides = js.Array[LaunchTemplateOverrides]
  type PolicyIncrement = scala.Double
  type PolicyNames = js.Array[ResourceName]
  type PolicyTypes = js.Array[XmlStringMaxLen64]
  type ProcessNames = js.Array[XmlStringMaxLen255]
  type Processes = js.Array[ProcessType]
  type Progress = scala.Double
  type PropagateAtLaunch = scala.Boolean
  type ProtectedFromScaleIn = scala.Boolean
  type ResourceName = java.lang.String
  type ScalingActivityStatusCode = awsDashSdkLib.awsDashSdkLibStrings.PendingSpotBidPlacement | awsDashSdkLib.awsDashSdkLibStrings.WaitingForSpotInstanceRequestId | awsDashSdkLib.awsDashSdkLibStrings.WaitingForSpotInstanceId | awsDashSdkLib.awsDashSdkLibStrings.WaitingForInstanceId | awsDashSdkLib.awsDashSdkLibStrings.PreInService | awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.WaitingForELBConnectionDraining | awsDashSdkLib.awsDashSdkLibStrings.MidLifecycleAction | awsDashSdkLib.awsDashSdkLibStrings.WaitingForInstanceWarmup | awsDashSdkLib.awsDashSdkLibStrings.Successful | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Cancelled | java.lang.String
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScheduledActionNames = js.Array[ResourceName]
  type ScheduledUpdateGroupActionRequests = js.Array[ScheduledUpdateGroupActionRequest]
  type ScheduledUpdateGroupActions = js.Array[ScheduledUpdateGroupAction]
  type SecurityGroups = js.Array[XmlString]
  type ShouldDecrementDesiredCapacity = scala.Boolean
  type ShouldRespectGracePeriod = scala.Boolean
  type SpotInstancePools = scala.Double
  type SpotPrice = java.lang.String
  type StepAdjustments = js.Array[StepAdjustment]
  type SuspendedProcesses = js.Array[SuspendedProcess]
  type TagDescriptionList = js.Array[TagDescription]
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TargetGroupARNs = js.Array[XmlStringMaxLen511]
  type TerminationPolicies = js.Array[XmlStringMaxLen1600]
  type TimestampType = stdLib.Date
  type Values = js.Array[XmlString]
  type XmlString = java.lang.String
  type XmlStringMaxLen1023 = java.lang.String
  type XmlStringMaxLen1600 = java.lang.String
  type XmlStringMaxLen19 = java.lang.String
  type XmlStringMaxLen2047 = java.lang.String
  type XmlStringMaxLen255 = java.lang.String
  type XmlStringMaxLen32 = java.lang.String
  type XmlStringMaxLen511 = java.lang.String
  type XmlStringMaxLen64 = java.lang.String
  type XmlStringUserData = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2011-01-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

