package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoMLJobV2Response extends StObject {
  
  /**
    * Returns the Amazon Resource Name (ARN) of the AutoML V2 job.
    */
  var AutoMLJobArn: typings.awsSdk.clientsSagemakerMod.AutoMLJobArn
  
  /**
    * Returns an array of channel objects describing the input data and their location.
    */
  var AutoMLJobInputDataConfig: typings.awsSdk.clientsSagemakerMod.AutoMLJobInputDataConfig
  
  /**
    * Returns the name of the AutoML V2 job.
    */
  var AutoMLJobName: typings.awsSdk.clientsSagemakerMod.AutoMLJobName
  
  /**
    * Returns the job's objective.
    */
  var AutoMLJobObjective: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLJobObjective] = js.undefined
  
  /**
    * Returns the secondary status of the AutoML V2 job.
    */
  var AutoMLJobSecondaryStatus: typings.awsSdk.clientsSagemakerMod.AutoMLJobSecondaryStatus
  
  /**
    * Returns the status of the AutoML V2 job.
    */
  var AutoMLJobStatus: typings.awsSdk.clientsSagemakerMod.AutoMLJobStatus
  
  /**
    * Returns the configuration settings of the problem type set for the AutoML V2 job.
    */
  var AutoMLProblemTypeConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLProblemTypeConfig] = js.undefined
  
  /**
    * Information about the candidate produced by an AutoML training job V2, including its status, steps, and other properties.
    */
  var BestCandidate: js.UndefOr[AutoMLCandidate] = js.undefined
  
  /**
    * Returns the creation time of the AutoML V2 job.
    */
  var CreationTime: js.Date
  
  /**
    * Returns the configuration settings of how the data are split into train and validation datasets.
    */
  var DataSplitConfig: js.UndefOr[AutoMLDataSplitConfig] = js.undefined
  
  /**
    * Returns the end time of the AutoML V2 job.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns the reason for the failure of the AutoML V2 job, when applicable.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined
  
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
    * Returns a list of reasons for partial failures within an AutoML V2 job.
    */
  var PartialFailureReasons: js.UndefOr[AutoMLPartialFailureReasons] = js.undefined
  
  /**
    * The ARN of the Identity and Access Management role that has read permission to the input data location and write permission to the output data location in Amazon S3.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * Returns the security configuration for traffic encryption or Amazon VPC settings.
    */
  var SecurityConfig: js.UndefOr[AutoMLSecurityConfig] = js.undefined
}
object DescribeAutoMLJobV2Response {
  
  inline def apply(
    AutoMLJobArn: AutoMLJobArn,
    AutoMLJobInputDataConfig: AutoMLJobInputDataConfig,
    AutoMLJobName: AutoMLJobName,
    AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
    AutoMLJobStatus: AutoMLJobStatus,
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn
  ): DescribeAutoMLJobV2Response = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobInputDataConfig = AutoMLJobInputDataConfig.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobV2Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAutoMLJobV2Response] (val x: Self) extends AnyVal {
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobInputDataConfig(value: AutoMLJobInputDataConfig): Self = StObject.set(x, "AutoMLJobInputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobInputDataConfigVarargs(value: AutoMLJobChannel*): Self = StObject.set(x, "AutoMLJobInputDataConfig", js.Array(value*))
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobObjective(value: AutoMLJobObjective): Self = StObject.set(x, "AutoMLJobObjective", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobObjectiveUndefined: Self = StObject.set(x, "AutoMLJobObjective", js.undefined)
    
    inline def setAutoMLJobSecondaryStatus(value: AutoMLJobSecondaryStatus): Self = StObject.set(x, "AutoMLJobSecondaryStatus", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobStatus(value: AutoMLJobStatus): Self = StObject.set(x, "AutoMLJobStatus", value.asInstanceOf[js.Any])
    
    inline def setAutoMLProblemTypeConfig(value: AutoMLProblemTypeConfig): Self = StObject.set(x, "AutoMLProblemTypeConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoMLProblemTypeConfigUndefined: Self = StObject.set(x, "AutoMLProblemTypeConfig", js.undefined)
    
    inline def setBestCandidate(value: AutoMLCandidate): Self = StObject.set(x, "BestCandidate", value.asInstanceOf[js.Any])
    
    inline def setBestCandidateUndefined: Self = StObject.set(x, "BestCandidate", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDataSplitConfig(value: AutoMLDataSplitConfig): Self = StObject.set(x, "DataSplitConfig", value.asInstanceOf[js.Any])
    
    inline def setDataSplitConfigUndefined: Self = StObject.set(x, "DataSplitConfig", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFailureReason(value: AutoMLFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModelDeployConfig(value: ModelDeployConfig): Self = StObject.set(x, "ModelDeployConfig", value.asInstanceOf[js.Any])
    
    inline def setModelDeployConfigUndefined: Self = StObject.set(x, "ModelDeployConfig", js.undefined)
    
    inline def setModelDeployResult(value: ModelDeployResult): Self = StObject.set(x, "ModelDeployResult", value.asInstanceOf[js.Any])
    
    inline def setModelDeployResultUndefined: Self = StObject.set(x, "ModelDeployResult", js.undefined)
    
    inline def setOutputDataConfig(value: AutoMLOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setPartialFailureReasons(value: AutoMLPartialFailureReasons): Self = StObject.set(x, "PartialFailureReasons", value.asInstanceOf[js.Any])
    
    inline def setPartialFailureReasonsUndefined: Self = StObject.set(x, "PartialFailureReasons", js.undefined)
    
    inline def setPartialFailureReasonsVarargs(value: AutoMLPartialFailureReason*): Self = StObject.set(x, "PartialFailureReasons", js.Array(value*))
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfig(value: AutoMLSecurityConfig): Self = StObject.set(x, "SecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigUndefined: Self = StObject.set(x, "SecurityConfig", js.undefined)
  }
}
