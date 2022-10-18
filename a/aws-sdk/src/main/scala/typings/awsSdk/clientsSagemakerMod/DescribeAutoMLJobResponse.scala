package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoMLJobResponse extends StObject {
  
  /**
    * Returns the ARN of the AutoML job.
    */
  var AutoMLJobArn: typings.awsSdk.clientsSagemakerMod.AutoMLJobArn
  
  /**
    * Returns information on the job's artifacts found in AutoMLJobArtifacts.
    */
  var AutoMLJobArtifacts: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLJobArtifacts] = js.undefined
  
  /**
    * Returns the configuration for the AutoML job.
    */
  var AutoMLJobConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLJobConfig] = js.undefined
  
  /**
    * Returns the name of the AutoML job.
    */
  var AutoMLJobName: typings.awsSdk.clientsSagemakerMod.AutoMLJobName
  
  /**
    * Returns the job's objective.
    */
  var AutoMLJobObjective: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLJobObjective] = js.undefined
  
  /**
    * Returns the secondary status of the AutoML job.
    */
  var AutoMLJobSecondaryStatus: typings.awsSdk.clientsSagemakerMod.AutoMLJobSecondaryStatus
  
  /**
    * Returns the status of the AutoML job.
    */
  var AutoMLJobStatus: typings.awsSdk.clientsSagemakerMod.AutoMLJobStatus
  
  /**
    * Returns the job's best AutoMLCandidate.
    */
  var BestCandidate: js.UndefOr[AutoMLCandidate] = js.undefined
  
  /**
    * Returns the creation time of the AutoML job.
    */
  var CreationTime: js.Date
  
  /**
    * Returns the end time of the AutoML job.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns the failure reason for an AutoML job, when applicable.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined
  
  /**
    * Indicates whether the output for an AutoML job generates candidate definitions only.
    */
  var GenerateCandidateDefinitionsOnly: js.UndefOr[typings.awsSdk.clientsSagemakerMod.GenerateCandidateDefinitionsOnly] = js.undefined
  
  /**
    * Returns the input data configuration for the AutoML job..
    */
  var InputDataConfig: AutoMLInputDataConfig
  
  /**
    * Returns the job's last modified time.
    */
  var LastModifiedTime: js.Date
  
  /**
    * Indicates whether the model was deployed automatically to an endpoint and the name of that endpoint if deployed automatically.
    */
  var ModelDeployConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelDeployConfig] = js.undefined
  
  /**
    * Provides information about endpoint for the model deployment.
    */
  var ModelDeployResult: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelDeployResult] = js.undefined
  
  /**
    * Returns the job's output data config.
    */
  var OutputDataConfig: AutoMLOutputDataConfig
  
  /**
    * Returns a list of reasons for partial failures within an AutoML job.
    */
  var PartialFailureReasons: js.UndefOr[AutoMLPartialFailureReasons] = js.undefined
  
  /**
    * Returns the job's problem type.
    */
  var ProblemType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProblemType] = js.undefined
  
  /**
    * This contains ProblemType, AutoMLJobObjective, and CompletionCriteria. If you do not provide these values, they are auto-inferred. If you do provide them, the values used are the ones you provide.
    */
  var ResolvedAttributes: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ResolvedAttributes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that has read permission to the input data location and write permission to the output data location in Amazon S3.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
}
object DescribeAutoMLJobResponse {
  
  inline def apply(
    AutoMLJobArn: AutoMLJobArn,
    AutoMLJobName: AutoMLJobName,
    AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
    AutoMLJobStatus: AutoMLJobStatus,
    CreationTime: js.Date,
    InputDataConfig: AutoMLInputDataConfig,
    LastModifiedTime: js.Date,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn
  ): DescribeAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobResponse]
  }
  
  extension [Self <: DescribeAutoMLJobResponse](x: Self) {
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobArtifacts(value: AutoMLJobArtifacts): Self = StObject.set(x, "AutoMLJobArtifacts", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobArtifactsUndefined: Self = StObject.set(x, "AutoMLJobArtifacts", js.undefined)
    
    inline def setAutoMLJobConfig(value: AutoMLJobConfig): Self = StObject.set(x, "AutoMLJobConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobConfigUndefined: Self = StObject.set(x, "AutoMLJobConfig", js.undefined)
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobObjective(value: AutoMLJobObjective): Self = StObject.set(x, "AutoMLJobObjective", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobObjectiveUndefined: Self = StObject.set(x, "AutoMLJobObjective", js.undefined)
    
    inline def setAutoMLJobSecondaryStatus(value: AutoMLJobSecondaryStatus): Self = StObject.set(x, "AutoMLJobSecondaryStatus", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobStatus(value: AutoMLJobStatus): Self = StObject.set(x, "AutoMLJobStatus", value.asInstanceOf[js.Any])
    
    inline def setBestCandidate(value: AutoMLCandidate): Self = StObject.set(x, "BestCandidate", value.asInstanceOf[js.Any])
    
    inline def setBestCandidateUndefined: Self = StObject.set(x, "BestCandidate", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFailureReason(value: AutoMLFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setGenerateCandidateDefinitionsOnly(value: GenerateCandidateDefinitionsOnly): Self = StObject.set(x, "GenerateCandidateDefinitionsOnly", value.asInstanceOf[js.Any])
    
    inline def setGenerateCandidateDefinitionsOnlyUndefined: Self = StObject.set(x, "GenerateCandidateDefinitionsOnly", js.undefined)
    
    inline def setInputDataConfig(value: AutoMLInputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigVarargs(value: AutoMLChannel*): Self = StObject.set(x, "InputDataConfig", js.Array(value*))
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModelDeployConfig(value: ModelDeployConfig): Self = StObject.set(x, "ModelDeployConfig", value.asInstanceOf[js.Any])
    
    inline def setModelDeployConfigUndefined: Self = StObject.set(x, "ModelDeployConfig", js.undefined)
    
    inline def setModelDeployResult(value: ModelDeployResult): Self = StObject.set(x, "ModelDeployResult", value.asInstanceOf[js.Any])
    
    inline def setModelDeployResultUndefined: Self = StObject.set(x, "ModelDeployResult", js.undefined)
    
    inline def setOutputDataConfig(value: AutoMLOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setPartialFailureReasons(value: AutoMLPartialFailureReasons): Self = StObject.set(x, "PartialFailureReasons", value.asInstanceOf[js.Any])
    
    inline def setPartialFailureReasonsUndefined: Self = StObject.set(x, "PartialFailureReasons", js.undefined)
    
    inline def setPartialFailureReasonsVarargs(value: AutoMLPartialFailureReason*): Self = StObject.set(x, "PartialFailureReasons", js.Array(value*))
    
    inline def setProblemType(value: ProblemType): Self = StObject.set(x, "ProblemType", value.asInstanceOf[js.Any])
    
    inline def setProblemTypeUndefined: Self = StObject.set(x, "ProblemType", js.undefined)
    
    inline def setResolvedAttributes(value: ResolvedAttributes): Self = StObject.set(x, "ResolvedAttributes", value.asInstanceOf[js.Any])
    
    inline def setResolvedAttributesUndefined: Self = StObject.set(x, "ResolvedAttributes", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
