package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterJobDefinitionRequest extends StObject {
  
  /**
    * An object with various properties specific to Amazon ECS based single-node container-based jobs. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties. This must not be specified for Amazon EKS based job definitions.  If the job runs on Fargate resources, then you must not specify nodeProperties; use only containerProperties. 
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.undefined
  
  /**
    * An object with various properties that are specific to Amazon EKS based jobs. This must not be specified for Amazon ECS based job definitions.
    */
  var eksProperties: js.UndefOr[EksProperties] = js.undefined
  
  /**
    * The name of the job definition to register. It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
    */
  var jobDefinitionName: String
  
  /**
    * An object with various properties specific to multi-node parallel jobs. If you specify node properties for a job, it becomes a multi-node parallel job. For more information, see Multi-node Parallel Jobs in the Batch User Guide. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties.  If the job runs on Fargate resources, then you must not specify nodeProperties; use containerProperties instead.   If the job runs on Amazon EKS resources, then you must not specify nodeProperties. 
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
  
  /**
    * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * The platform capabilities required by the job definition. If no value is specified, it defaults to EC2. To run the job on Fargate resources, specify FARGATE.  If the job runs on Amazon EKS resources, then you must not specify platformCapabilities. 
    */
  var platformCapabilities: js.UndefOr[PlatformCapabilityList] = js.undefined
  
  /**
    * Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS task. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks during task creation. For tags with the same name, job tags are given priority over job definitions tags. If the total number of combined tags from the job and job definition is over 50, the job is moved to the FAILED state.  If the job runs on Amazon EKS resources, then you must not specify propagateTags. 
    */
  var propagateTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that's specified during a SubmitJob operation overrides the retry strategy defined here. If a job is terminated due to a timeout, it isn't retried.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  
  /**
    * The scheduling priority for jobs that are submitted with this job definition. This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling priority are scheduled before jobs with a lower scheduling priority. The minimum supported value is 0 and the maximum supported value is 9999.
    */
  var schedulingPriority: js.UndefOr[Integer] = js.undefined
  
  /**
    * The tags that you apply to the job definition to help you categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging Amazon Web Services Resources in Batch User Guide.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
  
  /**
    * The timeout configuration for jobs that are submitted with this job definition, after which Batch terminates your jobs if they have not finished. If a job is terminated due to a timeout, it isn't retried. The minimum value for the timeout is 60 seconds. Any timeout configuration that's specified during a SubmitJob operation overrides the timeout configuration defined here. For more information, see Job Timeouts in the Batch User Guide.
    */
  var timeout: js.UndefOr[JobTimeout] = js.undefined
  
  /**
    * The type of job definition. For more information about multi-node parallel jobs, see Creating a multi-node parallel job definition in the Batch User Guide.  If the job is run on Fargate resources, then multinode isn't supported. 
    */
  var `type`: JobDefinitionType
}
object RegisterJobDefinitionRequest {
  
  inline def apply(jobDefinitionName: String, `type`: JobDefinitionType): RegisterJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterJobDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterJobDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setContainerProperties(value: ContainerProperties): Self = StObject.set(x, "containerProperties", value.asInstanceOf[js.Any])
    
    inline def setContainerPropertiesUndefined: Self = StObject.set(x, "containerProperties", js.undefined)
    
    inline def setEksProperties(value: EksProperties): Self = StObject.set(x, "eksProperties", value.asInstanceOf[js.Any])
    
    inline def setEksPropertiesUndefined: Self = StObject.set(x, "eksProperties", js.undefined)
    
    inline def setJobDefinitionName(value: String): Self = StObject.set(x, "jobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setNodeProperties(value: NodeProperties): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    inline def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPlatformCapabilities(value: PlatformCapabilityList): Self = StObject.set(x, "platformCapabilities", value.asInstanceOf[js.Any])
    
    inline def setPlatformCapabilitiesUndefined: Self = StObject.set(x, "platformCapabilities", js.undefined)
    
    inline def setPlatformCapabilitiesVarargs(value: PlatformCapability*): Self = StObject.set(x, "platformCapabilities", js.Array(value*))
    
    inline def setPropagateTags(value: Boolean): Self = StObject.set(x, "propagateTags", value.asInstanceOf[js.Any])
    
    inline def setPropagateTagsUndefined: Self = StObject.set(x, "propagateTags", js.undefined)
    
    inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    
    inline def setSchedulingPriority(value: Integer): Self = StObject.set(x, "schedulingPriority", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPriorityUndefined: Self = StObject.set(x, "schedulingPriority", js.undefined)
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeout(value: JobTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: JobDefinitionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
