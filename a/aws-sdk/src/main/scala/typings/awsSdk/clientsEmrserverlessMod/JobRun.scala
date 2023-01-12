package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobRun extends StObject {
  
  /**
    * The ID of the application the job is running on.
    */
  var applicationId: ApplicationId
  
  /**
    * The execution role ARN of the job run.
    */
  var arn: JobArn
  
  /**
    * The configuration settings that are used to override default configuration.
    */
  var configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined
  
  /**
    * The date and time when the job run was created.
    */
  var createdAt: js.Date
  
  /**
    * The user who created the job run.
    */
  var createdBy: RequestIdentityUserArn
  
  /**
    * The execution role ARN of the job run.
    */
  var executionRole: IAMRoleArn
  
  /**
    * The job driver for the job run.
    */
  var jobDriver: JobDriver
  
  /**
    * The ID of the job run.
    */
  var jobRunId: JobRunId
  
  /**
    * The optional job run name. This doesn't have to be unique.
    */
  var name: js.UndefOr[String256] = js.undefined
  
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * The EMR release version associated with the application your job is running on.
    */
  var releaseLabel: ReleaseLabel
  
  /**
    * The state of the job run.
    */
  var state: JobRunState
  
  /**
    * The state details of the job run.
    */
  var stateDetails: String256
  
  /**
    * The tags assigned to the job run.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The job run total execution duration in seconds. This field is only available for job runs in a COMPLETED, FAILED, or CANCELLED state.
    */
  var totalExecutionDurationSeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * The aggregate vCPU, memory, and storage resources used from the time job start executing till the time job is terminated, rounded up to the nearest second.
    */
  var totalResourceUtilization: js.UndefOr[TotalResourceUtilization] = js.undefined
  
  /**
    * The date and time when the job run was updated.
    */
  var updatedAt: js.Date
}
object JobRun {
  
  inline def apply(
    applicationId: ApplicationId,
    arn: JobArn,
    createdAt: js.Date,
    createdBy: RequestIdentityUserArn,
    executionRole: IAMRoleArn,
    jobDriver: JobDriver,
    jobRunId: JobRunId,
    releaseLabel: ReleaseLabel,
    state: JobRunState,
    stateDetails: String256,
    updatedAt: js.Date
  ): JobRun = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], executionRole = executionRole.asInstanceOf[js.Any], jobDriver = jobDriver.asInstanceOf[js.Any], jobRunId = jobRunId.asInstanceOf[js.Any], releaseLabel = releaseLabel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateDetails = stateDetails.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobRun] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setArn(value: JobArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverrides(value: ConfigurationOverrides): Self = StObject.set(x, "configurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverridesUndefined: Self = StObject.set(x, "configurationOverrides", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: RequestIdentityUserArn): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setExecutionRole(value: IAMRoleArn): Self = StObject.set(x, "executionRole", value.asInstanceOf[js.Any])
    
    inline def setJobDriver(value: JobDriver): Self = StObject.set(x, "jobDriver", value.asInstanceOf[js.Any])
    
    inline def setJobRunId(value: JobRunId): Self = StObject.set(x, "jobRunId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String256): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    inline def setReleaseLabel(value: ReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
    
    inline def setState(value: JobRunState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDetails(value: String256): Self = StObject.set(x, "stateDetails", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTotalExecutionDurationSeconds(value: Integer): Self = StObject.set(x, "totalExecutionDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setTotalExecutionDurationSecondsUndefined: Self = StObject.set(x, "totalExecutionDurationSeconds", js.undefined)
    
    inline def setTotalResourceUtilization(value: TotalResourceUtilization): Self = StObject.set(x, "totalResourceUtilization", value.asInstanceOf[js.Any])
    
    inline def setTotalResourceUtilizationUndefined: Self = StObject.set(x, "totalResourceUtilization", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
