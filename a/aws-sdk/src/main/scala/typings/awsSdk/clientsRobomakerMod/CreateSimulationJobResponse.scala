package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSimulationJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * Compute information for the simulation job.
    */
  var compute: js.UndefOr[ComputeResponse] = js.undefined
  
  /**
    * The data sources for the simulation job.
    */
  var dataSources: js.UndefOr[DataSources] = js.undefined
  
  /**
    * the failure behavior for the simulation job.
    */
  var failureBehavior: js.UndefOr[FailureBehavior] = js.undefined
  
  /**
    * The failure code of the simulation job if it failed:  InternalServiceError  Internal service error.  RobotApplicationCrash  Robot application exited abnormally.  SimulationApplicationCrash   Simulation application exited abnormally.  BadPermissionsRobotApplication  Robot application bundle could not be downloaded.  BadPermissionsSimulationApplication  Simulation application bundle could not be downloaded.  BadPermissionsS3Output  Unable to publish outputs to customer-provided S3 bucket.  BadPermissionsCloudwatchLogs  Unable to publish logs to customer-provided CloudWatch Logs resource.  SubnetIpLimitExceeded  Subnet IP limit exceeded.  ENILimitExceeded  ENI limit exceeded.  BadPermissionsUserCredentials  Unable to use the Role provided.  InvalidBundleRobotApplication  Robot bundle cannot be extracted (invalid format, bundling error, or other issue).  InvalidBundleSimulationApplication  Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).  RobotApplicationVersionMismatchedEtag  Etag for RobotApplication does not match value during version creation.  SimulationApplicationVersionMismatchedEtag  Etag for SimulationApplication does not match value during version creation.  
    */
  var failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined
  
  /**
    * The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated policies on your behalf.
    */
  var iamRole: js.UndefOr[IamRole] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last started.
    */
  var lastStartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The logging configuration.
    */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  
  /**
    * The maximum simulation job duration in seconds. 
    */
  var maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined
  
  /**
    * Simulation job output files location.
    */
  var outputLocation: js.UndefOr[OutputLocation] = js.undefined
  
  /**
    * The robot application used by the simulation job.
    */
  var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined
  
  /**
    * The simulation application used by the simulation job.
    */
  var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined
  
  /**
    * The simulation job execution duration in milliseconds.
    */
  var simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined
  
  /**
    * The status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.undefined
  
  /**
    * The list of all tags added to the simulation job.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Information about the vpc configuration.
    */
  var vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined
}
object CreateSimulationJobResponse {
  
  inline def apply(): CreateSimulationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSimulationJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSimulationJobResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setCompute(value: ComputeResponse): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
    
    inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
    
    inline def setDataSources(value: DataSources): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    inline def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "dataSources", js.Array(value*))
    
    inline def setFailureBehavior(value: FailureBehavior): Self = StObject.set(x, "failureBehavior", value.asInstanceOf[js.Any])
    
    inline def setFailureBehaviorUndefined: Self = StObject.set(x, "failureBehavior", js.undefined)
    
    inline def setFailureCode(value: SimulationJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setIamRole(value: IamRole): Self = StObject.set(x, "iamRole", value.asInstanceOf[js.Any])
    
    inline def setIamRoleUndefined: Self = StObject.set(x, "iamRole", js.undefined)
    
    inline def setLastStartedAt(value: js.Date): Self = StObject.set(x, "lastStartedAt", value.asInstanceOf[js.Any])
    
    inline def setLastStartedAtUndefined: Self = StObject.set(x, "lastStartedAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    inline def setMaxJobDurationInSeconds(value: JobDuration): Self = StObject.set(x, "maxJobDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxJobDurationInSecondsUndefined: Self = StObject.set(x, "maxJobDurationInSeconds", js.undefined)
    
    inline def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
    
    inline def setRobotApplications(value: RobotApplicationConfigs): Self = StObject.set(x, "robotApplications", value.asInstanceOf[js.Any])
    
    inline def setRobotApplicationsUndefined: Self = StObject.set(x, "robotApplications", js.undefined)
    
    inline def setRobotApplicationsVarargs(value: RobotApplicationConfig*): Self = StObject.set(x, "robotApplications", js.Array(value*))
    
    inline def setSimulationApplications(value: SimulationApplicationConfigs): Self = StObject.set(x, "simulationApplications", value.asInstanceOf[js.Any])
    
    inline def setSimulationApplicationsUndefined: Self = StObject.set(x, "simulationApplications", js.undefined)
    
    inline def setSimulationApplicationsVarargs(value: SimulationApplicationConfig*): Self = StObject.set(x, "simulationApplications", js.Array(value*))
    
    inline def setSimulationTimeMillis(value: SimulationTimeMillis): Self = StObject.set(x, "simulationTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setSimulationTimeMillisUndefined: Self = StObject.set(x, "simulationTimeMillis", js.undefined)
    
    inline def setStatus(value: SimulationJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVpcConfig(value: VPCConfigResponse): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
