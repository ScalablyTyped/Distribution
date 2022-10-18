package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchParameters extends StObject {
  
  /**
    * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an Batch job.
    */
  var ArrayProperties: js.UndefOr[BatchArrayProperties] = js.undefined
  
  /**
    * The ARN or name of the job definition to use if the event target is an Batch job. This job definition must already exist.
    */
  var JobDefinition: String
  
  /**
    * The name to use for this execution of the job, if the target is an Batch job.
    */
  var JobName: String
  
  /**
    * The retry strategy to use for failed jobs, if the target is an Batch job. The retry strategy is the number of times to retry the failed job execution. Valid values are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in the job definition.
    */
  var RetryStrategy: js.UndefOr[BatchRetryStrategy] = js.undefined
}
object BatchParameters {
  
  inline def apply(JobDefinition: String, JobName: String): BatchParameters = {
    val __obj = js.Dynamic.literal(JobDefinition = JobDefinition.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchParameters]
  }
  
  extension [Self <: BatchParameters](x: Self) {
    
    inline def setArrayProperties(value: BatchArrayProperties): Self = StObject.set(x, "ArrayProperties", value.asInstanceOf[js.Any])
    
    inline def setArrayPropertiesUndefined: Self = StObject.set(x, "ArrayProperties", js.undefined)
    
    inline def setJobDefinition(value: String): Self = StObject.set(x, "JobDefinition", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategy(value: BatchRetryStrategy): Self = StObject.set(x, "RetryStrategy", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategyUndefined: Self = StObject.set(x, "RetryStrategy", js.undefined)
  }
}
