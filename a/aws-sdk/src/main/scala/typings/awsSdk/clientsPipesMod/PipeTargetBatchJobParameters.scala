package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetBatchJobParameters extends StObject {
  
  /**
    * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an Batch job.
    */
  var ArrayProperties: js.UndefOr[BatchArrayProperties] = js.undefined
  
  /**
    * The overrides that are sent to a container.
    */
  var ContainerOverrides: js.UndefOr[BatchContainerOverrides] = js.undefined
  
  /**
    * A list of dependencies for the job. A job can depend upon a maximum of 20 jobs. You can specify a SEQUENTIAL type dependency without specifying a job ID for array jobs so that each child array job completes sequentially, starting at index 0. You can also specify an N_TO_N type dependency with a job ID for array jobs. In that case, each index child of this job must wait for the corresponding index child of each dependency to complete before it can begin.
    */
  var DependsOn: js.UndefOr[BatchDependsOn] = js.undefined
  
  /**
    * The job definition used by this job. This value can be one of name, name:revision, or the Amazon Resource Name (ARN) for the job definition. If name is specified without a revision then the latest active revision is used.
    */
  var JobDefinition: String
  
  /**
    * The name of the job. It can be up to 128 letters long. The first character must be alphanumeric, can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_).
    */
  var JobName: String
  
  /**
    * Additional parameters passed to the job that replace parameter substitution placeholders that are set in the job definition. Parameters are specified as a key and value pair mapping. Parameters included here override any corresponding parameter defaults from the job definition.
    */
  var Parameters: js.UndefOr[BatchParametersMap] = js.undefined
  
  /**
    * The retry strategy to use for failed jobs. When a retry strategy is specified here, it overrides the retry strategy defined in the job definition.
    */
  var RetryStrategy: js.UndefOr[BatchRetryStrategy] = js.undefined
}
object PipeTargetBatchJobParameters {
  
  inline def apply(JobDefinition: String, JobName: String): PipeTargetBatchJobParameters = {
    val __obj = js.Dynamic.literal(JobDefinition = JobDefinition.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeTargetBatchJobParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetBatchJobParameters] (val x: Self) extends AnyVal {
    
    inline def setArrayProperties(value: BatchArrayProperties): Self = StObject.set(x, "ArrayProperties", value.asInstanceOf[js.Any])
    
    inline def setArrayPropertiesUndefined: Self = StObject.set(x, "ArrayProperties", js.undefined)
    
    inline def setContainerOverrides(value: BatchContainerOverrides): Self = StObject.set(x, "ContainerOverrides", value.asInstanceOf[js.Any])
    
    inline def setContainerOverridesUndefined: Self = StObject.set(x, "ContainerOverrides", js.undefined)
    
    inline def setDependsOn(value: BatchDependsOn): Self = StObject.set(x, "DependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "DependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: BatchJobDependency*): Self = StObject.set(x, "DependsOn", js.Array(value*))
    
    inline def setJobDefinition(value: String): Self = StObject.set(x, "JobDefinition", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: BatchParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setRetryStrategy(value: BatchRetryStrategy): Self = StObject.set(x, "RetryStrategy", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategyUndefined: Self = StObject.set(x, "RetryStrategy", js.undefined)
  }
}
