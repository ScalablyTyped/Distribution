package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupInfo extends js.Object {
  /**
    * A list of alarms associated with the deployment group.
    */
  var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.native
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * Information about the automatic rollback configuration associated with the deployment group.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  /**
    * A list of associated Auto Scaling groups.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  /**
    * Information about blue/green deployment options for a deployment group.
    */
  var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.native
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * The deployment configuration name.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  /**
    * The deployment group ID.
    */
  var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.native
  /**
    * The deployment group name.
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  /**
    * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  var deploymentStyle: js.UndefOr[DeploymentStyle] = js.native
  /**
    * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified tags.
    */
  var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.native
  /**
    * Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2 instances identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
    */
  var ec2TagSet: js.UndefOr[EC2TagSet] = js.native
  /**
    *  The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format &lt;clustername&gt;:&lt;servicename&gt;. 
    */
  var ecsServices: js.UndefOr[ECSServiceList] = js.native
  /**
    * Information about the most recent attempted deployment to the deployment group.
    */
  var lastAttemptedDeployment: js.UndefOr[LastDeploymentInfo] = js.native
  /**
    * Information about the most recent successful deployment to the deployment group.
    */
  var lastSuccessfulDeployment: js.UndefOr[LastDeploymentInfo] = js.native
  /**
    * Information about the load balancer to use in a deployment.
    */
  var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.native
  /**
    * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of the specified tags.
    */
  var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.native
  /**
    * Information about groups of tags applied to an on-premises instance. The deployment group includes only on-premises instances identified by all the tag groups. Cannot be used in the same call as onPremisesInstanceTagFilters.
    */
  var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.native
  /**
    * A service role Amazon Resource Name (ARN) that grants CodeDeploy permission to make calls to AWS services on your behalf. For more information, see Create a Service Role for AWS CodeDeploy in the AWS CodeDeploy User Guide.
    */
  var serviceRoleArn: js.UndefOr[Role] = js.native
  /**
    * Information about the deployment group's target revision, including type and location.
    */
  var targetRevision: js.UndefOr[RevisionLocation] = js.native
  /**
    * Information about triggers associated with the deployment group.
    */
  var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.native
}

object DeploymentGroupInfo {
  @scala.inline
  def apply(
    alarmConfiguration: AlarmConfiguration = null,
    applicationName: ApplicationName = null,
    autoRollbackConfiguration: AutoRollbackConfiguration = null,
    autoScalingGroups: AutoScalingGroupList = null,
    blueGreenDeploymentConfiguration: BlueGreenDeploymentConfiguration = null,
    computePlatform: ComputePlatform = null,
    deploymentConfigName: DeploymentConfigName = null,
    deploymentGroupId: DeploymentGroupId = null,
    deploymentGroupName: DeploymentGroupName = null,
    deploymentStyle: DeploymentStyle = null,
    ec2TagFilters: EC2TagFilterList = null,
    ec2TagSet: EC2TagSet = null,
    ecsServices: ECSServiceList = null,
    lastAttemptedDeployment: LastDeploymentInfo = null,
    lastSuccessfulDeployment: LastDeploymentInfo = null,
    loadBalancerInfo: LoadBalancerInfo = null,
    onPremisesInstanceTagFilters: TagFilterList = null,
    onPremisesTagSet: OnPremisesTagSet = null,
    serviceRoleArn: Role = null,
    targetRevision: RevisionLocation = null,
    triggerConfigurations: TriggerConfigList = null
  ): DeploymentGroupInfo = {
    val __obj = js.Dynamic.literal()
    if (alarmConfiguration != null) __obj.updateDynamic("alarmConfiguration")(alarmConfiguration.asInstanceOf[js.Any])
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (autoRollbackConfiguration != null) __obj.updateDynamic("autoRollbackConfiguration")(autoRollbackConfiguration.asInstanceOf[js.Any])
    if (autoScalingGroups != null) __obj.updateDynamic("autoScalingGroups")(autoScalingGroups.asInstanceOf[js.Any])
    if (blueGreenDeploymentConfiguration != null) __obj.updateDynamic("blueGreenDeploymentConfiguration")(blueGreenDeploymentConfiguration.asInstanceOf[js.Any])
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName.asInstanceOf[js.Any])
    if (deploymentGroupId != null) __obj.updateDynamic("deploymentGroupId")(deploymentGroupId.asInstanceOf[js.Any])
    if (deploymentGroupName != null) __obj.updateDynamic("deploymentGroupName")(deploymentGroupName.asInstanceOf[js.Any])
    if (deploymentStyle != null) __obj.updateDynamic("deploymentStyle")(deploymentStyle.asInstanceOf[js.Any])
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters.asInstanceOf[js.Any])
    if (ec2TagSet != null) __obj.updateDynamic("ec2TagSet")(ec2TagSet.asInstanceOf[js.Any])
    if (ecsServices != null) __obj.updateDynamic("ecsServices")(ecsServices.asInstanceOf[js.Any])
    if (lastAttemptedDeployment != null) __obj.updateDynamic("lastAttemptedDeployment")(lastAttemptedDeployment.asInstanceOf[js.Any])
    if (lastSuccessfulDeployment != null) __obj.updateDynamic("lastSuccessfulDeployment")(lastSuccessfulDeployment.asInstanceOf[js.Any])
    if (loadBalancerInfo != null) __obj.updateDynamic("loadBalancerInfo")(loadBalancerInfo.asInstanceOf[js.Any])
    if (onPremisesInstanceTagFilters != null) __obj.updateDynamic("onPremisesInstanceTagFilters")(onPremisesInstanceTagFilters.asInstanceOf[js.Any])
    if (onPremisesTagSet != null) __obj.updateDynamic("onPremisesTagSet")(onPremisesTagSet.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (targetRevision != null) __obj.updateDynamic("targetRevision")(targetRevision.asInstanceOf[js.Any])
    if (triggerConfigurations != null) __obj.updateDynamic("triggerConfigurations")(triggerConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupInfo]
  }
}

