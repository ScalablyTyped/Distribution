package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object UpdateDeploymentGroupInput {
  @scala.inline
  def apply(
    applicationName: ApplicationName,
    currentDeploymentGroupName: DeploymentGroupName,
    alarmConfiguration: AlarmConfiguration = null,
    autoRollbackConfiguration: AutoRollbackConfiguration = null,
    autoScalingGroups: AutoScalingGroupNameList = null,
    blueGreenDeploymentConfiguration: BlueGreenDeploymentConfiguration = null,
    deploymentConfigName: DeploymentConfigName = null,
    deploymentStyle: DeploymentStyle = null,
    ec2TagFilters: EC2TagFilterList = null,
    ec2TagSet: EC2TagSet = null,
    ecsServices: ECSServiceList = null,
    loadBalancerInfo: LoadBalancerInfo = null,
    newDeploymentGroupName: DeploymentGroupName = null,
    onPremisesInstanceTagFilters: TagFilterList = null,
    onPremisesTagSet: OnPremisesTagSet = null,
    serviceRoleArn: Role = null,
    triggerConfigurations: TriggerConfigList = null
  ): UpdateDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName, currentDeploymentGroupName = currentDeploymentGroupName)
    if (alarmConfiguration != null) __obj.updateDynamic("alarmConfiguration")(alarmConfiguration)
    if (autoRollbackConfiguration != null) __obj.updateDynamic("autoRollbackConfiguration")(autoRollbackConfiguration)
    if (autoScalingGroups != null) __obj.updateDynamic("autoScalingGroups")(autoScalingGroups)
    if (blueGreenDeploymentConfiguration != null) __obj.updateDynamic("blueGreenDeploymentConfiguration")(blueGreenDeploymentConfiguration)
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName)
    if (deploymentStyle != null) __obj.updateDynamic("deploymentStyle")(deploymentStyle)
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters)
    if (ec2TagSet != null) __obj.updateDynamic("ec2TagSet")(ec2TagSet)
    if (ecsServices != null) __obj.updateDynamic("ecsServices")(ecsServices)
    if (loadBalancerInfo != null) __obj.updateDynamic("loadBalancerInfo")(loadBalancerInfo)
    if (newDeploymentGroupName != null) __obj.updateDynamic("newDeploymentGroupName")(newDeploymentGroupName)
    if (onPremisesInstanceTagFilters != null) __obj.updateDynamic("onPremisesInstanceTagFilters")(onPremisesInstanceTagFilters)
    if (onPremisesTagSet != null) __obj.updateDynamic("onPremisesTagSet")(onPremisesTagSet)
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn)
    if (triggerConfigurations != null) __obj.updateDynamic("triggerConfigurations")(triggerConfigurations)
    __obj.asInstanceOf[UpdateDeploymentGroupInput]
  }
}

