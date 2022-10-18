package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationJobRequest extends StObject {
  
  /**
    * Compute information for the simulation job
    */
  var compute: js.UndefOr[Compute] = js.undefined
  
  /**
    * Specify data sources to mount read-only files from S3 into your simulation. These files are available under /opt/robomaker/datasources/data_source_name.   There is a limit of 100 files and a combined size of 25GB for all DataSourceConfig objects.  
    */
  var dataSources: js.UndefOr[DataSourceConfigs] = js.undefined
  
  /**
    * The failure behavior the simulation job.  Continue  Leaves the host running for its maximum timeout duration after a 4XX error code.  Fail  Stop the simulation job and terminate the instance.  
    */
  var failureBehavior: js.UndefOr[FailureBehavior] = js.undefined
  
  /**
    * The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its associated policies on your behalf. This is how credentials are passed in to your simulation job. 
    */
  var iamRole: js.UndefOr[IamRole] = js.undefined
  
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  
  /**
    * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
    */
  var maxJobDurationInSeconds: JobDuration
  
  var outputLocation: js.UndefOr[OutputLocation] = js.undefined
  
  /**
    * The robot applications to use in the simulation job.
    */
  var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined
  
  /**
    * The simulation applications to use in the simulation job.
    */
  var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined
  
  /**
    * A map that contains tag keys and tag values that are attached to the simulation job request.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A Boolean indicating whether to use default applications in the simulation job. Default applications include Gazebo, rqt, rviz and terminal access. 
    */
  var useDefaultApplications: js.UndefOr[BoxedBoolean] = js.undefined
  
  var vpcConfig: js.UndefOr[VPCConfig] = js.undefined
}
object SimulationJobRequest {
  
  inline def apply(maxJobDurationInSeconds: JobDuration): SimulationJobRequest = {
    val __obj = js.Dynamic.literal(maxJobDurationInSeconds = maxJobDurationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationJobRequest]
  }
  
  extension [Self <: SimulationJobRequest](x: Self) {
    
    inline def setCompute(value: Compute): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
    
    inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
    
    inline def setDataSources(value: DataSourceConfigs): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    inline def setDataSourcesVarargs(value: DataSourceConfig*): Self = StObject.set(x, "dataSources", js.Array(value*))
    
    inline def setFailureBehavior(value: FailureBehavior): Self = StObject.set(x, "failureBehavior", value.asInstanceOf[js.Any])
    
    inline def setFailureBehaviorUndefined: Self = StObject.set(x, "failureBehavior", js.undefined)
    
    inline def setIamRole(value: IamRole): Self = StObject.set(x, "iamRole", value.asInstanceOf[js.Any])
    
    inline def setIamRoleUndefined: Self = StObject.set(x, "iamRole", js.undefined)
    
    inline def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    inline def setMaxJobDurationInSeconds(value: JobDuration): Self = StObject.set(x, "maxJobDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
    
    inline def setRobotApplications(value: RobotApplicationConfigs): Self = StObject.set(x, "robotApplications", value.asInstanceOf[js.Any])
    
    inline def setRobotApplicationsUndefined: Self = StObject.set(x, "robotApplications", js.undefined)
    
    inline def setRobotApplicationsVarargs(value: RobotApplicationConfig*): Self = StObject.set(x, "robotApplications", js.Array(value*))
    
    inline def setSimulationApplications(value: SimulationApplicationConfigs): Self = StObject.set(x, "simulationApplications", value.asInstanceOf[js.Any])
    
    inline def setSimulationApplicationsUndefined: Self = StObject.set(x, "simulationApplications", js.undefined)
    
    inline def setSimulationApplicationsVarargs(value: SimulationApplicationConfig*): Self = StObject.set(x, "simulationApplications", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUseDefaultApplications(value: BoxedBoolean): Self = StObject.set(x, "useDefaultApplications", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultApplicationsUndefined: Self = StObject.set(x, "useDefaultApplications", js.undefined)
    
    inline def setVpcConfig(value: VPCConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
