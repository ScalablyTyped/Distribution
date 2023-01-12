package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupInfo extends StObject {
  
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
    * The destination platform type for the deployment (Lambda, Server, or ECS).
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
    * Information about groups of tags applied to an Amazon EC2 instance. The deployment group includes only Amazon EC2 instances identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
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
    * Indicates what happens when new Amazon EC2 instances are launched mid-deployment and do not receive the deployed application revision. If this option is set to UPDATE or is unspecified, CodeDeploy initiates one or more 'auto-update outdated instances' deployments to apply the deployed application revision to the new Amazon EC2 instances. If this option is set to IGNORE, CodeDeploy does not initiate a deployment to update the new Amazon EC2 instances. This may result in instances having different revisions.
    */
  var outdatedInstancesStrategy: js.UndefOr[OutdatedInstancesStrategy] = js.undefined
  
  /**
    * A service role Amazon Resource Name (ARN) that grants CodeDeploy permission to make calls to Amazon Web Services services on your behalf. For more information, see Create a Service Role for CodeDeploy in the CodeDeploy User Guide.
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
object DeploymentGroupInfo {
  
  inline def apply(): DeploymentGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentGroupInfo] (val x: Self) extends AnyVal {
    
    inline def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "alarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "alarmConfiguration", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = StObject.set(x, "autoRollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoRollbackConfigurationUndefined: Self = StObject.set(x, "autoRollbackConfiguration", js.undefined)
    
    inline def setAutoScalingGroups(value: AutoScalingGroupList): Self = StObject.set(x, "autoScalingGroups", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupsUndefined: Self = StObject.set(x, "autoScalingGroups", js.undefined)
    
    inline def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "autoScalingGroups", js.Array(value*))
    
    inline def setBlueGreenDeploymentConfiguration(value: BlueGreenDeploymentConfiguration): Self = StObject.set(x, "blueGreenDeploymentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenDeploymentConfigurationUndefined: Self = StObject.set(x, "blueGreenDeploymentConfiguration", js.undefined)
    
    inline def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    inline def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    inline def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
    
    inline def setDeploymentGroupId(value: DeploymentGroupId): Self = StObject.set(x, "deploymentGroupId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupIdUndefined: Self = StObject.set(x, "deploymentGroupId", js.undefined)
    
    inline def setDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupNameUndefined: Self = StObject.set(x, "deploymentGroupName", js.undefined)
    
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
    
    inline def setLastAttemptedDeployment(value: LastDeploymentInfo): Self = StObject.set(x, "lastAttemptedDeployment", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptedDeploymentUndefined: Self = StObject.set(x, "lastAttemptedDeployment", js.undefined)
    
    inline def setLastSuccessfulDeployment(value: LastDeploymentInfo): Self = StObject.set(x, "lastSuccessfulDeployment", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulDeploymentUndefined: Self = StObject.set(x, "lastSuccessfulDeployment", js.undefined)
    
    inline def setLoadBalancerInfo(value: LoadBalancerInfo): Self = StObject.set(x, "loadBalancerInfo", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerInfoUndefined: Self = StObject.set(x, "loadBalancerInfo", js.undefined)
    
    inline def setOnPremisesInstanceTagFilters(value: TagFilterList): Self = StObject.set(x, "onPremisesInstanceTagFilters", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesInstanceTagFiltersUndefined: Self = StObject.set(x, "onPremisesInstanceTagFilters", js.undefined)
    
    inline def setOnPremisesInstanceTagFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "onPremisesInstanceTagFilters", js.Array(value*))
    
    inline def setOnPremisesTagSet(value: OnPremisesTagSet): Self = StObject.set(x, "onPremisesTagSet", value.asInstanceOf[js.Any])
    
    inline def setOnPremisesTagSetUndefined: Self = StObject.set(x, "onPremisesTagSet", js.undefined)
    
    inline def setOutdatedInstancesStrategy(value: OutdatedInstancesStrategy): Self = StObject.set(x, "outdatedInstancesStrategy", value.asInstanceOf[js.Any])
    
    inline def setOutdatedInstancesStrategyUndefined: Self = StObject.set(x, "outdatedInstancesStrategy", js.undefined)
    
    inline def setServiceRoleArn(value: Role): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
    
    inline def setTargetRevision(value: RevisionLocation): Self = StObject.set(x, "targetRevision", value.asInstanceOf[js.Any])
    
    inline def setTargetRevisionUndefined: Self = StObject.set(x, "targetRevision", js.undefined)
    
    inline def setTriggerConfigurations(value: TriggerConfigList): Self = StObject.set(x, "triggerConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTriggerConfigurationsUndefined: Self = StObject.set(x, "triggerConfigurations", js.undefined)
    
    inline def setTriggerConfigurationsVarargs(value: TriggerConfig*): Self = StObject.set(x, "triggerConfigurations", js.Array(value*))
  }
}
