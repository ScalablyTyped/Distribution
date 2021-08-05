package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDefinition extends StObject {
  
  /**
    * An object with various properties specific to container-based jobs.
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the job definition.
    */
  var jobDefinitionArn: String
  
  /**
    * The name of the job definition.
    */
  var jobDefinitionName: String
  
  /**
    * An object with various properties specific to multi-node parallel jobs.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
  
  /**
    * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition. For more information about specifying parameters, see Job Definition Parameters in the AWS Batch User Guide.
    */
  var parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  
  /**
    * The revision of the job definition.
    */
  var revision: Integer
  
  /**
    * The status of the job definition.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The tags applied to the job definition.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
  
  /**
    * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout duration after which AWS Batch terminates your jobs if they have not finished.
    */
  var timeout: js.UndefOr[JobTimeout] = js.undefined
  
  /**
    * The type of job definition.
    */
  var `type`: String
}
object JobDefinition {
  
  inline def apply(jobDefinitionArn: String, jobDefinitionName: String, revision: Integer, `type`: String): JobDefinition = {
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn.asInstanceOf[js.Any], jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinition]
  }
  
  extension [Self <: JobDefinition](x: Self) {
    
    inline def setContainerProperties(value: ContainerProperties): Self = StObject.set(x, "containerProperties", value.asInstanceOf[js.Any])
    
    inline def setContainerPropertiesUndefined: Self = StObject.set(x, "containerProperties", js.undefined)
    
    inline def setJobDefinitionArn(value: String): Self = StObject.set(x, "jobDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionName(value: String): Self = StObject.set(x, "jobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setNodeProperties(value: NodeProperties): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    inline def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    
    inline def setRevision(value: Integer): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeout(value: JobTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
