package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobRunSummary extends StObject {
  
  /**
    * The ID of the application the job is running on.
    */
  var applicationId: ApplicationId
  
  /**
    * The ARN of the job run.
    */
  var arn: JobArn
  
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
    * The ID of the job run.
    */
  var id: JobRunId
  
  /**
    * The optional job run name. This doesn't have to be unique.
    */
  var name: js.UndefOr[String256] = js.undefined
  
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
    * The type of job run, such as Spark or Hive.
    */
  var `type`: js.UndefOr[JobRunType] = js.undefined
  
  /**
    * The date and time when the job run was last updated.
    */
  var updatedAt: js.Date
}
object JobRunSummary {
  
  inline def apply(
    applicationId: ApplicationId,
    arn: JobArn,
    createdAt: js.Date,
    createdBy: RequestIdentityUserArn,
    executionRole: IAMRoleArn,
    id: JobRunId,
    releaseLabel: ReleaseLabel,
    state: JobRunState,
    stateDetails: String256,
    updatedAt: js.Date
  ): JobRunSummary = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], executionRole = executionRole.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], releaseLabel = releaseLabel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateDetails = stateDetails.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRunSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobRunSummary] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setArn(value: JobArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: RequestIdentityUserArn): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setExecutionRole(value: IAMRoleArn): Self = StObject.set(x, "executionRole", value.asInstanceOf[js.Any])
    
    inline def setId(value: JobRunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String256): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReleaseLabel(value: ReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
    
    inline def setState(value: JobRunState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDetails(value: String256): Self = StObject.set(x, "stateDetails", value.asInstanceOf[js.Any])
    
    inline def setType(value: JobRunType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
