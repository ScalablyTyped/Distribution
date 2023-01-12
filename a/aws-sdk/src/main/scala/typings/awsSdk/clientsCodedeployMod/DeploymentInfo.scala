package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentInfo extends StObject {
  
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
  var completeTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  
  /**
    * A timestamp that indicates when the deployment was created.
    */
  var createTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The means by which the deployment was created:    user: A user created the deployment.    autoscaling: Amazon EC2 Auto Scaling created the deployment.    codeDeployRollback: A rollback process created the deployment.    CodeDeployAutoUpdate: An auto-update process created the deployment when it detected outdated Amazon EC2 instances.  
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
    * The unique ID for an external resource (for example, a CloudFormation stack ID) that is linked to this deployment.
    */
  var externalId: js.UndefOr[ExternalId] = js.undefined
  
  /**
    * Information about how CodeDeploy handles files that already exist in a deployment target location but weren't part of the previous successful deployment.    DISALLOW: The deployment fails. This is also the default behavior if no option is specified.    OVERWRITE: The version of the file from the application revision currently being deployed replaces the version already on the instance.    RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.  
    */
  var fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.undefined
  
  /**
    *  If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an instance fails, then the deployment continues to the next deployment lifecycle event. For example, if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.   If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.   During a deployment, the CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run successfully, the deployment can fail.   If the cause of the failure is a script from the last successful deployment that will never run successfully, create a new deployment and use ignoreApplicationStopFailures to specify that the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored. 
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
  
  var overrideAlarmConfiguration: js.UndefOr[AlarmConfiguration] = js.undefined
  
  /**
    * Information about the application revision that was deployed to the deployment group before the most recent successful deployment.
    */
  var previousRevision: js.UndefOr[RevisionLocation] = js.undefined
  
  var relatedDeployments: js.UndefOr[RelatedDeployments] = js.undefined
  
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
  var startTime: js.UndefOr[js.Date] = js.undefined
  
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
object DeploymentInfo {
  
  inline def apply(): DeploymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentInfo] (val x: Self) extends AnyVal {
    
    inline def setAdditionalDeploymentStatusInfo(value: AdditionalDeploymentStatusInfo): Self = StObject.set(x, "additionalDeploymentStatusInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDeploymentStatusInfoUndefined: Self = StObject.set(x, "additionalDeploymentStatusInfo", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = StObject.set(x, "autoRollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoRollbackConfigurationUndefined: Self = StObject.set(x, "autoRollbackConfiguration", js.undefined)
    
    inline def setBlueGreenDeploymentConfiguration(value: BlueGreenDeploymentConfiguration): Self = StObject.set(x, "blueGreenDeploymentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenDeploymentConfigurationUndefined: Self = StObject.set(x, "blueGreenDeploymentConfiguration", js.undefined)
    
    inline def setCompleteTime(value: js.Date): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    inline def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: DeploymentCreator): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
    
    inline def setDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupNameUndefined: Self = StObject.set(x, "deploymentGroupName", js.undefined)
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setDeploymentOverview(value: DeploymentOverview): Self = StObject.set(x, "deploymentOverview", value.asInstanceOf[js.Any])
    
    inline def setDeploymentOverviewUndefined: Self = StObject.set(x, "deploymentOverview", js.undefined)
    
    inline def setDeploymentStatusMessages(value: DeploymentStatusMessageList): Self = StObject.set(x, "deploymentStatusMessages", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessagesUndefined: Self = StObject.set(x, "deploymentStatusMessages", js.undefined)
    
    inline def setDeploymentStatusMessagesVarargs(value: ErrorMessage*): Self = StObject.set(x, "deploymentStatusMessages", js.Array(value*))
    
    inline def setDeploymentStyle(value: DeploymentStyle): Self = StObject.set(x, "deploymentStyle", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStyleUndefined: Self = StObject.set(x, "deploymentStyle", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setErrorInformation(value: ErrorInformation): Self = StObject.set(x, "errorInformation", value.asInstanceOf[js.Any])
    
    inline def setErrorInformationUndefined: Self = StObject.set(x, "errorInformation", js.undefined)
    
    inline def setExternalId(value: ExternalId): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setFileExistsBehavior(value: FileExistsBehavior): Self = StObject.set(x, "fileExistsBehavior", value.asInstanceOf[js.Any])
    
    inline def setFileExistsBehaviorUndefined: Self = StObject.set(x, "fileExistsBehavior", js.undefined)
    
    inline def setIgnoreApplicationStopFailures(value: Boolean): Self = StObject.set(x, "ignoreApplicationStopFailures", value.asInstanceOf[js.Any])
    
    inline def setIgnoreApplicationStopFailuresUndefined: Self = StObject.set(x, "ignoreApplicationStopFailures", js.undefined)
    
    inline def setInstanceTerminationWaitTimeStarted(value: Boolean): Self = StObject.set(x, "instanceTerminationWaitTimeStarted", value.asInstanceOf[js.Any])
    
    inline def setInstanceTerminationWaitTimeStartedUndefined: Self = StObject.set(x, "instanceTerminationWaitTimeStarted", js.undefined)
    
    inline def setLoadBalancerInfo(value: LoadBalancerInfo): Self = StObject.set(x, "loadBalancerInfo", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerInfoUndefined: Self = StObject.set(x, "loadBalancerInfo", js.undefined)
    
    inline def setOverrideAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "overrideAlarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOverrideAlarmConfigurationUndefined: Self = StObject.set(x, "overrideAlarmConfiguration", js.undefined)
    
    inline def setPreviousRevision(value: RevisionLocation): Self = StObject.set(x, "previousRevision", value.asInstanceOf[js.Any])
    
    inline def setPreviousRevisionUndefined: Self = StObject.set(x, "previousRevision", js.undefined)
    
    inline def setRelatedDeployments(value: RelatedDeployments): Self = StObject.set(x, "relatedDeployments", value.asInstanceOf[js.Any])
    
    inline def setRelatedDeploymentsUndefined: Self = StObject.set(x, "relatedDeployments", js.undefined)
    
    inline def setRevision(value: RevisionLocation): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setRollbackInfo(value: RollbackInfo): Self = StObject.set(x, "rollbackInfo", value.asInstanceOf[js.Any])
    
    inline def setRollbackInfoUndefined: Self = StObject.set(x, "rollbackInfo", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetInstances(value: TargetInstances): Self = StObject.set(x, "targetInstances", value.asInstanceOf[js.Any])
    
    inline def setTargetInstancesUndefined: Self = StObject.set(x, "targetInstances", js.undefined)
    
    inline def setUpdateOutdatedInstancesOnly(value: Boolean): Self = StObject.set(x, "updateOutdatedInstancesOnly", value.asInstanceOf[js.Any])
    
    inline def setUpdateOutdatedInstancesOnlyUndefined: Self = StObject.set(x, "updateOutdatedInstancesOnly", js.undefined)
  }
}
