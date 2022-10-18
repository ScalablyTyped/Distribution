package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeploymentGroupInput extends StObject {
  
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
    * The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change them.   To keep the Auto Scaling groups, enter their names or do not specify this parameter.    To remove Auto Scaling groups, specify a non-null empty list of Auto Scaling group names to detach all CodeDeploy-managed Auto Scaling lifecycle hooks. For examples, see Amazon EC2 instances in an Amazon EC2 Auto Scaling group fail to launch and receive the error "Heartbeat Timeout" in the CodeDeploy User Guide.  
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
    * Information about groups of tags applied to on-premises instances. The deployment group includes only Amazon EC2 instances identified by all the tag groups.
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
    * Indicates what happens when new Amazon EC2 instances are launched mid-deployment and do not receive the deployed application revision. If this option is set to UPDATE or is unspecified, CodeDeploy initiates one or more 'auto-update outdated instances' deployments to apply the deployed application revision to the new Amazon EC2 instances. If this option is set to IGNORE, CodeDeploy does not initiate a deployment to update the new Amazon EC2 instances. This may result in instances having different revisions.
    */
  var outdatedInstancesStrategy: js.UndefOr[OutdatedInstancesStrategy] = js.undefined
  
  /**
    * A replacement ARN for the service role, if you want to change it.
    */
  var serviceRoleArn: js.UndefOr[Role] = js.undefined
  
  /**
    * Information about triggers to change when the deployment group is updated. For examples, see Edit a Trigger in a CodeDeploy Deployment Group in the CodeDeploy User Guide.
    */
  var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.undefined
}
object UpdateDeploymentGroupInput {
  
  inline def apply(applicationName: ApplicationName, currentDeploymentGroupName: DeploymentGroupName): UpdateDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], currentDeploymentGroupName = currentDeploymentGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeploymentGroupInput]
  }
  
  extension [Self <: UpdateDeploymentGroupInput](x: Self) {
    
    inline def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "alarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "alarmConfiguration", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = StObject.set(x, "autoRollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoRollbackConfigurationUndefined: Self = StObject.set(x, "autoRollbackConfiguration", js.undefined)
    
    inline def setAutoScalingGroups(value: AutoScalingGroupNameList): Self = StObject.set(x, "autoScalingGroups", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupsUndefined: Self = StObject.set(x, "autoScalingGroups", js.undefined)
    
    inline def setAutoScalingGroupsVarargs(value: AutoScalingGroupName*): Self = StObject.set(x, "autoScalingGroups", js.Array(value*))
    
    inline def setBlueGreenDeploymentConfiguration(value: BlueGreenDeploymentConfiguration): Self = StObject.set(x, "blueGreenDeploymentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenDeploymentConfigurationUndefined: Self = StObject.set(x, "blueGreenDeploymentConfiguration", js.undefined)
    
    inline def setCurrentDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "currentDeploymentGroupName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
    
    inline def setDeploymentStyle(value: DeploymentStyle): Self = StObject.set(x, "deploymentStyle", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStyleUndefined: Self = StObject.set(x, "deploymentStyle", js.undefined)
    
    inline def setEc2TagFilters(value: EC2TagFilterList): Self = StObject.set(x, "ec2TagFilters", value.asInstanceOf[js.Any])
    
    inline def setEc2TagFiltersUndefined: Self = StObject.set(x, "ec2TagFilters", js.undefined)
    
    inline def setEc2TagFiltersVarargs(value: EC2TagFilter*): Self = StObject.set(x, "ec2TagFilters", js.Array(value*))
    
    inline def setEc2TagSet(value: EC2TagSet): Self = StObject.set(x, "ec2TagSet", value.asInstanceOf[js.Any])
    
    inline def setEc2TagSetUndefined: Self = StObject.set(x, "ec2TagSet", js.undefined)
    
    inline def setEcsServices(value: ECSServiceList): Self = StObject.set(x, "ecsServices", value.asInstanceOf[js.Any])
    
    inline def setEcsServicesUndefined: Self = StObject.set(x, "ecsServices", js.undefined)
    
    inline def setEcsServicesVarargs(value: ECSService*): Self = StObject.set(x, "ecsServices", js.Array(value*))
    
    inline def setLoadBalancerInfo(value: LoadBalancerInfo): Self = StObject.set(x, "loadBalancerInfo", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerInfoUndefined: Self = StObject.set(x, "loadBalancerInfo", js.undefined)
    
    inline def setNewDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "newDeploymentGroupName", value.asInstanceOf[js.Any])
    
    inline def setNewDeploymentGroupNameUndefined: Self = StObject.set(x, "newDeploymentGroupName", js.undefined)
    
    inline def setOnPremisesInstanceTagFilters(value: TagFilterList): Self = StObject.set(x, "onPremisesInstanceTagFilters", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesInstanceTagFiltersUndefined: Self = StObject.set(x, "onPremisesInstanceTagFilters", js.undefined)
    
    inline def setOnPremisesInstanceTagFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "onPremisesInstanceTagFilters", js.Array(value*))
    
    inline def setOnPremisesTagSet(value: OnPremisesTagSet): Self = StObject.set(x, "onPremisesTagSet", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesTagSetUndefined: Self = StObject.set(x, "onPremisesTagSet", js.undefined)
    
    inline def setOutdatedInstancesStrategy(value: OutdatedInstancesStrategy): Self = StObject.set(x, "outdatedInstancesStrategy", value.asInstanceOf[js.Any])
    
    inline def setOutdatedInstancesStrategyUndefined: Self = StObject.set(x, "outdatedInstancesStrategy", js.undefined)
    
    inline def setServiceRoleArn(value: Role): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
    
    inline def setTriggerConfigurations(value: TriggerConfigList): Self = StObject.set(x, "triggerConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTriggerConfigurationsUndefined: Self = StObject.set(x, "triggerConfigurations", js.undefined)
    
    inline def setTriggerConfigurationsVarargs(value: TriggerConfig*): Self = StObject.set(x, "triggerConfigurations", js.Array(value*))
  }
}
