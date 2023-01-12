package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDefinition extends StObject {
  
  /**
    * The orchestration type of the compute environment. The valid values are ECS (default) or EKS.
    */
  var containerOrchestrationType: js.UndefOr[OrchestrationType] = js.undefined
  
  /**
    * An object with various properties specific to Amazon ECS based jobs. Valid values are containerProperties, eksProperties, and nodeProperties. Only one can be specified.
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.undefined
  
  /**
    * An object with various properties that are specific to Amazon EKS based jobs. Valid values are containerProperties, eksProperties, and nodeProperties. Only one can be specified.
    */
  var eksProperties: js.UndefOr[EksProperties] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the job definition.
    */
  var jobDefinitionArn: String
  
  /**
    * The name of the job definition.
    */
  var jobDefinitionName: String
  
  /**
    * An object with various properties that are specific to multi-node parallel jobs. Valid values are containerProperties, eksProperties, and nodeProperties. Only one can be specified.  If the job runs on Fargate resources, don't specify nodeProperties. Use containerProperties instead. 
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
  
  /**
    * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition. For more information about specifying parameters, see Job definition parameters in the Batch User Guide.
    */
  var parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * The platform capabilities required by the job definition. If no value is specified, it defaults to EC2. Jobs run on Fargate resources specify FARGATE.
    */
  var platformCapabilities: js.UndefOr[PlatformCapabilityList] = js.undefined
  
  /**
    * Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS task. If no value is specified, the tags aren't propagated. Tags can only be propagated to the tasks when the tasks are created. For tags with the same name, job tags are given priority over job definitions tags. If the total number of combined tags from the job and job definition is over 50, the job is moved to the FAILED state.
    */
  var propagateTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  
  /**
    * The revision of the job definition.
    */
  var revision: Integer
  
  /**
    * The scheduling priority of the job definition. This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling priority are scheduled before jobs with a lower scheduling priority.
    */
  var schedulingPriority: js.UndefOr[Integer] = js.undefined
  
  /**
    * The status of the job definition.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The tags that are applied to the job definition.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
  
  /**
    * The timeout time for jobs that are submitted with this job definition. After the amount of time you specify passes, Batch terminates your jobs if they aren't finished.
    */
  var timeout: js.UndefOr[JobTimeout] = js.undefined
  
  /**
    * The type of job definition. It's either container or multinode. If the job is run on Fargate resources, then multinode isn't supported. For more information about multi-node parallel jobs, see Creating a multi-node parallel job definition in the Batch User Guide.
    */
  var `type`: String
}
object JobDefinition {
  
  inline def apply(jobDefinitionArn: String, jobDefinitionName: String, revision: Integer, `type`: String): JobDefinition = {
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn.asInstanceOf[js.Any], jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobDefinition] (val x: Self) extends AnyVal {
    
    inline def setContainerOrchestrationType(value: OrchestrationType): Self = StObject.set(x, "containerOrchestrationType", value.asInstanceOf[js.Any])
    
    inline def setContainerOrchestrationTypeUndefined: Self = StObject.set(x, "containerOrchestrationType", js.undefined)
    
    inline def setContainerProperties(value: ContainerProperties): Self = StObject.set(x, "containerProperties", value.asInstanceOf[js.Any])
    
    inline def setContainerPropertiesUndefined: Self = StObject.set(x, "containerProperties", js.undefined)
    
    inline def setEksProperties(value: EksProperties): Self = StObject.set(x, "eksProperties", value.asInstanceOf[js.Any])
    
    inline def setEksPropertiesUndefined: Self = StObject.set(x, "eksProperties", js.undefined)
    
    inline def setJobDefinitionArn(value: String): Self = StObject.set(x, "jobDefinitionArn", value.asInstanceOf[js.Any])
    
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
    
    inline def setRevision(value: Integer): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPriority(value: Integer): Self = StObject.set(x, "schedulingPriority", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPriorityUndefined: Self = StObject.set(x, "schedulingPriority", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeout(value: JobTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
