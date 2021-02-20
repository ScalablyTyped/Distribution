package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobDefinition extends StObject {
  
  /**
    * An object with various properties specific to container-based jobs.
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the job definition.
    */
  var jobDefinitionArn: String = js.native
  
  /**
    * The name of the job definition.
    */
  var jobDefinitionName: String = js.native
  
  /**
    * An object with various properties specific to multi-node parallel jobs.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.native
  
  /**
    * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition. For more information about specifying parameters, see Job Definition Parameters in the AWS Batch User Guide.
    */
  var parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  
  /**
    * The revision of the job definition.
    */
  var revision: Integer = js.native
  
  /**
    * The status of the job definition.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The tags applied to the job definition.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.native
  
  /**
    * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout duration after which AWS Batch terminates your jobs if they have not finished.
    */
  var timeout: js.UndefOr[JobTimeout] = js.native
  
  /**
    * The type of job definition.
    */
  var `type`: String = js.native
}
object JobDefinition {
  
  @scala.inline
  def apply(jobDefinitionArn: String, jobDefinitionName: String, revision: Integer, `type`: String): JobDefinition = {
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn.asInstanceOf[js.Any], jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinition]
  }
  
  @scala.inline
  implicit class JobDefinitionMutableBuilder[Self <: JobDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerProperties(value: ContainerProperties): Self = StObject.set(x, "containerProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPropertiesUndefined: Self = StObject.set(x, "containerProperties", js.undefined)
    
    @scala.inline
    def setJobDefinitionArn(value: String): Self = StObject.set(x, "jobDefinitionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDefinitionName(value: String): Self = StObject.set(x, "jobDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeProperties(value: NodeProperties): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    
    @scala.inline
    def setRevision(value: Integer): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: JobTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
