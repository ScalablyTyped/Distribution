package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitJobRequest extends StObject {
  
  /**
    * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. For more information, see Array Jobs in the Batch User Guide.
    */
  var arrayProperties: js.UndefOr[ArrayProperties] = js.undefined
  
  /**
    * An object with various properties that override the defaults for the job definition that specify the name of a container in the specified job definition and the overrides it should receive. You can override the default command for a container, which is specified in the job definition or the Docker image, with a command override. You can also override existing environment variables on a container or add new environment variables to it with an environment override.
    */
  var containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined
  
  /**
    * A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a SEQUENTIAL type dependency without specifying a job ID for array jobs so that each child array job completes sequentially, starting at index 0. You can also specify an N_TO_N type dependency with a job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of each dependency to complete before it can begin.
    */
  var dependsOn: js.UndefOr[JobDependencyList] = js.undefined
  
  /**
    * An object that can only be specified for jobs that are run on Amazon EKS resources with various properties that override defaults for the job definition.
    */
  var eksPropertiesOverride: js.UndefOr[EksPropertiesOverride] = js.undefined
  
  /**
    * The job definition used by this job. This value can be one of name, name:revision, or the Amazon Resource Name (ARN) for the job definition. If name is specified without a revision then the latest active revision is used.
    */
  var jobDefinition: String
  
  /**
    * The name of the job. It can be up to 128 letters long. The first character must be alphanumeric, can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
    */
  var jobName: String
  
  /**
    * The job queue where the job is submitted. You can specify either the name or the Amazon Resource Name (ARN) of the queue.
    */
  var jobQueue: String
  
  /**
    * A list of node overrides in JSON format that specify the node range to target and the container overrides for that node range.  This parameter isn't applicable to jobs that are running on Fargate resources; use containerOverrides instead. 
    */
  var nodeOverrides: js.UndefOr[NodeOverrides] = js.undefined
  
  /**
    * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job definition. Parameters are specified as a key and value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS task. If no value is specified, the tags aren't propagated. Tags can only be propagated to the tasks during task creation. For tags with the same name, job tags are given priority over job definitions tags. If the total number of combined tags from the job and job definition is over 50, the job is moved to the FAILED state. When specified, this overrides the tag propagation setting in the job definition.
    */
  var propagateTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The retry strategy to use for failed jobs from this SubmitJob operation. When a retry strategy is specified here, it overrides the retry strategy defined in the job definition.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  
  /**
    * The scheduling priority for the job. This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling priority are scheduled before jobs with a lower scheduling priority. This overrides any scheduling priority in the job definition. The minimum supported value is 0 and the maximum supported value is 9999.
    */
  var schedulingPriorityOverride: js.UndefOr[Integer] = js.undefined
  
  /**
    * The share identifier for the job. If the job queue doesn't have a scheduling policy, then this parameter must not be specified. If the job queue has a scheduling policy, then this parameter must be specified.
    */
  var shareIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The tags that you apply to the job request to help you categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging Amazon Web Services Resources in Amazon Web Services General Reference.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
  
  /**
    * The timeout configuration for this SubmitJob operation. You can specify a timeout duration after which Batch terminates your jobs if they haven't finished. If a job is terminated due to a timeout, it isn't retried. The minimum value for the timeout is 60 seconds. This configuration overrides any timeout configuration specified in the job definition. For array jobs, child jobs have the same timeout configuration as the parent job. For more information, see Job Timeouts in the Amazon Elastic Container Service Developer Guide.
    */
  var timeout: js.UndefOr[JobTimeout] = js.undefined
}
object SubmitJobRequest {
  
  inline def apply(jobDefinition: String, jobName: String, jobQueue: String): SubmitJobRequest = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobQueue = jobQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitJobRequest]
  }
  
  extension [Self <: SubmitJobRequest](x: Self) {
    
    inline def setArrayProperties(value: ArrayProperties): Self = StObject.set(x, "arrayProperties", value.asInstanceOf[js.Any])
    
    inline def setArrayPropertiesUndefined: Self = StObject.set(x, "arrayProperties", js.undefined)
    
    inline def setContainerOverrides(value: ContainerOverrides): Self = StObject.set(x, "containerOverrides", value.asInstanceOf[js.Any])
    
    inline def setContainerOverridesUndefined: Self = StObject.set(x, "containerOverrides", js.undefined)
    
    inline def setDependsOn(value: JobDependencyList): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: JobDependency*): Self = StObject.set(x, "dependsOn", js.Array(value*))
    
    inline def setEksPropertiesOverride(value: EksPropertiesOverride): Self = StObject.set(x, "eksPropertiesOverride", value.asInstanceOf[js.Any])
    
    inline def setEksPropertiesOverrideUndefined: Self = StObject.set(x, "eksPropertiesOverride", js.undefined)
    
    inline def setJobDefinition(value: String): Self = StObject.set(x, "jobDefinition", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobQueue(value: String): Self = StObject.set(x, "jobQueue", value.asInstanceOf[js.Any])
    
    inline def setNodeOverrides(value: NodeOverrides): Self = StObject.set(x, "nodeOverrides", value.asInstanceOf[js.Any])
    
    inline def setNodeOverridesUndefined: Self = StObject.set(x, "nodeOverrides", js.undefined)
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPropagateTags(value: Boolean): Self = StObject.set(x, "propagateTags", value.asInstanceOf[js.Any])
    
    inline def setPropagateTagsUndefined: Self = StObject.set(x, "propagateTags", js.undefined)
    
    inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    
    inline def setSchedulingPriorityOverride(value: Integer): Self = StObject.set(x, "schedulingPriorityOverride", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPriorityOverrideUndefined: Self = StObject.set(x, "schedulingPriorityOverride", js.undefined)
    
    inline def setShareIdentifier(value: String): Self = StObject.set(x, "shareIdentifier", value.asInstanceOf[js.Any])
    
    inline def setShareIdentifierUndefined: Self = StObject.set(x, "shareIdentifier", js.undefined)
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeout(value: JobTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
