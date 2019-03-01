package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/codedeploy", "CodeDeploy")
@js.native
object CodeDeployNs extends js.Object {
  trait AddTagsToOnPremisesInstancesInput extends js.Object {
    /**
      * The names of the on-premises instances to which to add tags.
      */
    var instanceNames: InstanceNameList
    /**
      * The tag key-value pairs to add to the on-premises instances. Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
      */
    var tags: TagList
  }
  
  trait Alarm extends js.Object {
    /**
      * The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list of alarms.
      */
    var name: js.UndefOr[AlarmName] = js.undefined
  }
  
  trait AlarmConfiguration extends js.Object {
    /**
      * A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment group.
      */
    var alarms: js.UndefOr[AlarmList] = js.undefined
    /**
      * Indicates whether the alarm configuration is enabled.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Indicates whether a deployment should continue if information about the current state of alarms cannot be retrieved from Amazon CloudWatch. The default value is false.   true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.   false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.  
      */
    var ignorePollAlarmFailure: js.UndefOr[Boolean] = js.undefined
  }
  
  trait AppSpecContent extends js.Object {
    /**
      *  The YAML-formatted or JSON-formatted revision string.   For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original version, and the alias for its replacement version. The deployment shifts traffic from the original version of the Lambda function to the replacement version.   For an Amazon ECS deployment, the content includes the task name, information about the load balancer that serves traffic to the container, and more.   For both types of deployments, the content can specify Lambda functions that run at specified hooks, such as BeforeInstall, during a deployment. 
      */
    var content: js.UndefOr[RawStringContent] = js.undefined
    /**
      *  The SHA256 hash value of the revision content. 
      */
    var sha256: js.UndefOr[RawStringSha256] = js.undefined
  }
  
  trait ApplicationInfo extends js.Object {
    /**
      * The application ID.
      */
    var applicationId: js.UndefOr[ApplicationId] = js.undefined
    /**
      * The application name.
      */
    var applicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The destination platform type for deployment of the application (Lambda or Server).
      */
    var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
    /**
      * The time at which the application was created.
      */
    var createTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name for a connection to a GitHub account.
      */
    var gitHubAccountName: js.UndefOr[GitHubAccountTokenName] = js.undefined
    /**
      * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
      */
    var linkedToGitHub: js.UndefOr[Boolean] = js.undefined
  }
  
  trait AutoRollbackConfiguration extends js.Object {
    /**
      * Indicates whether a defined automatic rollback configuration is currently enabled.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The event type or types that trigger a rollback.
      */
    var events: js.UndefOr[AutoRollbackEventsList] = js.undefined
  }
  
  trait AutoScalingGroup extends js.Object {
    /**
      * An Auto Scaling lifecycle event hook name.
      */
    var hook: js.UndefOr[AutoScalingGroupHook] = js.undefined
    /**
      * The Auto Scaling group name.
      */
    var name: js.UndefOr[AutoScalingGroupName] = js.undefined
  }
  
  trait BatchGetApplicationRevisionsInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application about which to get revision information.
      */
    var applicationName: ApplicationName
    /**
      * Information to get about the application revisions, including type and location.
      */
    var revisions: RevisionLocationList
  }
  
  trait BatchGetApplicationRevisionsOutput extends js.Object {
    /**
      * The name of the application that corresponds to the revisions.
      */
    var applicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * Information about errors that might have occurred during the API call.
      */
    var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
      * Additional information about the revisions, including the type and location.
      */
    var revisions: js.UndefOr[RevisionInfoList] = js.undefined
  }
  
  trait BatchGetApplicationsInput extends js.Object {
    /**
      * A list of application names separated by spaces.
      */
    var applicationNames: ApplicationsList
  }
  
  trait BatchGetApplicationsOutput extends js.Object {
    /**
      * Information about the applications.
      */
    var applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.undefined
  }
  
  trait BatchGetDeploymentGroupsInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
      */
    var applicationName: ApplicationName
    /**
      * The names of the deployment groups.
      */
    var deploymentGroupNames: DeploymentGroupsList
  }
  
  trait BatchGetDeploymentGroupsOutput extends js.Object {
    /**
      * Information about the deployment groups.
      */
    var deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList] = js.undefined
    /**
      * Information about errors that might have occurred during the API call.
      */
    var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  }
  
  trait BatchGetDeploymentInstancesInput extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: DeploymentId
    /**
      * The unique IDs of instances used in the deployment.
      */
    var instanceIds: InstancesList
  }
  
  trait BatchGetDeploymentInstancesOutput extends js.Object {
    /**
      * Information about errors that might have occurred during the API call.
      */
    var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
      * Information about the instance.
      */
    var instancesSummary: js.UndefOr[InstanceSummaryList] = js.undefined
  }
  
  trait BatchGetDeploymentTargetsInput extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      *  The unique IDs of the deployment targets. The compute platform of the deployment determines the type of the targets and their formats.     For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises instances IDs, and their target type is instanceTarget.     For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda functions, and their target type is instanceTarget.     For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters and services specified using the format &lt;clustername&gt;:&lt;servicename&gt;. Their target type is ecsTarget.   
      */
    var targetIds: js.UndefOr[TargetIdList] = js.undefined
  }
  
  trait BatchGetDeploymentTargetsOutput extends js.Object {
    /**
      *  A list of target objects for a deployment. Each target object contains details about the target, such as its status and lifecycle events. The type of the target objects depends on the deployment' compute platform.     EC2/On-premises: Each target object is an EC2 or on-premises instance.     AWS Lambda: The target object is a specific version of an AWS Lambda function.     Amazon ECS: The target object is an Amazon ECS service.   
      */
    var deploymentTargets: js.UndefOr[DeploymentTargetList] = js.undefined
  }
  
  trait BatchGetDeploymentsInput extends js.Object {
    /**
      *  A list of deployment IDs, separated by spaces. 
      */
    var deploymentIds: DeploymentsList
  }
  
  trait BatchGetDeploymentsOutput extends js.Object {
    /**
      *  Information about the deployments. 
      */
    var deploymentsInfo: js.UndefOr[DeploymentsInfoList] = js.undefined
  }
  
  trait BatchGetOnPremisesInstancesInput extends js.Object {
    /**
      * The names of the on-premises instances about which to get information.
      */
    var instanceNames: InstanceNameList
  }
  
  trait BatchGetOnPremisesInstancesOutput extends js.Object {
    /**
      * Information about the on-premises instances.
      */
    var instanceInfos: js.UndefOr[InstanceInfoList] = js.undefined
  }
  
  trait BlueGreenDeploymentConfiguration extends js.Object {
    /**
      * Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment.
      */
    var deploymentReadyOption: js.UndefOr[DeploymentReadyOption] = js.undefined
    /**
      * Information about how instances are provisioned for a replacement environment in a blue/green deployment.
      */
    var greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption] = js.undefined
    /**
      * Information about whether to terminate instances in the original fleet during a blue/green deployment.
      */
    var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption] = js.undefined
  }
  
  trait BlueInstanceTerminationOption extends js.Object {
    /**
      * The action to take on instances in the original environment after a successful blue/green deployment.   TERMINATE: Instances are terminated after a specified wait time.   KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.  
      */
    var action: js.UndefOr[InstanceAction] = js.undefined
    /**
      * The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment. The maximum setting is 2880 minutes (2 days).
      */
    var terminationWaitTimeInMinutes: js.UndefOr[Duration] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ContinueDeploymentInput extends js.Object {
    /**
      *  The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement environment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      *  The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start shifting traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not terminated. 
      */
    var deploymentWaitType: js.UndefOr[DeploymentWaitType] = js.undefined
  }
  
  trait CreateApplicationInput extends js.Object {
    /**
      * The name of the application. This name must be unique with the applicable IAM user or AWS account.
      */
    var applicationName: ApplicationName
    /**
      *  The destination platform type for the deployment (Lambda or Server).
      */
    var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  }
  
  trait CreateApplicationOutput extends js.Object {
    /**
      * A unique application ID.
      */
    var applicationId: js.UndefOr[ApplicationId] = js.undefined
  }
  
  trait CreateDeploymentConfigInput extends js.Object {
    /**
      * The destination platform type for the deployment (Lambda or Server&gt;).
      */
    var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
    /**
      * The name of the deployment configuration to create.
      */
    var deploymentConfigName: DeploymentConfigName
    /**
      * The minimum number of healthy instances that should be available at any time during the deployment. There are two parameters expected in the input: type and value. The type parameter takes either of the following values:   HOST_COUNT: The value parameter represents the minimum number of healthy instances as an absolute value.   FLEET_PERCENT: The value parameter represents the minimum number of healthy instances as a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.   The value parameter takes an integer. For example, to set a minimum of 95% healthy instance, specify a type of FLEET_PERCENT and a value of 95.
      */
    var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined
    /**
      * The configuration that specifies how the deployment traffic is routed.
      */
    var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined
  }
  
  trait CreateDeploymentConfigOutput extends js.Object {
    /**
      * A unique deployment configuration ID.
      */
    var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined
  }
  
  trait CreateDeploymentGroupInput extends js.Object {
    /**
      * Information to add about Amazon CloudWatch alarms when the deployment group is created.
      */
    var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined
    /**
      * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
      */
    var applicationName: ApplicationName
    /**
      * Configuration information for an automatic rollback that is added when a deployment group is created.
      */
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined
    /**
      * A list of associated Amazon EC2 Auto Scaling groups.
      */
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined
    /**
      * Information about blue/green deployment options for a deployment group.
      */
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined
    /**
      * If specified, the deployment configuration name can be either one of the predefined configurations provided with AWS CodeDeploy or a custom deployment configuration that you create by calling the create deployment configuration operation. CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't specified for the deployment or deployment group. For more information about the predefined deployment configurations in AWS CodeDeploy, see Working with Deployment Groups in AWS CodeDeploy in the AWS CodeDeploy User Guide.
      */
    var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
    /**
      * The name of a new deployment group for the specified application.
      */
    var deploymentGroupName: DeploymentGroupName
    /**
      * Information about the type of deployment, in-place or blue/green, that you want to run and whether to route deployment traffic behind a load balancer.
      */
    var deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined
    /**
      * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified tags. Cannot be used in the same call as ec2TagSet.
      */
    var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined
    /**
      * Information about groups of tags applied to EC2 instances. The deployment group includes only EC2 instances identified by all the tag groups. Cannot be used in the same call as ec2TagFilters.
      */
    var ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined
    /**
      *  The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format &lt;clustername&gt;:&lt;servicename&gt;. 
      */
    var ecsServices: js.UndefOr[ECSServiceList] = js.undefined
    /**
      * Information about the load balancer used in a deployment.
      */
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined
    /**
      * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of the specified tags. Cannot be used in the same call as OnPremisesTagSet.
      */
    var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined
    /**
      * Information about groups of tags applied to on-premises instances. The deployment group includes only on-premises instances identified by all of the tag groups. Cannot be used in the same call as onPremisesInstanceTagFilters.
      */
    var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.undefined
    /**
      * A service role ARN that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS services.
      */
    var serviceRoleArn: Role
    /**
      * Information about triggers to create when the deployment group is created. For examples, see Create a Trigger for an AWS CodeDeploy Event in the AWS CodeDeploy User Guide.
      */
    var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined
  }
  
  trait CreateDeploymentGroupOutput extends js.Object {
    /**
      * A unique deployment group ID.
      */
    var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined
  }
  
  trait CreateDeploymentInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
      */
    var applicationName: ApplicationName
    /**
      * Configuration information for an automatic rollback that is added when a deployment is created.
      */
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined
    /**
      * The name of a deployment configuration associated with the IAM user or AWS account. If not specified, the value configured in the deployment group is used as the default. If the deployment group does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by default.
      */
    var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
    /**
      * The name of the deployment group.
      */
    var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
    /**
      * A comment about the deployment.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't part of the previous successful deployment. The fileExistsBehavior parameter takes any of the following values:   DISALLOW: The deployment fails. This is also the default behavior if no option is specified.   OVERWRITE: The version of the file from the application revision currently being deployed replaces the version already on the instance.   RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.  
      */
    var fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined
    /**
      *  If set to true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to fail, the deployment to that instance is considered to have failed at that point and continues on to the BeforeInstall deployment lifecycle event.   If set to false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event to fail to an instance, the deployment to that instance stops, and the deployment to that instance is considered to have failed. 
      */
    var ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined
    /**
      *  The type and location of the revision to deploy. 
      */
    var revision: js.UndefOr[RevisionLocation] = js.undefined
    /**
      *  Information about the instances that belong to the replacement environment in a blue/green deployment. 
      */
    var targetInstances: js.UndefOr[TargetInstances] = js.undefined
    /**
      *  Indicates whether to deploy to all instances or only to instances that are not running the latest application revision. 
      */
    var updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined
  }
  
  trait CreateDeploymentOutput extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  }
  
  trait DeleteApplicationInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
      */
    var applicationName: ApplicationName
  }
  
  trait DeleteDeploymentConfigInput extends js.Object {
    /**
      * The name of a deployment configuration associated with the IAM user or AWS account.
      */
    var deploymentConfigName: DeploymentConfigName
  }
  
  trait DeleteDeploymentGroupInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
      */
    var applicationName: ApplicationName
    /**
      * The name of a deployment group for the specified application.
      */
    var deploymentGroupName: DeploymentGroupName
  }
  
  trait DeleteDeploymentGroupOutput extends js.Object {
    /**
      * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the Amazon EC2 instances in the Auto Scaling group.
      */
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined
  }
  
  trait DeleteGitHubAccountTokenInput extends js.Object {
    /**
      * The name of the GitHub account connection to delete.
      */
    var tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined
  }
  
  trait DeleteGitHubAccountTokenOutput extends js.Object {
    /**
      * The name of the GitHub account connection that was deleted.
      */
    var tokenName: js.UndefOr[GitHubAccountTokenName] = js.undefined
  }
  
  trait DeploymentConfigInfo extends js.Object {
    /**
      * The destination platform type for the deployment (Lambda or Server).
      */
    var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
    /**
      * The time at which the deployment configuration was created.
      */
    var createTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The deployment configuration ID.
      */
    var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined
    /**
      * The deployment configuration name.
      */
    var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
    /**
      * Information about the number or percentage of minimum healthy instance.
      */
    var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined
    /**
      * The configuration that specifies how the deployment traffic is routed. Only deployments with a Lambda compute platform can specify this.
      */
    var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined
  }
  
  trait DeploymentGroupInfo extends js.Object {
    /**
      * A list of alarms associated with the deployment group.
      */
    var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined
    /**
      * The application name.
      */
    var applicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * Information about the automatic rollback configuration associated with the deployment group.
      */
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined
    /**
      * A list of associated Auto Scaling groups.
      */
    var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined
    /**
      * Information about blue/green deployment options for a deployment group.
      */
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined
    /**
      * The destination platform type for the deployment group (Lambda or Server).
      */
    var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
    /**
      * The deployment configuration name.
      */
    var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
    /**
      * The deployment group ID.
      */
    var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.undefined
    /**
      * The deployment group name.
      */
    var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
    /**
      * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
      */
    var deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined
    /**
      * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified tags.
      */
    var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined
    /**
      * Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2 instances identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
      */
    var ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined
    /**
      *  The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format &lt;clustername&gt;:&lt;servicename&gt;. 
      */
    var ecsServices: js.UndefOr[ECSServiceList] = js.undefined
    /**
      * Information about the most recent attempted deployment to the deployment group.
      */
    var lastAttemptedDeployment: js.UndefOr[LastDeploymentInfo] = js.undefined
    /**
      * Information about the most recent successful deployment to the deployment group.
      */
    var lastSuccessfulDeployment: js.UndefOr[LastDeploymentInfo] = js.undefined
    /**
      * Information about the load balancer to use in a deployment.
      */
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined
    /**
      * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of the specified tags.
      */
    var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined
    /**
      * Information about groups of tags applied to an on-premises instance. The deployment group includes only on-premises instances identified by all the tag groups. Cannot be used in the same call as onPremisesInstanceTagFilters.
      */
    var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.undefined
    /**
      * A service role ARN.
      */
    var serviceRoleArn: js.UndefOr[Role] = js.undefined
    /**
      * Information about the deployment group's target revision, including type and location.
      */
    var targetRevision: js.UndefOr[RevisionLocation] = js.undefined
    /**
      * Information about triggers associated with the deployment group.
      */
    var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined
  }
  
  trait DeploymentInfo extends js.Object {
    /**
      * Provides information about the results of a deployment, such as whether instances in the original environment in a blue/green deployment were not terminated.
      */
    var additionalDeploymentStatusInfo: js.UndefOr[AdditionalDeploymentStatusInfo] = js.undefined
    /**
      * The application name.
      */
    var applicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * Information about the automatic rollback configuration associated with the deployment.
      */
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined
    /**
      * Information about blue/green deployment options for this deployment.
      */
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined
    /**
      * A timestamp that indicates when the deployment was complete.
      */
    var completeTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The destination platform type for the deployment (Lambda or Server). 
      */
    var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
    /**
      * A timestamp that indicates when the deployment was created.
      */
    var createTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The means by which the deployment was created:   user: A user created the deployment.   autoscaling: Amazon EC2 Auto Scaling created the deployment.   codeDeployRollback: A rollback process created the deployment.  
      */
    var creator: js.UndefOr[DeploymentCreator] = js.undefined
    /**
      *  The deployment configuration name. 
      */
    var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
    /**
      *  The deployment group name. 
      */
    var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      * A summary of the deployment status of the instances in the deployment.
      */
    var deploymentOverview: js.UndefOr[DeploymentOverview] = js.undefined
    /**
      * Messages that contain information about the status of a deployment.
      */
    var deploymentStatusMessages: js.UndefOr[DeploymentStatusMessageList] = js.undefined
    /**
      * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
      */
    var deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined
    /**
      * A comment about the deployment.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * Information about any error associated with this deployment.
      */
    var errorInformation: js.UndefOr[ErrorInformation] = js.undefined
    /**
      * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't part of the previous successful deployment.   DISALLOW: The deployment fails. This is also the default behavior if no option is specified.   OVERWRITE: The version of the file from the application revision currently being deployed replaces the version already on the instance.   RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.  
      */
    var fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined
    /**
      * If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to fail, the deployment to that instance is not considered to have failed at that point and continues on to the BeforeInstall deployment lifecycle event. If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to fail, the deployment to that instance stops, and the deployment to that instance is considered to have failed.
      */
    var ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined
    /**
      * Indicates whether the wait period set for the termination of instances in the original environment has started. Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the termination wait period starts.
      */
    var instanceTerminationWaitTimeStarted: js.UndefOr[Boolean] = js.undefined
    /**
      * Information about the load balancer used in the deployment.
      */
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined
    /**
      * Information about the application revision that was deployed to the deployment group before the most recent successful deployment.
      */
    var previousRevision: js.UndefOr[RevisionLocation] = js.undefined
    /**
      * Information about the location of stored application artifacts and the service from which to retrieve them.
      */
    var revision: js.UndefOr[RevisionLocation] = js.undefined
    /**
      * Information about a deployment rollback.
      */
    var rollbackInfo: js.UndefOr[RollbackInfo] = js.undefined
    /**
      * A timestamp that indicates when the deployment was deployed to the deployment group. In some cases, the reported value of the start time might be later than the complete time. This is due to differences in the clock settings of backend servers that participate in the deployment process.
      */
    var startTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The current state of the deployment as a whole.
      */
    var status: js.UndefOr[DeploymentStatus] = js.undefined
    /**
      * Information about the instances that belong to the replacement environment in a blue/green deployment.
      */
    var targetInstances: js.UndefOr[TargetInstances] = js.undefined
    /**
      * Indicates whether only instances that are not running the latest application revision are to be deployed to.
      */
    var updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DeploymentOverview extends js.Object {
    /**
      * The number of instances in the deployment in a failed state.
      */
    var Failed: js.UndefOr[InstanceCount] = js.undefined
    /**
      * The number of instances in which the deployment is in progress.
      */
    var InProgress: js.UndefOr[InstanceCount] = js.undefined
    /**
      * The number of instances in the deployment in a pending state.
      */
    var Pending: js.UndefOr[InstanceCount] = js.undefined
    /**
      * The number of instances in a replacement environment ready to receive traffic in a blue/green deployment.
      */
    var Ready: js.UndefOr[InstanceCount] = js.undefined
    /**
      * The number of instances in the deployment in a skipped state.
      */
    var Skipped: js.UndefOr[InstanceCount] = js.undefined
    /**
      * The number of instances in the deployment to which revisions have been successfully deployed.
      */
    var Succeeded: js.UndefOr[InstanceCount] = js.undefined
  }
  
  trait DeploymentReadyOption extends js.Object {
    /**
      * Information about when to reroute traffic from an original environment to a replacement environment in a blue/green deployment.   CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application revision is installed on the instances in the replacement environment.   STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started using ContinueDeployment. If traffic rerouting is not started before the end of the specified wait period, the deployment status is changed to Stopped.  
      */
    var actionOnTimeout: js.UndefOr[DeploymentReadyAction] = js.undefined
    /**
      * The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if rerouting is not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout
      */
    var waitTimeInMinutes: js.UndefOr[Duration] = js.undefined
  }
  
  trait DeploymentStyle extends js.Object {
    /**
      * Indicates whether to route deployment traffic behind a load balancer.
      */
    var deploymentOption: js.UndefOr[DeploymentOption] = js.undefined
    /**
      * Indicates whether to run an in-place deployment or a blue/green deployment.
      */
    var deploymentType: js.UndefOr[DeploymentType] = js.undefined
  }
  
  trait DeploymentTarget extends js.Object {
    /**
      *  The deployment type that is specific to the deployment's compute platform. 
      */
    var deploymentTargetType: js.UndefOr[DeploymentTargetType] = js.undefined
    /**
      *  Information about the target for a deployment that uses the Amazon ECS compute platform. 
      */
    var ecsTarget: js.UndefOr[ECSTarget] = js.undefined
    /**
      *  Information about the target for a deployment that uses the EC2/On-premises compute platform. 
      */
    var instanceTarget: js.UndefOr[InstanceTarget] = js.undefined
    /**
      *  Information about the target for a deployment that uses the AWS Lambda compute platform. 
      */
    var lambdaTarget: js.UndefOr[LambdaTarget] = js.undefined
  }
  
  trait DeregisterOnPremisesInstanceInput extends js.Object {
    /**
      * The name of the on-premises instance to deregister.
      */
    var instanceName: InstanceName
  }
  
  trait Diagnostics extends js.Object {
    /**
      * The associated error code:   Success: The specified script ran.   ScriptMissing: The specified script was not found in the specified location.   ScriptNotExecutable: The specified script is not a recognized executable file type.   ScriptTimedOut: The specified script did not finish running in the specified time period.   ScriptFailed: The specified script failed to run as expected.   UnknownError: The specified script did not run for an unknown reason.  
      */
    var errorCode: js.UndefOr[LifecycleErrorCode] = js.undefined
    /**
      * The last portion of the diagnostic log. If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
      */
    var logTail: js.UndefOr[LogTail] = js.undefined
    /**
      * The message associated with the error.
      */
    var message: js.UndefOr[LifecycleMessage] = js.undefined
    /**
      * The name of the script.
      */
    var scriptName: js.UndefOr[ScriptName] = js.undefined
  }
  
  trait EC2TagFilter extends js.Object {
    /**
      * The tag filter key.
      */
    var Key: js.UndefOr[Key] = js.undefined
    /**
      * The tag filter type:   KEY_ONLY: Key only.   VALUE_ONLY: Value only.   KEY_AND_VALUE: Key and value.  
      */
    var Type: js.UndefOr[EC2TagFilterType] = js.undefined
    /**
      * The tag filter value.
      */
    var Value: js.UndefOr[Value] = js.undefined
  }
  
  trait EC2TagSet extends js.Object {
    /**
      * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
      */
    var ec2TagSetList: js.UndefOr[EC2TagSetList] = js.undefined
  }
  
  trait ECSService extends js.Object {
    /**
      *  The name of the cluster that the Amazon ECS service is associated with. 
      */
    var clusterName: js.UndefOr[ECSClusterName] = js.undefined
    /**
      *  The name of the target Amazon ECS service. 
      */
    var serviceName: js.UndefOr[ECSServiceName] = js.undefined
  }
  
  trait ECSTarget extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      *  The date and time when the target Amazon ECS application was updated by a deployment. 
      */
    var lastUpdatedAt: js.UndefOr[Time] = js.undefined
    /**
      *  The lifecycle events of the deployment to this target Amazon ECS application. 
      */
    var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
    /**
      *  The status an Amazon ECS deployment's target ECS application. 
      */
    var status: js.UndefOr[TargetStatus] = js.undefined
    /**
      *  The ARN of the target. 
      */
    var targetArn: js.UndefOr[TargetArn] = js.undefined
    /**
      *  The unique ID of a deployment target that has a type of ecsTarget. 
      */
    var targetId: js.UndefOr[TargetId] = js.undefined
    /**
      *  The ECSTaskSet objects associated with the ECS target. 
      */
    var taskSetsInfo: js.UndefOr[ECSTaskSetList] = js.undefined
  }
  
  trait ECSTaskSet extends js.Object {
    /**
      *  The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create. After the updated task set is created, CodeDeploy shifts traffic to the new task set. 
      */
    var desiredCount: js.UndefOr[ECSTaskSetCount] = js.undefined
    /**
      *  A unique ID of an ECSTaskSet. 
      */
    var identifer: js.UndefOr[ECSTaskSetIdentifier] = js.undefined
    /**
      *  The number of tasks in the task set that are in the PENDING status during an Amazon ECS deployment. A task in the PENDING state is preparing to enter the RUNNING state. A task set enters the PENDING status when it launches for the first time, or when it is restarted after being in the STOPPED state. 
      */
    var pendingCount: js.UndefOr[ECSTaskSetCount] = js.undefined
    /**
      *  The number of tasks in the task set that are in the RUNNING status during an Amazon ECS deployment. A task in the RUNNING state is running and ready for use. 
      */
    var runningCount: js.UndefOr[ECSTaskSetCount] = js.undefined
    /**
      *  The status of the task set. There are three valid task set statuses:     PRIMARY: Indicates the task set is serving production traffic.     ACTIVE: Indicates the task set is not serving production traffic.     DRAINING: Indicates the tasks in the task set are being stopped and their corresponding targets are being deregistered from their target group.   
      */
    var status: js.UndefOr[ECSTaskSetStatus] = js.undefined
    /**
      *  The target group associated with the task set. The target group is used by AWS CodeDeploy to manage traffic to a task set. 
      */
    var targetGroup: js.UndefOr[TargetGroupInfo] = js.undefined
    /**
      *  A label that identifies whether the ECS task set is an original target (BLUE) or a replacement target (GREEN). 
      */
    var taskSetLabel: js.UndefOr[TargetLabel] = js.undefined
    /**
      *  The percentage of traffic served by this task set. 
      */
    var trafficWeight: js.UndefOr[TrafficWeight] = js.undefined
  }
  
  trait ELBInfo extends js.Object {
    /**
      * For blue/green deployments, the name of the load balancer that is used to route traffic from original instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load balancer that instances are deregistered from so they are not serving traffic during a deployment, and then re-registered with after the deployment is complete.
      */
    var name: js.UndefOr[ELBName] = js.undefined
  }
  
  trait ErrorInformation extends js.Object {
    /**
      * For more information, see Error Codes for AWS CodeDeploy in the AWS CodeDeploy User Guide. The error code:   APPLICATION_MISSING: The application was missing. This error code is most likely raised if the application is deleted after the deployment is created, but before it is started.   DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code is most likely raised if the deployment group is deleted after the deployment is created, but before it is started.   HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the instance health constraints specified.   HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health constraints specified.   IAM_ROLE_MISSING: The service role cannot be accessed.   IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.   INTERNAL_ERROR: There was an internal error.   NO_EC2_SUBSCRIPTION: The calling account is not subscribed to Amazon EC2.   NO_INSTANCES: No instances were specified, or no instances can be found.   OVER_MAX_INSTANCES: The maximum number of instances was exceeded.   THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one or more AWS services.   TIMEOUT: The deployment has timed out.   REVISION_MISSING: The revision ID was missing. This error code is most likely raised if the revision is deleted after the deployment is created, but before it is started.  
      */
    var code: js.UndefOr[ErrorCode] = js.undefined
    /**
      * An accompanying error message.
      */
    var message: js.UndefOr[ErrorMessage] = js.undefined
  }
  
  trait GenericRevisionInfo extends js.Object {
    /**
      * The deployment groups for which this is the current target revision.
      */
    var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined
    /**
      * A comment about the revision.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * When the revision was first used by AWS CodeDeploy.
      */
    var firstUsedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * When the revision was last used by AWS CodeDeploy.
      */
    var lastUsedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * When the revision was registered with AWS CodeDeploy.
      */
    var registerTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait GetApplicationInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
      */
    var applicationName: ApplicationName
  }
  
  trait GetApplicationOutput extends js.Object {
    /**
      * Information about the application.
      */
    var application: js.UndefOr[ApplicationInfo] = js.undefined
  }
  
  trait GetApplicationRevisionInput extends js.Object {
    /**
      * The name of the application that corresponds to the revision.
      */
    var applicationName: ApplicationName
    /**
      * Information about the application revision to get, including type and location.
      */
    var revision: RevisionLocation
  }
  
  trait GetApplicationRevisionOutput extends js.Object {
    /**
      * The name of the application that corresponds to the revision.
      */
    var applicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * Additional information about the revision, including type and location.
      */
    var revision: js.UndefOr[RevisionLocation] = js.undefined
    /**
      * General information about the revision.
      */
    var revisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined
  }
  
  trait GetDeploymentConfigInput extends js.Object {
    /**
      * The name of a deployment configuration associated with the IAM user or AWS account.
      */
    var deploymentConfigName: DeploymentConfigName
  }
  
  trait GetDeploymentConfigOutput extends js.Object {
    /**
      * Information about the deployment configuration.
      */
    var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.undefined
  }
  
  trait GetDeploymentGroupInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
      */
    var applicationName: ApplicationName
    /**
      * The name of a deployment group for the specified application.
      */
    var deploymentGroupName: DeploymentGroupName
  }
  
  trait GetDeploymentGroupOutput extends js.Object {
    /**
      * Information about the deployment group.
      */
    var deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo] = js.undefined
  }
  
  trait GetDeploymentInput extends js.Object {
    /**
      *  The unique ID of a deployment associated with the IAM user or AWS account. 
      */
    var deploymentId: DeploymentId
  }
  
  trait GetDeploymentInstanceInput extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: DeploymentId
    /**
      *  The unique ID of an instance in the deployment group. 
      */
    var instanceId: InstanceId
  }
  
  trait GetDeploymentInstanceOutput extends js.Object {
    /**
      *  Information about the instance. 
      */
    var instanceSummary: js.UndefOr[InstanceSummary] = js.undefined
  }
  
  trait GetDeploymentOutput extends js.Object {
    /**
      * Information about the deployment.
      */
    var deploymentInfo: js.UndefOr[DeploymentInfo] = js.undefined
  }
  
  trait GetDeploymentTargetInput extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      *  The unique ID of a deployment target. 
      */
    var targetId: js.UndefOr[TargetId] = js.undefined
  }
  
  trait GetDeploymentTargetOutput extends js.Object {
    /**
      *  A deployment target that contains information about a deployment such as its status, lifecyle events, and when it was last updated. It also contains metadata about the deployment target. The deployment target metadata depends on the deployment target's type (instanceTarget, lambdaTarget, or ecsTarget). 
      */
    var deploymentTarget: js.UndefOr[DeploymentTarget] = js.undefined
  }
  
  trait GetOnPremisesInstanceInput extends js.Object {
    /**
      *  The name of the on-premises instance about which to get information. 
      */
    var instanceName: InstanceName
  }
  
  trait GetOnPremisesInstanceOutput extends js.Object {
    /**
      *  Information about the on-premises instance. 
      */
    var instanceInfo: js.UndefOr[InstanceInfo] = js.undefined
  }
  
  trait GitHubLocation extends js.Object {
    /**
      * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application revision.
      */
    var commitId: js.UndefOr[CommitId] = js.undefined
    /**
      * The GitHub account and repository pair that stores a reference to the commit that represents the bundled artifacts for the application revision.  Specified as account/repository.
      */
    var repository: js.UndefOr[Repository] = js.undefined
  }
  
  trait GreenFleetProvisioningOption extends js.Object {
    /**
      * The method used to add instances to a replacement environment.   DISCOVER_EXISTING: Use instances that already exist or will be created manually.   COPY_AUTO_SCALING_GROUP: Use settings from a specified Auto Scaling group to define and create instances in a new Auto Scaling group.  
      */
    var action: js.UndefOr[GreenFleetProvisioningAction] = js.undefined
  }
  
  trait InstanceInfo extends js.Object {
    /**
      * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
      */
    var deregisterTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The ARN of the IAM session associated with the on-premises instance.
      */
    var iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined
    /**
      * The IAM user ARN associated with the on-premises instance.
      */
    var iamUserArn: js.UndefOr[IamUserArn] = js.undefined
    /**
      * The ARN of the on-premises instance.
      */
    var instanceArn: js.UndefOr[InstanceArn] = js.undefined
    /**
      * The name of the on-premises instance.
      */
    var instanceName: js.UndefOr[InstanceName] = js.undefined
    /**
      * The time at which the on-premises instance was registered.
      */
    var registerTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The tags currently associated with the on-premises instance.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait InstanceSummary extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      * The instance ID.
      */
    var instanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * Information about which environment an instance belongs to in a blue/green deployment.   BLUE: The instance is part of the original environment.   GREEN: The instance is part of the replacement environment.  
      */
    var instanceType: js.UndefOr[InstanceType] = js.undefined
    /**
      * A timestamp that indicaties when the instance information was last updated.
      */
    var lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined
    /**
      * A list of lifecycle events for this instance.
      */
    var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
    /**
      * The deployment status for this instance:   Pending: The deployment is pending for this instance.   In Progress: The deployment is in progress for this instance.   Succeeded: The deployment has succeeded for this instance.   Failed: The deployment has failed for this instance.   Skipped: The deployment has been skipped for this instance.   Unknown: The deployment status is unknown for this instance.  
      */
    var status: js.UndefOr[InstanceStatus] = js.undefined
  }
  
  trait InstanceTarget extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      *  A label that identifies whether the instance is an original target (BLUE) or a replacement target (GREEN). 
      */
    var instanceLabel: js.UndefOr[TargetLabel] = js.undefined
    /**
      *  The date and time when the target instance was updated by a deployment. 
      */
    var lastUpdatedAt: js.UndefOr[Time] = js.undefined
    /**
      *  The lifecycle events of the deployment to this target instance. 
      */
    var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
    /**
      *  The status an EC2/On-premises deployment's target instance. 
      */
    var status: js.UndefOr[TargetStatus] = js.undefined
    /**
      *  The ARN of the target. 
      */
    var targetArn: js.UndefOr[TargetArn] = js.undefined
    /**
      *  The unique ID of a deployment target that has a type of instanceTarget. 
      */
    var targetId: js.UndefOr[TargetId] = js.undefined
  }
  
  trait LambdaTarget extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      *  The date and time when the target Lambda function was updated by a deployment. 
      */
    var lastUpdatedAt: js.UndefOr[Time] = js.undefined
    /**
      *  The lifecycle events of the deployment to this target Lambda function. 
      */
    var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
    /**
      *  The status an AWS Lambda deployment's target Lambda function. 
      */
    var status: js.UndefOr[TargetStatus] = js.undefined
    /**
      *  The ARN of the target. 
      */
    var targetArn: js.UndefOr[TargetArn] = js.undefined
    /**
      *  The unique ID of a deployment target that has a type of lambdaTarget. 
      */
    var targetId: js.UndefOr[TargetId] = js.undefined
  }
  
  trait LastDeploymentInfo extends js.Object {
    /**
      * A timestamp that indicates when the most recent deployment to the deployment group started.
      */
    var createTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      * A timestamp that indicates when the most recent deployment to the deployment group was complete.
      */
    var endTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The status of the most recent deployment.
      */
    var status: js.UndefOr[DeploymentStatus] = js.undefined
  }
  
  trait LifecycleEvent extends js.Object {
    /**
      * Diagnostic information about the deployment lifecycle event.
      */
    var diagnostics: js.UndefOr[Diagnostics] = js.undefined
    /**
      * A timestamp that indicates when the deployment lifecycle event ended.
      */
    var endTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The deployment lifecycle event name, such as ApplicationStop, BeforeInstall, AfterInstall, ApplicationStart, or ValidateService.
      */
    var lifecycleEventName: js.UndefOr[LifecycleEventName] = js.undefined
    /**
      * A timestamp that indicates when the deployment lifecycle event started.
      */
    var startTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The deployment lifecycle event status:   Pending: The deployment lifecycle event is pending.   InProgress: The deployment lifecycle event is in progress.   Succeeded: The deployment lifecycle event ran successfully.   Failed: The deployment lifecycle event has failed.   Skipped: The deployment lifecycle event has been skipped.   Unknown: The deployment lifecycle event is unknown.  
      */
    var status: js.UndefOr[LifecycleEventStatus] = js.undefined
  }
  
  trait ListApplicationRevisionsInput extends js.Object {
    /**
      *  The name of an AWS CodeDeploy application associated with the IAM user or AWS account. 
      */
    var applicationName: ApplicationName
    /**
      *  Whether to list revisions based on whether the revision is the target revision of an deployment group:    include: List revisions that are target revisions of a deployment group.   exclude: Do not list revisions that are target revisions of a deployment group.   ignore: List all revisions.  
      */
    var deployed: js.UndefOr[ListStateFilterAction] = js.undefined
    /**
      * An identifier returned from the previous ListApplicationRevisions call. It can be used to return the next set of applications in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      *  An Amazon S3 bucket name to limit the search for revisions.   If set to null, all of the user's buckets are searched. 
      */
    var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      *  A key prefix for the set of Amazon S3 objects to limit the search for revisions. 
      */
    var s3KeyPrefix: js.UndefOr[S3Key] = js.undefined
    /**
      * The column name to use to sort the list results:   registerTime: Sort by the time the revisions were registered with AWS CodeDeploy.   firstUsedTime: Sort by the time the revisions were first used in a deployment.   lastUsedTime: Sort by the time the revisions were last used in a deployment.    If not specified or set to null, the results are returned in an arbitrary order. 
      */
    var sortBy: js.UndefOr[ApplicationRevisionSortBy] = js.undefined
    /**
      *  The order in which to sort the list results:    ascending: ascending order.   descending: descending order.   If not specified, the results are sorted in ascending order. If set to null, the results are sorted in an arbitrary order.
      */
    var sortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  trait ListApplicationRevisionsOutput extends js.Object {
    /**
      * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list application revisions call to return the next set of application revisions in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of locations that contain the matching revisions.
      */
    var revisions: js.UndefOr[RevisionLocationList] = js.undefined
  }
  
  trait ListApplicationsInput extends js.Object {
    /**
      * An identifier returned from the previous list applications call. It can be used to return the next set of applications in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListApplicationsOutput extends js.Object {
    /**
      * A list of application names.
      */
    var applications: js.UndefOr[ApplicationsList] = js.undefined
    /**
      * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list applications call to return the next set of applications in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeploymentConfigsInput extends js.Object {
    /**
      * An identifier returned from the previous ListDeploymentConfigs call. It can be used to return the next set of deployment configurations in the list. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeploymentConfigsOutput extends js.Object {
    /**
      * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
      */
    var deploymentConfigsList: js.UndefOr[DeploymentConfigsList] = js.undefined
    /**
      * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment configurations call to return the next set of deployment configurations in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeploymentGroupsInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
      */
    var applicationName: ApplicationName
    /**
      * An identifier returned from the previous list deployment groups call. It can be used to return the next set of deployment groups in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeploymentGroupsOutput extends js.Object {
    /**
      * The application name.
      */
    var applicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * A list of deployment group names.
      */
    var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined
    /**
      * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment groups call to return the next set of deployment groups in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeploymentInstancesInput extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: DeploymentId
    /**
      * A subset of instances to list by status:   Pending: Include those instances with pending deployments.   InProgress: Include those instances where deployments are still in progress.   Succeeded: Include those instances with successful deployments.   Failed: Include those instances with failed deployments.   Skipped: Include those instances with skipped deployments.   Unknown: Include those instances with deployments in an unknown state.  
      */
    var instanceStatusFilter: js.UndefOr[InstanceStatusList] = js.undefined
    /**
      * The set of instances in a blue/green deployment, either those in the original environment ("BLUE") or those in the replacement environment ("GREEN"), for which you want to view instance information.
      */
    var instanceTypeFilter: js.UndefOr[InstanceTypeList] = js.undefined
    /**
      * An identifier returned from the previous list deployment instances call. It can be used to return the next set of deployment instances in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeploymentInstancesOutput extends js.Object {
    /**
      * A list of instance IDs.
      */
    var instancesList: js.UndefOr[InstancesList] = js.undefined
    /**
      * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment instances call to return the next set of deployment instances in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeploymentTargetsInput extends js.Object {
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      *  A token identifier returned from the previous ListDeploymentTargets call. It can be used to return the next set of deployment targets in the list. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      *  A key used to filter the returned targets. 
      */
    var targetFilters: js.UndefOr[TargetFilters] = js.undefined
  }
  
  trait ListDeploymentTargetsOutput extends js.Object {
    /**
      *  If a large amount of information is returned, a token identifier is also returned. It can be used in a subsequent ListDeploymentTargets call to return the next set of deployment targets in the list. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      *  The unique IDs of deployment targets. 
      */
    var targetIds: js.UndefOr[TargetIdList] = js.undefined
  }
  
  trait ListDeploymentsInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
      */
    var applicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * A time range (start and end) for returning a subset of the list of deployments.
      */
    var createTimeRange: js.UndefOr[TimeRange] = js.undefined
    /**
      * The name of a deployment group for the specified application.
      */
    var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
    /**
      * A subset of deployments to list by status:   Created: Include created deployments in the resulting list.   Queued: Include queued deployments in the resulting list.   In Progress: Include in-progress deployments in the resulting list.   Succeeded: Include successful deployments in the resulting list.   Failed: Include failed deployments in the resulting list.   Stopped: Include stopped deployments in the resulting list.  
      */
    var includeOnlyStatuses: js.UndefOr[DeploymentStatusList] = js.undefined
    /**
      * An identifier returned from the previous list deployments call. It can be used to return the next set of deployments in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeploymentsOutput extends js.Object {
    /**
      * A list of deployment IDs.
      */
    var deployments: js.UndefOr[DeploymentsList] = js.undefined
    /**
      * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployments call to return the next set of deployments in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListGitHubAccountTokenNamesInput extends js.Object {
    /**
      * An identifier returned from the previous ListGitHubAccountTokenNames call. It can be used to return the next set of names in the list. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListGitHubAccountTokenNamesOutput extends js.Object {
    /**
      * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent ListGitHubAccountTokenNames call to return the next set of names in the list. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of names of connections to GitHub accounts.
      */
    var tokenNameList: js.UndefOr[GitHubAccountTokenNameList] = js.undefined
  }
  
  trait ListOnPremisesInstancesInput extends js.Object {
    /**
      * An identifier returned from the previous list on-premises instances call. It can be used to return the next set of on-premises instances in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The registration status of the on-premises instances:   Deregistered: Include deregistered on-premises instances in the resulting list.   Registered: Include registered on-premises instances in the resulting list.  
      */
    var registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined
    /**
      * The on-premises instance tags that are used to restrict the on-premises instance names returned.
      */
    var tagFilters: js.UndefOr[TagFilterList] = js.undefined
  }
  
  trait ListOnPremisesInstancesOutput extends js.Object {
    /**
      * The list of matching on-premises instance names.
      */
    var instanceNames: js.UndefOr[InstanceNameList] = js.undefined
    /**
      * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list on-premises instances call to return the next set of on-premises instances in the list.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait LoadBalancerInfo extends js.Object {
    /**
      * An array that contains information about the load balancer to use for load balancing in a deployment. In Elastic Load Balancing, load balancers are used with Classic Load Balancers.   Adding more than one load balancer to the array is not supported.  
      */
    var elbInfoList: js.UndefOr[ELBInfoList] = js.undefined
    /**
      * An array that contains information about the target group to use for load balancing in a deployment. In Elastic Load Balancing, target groups are used with Application Load Balancers.   Adding more than one target group to the array is not supported.  
      */
    var targetGroupInfoList: js.UndefOr[TargetGroupInfoList] = js.undefined
    /**
      *  The target group pair information. This is an array of TargeGroupPairInfo objects with a maximum size of one. 
      */
    var targetGroupPairInfoList: js.UndefOr[TargetGroupPairInfoList] = js.undefined
  }
  
  trait MinimumHealthyHosts extends js.Object {
    /**
      * The minimum healthy instance type:   HOST_COUNT: The minimum number of healthy instance as an absolute value.   FLEET_PERCENT: The minimum number of healthy instance as a percentage of the total number of instance in the deployment.   In an example of nine instance, if a HOST_COUNT of six is specified, deploy to up to three instances at a time. The deployment is successful if six or more instances are deployed to successfully. Otherwise, the deployment fails. If a FLEET_PERCENT of 40 is specified, deploy to up to five instance at a time. The deployment is successful if four or more instance are deployed to successfully. Otherwise, the deployment fails.  In a call to the get deployment configuration operation, CodeDeployDefault.OneAtATime returns a minimum healthy instance type of MOST_CONCURRENCY and a value of 1. This means a deployment to only one instance at a time. (You cannot set the type to MOST_CONCURRENCY, only to HOST_COUNT or FLEET_PERCENT.) In addition, with CodeDeployDefault.OneAtATime, AWS CodeDeploy attempts to ensure that all instances but one are kept in a healthy state during the deployment. Although this allows one instance at a time to be taken offline for a new deployment, it also means that if the deployment to the last instance fails, the overall deployment is still successful.  For more information, see AWS CodeDeploy Instance Health in the AWS CodeDeploy User Guide.
      */
    var `type`: js.UndefOr[MinimumHealthyHostsType] = js.undefined
    /**
      * The minimum healthy instance value.
      */
    var value: js.UndefOr[MinimumHealthyHostsValue] = js.undefined
  }
  
  trait OnPremisesTagSet extends js.Object {
    /**
      * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
      */
    var onPremisesTagSetList: js.UndefOr[OnPremisesTagSetList] = js.undefined
  }
  
  trait PutLifecycleEventHookExecutionStatusInput extends js.Object {
    /**
      *  The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      *  The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the hooks section of the AppSpec file. 
      */
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined
    /**
      * The result of a Lambda function that validates a deployment lifecycle event (Succeeded or Failed).
      */
    var status: js.UndefOr[LifecycleEventStatus] = js.undefined
  }
  
  trait PutLifecycleEventHookExecutionStatusOutput extends js.Object {
    /**
      * The execution ID of the lifecycle event hook. A hook is specified in the hooks section of the deployment's AppSpec file.
      */
    var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined
  }
  
  trait RawString extends js.Object {
    /**
      * The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function to update and optional Lambda functions that validate deployment lifecycle events.
      */
    var content: js.UndefOr[RawStringContent] = js.undefined
    /**
      * The SHA256 hash value of the revision content.
      */
    var sha256: js.UndefOr[RawStringSha256] = js.undefined
  }
  
  trait RegisterApplicationRevisionInput extends js.Object {
    /**
      * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
      */
    var applicationName: ApplicationName
    /**
      * A comment about the revision.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * Information about the application revision to register, including type and location.
      */
    var revision: RevisionLocation
  }
  
  trait RegisterOnPremisesInstanceInput extends js.Object {
    /**
      * The ARN of the IAM session to associate with the on-premises instance.
      */
    var iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined
    /**
      * The ARN of the IAM user to associate with the on-premises instance.
      */
    var iamUserArn: js.UndefOr[IamUserArn] = js.undefined
    /**
      * The name of the on-premises instance to register.
      */
    var instanceName: InstanceName
  }
  
  trait RemoveTagsFromOnPremisesInstancesInput extends js.Object {
    /**
      * The names of the on-premises instances from which to remove tags.
      */
    var instanceNames: InstanceNameList
    /**
      * The tag key-value pairs to remove from the on-premises instances.
      */
    var tags: TagList
  }
  
  trait RevisionInfo extends js.Object {
    /**
      * Information about an application revision, including usage details and associated deployment groups.
      */
    var genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined
    /**
      * Information about the location and type of an application revision.
      */
    var revisionLocation: js.UndefOr[RevisionLocation] = js.undefined
  }
  
  trait RevisionLocation extends js.Object {
    /**
      *  The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML and stored as a RawString. 
      */
    var appSpecContent: js.UndefOr[AppSpecContent] = js.undefined
    /**
      * Information about the location of application artifacts stored in GitHub.
      */
    var gitHubLocation: js.UndefOr[GitHubLocation] = js.undefined
    /**
      * The type of application revision:   S3: An application revision stored in Amazon S3.   GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).   String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).  
      */
    var revisionType: js.UndefOr[RevisionLocationType] = js.undefined
    /**
      * Information about the location of a revision stored in Amazon S3. 
      */
    var s3Location: js.UndefOr[S3Location] = js.undefined
    /**
      * Information about the location of an AWS Lambda deployment revision stored as a RawString.
      */
    var string: js.UndefOr[RawString] = js.undefined
  }
  
  trait RollbackInfo extends js.Object {
    /**
      * The ID of the deployment rollback.
      */
    var rollbackDeploymentId: js.UndefOr[DeploymentId] = js.undefined
    /**
      * Information that describes the status of a deployment rollback (for example, whether the deployment can't be rolled back, is in progress, failed, or succeeded). 
      */
    var rollbackMessage: js.UndefOr[Description] = js.undefined
    /**
      * The deployment ID of the deployment that was underway and triggered a rollback deployment because it failed or was stopped.
      */
    var rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId] = js.undefined
  }
  
  trait S3Location extends js.Object {
    /**
      * The name of the Amazon S3 bucket where the application revision is stored.
      */
    var bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * The file type of the application revision. Must be one of the following:   tar: A tar archive file.   tgz: A compressed tar archive file.   zip: A zip archive file.  
      */
    var bundleType: js.UndefOr[BundleType] = js.undefined
    /**
      * The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision. If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
      */
    var eTag: js.UndefOr[ETag] = js.undefined
    /**
      * The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
      */
    var key: js.UndefOr[S3Key] = js.undefined
    /**
      * A specific version of the Amazon S3 object that represents the bundled artifacts for the application revision. If the version is not specified, the system uses the most recent version by default.
      */
    var version: js.UndefOr[VersionId] = js.undefined
  }
  
  trait SkipWaitTimeForInstanceTerminationInput extends js.Object {
    /**
      *  The unique ID of a blue/green deployment for which you want to skip the instance termination wait time. 
      */
    var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  }
  
  trait StopDeploymentInput extends js.Object {
    /**
      *  Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the previous version of the application revision. 
      */
    var autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.undefined
    /**
      *  The unique ID of a deployment. 
      */
    var deploymentId: DeploymentId
  }
  
  trait StopDeploymentOutput extends js.Object {
    /**
      * The status of the stop deployment operation:   Pending: The stop operation is pending.   Succeeded: The stop operation was successful.  
      */
    var status: js.UndefOr[StopStatus] = js.undefined
    /**
      * An accompanying status message.
      */
    var statusMessage: js.UndefOr[Message] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The tag's key.
      */
    var Key: js.UndefOr[Key] = js.undefined
    /**
      * The tag's value.
      */
    var Value: js.UndefOr[Value] = js.undefined
  }
  
  trait TagFilter extends js.Object {
    /**
      * The on-premises instance tag filter key.
      */
    var Key: js.UndefOr[Key] = js.undefined
    /**
      * The on-premises instance tag filter type:   KEY_ONLY: Key only.   VALUE_ONLY: Value only.   KEY_AND_VALUE: Key and value.  
      */
    var Type: js.UndefOr[TagFilterType] = js.undefined
    /**
      * The on-premises instance tag filter value.
      */
    var Value: js.UndefOr[Value] = js.undefined
  }
  
  trait TargetFilters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[FilterValueList]
  
  trait TargetGroupInfo extends js.Object {
    /**
      * For blue/green deployments, the name of the target group that instances in the original environment are deregistered from, and instances in the replacement environment are registered with. For in-place deployments, the name of the target group that instances are deregistered from, so they are not serving traffic during a deployment, and then re-registered with after the deployment is complete. 
      */
    var name: js.UndefOr[TargetGroupName] = js.undefined
  }
  
  trait TargetGroupPairInfo extends js.Object {
    /**
      *  The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete. 
      */
    var prodTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined
    /**
      *  One pair of target groups. One is associated with the original task set. The second is associated with the task set that serves traffic after the deployment is complete. 
      */
    var targetGroups: js.UndefOr[TargetGroupInfoList] = js.undefined
    /**
      *  An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation can occur while test traffic is served during a deployment. 
      */
    var testTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined
  }
  
  trait TargetInstances extends js.Object {
    /**
      * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
      */
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined
    /**
      * Information about the groups of EC2 instance tags that an instance must be identified by in order for it to be included in the replacement environment for a blue/green deployment. Cannot be used in the same call as tagFilters.
      */
    var ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined
    /**
      * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a blue/green deployment. Cannot be used in the same call as ec2TagSet.
      */
    var tagFilters: js.UndefOr[EC2TagFilterList] = js.undefined
  }
  
  trait TimeBasedCanary extends js.Object {
    /**
      * The number of minutes between the first and second traffic shifts of a TimeBasedCanary deployment.
      */
    var canaryInterval: js.UndefOr[WaitTimeInMins] = js.undefined
    /**
      * The percentage of traffic to shift in the first increment of a TimeBasedCanary deployment.
      */
    var canaryPercentage: js.UndefOr[Percentage] = js.undefined
  }
  
  trait TimeBasedLinear extends js.Object {
    /**
      * The number of minutes between each incremental traffic shift of a TimeBasedLinear deployment.
      */
    var linearInterval: js.UndefOr[WaitTimeInMins] = js.undefined
    /**
      * The percentage of traffic that is shifted at the start of each increment of a TimeBasedLinear deployment.
      */
    var linearPercentage: js.UndefOr[Percentage] = js.undefined
  }
  
  trait TimeRange extends js.Object {
    /**
      * The end time of the time range.  Specify null to leave the end time open-ended. 
      */
    var end: js.UndefOr[Timestamp] = js.undefined
    /**
      * The start time of the time range.  Specify null to leave the start time open-ended. 
      */
    var start: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait TrafficRoute extends js.Object {
    /**
      *  The ARN of one listener. The listener identifies the route between a target group and a load balancer. This is an array of strings with a maximum size of one. 
      */
    var listenerArns: js.UndefOr[ListenerArnList] = js.undefined
  }
  
  trait TrafficRoutingConfig extends js.Object {
    /**
      * A configuration that shifts traffic from one version of a Lambda function to another in two increments. The original and target Lambda function versions are specified in the deployment's AppSpec file.
      */
    var timeBasedCanary: js.UndefOr[TimeBasedCanary] = js.undefined
    /**
      * A configuration that shifts traffic from one version of a Lambda function to another in equal increments, with an equal number of minutes between each increment. The original and target Lambda function versions are specified in the deployment's AppSpec file.
      */
    var timeBasedLinear: js.UndefOr[TimeBasedLinear] = js.undefined
    /**
      * The type of traffic shifting (TimeBasedCanary or TimeBasedLinear) used by a deployment configuration .
      */
    var `type`: js.UndefOr[TrafficRoutingType] = js.undefined
  }
  
  trait TriggerConfig extends js.Object {
    /**
      * The event type or types for which notifications are triggered.
      */
    var triggerEvents: js.UndefOr[TriggerEventTypeList] = js.undefined
    /**
      * The name of the notification trigger.
      */
    var triggerName: js.UndefOr[TriggerName] = js.undefined
    /**
      * The ARN of the Amazon Simple Notification Service topic through which notifications about deployment or instance events are sent.
      */
    var triggerTargetArn: js.UndefOr[TriggerTargetArn] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds tags to on-premises instances.
      */
    def addTagsToOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToOnPremisesInstances(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds tags to on-premises instances.
      */
    def addTagsToOnPremisesInstances(params: AddTagsToOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToOnPremisesInstances(
      params: AddTagsToOnPremisesInstancesInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more application revisions.
      */
    def batchGetApplicationRevisions(): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetApplicationRevisions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetApplicationRevisionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more application revisions.
      */
    def batchGetApplicationRevisions(params: BatchGetApplicationRevisionsInput): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetApplicationRevisions(
      params: BatchGetApplicationRevisionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetApplicationRevisionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more applications.
      */
    def batchGetApplications(): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetApplications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetApplicationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more applications.
      */
    def batchGetApplications(params: BatchGetApplicationsInput): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetApplications(
      params: BatchGetApplicationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetApplicationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more deployment groups.
      */
    def batchGetDeploymentGroups(): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetDeploymentGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetDeploymentGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more deployment groups.
      */
    def batchGetDeploymentGroups(params: BatchGetDeploymentGroupsInput): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetDeploymentGroups(
      params: BatchGetDeploymentGroupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetDeploymentGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *   This method works, but is deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. 
      */
    def batchGetDeploymentInstances(): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetDeploymentInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetDeploymentInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *   This method works, but is deprecated. Use BatchGetDeploymentTargets instead.    Returns an array of instances associated with a deployment. This method works with EC2/On-premises and AWS Lambda compute platforms. The newer BatchGetDeploymentTargets works with all compute platforms. 
      */
    def batchGetDeploymentInstances(params: BatchGetDeploymentInstancesInput): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetDeploymentInstances(
      params: BatchGetDeploymentInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetDeploymentInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns an array of targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances.   The type of targets returned depends on the deployment's compute platform:     EC2/On-premises: Information about EC2 instance targets.     AWS Lambda: Information about Lambda functions targets.     Amazon ECS: Information about Amazon ECS service targets.   
      */
    def batchGetDeploymentTargets(): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetDeploymentTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetDeploymentTargetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns an array of targets associated with a deployment. This method works with all compute types and should be used instead of the deprecated BatchGetDeploymentInstances.   The type of targets returned depends on the deployment's compute platform:     EC2/On-premises: Information about EC2 instance targets.     AWS Lambda: Information about Lambda functions targets.     Amazon ECS: Information about Amazon ECS service targets.   
      */
    def batchGetDeploymentTargets(params: BatchGetDeploymentTargetsInput): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetDeploymentTargets(
      params: BatchGetDeploymentTargetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetDeploymentTargetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more deployments.
      */
    def batchGetDeployments(): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetDeployments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetDeploymentsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more deployments.
      */
    def batchGetDeployments(params: BatchGetDeploymentsInput): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetDeployments(
      params: BatchGetDeploymentsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetDeploymentsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more on-premises instances.
      */
    def batchGetOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[BatchGetOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetOnPremisesInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetOnPremisesInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about one or more on-premises instances.
      */
    def batchGetOnPremisesInstances(params: BatchGetOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[BatchGetOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchGetOnPremisesInstances(
      params: BatchGetOnPremisesInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetOnPremisesInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
      */
    def continueDeployment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def continueDeployment(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a blue/green deployment, starts the process of rerouting traffic from instances in the original environment to instances in the replacement environment without waiting for a specified wait time to elapse. (Traffic rerouting, which is achieved by registering instances in the replacement environment with the load balancer, can start as soon as all instances have a status of Ready.) 
      */
    def continueDeployment(params: ContinueDeploymentInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def continueDeployment(
      params: ContinueDeploymentInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an application.
      */
    def createApplication(): awsDashSdkLib.libRequestMod.Request[CreateApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an application.
      */
    def createApplication(params: CreateApplicationInput): awsDashSdkLib.libRequestMod.Request[CreateApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createApplication(
      params: CreateApplicationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deploys an application revision through the specified deployment group.
      */
    def createDeployment(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeployment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deploys an application revision through the specified deployment group.
      */
    def createDeployment(params: CreateDeploymentInput): awsDashSdkLib.libRequestMod.Request[CreateDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeployment(
      params: CreateDeploymentInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a deployment configuration. 
      */
    def createDeploymentConfig(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeploymentConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentConfigOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a deployment configuration. 
      */
    def createDeploymentConfig(params: CreateDeploymentConfigInput): awsDashSdkLib.libRequestMod.Request[CreateDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeploymentConfig(
      params: CreateDeploymentConfigInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentConfigOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a deployment group to which application revisions are deployed.
      */
    def createDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeploymentGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a deployment group to which application revisions are deployed.
      */
    def createDeploymentGroup(params: CreateDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[CreateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeploymentGroup(
      params: CreateDeploymentGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an application.
      */
    def deleteApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplication(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an application.
      */
    def deleteApplication(params: DeleteApplicationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteApplication(
      params: DeleteApplicationInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
      */
    def deleteDeploymentConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDeploymentConfig(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a deployment configuration.  A deployment configuration cannot be deleted if it is currently in use. Predefined configurations cannot be deleted. 
      */
    def deleteDeploymentConfig(params: DeleteDeploymentConfigInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDeploymentConfig(
      params: DeleteDeploymentConfigInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a deployment group.
      */
    def deleteDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[DeleteDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDeploymentGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDeploymentGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a deployment group.
      */
    def deleteDeploymentGroup(params: DeleteDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[DeleteDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDeploymentGroup(
      params: DeleteDeploymentGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDeploymentGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a GitHub account connection.
      */
    def deleteGitHubAccountToken(): awsDashSdkLib.libRequestMod.Request[DeleteGitHubAccountTokenOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGitHubAccountToken(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGitHubAccountTokenOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGitHubAccountTokenOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a GitHub account connection.
      */
    def deleteGitHubAccountToken(params: DeleteGitHubAccountTokenInput): awsDashSdkLib.libRequestMod.Request[DeleteGitHubAccountTokenOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGitHubAccountToken(
      params: DeleteGitHubAccountTokenInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGitHubAccountTokenOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGitHubAccountTokenOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters an on-premises instance.
      */
    def deregisterOnPremisesInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterOnPremisesInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters an on-premises instance.
      */
    def deregisterOnPremisesInstance(params: DeregisterOnPremisesInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterOnPremisesInstance(
      params: DeregisterOnPremisesInstanceInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an application.
      */
    def getApplication(): awsDashSdkLib.libRequestMod.Request[GetApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an application.
      */
    def getApplication(params: GetApplicationInput): awsDashSdkLib.libRequestMod.Request[GetApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApplication(
      params: GetApplicationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an application revision.
      */
    def getApplicationRevision(): awsDashSdkLib.libRequestMod.Request[GetApplicationRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApplicationRevision(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationRevisionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an application revision.
      */
    def getApplicationRevision(params: GetApplicationRevisionInput): awsDashSdkLib.libRequestMod.Request[GetApplicationRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getApplicationRevision(
      params: GetApplicationRevisionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationRevisionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationRevisionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a deployment.
      */
    def getDeployment(): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeployment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a deployment.
      */
    def getDeployment(params: GetDeploymentInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeployment(
      params: GetDeploymentInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a deployment configuration.
      */
    def getDeploymentConfig(): awsDashSdkLib.libRequestMod.Request[GetDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeploymentConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentConfigOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a deployment configuration.
      */
    def getDeploymentConfig(params: GetDeploymentConfigInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeploymentConfig(
      params: GetDeploymentConfigInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentConfigOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentConfigOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a deployment group.
      */
    def getDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[GetDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeploymentGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a deployment group.
      */
    def getDeploymentGroup(params: GetDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeploymentGroup(
      params: GetDeploymentGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an instance as part of a deployment.
      */
    def getDeploymentInstance(): awsDashSdkLib.libRequestMod.Request[GetDeploymentInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeploymentInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentInstanceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an instance as part of a deployment.
      */
    def getDeploymentInstance(params: GetDeploymentInstanceInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeploymentInstance(
      params: GetDeploymentInstanceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentInstanceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns information about a deployment target. 
      */
    def getDeploymentTarget(): awsDashSdkLib.libRequestMod.Request[GetDeploymentTargetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeploymentTarget(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentTargetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentTargetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns information about a deployment target. 
      */
    def getDeploymentTarget(params: GetDeploymentTargetInput): awsDashSdkLib.libRequestMod.Request[GetDeploymentTargetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDeploymentTarget(
      params: GetDeploymentTargetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentTargetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentTargetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Gets information about an on-premises instance. 
      */
    def getOnPremisesInstance(): awsDashSdkLib.libRequestMod.Request[GetOnPremisesInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOnPremisesInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOnPremisesInstanceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOnPremisesInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Gets information about an on-premises instance. 
      */
    def getOnPremisesInstance(params: GetOnPremisesInstanceInput): awsDashSdkLib.libRequestMod.Request[GetOnPremisesInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOnPremisesInstance(
      params: GetOnPremisesInstanceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOnPremisesInstanceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOnPremisesInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about revisions for an application.
      */
    def listApplicationRevisions(): awsDashSdkLib.libRequestMod.Request[ListApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listApplicationRevisions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationRevisionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists information about revisions for an application.
      */
    def listApplicationRevisions(params: ListApplicationRevisionsInput): awsDashSdkLib.libRequestMod.Request[ListApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listApplicationRevisions(
      params: ListApplicationRevisionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationRevisionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationRevisionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the applications registered with the IAM user or AWS account.
      */
    def listApplications(): awsDashSdkLib.libRequestMod.Request[ListApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listApplications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the applications registered with the IAM user or AWS account.
      */
    def listApplications(params: ListApplicationsInput): awsDashSdkLib.libRequestMod.Request[ListApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listApplications(
      params: ListApplicationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the deployment configurations with the IAM user or AWS account.
      */
    def listDeploymentConfigs(): awsDashSdkLib.libRequestMod.Request[ListDeploymentConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentConfigs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentConfigsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the deployment configurations with the IAM user or AWS account.
      */
    def listDeploymentConfigs(params: ListDeploymentConfigsInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentConfigs(
      params: ListDeploymentConfigsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentConfigsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentConfigsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the deployment groups for an application registered with the IAM user or AWS account.
      */
    def listDeploymentGroups(): awsDashSdkLib.libRequestMod.Request[ListDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the deployment groups for an application registered with the IAM user or AWS account.
      */
    def listDeploymentGroups(params: ListDeploymentGroupsInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentGroups(
      params: ListDeploymentGroupsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentGroupsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the IAM user or AWS account. 
      */
    def listDeploymentInstances(): awsDashSdkLib.libRequestMod.Request[ListDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *   The newer BatchGetDeploymentTargets should be used instead because it works with all compute types. ListDeploymentInstances throws an exception if it is used with a compute platform other than EC2/On-premises or AWS Lambda.    Lists the instance for a deployment associated with the IAM user or AWS account. 
      */
    def listDeploymentInstances(params: ListDeploymentInstancesInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentInstances(
      params: ListDeploymentInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns an array of target IDs that are associated a deployment. 
      */
    def listDeploymentTargets(): awsDashSdkLib.libRequestMod.Request[ListDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentTargetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns an array of target IDs that are associated a deployment. 
      */
    def listDeploymentTargets(params: ListDeploymentTargetsInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentTargets(
      params: ListDeploymentTargetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentTargetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.
      */
    def listDeployments(): awsDashSdkLib.libRequestMod.Request[ListDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeployments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the deployments in a deployment group for an application registered with the IAM user or AWS account.
      */
    def listDeployments(params: ListDeploymentsInput): awsDashSdkLib.libRequestMod.Request[ListDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeployments(
      params: ListDeploymentsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the names of stored connections to GitHub accounts.
      */
    def listGitHubAccountTokenNames(): awsDashSdkLib.libRequestMod.Request[ListGitHubAccountTokenNamesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGitHubAccountTokenNames(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGitHubAccountTokenNamesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGitHubAccountTokenNamesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the names of stored connections to GitHub accounts.
      */
    def listGitHubAccountTokenNames(params: ListGitHubAccountTokenNamesInput): awsDashSdkLib.libRequestMod.Request[ListGitHubAccountTokenNamesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGitHubAccountTokenNames(
      params: ListGitHubAccountTokenNamesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGitHubAccountTokenNamesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGitHubAccountTokenNamesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
      */
    def listOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[ListOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOnPremisesInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOnPremisesInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of names for one or more on-premises instances. Unless otherwise specified, both registered and deregistered on-premises instance names are listed. To list only registered or deregistered on-premises instance names, use the registration status parameter.
      */
    def listOnPremisesInstances(params: ListOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[ListOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listOnPremisesInstances(
      params: ListOnPremisesInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOnPremisesInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOnPremisesInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Sets the result of a Lambda validation function. The function validates one or both lifecycle events (BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or Failed. 
      */
    def putLifecycleEventHookExecutionStatus(): awsDashSdkLib.libRequestMod.Request[PutLifecycleEventHookExecutionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putLifecycleEventHookExecutionStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLifecycleEventHookExecutionStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLifecycleEventHookExecutionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Sets the result of a Lambda validation function. The function validates one or both lifecycle events (BeforeAllowTraffic and AfterAllowTraffic) and returns Succeeded or Failed. 
      */
    def putLifecycleEventHookExecutionStatus(params: PutLifecycleEventHookExecutionStatusInput): awsDashSdkLib.libRequestMod.Request[PutLifecycleEventHookExecutionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putLifecycleEventHookExecutionStatus(
      params: PutLifecycleEventHookExecutionStatusInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLifecycleEventHookExecutionStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLifecycleEventHookExecutionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers with AWS CodeDeploy a revision for the specified application.
      */
    def registerApplicationRevision(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerApplicationRevision(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers with AWS CodeDeploy a revision for the specified application.
      */
    def registerApplicationRevision(params: RegisterApplicationRevisionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerApplicationRevision(
      params: RegisterApplicationRevisionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
      */
    def registerOnPremisesInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerOnPremisesInstance(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an on-premises instance.  Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the request. You cannot use both. 
      */
    def registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerOnPremisesInstance(
      params: RegisterOnPremisesInstanceInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from one or more on-premises instances.
      */
    def removeTagsFromOnPremisesInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromOnPremisesInstances(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from one or more on-premises instances.
      */
    def removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromOnPremisesInstances(
      params: RemoveTagsFromOnPremisesInstancesInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is complete.
      */
    def skipWaitTimeForInstanceTermination(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def skipWaitTimeForInstanceTermination(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * In a blue/green deployment, overrides any specified wait time and starts terminating instances immediately after the traffic routing is complete.
      */
    def skipWaitTimeForInstanceTermination(params: SkipWaitTimeForInstanceTerminationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def skipWaitTimeForInstanceTermination(
      params: SkipWaitTimeForInstanceTerminationInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attempts to stop an ongoing deployment.
      */
    def stopDeployment(): awsDashSdkLib.libRequestMod.Request[StopDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopDeployment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDeploymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attempts to stop an ongoing deployment.
      */
    def stopDeployment(params: StopDeploymentInput): awsDashSdkLib.libRequestMod.Request[StopDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopDeployment(
      params: StopDeploymentInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDeploymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the name of an application.
      */
    def updateApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplication(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the name of an application.
      */
    def updateApplication(params: UpdateApplicationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateApplication(
      params: UpdateApplicationInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes information about a deployment group.
      */
    def updateDeploymentGroup(): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDeploymentGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDeploymentGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes information about a deployment group.
      */
    def updateDeploymentGroup(params: UpdateDeploymentGroupInput): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDeploymentGroup(
      params: UpdateDeploymentGroupInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDeploymentGroupOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDeploymentGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
      */
    @JSName("waitFor")
    def waitFor_deploymentSuccessful(state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_deploymentSuccessful(
      state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the deploymentSuccessful state by periodically calling the underlying CodeDeploy.getDeploymentoperation every 15 seconds (at most 120 times).
      */
    @JSName("waitFor")
    def waitFor_deploymentSuccessful(
      state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
      params: GetDeploymentInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_deploymentSuccessful(
      state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
      params: GetDeploymentInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeploymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeploymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateApplicationInput extends js.Object {
    /**
      * The current name of the application you want to change.
      */
    var applicationName: js.UndefOr[ApplicationName] = js.undefined
    /**
      * The new name to give the application.
      */
    var newApplicationName: js.UndefOr[ApplicationName] = js.undefined
  }
  
  trait UpdateDeploymentGroupInput extends js.Object {
    /**
      * Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
      */
    var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined
    /**
      * The application name that corresponds to the deployment group to update.
      */
    var applicationName: ApplicationName
    /**
      * Information for an automatic rollback configuration that is added or changed when a deployment group is updated.
      */
    var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.undefined
    /**
      * The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change them. To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any Auto Scaling group names.
      */
    var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.undefined
    /**
      * Information about blue/green deployment options for a deployment group.
      */
    var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.undefined
    /**
      * The current name of the deployment group.
      */
    var currentDeploymentGroupName: DeploymentGroupName
    /**
      * The replacement deployment configuration name to use, if you want to change it.
      */
    var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
    /**
      * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
      */
    var deploymentStyle: js.UndefOr[DeploymentStyle] = js.undefined
    /**
      * The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the existing tags, enter their names. To remove tags, do not enter any tag names.
      */
    var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.undefined
    /**
      * Information about groups of tags applied to on-premises instances. The deployment group includes only EC2 instances identified by all the tag groups.
      */
    var ec2TagSet: js.UndefOr[EC2TagSet] = js.undefined
    /**
      *  The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format &lt;clustername&gt;:&lt;servicename&gt;. 
      */
    var ecsServices: js.UndefOr[ECSServiceList] = js.undefined
    /**
      * Information about the load balancer used in a deployment.
      */
    var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.undefined
    /**
      * The new name of the deployment group, if you want to change it.
      */
    var newDeploymentGroupName: js.UndefOr[DeploymentGroupName] = js.undefined
    /**
      * The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep the existing tags, enter their names. To remove tags, do not enter any tag names.
      */
    var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.undefined
    /**
      * Information about an on-premises instance tag set. The deployment group includes only on-premises instances identified by all the tag groups.
      */
    var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.undefined
    /**
      * A replacement ARN for the service role, if you want to change it.
      */
    var serviceRoleArn: js.UndefOr[Role] = js.undefined
    /**
      * Information about triggers to change when the deployment group is updated. For examples, see Modify Triggers in an AWS CodeDeploy Deployment Group in the AWS CodeDeploy User Guide.
      */
    var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined
  }
  
  trait UpdateDeploymentGroupOutput extends js.Object {
    /**
      * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the AWS account. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the AWS account.
      */
    var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.undefined
  }
  
  trait _ApplicationRevisionSortBy extends js.Object
  
  trait _AutoRollbackEvent extends js.Object
  
  trait _BundleType extends js.Object
  
  trait _ComputePlatform extends js.Object
  
  trait _DeploymentCreator extends js.Object
  
  trait _DeploymentOption extends js.Object
  
  trait _DeploymentReadyAction extends js.Object
  
  trait _DeploymentStatus extends js.Object
  
  trait _DeploymentTargetType extends js.Object
  
  trait _DeploymentType extends js.Object
  
  trait _DeploymentWaitType extends js.Object
  
  trait _EC2TagFilterType extends js.Object
  
  trait _ErrorCode extends js.Object
  
  trait _FileExistsBehavior extends js.Object
  
  trait _GreenFleetProvisioningAction extends js.Object
  
  trait _InstanceAction extends js.Object
  
  trait _InstanceStatus extends js.Object
  
  trait _InstanceType extends js.Object
  
  trait _LifecycleErrorCode extends js.Object
  
  trait _LifecycleEventStatus extends js.Object
  
  trait _ListStateFilterAction extends js.Object
  
  trait _MinimumHealthyHostsType extends js.Object
  
  trait _RegistrationStatus extends js.Object
  
  trait _RevisionLocationType extends js.Object
  
  trait _SortOrder extends js.Object
  
  trait _StopStatus extends js.Object
  
  trait _TagFilterType extends js.Object
  
  trait _TargetFilterName extends js.Object
  
  trait _TargetLabel extends js.Object
  
  trait _TargetStatus extends js.Object
  
  trait _TrafficRoutingType extends js.Object
  
  trait _TriggerEventType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AdditionalDeploymentStatusInfo = java.lang.String
  type AlarmList = js.Array[Alarm]
  type AlarmName = java.lang.String
  type ApplicationId = java.lang.String
  type ApplicationName = java.lang.String
  type ApplicationRevisionSortBy = _ApplicationRevisionSortBy | java.lang.String
  type ApplicationsInfoList = js.Array[ApplicationInfo]
  type ApplicationsList = js.Array[ApplicationName]
  type AutoRollbackEvent = _AutoRollbackEvent | java.lang.String
  type AutoRollbackEventsList = js.Array[AutoRollbackEvent]
  type AutoScalingGroupHook = java.lang.String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AutoScalingGroupName = java.lang.String
  type AutoScalingGroupNameList = js.Array[AutoScalingGroupName]
  type Boolean = scala.Boolean
  type BundleType = _BundleType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CommitId = java.lang.String
  type ComputePlatform = _ComputePlatform | java.lang.String
  type DeploymentConfigId = java.lang.String
  type DeploymentConfigName = java.lang.String
  type DeploymentConfigsList = js.Array[DeploymentConfigName]
  type DeploymentCreator = _DeploymentCreator | java.lang.String
  type DeploymentGroupId = java.lang.String
  type DeploymentGroupInfoList = js.Array[DeploymentGroupInfo]
  type DeploymentGroupName = java.lang.String
  type DeploymentGroupsList = js.Array[DeploymentGroupName]
  type DeploymentId = java.lang.String
  type DeploymentOption = _DeploymentOption | java.lang.String
  type DeploymentReadyAction = _DeploymentReadyAction | java.lang.String
  type DeploymentStatus = _DeploymentStatus | java.lang.String
  type DeploymentStatusList = js.Array[DeploymentStatus]
  type DeploymentStatusMessageList = js.Array[ErrorMessage]
  type DeploymentTargetList = js.Array[DeploymentTarget]
  type DeploymentTargetType = _DeploymentTargetType | java.lang.String
  type DeploymentType = _DeploymentType | java.lang.String
  type DeploymentWaitType = _DeploymentWaitType | java.lang.String
  type DeploymentsInfoList = js.Array[DeploymentInfo]
  type DeploymentsList = js.Array[DeploymentId]
  type Description = java.lang.String
  type Duration = scala.Double
  type EC2TagFilterList = js.Array[EC2TagFilter]
  type EC2TagFilterType = _EC2TagFilterType | java.lang.String
  type EC2TagSetList = js.Array[EC2TagFilterList]
  type ECSClusterName = java.lang.String
  type ECSServiceList = js.Array[ECSService]
  type ECSServiceName = java.lang.String
  type ECSTaskSetCount = scala.Double
  type ECSTaskSetIdentifier = java.lang.String
  type ECSTaskSetList = js.Array[ECSTaskSet]
  type ECSTaskSetStatus = java.lang.String
  type ELBInfoList = js.Array[ELBInfo]
  type ELBName = java.lang.String
  type ETag = java.lang.String
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type FileExistsBehavior = _FileExistsBehavior | java.lang.String
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[FilterValue]
  type GitHubAccountTokenName = java.lang.String
  type GitHubAccountTokenNameList = js.Array[GitHubAccountTokenName]
  type GreenFleetProvisioningAction = _GreenFleetProvisioningAction | java.lang.String
  type IamSessionArn = java.lang.String
  type IamUserArn = java.lang.String
  type InstanceAction = _InstanceAction | java.lang.String
  type InstanceArn = java.lang.String
  type InstanceCount = scala.Double
  type InstanceId = java.lang.String
  type InstanceInfoList = js.Array[InstanceInfo]
  type InstanceName = java.lang.String
  type InstanceNameList = js.Array[InstanceName]
  type InstanceStatus = _InstanceStatus | java.lang.String
  type InstanceStatusList = js.Array[InstanceStatus]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type InstanceType = _InstanceType | java.lang.String
  type InstanceTypeList = js.Array[InstanceType]
  type InstancesList = js.Array[InstanceId]
  type Key = java.lang.String
  type LifecycleErrorCode = _LifecycleErrorCode | java.lang.String
  type LifecycleEventHookExecutionId = java.lang.String
  type LifecycleEventList = js.Array[LifecycleEvent]
  type LifecycleEventName = java.lang.String
  type LifecycleEventStatus = _LifecycleEventStatus | java.lang.String
  type LifecycleMessage = java.lang.String
  type ListStateFilterAction = _ListStateFilterAction | java.lang.String
  type ListenerArn = java.lang.String
  type ListenerArnList = js.Array[ListenerArn]
  type LogTail = java.lang.String
  type Message = java.lang.String
  type MinimumHealthyHostsType = _MinimumHealthyHostsType | java.lang.String
  type MinimumHealthyHostsValue = scala.Double
  type NextToken = java.lang.String
  type NullableBoolean = scala.Boolean
  type OnPremisesTagSetList = js.Array[TagFilterList]
  type Percentage = scala.Double
  type RawStringContent = java.lang.String
  type RawStringSha256 = java.lang.String
  type RegistrationStatus = _RegistrationStatus | java.lang.String
  type Repository = java.lang.String
  type RevisionInfoList = js.Array[RevisionInfo]
  type RevisionLocationList = js.Array[RevisionLocation]
  type RevisionLocationType = _RevisionLocationType | java.lang.String
  type Role = java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type ScriptName = java.lang.String
  type SortOrder = _SortOrder | java.lang.String
  type StopStatus = _StopStatus | java.lang.String
  type TagFilterList = js.Array[TagFilter]
  type TagFilterType = _TagFilterType | java.lang.String
  type TagList = js.Array[Tag]
  type TargetArn = java.lang.String
  type TargetFilterName = _TargetFilterName | java.lang.String
  type TargetGroupInfoList = js.Array[TargetGroupInfo]
  type TargetGroupName = java.lang.String
  type TargetGroupPairInfoList = js.Array[TargetGroupPairInfo]
  type TargetId = java.lang.String
  type TargetIdList = js.Array[TargetId]
  type TargetLabel = _TargetLabel | java.lang.String
  type TargetStatus = _TargetStatus | java.lang.String
  type Time = stdLib.Date
  type Timestamp = stdLib.Date
  type TrafficRoutingType = _TrafficRoutingType | java.lang.String
  type TrafficWeight = scala.Double
  type TriggerConfigList = js.Array[TriggerConfig]
  type TriggerEventType = _TriggerEventType | java.lang.String
  type TriggerEventTypeList = js.Array[TriggerEventType]
  type TriggerName = java.lang.String
  type TriggerTargetArn = java.lang.String
  type Value = java.lang.String
  type VersionId = java.lang.String
  type WaitTimeInMins = scala.Double
  type apiVersion = _apiVersion | java.lang.String
}

