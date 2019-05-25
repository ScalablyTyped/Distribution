package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    *  The metadata that you apply to CodeDeploy deployment groups to help you organize and categorize them. Each tag consists of a key and an optional value, both of which you define. 
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * Information about triggers to create when the deployment group is created. For examples, see Create a Trigger for an AWS CodeDeploy Event in the AWS CodeDeploy User Guide.
    */
  var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined
}

object CreateDeploymentGroupInput {
  @scala.inline
  def apply(
    applicationName: ApplicationName,
    deploymentGroupName: DeploymentGroupName,
    serviceRoleArn: Role,
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
    onPremisesInstanceTagFilters: TagFilterList = null,
    onPremisesTagSet: OnPremisesTagSet = null,
    tags: TagList = null,
    triggerConfigurations: TriggerConfigList = null
  ): CreateDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName, deploymentGroupName = deploymentGroupName, serviceRoleArn = serviceRoleArn)
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
    if (onPremisesInstanceTagFilters != null) __obj.updateDynamic("onPremisesInstanceTagFilters")(onPremisesInstanceTagFilters)
    if (onPremisesTagSet != null) __obj.updateDynamic("onPremisesTagSet")(onPremisesTagSet)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (triggerConfigurations != null) __obj.updateDynamic("triggerConfigurations")(triggerConfigurations)
    __obj.asInstanceOf[CreateDeploymentGroupInput]
  }
}

