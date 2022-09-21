package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobRequest extends StObject {
  
  /**
    * Definition of the Amazon Braket job to be created. Specifies the container image the job uses and information about the Python scripts used for entry and training.
    */
  var algorithmSpecification: AlgorithmSpecification
  
  /**
    * Information about the output locations for job checkpoint data.
    */
  var checkpointConfig: js.UndefOr[JobCheckpointConfig] = js.undefined
  
  /**
    * A unique token that guarantees that the call to this API is idempotent.
    */
  var clientToken: String64
  
  /**
    * The quantum processing unit (QPU) or simulator used to create an Amazon Braket job.
    */
  var deviceConfig: DeviceConfig
  
  /**
    * Algorithm-specific parameters used by an Amazon Braket job that influence the quality of the training job. The values are set with a string of JSON key:value pairs, where the key is the name of the hyperparameter and the value is the value of th hyperparameter.
    */
  var hyperParameters: js.UndefOr[HyperParameters] = js.undefined
  
  /**
    * A list of parameters that specify the name and type of input data and where it is located.
    */
  var inputDataConfig: js.UndefOr[CreateJobRequestInputDataConfigList] = js.undefined
  
  /**
    * Configuration of the resource instances to use while running the hybrid job on Amazon Braket.
    */
  var instanceConfig: InstanceConfig
  
  /**
    * The name of the Amazon Braket job.
    */
  var jobName: CreateJobRequestJobNameString
  
  /**
    * The path to the S3 location where you want to store job artifacts and the encryption key used to store them.
    */
  var outputDataConfig: JobOutputDataConfig
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon Braket can assume to perform tasks on behalf of a user. It can access user resources, run an Amazon Braket job container on behalf of user, and output resources to the users' s3 buckets.
    */
  var roleArn: RoleArn
  
  /**
    *  The user-defined criteria that specifies when a job stops running.
    */
  var stoppingCondition: js.UndefOr[JobStoppingCondition] = js.undefined
  
  /**
    * A tag object that consists of a key and an optional value, used to manage metadata for Amazon Braket resources.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateJobRequest {
  
  inline def apply(
    algorithmSpecification: AlgorithmSpecification,
    clientToken: String64,
    deviceConfig: DeviceConfig,
    instanceConfig: InstanceConfig,
    jobName: CreateJobRequestJobNameString,
    outputDataConfig: JobOutputDataConfig,
    roleArn: RoleArn
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(algorithmSpecification = algorithmSpecification.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], deviceConfig = deviceConfig.asInstanceOf[js.Any], instanceConfig = instanceConfig.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], outputDataConfig = outputDataConfig.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  extension [Self <: CreateJobRequest](x: Self) {
    
    inline def setAlgorithmSpecification(value: AlgorithmSpecification): Self = StObject.set(x, "algorithmSpecification", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfig(value: JobCheckpointConfig): Self = StObject.set(x, "checkpointConfig", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfigUndefined: Self = StObject.set(x, "checkpointConfig", js.undefined)
    
    inline def setClientToken(value: String64): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfig(value: DeviceConfig): Self = StObject.set(x, "deviceConfig", value.asInstanceOf[js.Any])
    
    inline def setHyperParameters(value: HyperParameters): Self = StObject.set(x, "hyperParameters", value.asInstanceOf[js.Any])
    
    inline def setHyperParametersUndefined: Self = StObject.set(x, "hyperParameters", js.undefined)
    
    inline def setInputDataConfig(value: CreateJobRequestInputDataConfigList): Self = StObject.set(x, "inputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "inputDataConfig", js.undefined)
    
    inline def setInputDataConfigVarargs(value: InputFileConfig*): Self = StObject.set(x, "inputDataConfig", js.Array(value*))
    
    inline def setInstanceConfig(value: InstanceConfig): Self = StObject.set(x, "instanceConfig", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: CreateJobRequestJobNameString): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfig(value: JobOutputDataConfig): Self = StObject.set(x, "outputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: JobStoppingCondition): Self = StObject.set(x, "stoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "stoppingCondition", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
