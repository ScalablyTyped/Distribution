package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobResponse extends StObject {
  
  /**
    * Definition of the Amazon Braket job created. Specifies the container image the job uses, information about the Python scripts used for entry and training, and the user-defined metrics used to evaluation the job.
    */
  var algorithmSpecification: AlgorithmSpecification
  
  /**
    * The billable time the Amazon Braket job used to complete.
    */
  var billableDuration: js.UndefOr[Integer] = js.undefined
  
  /**
    * Information about the output locations for job checkpoint data.
    */
  var checkpointConfig: js.UndefOr[JobCheckpointConfig] = js.undefined
  
  /**
    * The date and time that the Amazon Braket job was created.
    */
  var createdAt: js.Date
  
  /**
    * The quantum processing unit (QPU) or simulator used to run the Amazon Braket job.
    */
  var deviceConfig: js.UndefOr[DeviceConfig] = js.undefined
  
  /**
    * The date and time that the Amazon Braket job ended.
    */
  var endedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Details about the type and time events occurred related to the Amazon Braket job.
    */
  var events: js.UndefOr[JobEvents] = js.undefined
  
  /**
    * A description of the reason why an Amazon Braket job failed, if it failed.
    */
  var failureReason: js.UndefOr[String1024] = js.undefined
  
  /**
    * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the traiing job. The values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter and the value is the value of th hyperparameter.
    */
  var hyperParameters: js.UndefOr[HyperParameters] = js.undefined
  
  /**
    * A list of parameters that specify the name and type of input data and where it is located.
    */
  var inputDataConfig: js.UndefOr[InputConfigList] = js.undefined
  
  /**
    * The resource instances to use while running the hybrid job on Amazon Braket.
    */
  var instanceConfig: InstanceConfig
  
  /**
    * The ARN of the Amazon Braket job.
    */
  var jobArn: JobArn
  
  /**
    * The name of the Amazon Braket job.
    */
  var jobName: GetJobResponseJobNameString
  
  /**
    * The path to the S3 location where job artifacts are stored and the encryption key used to store them there.
    */
  var outputDataConfig: JobOutputDataConfig
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user. It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the s3 buckets of a user.
    */
  var roleArn: RoleArn
  
  /**
    * The date and time that the Amazon Braket job was started.
    */
  var startedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the Amazon Braket job.
    */
  var status: JobPrimaryStatus
  
  /**
    * The user-defined criteria that specifies when to stop a job running.
    */
  var stoppingCondition: js.UndefOr[JobStoppingCondition] = js.undefined
  
  /**
    * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object GetJobResponse {
  
  inline def apply(
    algorithmSpecification: AlgorithmSpecification,
    createdAt: js.Date,
    instanceConfig: InstanceConfig,
    jobArn: JobArn,
    jobName: GetJobResponseJobNameString,
    outputDataConfig: JobOutputDataConfig,
    roleArn: RoleArn,
    status: JobPrimaryStatus
  ): GetJobResponse = {
    val __obj = js.Dynamic.literal(algorithmSpecification = algorithmSpecification.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], instanceConfig = instanceConfig.asInstanceOf[js.Any], jobArn = jobArn.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], outputDataConfig = outputDataConfig.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobResponse]
  }
  
  extension [Self <: GetJobResponse](x: Self) {
    
    inline def setAlgorithmSpecification(value: AlgorithmSpecification): Self = StObject.set(x, "algorithmSpecification", value.asInstanceOf[js.Any])
    
    inline def setBillableDuration(value: Integer): Self = StObject.set(x, "billableDuration", value.asInstanceOf[js.Any])
    
    inline def setBillableDurationUndefined: Self = StObject.set(x, "billableDuration", js.undefined)
    
    inline def setCheckpointConfig(value: JobCheckpointConfig): Self = StObject.set(x, "checkpointConfig", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfigUndefined: Self = StObject.set(x, "checkpointConfig", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfig(value: DeviceConfig): Self = StObject.set(x, "deviceConfig", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigUndefined: Self = StObject.set(x, "deviceConfig", js.undefined)
    
    inline def setEndedAt(value: js.Date): Self = StObject.set(x, "endedAt", value.asInstanceOf[js.Any])
    
    inline def setEndedAtUndefined: Self = StObject.set(x, "endedAt", js.undefined)
    
    inline def setEvents(value: JobEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: JobEventDetails*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFailureReason(value: String1024): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setHyperParameters(value: HyperParameters): Self = StObject.set(x, "hyperParameters", value.asInstanceOf[js.Any])
    
    inline def setHyperParametersUndefined: Self = StObject.set(x, "hyperParameters", js.undefined)
    
    inline def setInputDataConfig(value: InputConfigList): Self = StObject.set(x, "inputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "inputDataConfig", js.undefined)
    
    inline def setInputDataConfigVarargs(value: InputFileConfig*): Self = StObject.set(x, "inputDataConfig", js.Array(value*))
    
    inline def setInstanceConfig(value: InstanceConfig): Self = StObject.set(x, "instanceConfig", value.asInstanceOf[js.Any])
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: GetJobResponseJobNameString): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfig(value: JobOutputDataConfig): Self = StObject.set(x, "outputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStatus(value: JobPrimaryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: JobStoppingCondition): Self = StObject.set(x, "stoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "stoppingCondition", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
