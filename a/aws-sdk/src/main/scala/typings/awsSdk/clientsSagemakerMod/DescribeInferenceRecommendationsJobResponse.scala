package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInferenceRecommendationsJobResponse extends StObject {
  
  /**
    * A timestamp that shows when the job completed.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The performance results from running an Inference Recommender job on an existing endpoint.
    */
  var EndpointPerformances: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointPerformances] = js.undefined
  
  /**
    * If the job fails, provides information why the job failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The recommendations made by Inference Recommender.
    */
  var InferenceRecommendations: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InferenceRecommendations] = js.undefined
  
  /**
    * Returns information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and endpoint configurations you provided when you initiated the job.
    */
  var InputConfig: RecommendationJobInputConfig
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var JobArn: RecommendationJobArn
  
  /**
    * The job description that you provided when you initiated the job.
    */
  var JobDescription: js.UndefOr[RecommendationJobDescription] = js.undefined
  
  /**
    * The name of the job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var JobName: RecommendationJobName
  
  /**
    * The job type that you provided when you initiated the job.
    */
  var JobType: RecommendationJobType
  
  /**
    * A timestamp that shows when the job was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role you provided when you initiated the job.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * The status of the job.
    */
  var Status: RecommendationJobStatus
  
  /**
    * The stopping conditions that you provided when you initiated the job.
    */
  var StoppingConditions: js.UndefOr[RecommendationJobStoppingConditions] = js.undefined
}
object DescribeInferenceRecommendationsJobResponse {
  
  inline def apply(
    CreationTime: js.Date,
    InputConfig: RecommendationJobInputConfig,
    JobArn: RecommendationJobArn,
    JobName: RecommendationJobName,
    JobType: RecommendationJobType,
    LastModifiedTime: js.Date,
    RoleArn: RoleArn,
    Status: RecommendationJobStatus
  ): DescribeInferenceRecommendationsJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], JobArn = JobArn.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInferenceRecommendationsJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInferenceRecommendationsJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndpointPerformances(value: EndpointPerformances): Self = StObject.set(x, "EndpointPerformances", value.asInstanceOf[js.Any])
    
    inline def setEndpointPerformancesUndefined: Self = StObject.set(x, "EndpointPerformances", js.undefined)
    
    inline def setEndpointPerformancesVarargs(value: EndpointPerformance*): Self = StObject.set(x, "EndpointPerformances", js.Array(value*))
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setInferenceRecommendations(value: InferenceRecommendations): Self = StObject.set(x, "InferenceRecommendations", value.asInstanceOf[js.Any])
    
    inline def setInferenceRecommendationsUndefined: Self = StObject.set(x, "InferenceRecommendations", js.undefined)
    
    inline def setInferenceRecommendationsVarargs(value: InferenceRecommendation*): Self = StObject.set(x, "InferenceRecommendations", js.Array(value*))
    
    inline def setInputConfig(value: RecommendationJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobArn(value: RecommendationJobArn): Self = StObject.set(x, "JobArn", value.asInstanceOf[js.Any])
    
    inline def setJobDescription(value: RecommendationJobDescription): Self = StObject.set(x, "JobDescription", value.asInstanceOf[js.Any])
    
    inline def setJobDescriptionUndefined: Self = StObject.set(x, "JobDescription", js.undefined)
    
    inline def setJobName(value: RecommendationJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobType(value: RecommendationJobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RecommendationJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditions(value: RecommendationJobStoppingConditions): Self = StObject.set(x, "StoppingConditions", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionsUndefined: Self = StObject.set(x, "StoppingConditions", js.undefined)
  }
}
